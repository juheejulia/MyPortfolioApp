package com.example.myportfolioapp.portfolio;

// This technic allows a function to call another function
// It calls the portfolio detail fragment
public interface PortfolioCallback {

    void onPortfolioItemClick(int pos);

}
