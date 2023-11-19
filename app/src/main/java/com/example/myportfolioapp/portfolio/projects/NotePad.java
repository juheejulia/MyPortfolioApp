package com.example.myportfolioapp.portfolio.projects;
import com.example.myportfolioapp.R;
import com.example.myportfolioapp.portfolio.PortfolioItem;

public class NotePad extends PortfolioItem {

    public NotePad(){
    }
    public int getImage() {
        return R.drawable.notepad_2;
    }

    public String getTitle() {
        return "NotePad";
    }

    public String getShortDescription() {
        return "Seventh school project";
    }

    public String getLongDescription() {
        return "I will write later. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras turpis sapien, rutrum sed cursus ut, porttitor at ipsum. Pellentesque lobortis neque at accumsan mattis. In hac habitasse platea dictumst. Etiam sed suscipit eros. Nunc consectetur arcu nec hendrerit lobortis. In hac habitasse platea dictumst. Vestibulum vulputate elit eget nisl semper, id consectetur ligula iaculis.\"";
    }
}
