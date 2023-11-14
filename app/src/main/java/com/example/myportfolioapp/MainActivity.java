package com.example.myportfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.view.WindowCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myportfolioapp.portfolio.PortfolioFragment;
import com.example.myportfolioapp.sideMenu.Callback;
import com.example.myportfolioapp.sideMenu.MenuAdapter;
import com.example.myportfolioapp.sideMenu.MenuItem;
import com.example.myportfolioapp.sideMenu.MenuUtil;

import java.util.List;


public class MainActivity extends AppCompatActivity implements Callback {
    RecyclerView menuRv;
    List<MenuItem> menuItems;
    MenuAdapter adapter;
    ImageView hamburgerMenuButton;

    int selectedMenuPos = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        // It will hide the title bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        hamburgerMenuButton = findViewById(R.id.btn_hamburgerMenu);
        hamburgerMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuRv.setVisibility(View.VISIBLE);
            }
        });
        
        // setup side menu
        setupSideMenu();

    }

    private void setupSideMenu() {

        menuRv = findViewById(R.id.rv_side_menu);
        menuRv.setVisibility(View.GONE);

        // get menu list item  will get data from a static data class

        menuItems = MenuUtil.getMenuList();
        adapter = new MenuAdapter(menuItems,this);
        menuRv.setLayoutManager(new LinearLayoutManager(this));
        menuRv.setAdapter(adapter);

    }

    void setPortfoliofragment() {

        getSupportFragmentManager().beginTransaction().replace(R.id.container,new PortfolioFragment()).commit();

    }

    @Override
    public void onSideMenuItemClick(int i) {
        switch (menuItems.get(i).getCode()) {

            //case MenuUtil.HOME_FRAGMENT_CODE : setHomeFragment();
            //    break;
            //case MenuUtil.CV_FRAGMENT_CODE : setCVFragment();
            //    break;
            //case MenuUtil.TEAM_FRAGMENT_CODE: setTeamFragment();
            //    break;
            case MenuUtil.PORTFOLIO_FRAGMENT_CODE:setPortfoliofragment();
                break;
            //default: setHomeFragment();
        }

        // hightligh the selected menu item

        menuItems.get(selectedMenuPos).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectedMenuPos = i ;
        adapter.notifyDataSetChanged();
    }
}