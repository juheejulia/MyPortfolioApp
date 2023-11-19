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
        return "Need to wirte later. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras turpis sapien, rutrum sed cursus ut, porttitor at ipsum. Pellentesque lobortis neque at accumsan mattis. In hac habitasse platea dictumst. Etiam sed suscipit eros. Nunc consectetur arcu nec hendrerit lobortis. In hac habitasse platea dictumst. Vestibulum vulputate elit eget nisl semper, id consectetur ligula iaculis.";

    }
}
