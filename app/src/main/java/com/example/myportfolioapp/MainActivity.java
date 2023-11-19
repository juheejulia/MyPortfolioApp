// Juhee Kang Johansson
// My portfolio app

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

import com.example.myportfolioapp.links.LinksFragment;
import com.example.myportfolioapp.portfolio.PortfolioFragment;
import com.example.myportfolioapp.sideMenu.Callback;
import com.example.myportfolioapp.sideMenu.MenuAdapter;
import com.example.myportfolioapp.sideMenu.MenuItem;
import com.example.myportfolioapp.sideMenu.SideMenuList;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Callback {
    RecyclerView menuRecycleView;
    List<MenuItem> menuItems;
    MenuAdapter menuAdapter;
    ImageView homeButton;
    int selectedMenuPosition = 0;

    public void setPortfolioFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new PortfolioFragment()).commit();
    }

    public void setLinksFragment() {
        menuRecycleView.setVisibility(View.GONE);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new LinksFragment()).commit();
    }

    @Override
    public void onSideMenuItemClick(int i) {
        switch (menuItems.get(i).getMenu()) {
            //TODO set all menu list fragment
            //case SideMenuList.PERSON_FRAGMENT_POSITION : setPersonFragment();
            //    break;
            //case SideMenuList.SKILL_FRAGMENT_POSITION : setSkillFragment();
            //    break;
            //case SideMenuList.WORK_FRAGMENT_POSITION : setWorkFragment();
            //    break;
            //case SideMenuList.EDUCATION_FRAGMENT_POSITION: setEducationFragment();
            //    break;
            case SideMenuList.PORTFOLIO_FRAGMENT_POSITION: setPortfolioFragment();
                break;
            case SideMenuList.LINKS_FRAGMENT_POSITION: setLinksFragment();

            default: setPortfolioFragment();
        }

        // High light the selected menu item
        menuItems.get(selectedMenuPosition).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectedMenuPosition = i ;
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
        menuItems = SideMenuList.getMenuList();
        menuAdapter = new MenuAdapter(menuItems,this);
        menuRecycleView.setLayoutManager(new LinearLayoutManager(this));
        menuRecycleView.setAdapter(menuAdapter);
    }
}