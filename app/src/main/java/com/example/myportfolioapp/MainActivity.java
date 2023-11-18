package com.example.myportfolioapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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
    RecyclerView menuRecycleView;
    List<MenuItem> menuItems;
    MenuAdapter menuAdapter;
    ImageView homeButton;
    int selectedMenuPos = 0;

    public void setPortfolioFragment() {
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
            case MenuUtil.PORTFOLIO_FRAGMENT_CODE:
                setPortfolioFragment();
                break;
            //default: setHomeFragment();
        }

        // hightligh the selected menu item

        menuItems.get(selectedMenuPos).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectedMenuPos = i ;
        menuAdapter.notifyDataSetChanged();
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        // It will hide the title bar
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        homeButton = findViewById(R.id.btn_home);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        setupSideMenu();
    }

    private void setupSideMenu() {
        menuRecycleView = findViewById(R.id.rv_side_menu);
        //menuRecycleView.setVisibility(View.GONE);

        // get menu list item  will get data from a static data class

        menuItems = MenuUtil.getMenuList();
        menuAdapter = new MenuAdapter(menuItems,this);
        menuRecycleView.setLayoutManager(new LinearLayoutManager(this));
        menuRecycleView.setAdapter(menuAdapter);
    }
}