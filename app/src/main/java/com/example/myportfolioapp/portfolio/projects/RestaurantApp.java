package com.example.myportfolioapp.portfolio.projects;
import com.example.myportfolioapp.R;
import com.example.myportfolioapp.portfolio.PortfolioItem;

public class RestaurantApp extends PortfolioItem {

    public RestaurantApp(){
    }
    public int getImage() {
        return R.drawable.restaurang_menu;
    }

    public String getTitle() {
        return "Restaurant App";
    }

    public String getShortDescription() {
        return "Third school project";
    }

    public String getLongDescription() {
        return "This one will come soon.";
    }
}
