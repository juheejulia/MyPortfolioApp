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
        return "This one will come soon. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras turpis sapien, rutrum sed cursus ut, porttitor at ipsum. Pellentesque lobortis neque at accumsan mattis. In hac habitasse platea dictumst. Etiam sed suscipit eros. Nunc consectetur arcu nec hendrerit lobortis. In hac habitasse platea dictumst. Vestibulum vulputate elit eget nisl semper, id consectetur ligula iaculis.\"";
    }
}
