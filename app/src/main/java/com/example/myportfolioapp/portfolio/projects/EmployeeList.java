package com.example.myportfolioapp.portfolio.projects;
import com.example.myportfolioapp.R;
import com.example.myportfolioapp.portfolio.PortfolioItem;

public class EmployeeList extends PortfolioItem {

    public EmployeeList(){
    }
    public int getImage() {
        return R.drawable.employee_list_2;
    }

    public String getTitle() {
        return "Employee List";
    }

    public String getShortDescription() {
        return "Fourth school project";
    }

    public String getLongDescription() {
        return "Need to wirte later.";
    }
}
