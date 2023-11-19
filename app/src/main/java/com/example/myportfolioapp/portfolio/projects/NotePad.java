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
        return "I will write later.";
    }
}
