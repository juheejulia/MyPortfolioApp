package com.example.myportfolioapp.sideMenu;

import com.example.myportfolioapp.R;

import java.util.ArrayList;
import java.util.List;

// Side menu icon utility
public class SideMenuList {

    public static final int PERSON_FRAGMENT_POSITION = 0;
    public static final int SKILL_FRAGMENT_POSITION = 1;
    public static final int WORK_FRAGMENT_POSITION = 2;
    public static final int EDUCATION_FRAGMENT_POSITION = 3;
    public static final int PORTFOLIO_FRAGMENT_POSITION = 4;
    public static final int LINKS_FRAGMENT_POSITION = 5;

    public static List<MenuItem> getMenuList() {

        List<MenuItem> list = new ArrayList<>();
        // first menu item is selected
        list.add(new MenuItem(R.drawable.ic_baseline_person_24, PERSON_FRAGMENT_POSITION,true));
        list.add(new MenuItem(R.drawable.ic_baseline_skill_24, SKILL_FRAGMENT_POSITION,false));
        list.add(new MenuItem(R.drawable.ic_baseline_work_24, WORK_FRAGMENT_POSITION,false));
        list.add(new MenuItem(R.drawable.ic_baseline_school_24, EDUCATION_FRAGMENT_POSITION,false));
        list.add(new MenuItem(R.drawable.ic_baseline_dashboard_24, PORTFOLIO_FRAGMENT_POSITION,false));
        list.add(new MenuItem(R.drawable.ic_baseline_favorite_24, LINKS_FRAGMENT_POSITION,false));

        return list;
    }
}
