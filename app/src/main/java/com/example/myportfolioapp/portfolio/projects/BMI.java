package com.example.myportfolioapp.portfolio.projects;
import com.example.myportfolioapp.R;
import com.example.myportfolioapp.portfolio.PortfolioItem;

public class BMI extends PortfolioItem {

    public BMI(){
    }
    public int getImage() {
        return R.drawable.bmi;
    }

    public String getTitle() {
        return "BIM";
    }

    public String getShortDescription() {
        return "Second school project";
    }

    public String getLongDescription() {
        return "Update needs. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras turpis sapien, rutrum sed cursus ut, porttitor at ipsum. Pellentesque lobortis neque at accumsan mattis. In hac habitasse platea dictumst. Etiam sed suscipit eros. Nunc consectetur arcu nec hendrerit lobortis. In hac habitasse platea dictumst. Vestibulum vulputate elit eget nisl semper, id consectetur ligula iaculis.";

    }
}
