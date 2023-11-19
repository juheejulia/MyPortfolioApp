package com.example.myportfolioapp.sideMenu;

public class MenuItem {

    private int icon, menu;
    private boolean isSelected;

    public MenuItem(int icon, int menu) {
        this.icon = icon;
        this.menu = menu;
    }

    public MenuItem(int icon, int menu, boolean isSelected) {
        this.icon = icon;
        this.menu = menu;
        this.isSelected = isSelected;
    }

    public int getIcon() {
        return icon;
    }

    public int getMenu() {
        return menu;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
