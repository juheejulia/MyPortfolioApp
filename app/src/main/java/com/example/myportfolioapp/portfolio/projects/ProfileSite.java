package com.example.myportfolioapp.portfolio.projects;
import com.example.myportfolioapp.R;
import com.example.myportfolioapp.portfolio.PortfolioItem;

public class ProfileSite extends PortfolioItem {

    public ProfileSite(){
    }
    public int getImage() {
        return R.drawable.profile;
    }

    public String getTitle() {
        return "Profile site";
    }

    public String getShortDescription() {
        return "First school project";
    }

    public String getLongDescription() {
        return "commer snart.";
    }
}
