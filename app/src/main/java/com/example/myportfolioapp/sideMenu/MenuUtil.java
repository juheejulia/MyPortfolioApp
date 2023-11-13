package com.example.myportfolioapp.sideMenu;

import com.example.myportfolioapp.R;

import java.util.ArrayList;
import java.util.List;

// Side menu icon utility
public class MenuUtil {

    public static final int PERSON_FRAGMENT_CODE = 0;
    public static final int SKILL_FRAGMENT_CODE = 1;
    public static final int WORK_FRAGMENT_CODE = 2;
    public static final int CV_FRAGMENT_CODE = 3;
    public static final int PORTFOLIO_FRAGMENT_CODE = 4;
    public static final int LINK_FRAGMENT_CODE = 5;

    public static List<MenuItem> getMenuList() {

        List<MenuItem> list = new ArrayList<>();
        // first menu item is selected
        list.add(new MenuItem(R.drawable.ic_baseline_person_24,PERSON_FRAGMENT_CODE,true));
        list.add(new MenuItem(R.drawable.ic_baseline_skill_24,PERSON_FRAGMENT_CODE,true));
        list.add(new MenuItem(R.drawable.ic_baseline_work_24, WORK_FRAGMENT_CODE,false));
        list.add(new MenuItem(R.drawable.ic_baseline_school_24,CV_FRAGMENT_CODE,false));
        list.add(new MenuItem(R.drawable.ic_baseline_dashboard_24,PORTFOLIO_FRAGMENT_CODE,false));
        list.add(new MenuItem(R.drawable.ic_baseline_favorite_24,LINK_FRAGMENT_CODE,false));

        return list;
    }
}
