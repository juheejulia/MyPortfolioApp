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
        return "commer snart. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras turpis sapien, rutrum sed cursus ut, porttitor at ipsum. Pellentesque lobortis neque at accumsan mattis. In hac habitasse platea dictumst. Etiam sed suscipit eros. Nunc consectetur arcu nec hendrerit lobortis. In hac habitasse platea dictumst. Vestibulum vulputate elit eget nisl semper, id consectetur ligula iaculis.\"";
    }
}
