package com.example.myportfolioapp.portfolio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myportfolioapp.R;
import com.example.myportfolioapp.portfolio.projects.BMI;
import com.example.myportfolioapp.portfolio.projects.EmployeeList;
import com.example.myportfolioapp.portfolio.projects.NotePad;
import com.example.myportfolioapp.portfolio.projects.ProfileSite;
import com.example.myportfolioapp.portfolio.projects.RestaurantApp;

import java.util.ArrayList;
import java.util.List;

public class PortfolioFragment extends Fragment implements PortfolioCallback {
    List<PortfolioItem> portfolioItems;
    RecyclerView rv_portfolio;
    PortfolioAdapter portfolioAdapter ;

    public PortfolioFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv_portfolio = view.findViewById(R.id.rv_portfolio);

        // create a list of portfolio items
        portfolioItems = new ArrayList<>();

        portfolioItems.add(new ProfileSite());
        portfolioItems.add(new BMI());
        portfolioItems.add(new RestaurantApp());
        portfolioItems.add(new EmployeeList());
        portfolioItems.add(new NotePad());

        portfolioAdapter = new PortfolioAdapter(portfolioItems,this);

        // setup grid recyclerview
        rv_portfolio.setLayoutManager(new GridLayoutManager(getActivity(),1));
        rv_portfolio.setAdapter(portfolioAdapter);
    }

    @Override
    public void onPortfolioItemClick(int pos) {
        //ToDo Fix double click bug
        //handle click listener event when portfolio item clicked
        //create a fragment bottom sheet instance
        PortfolioFragmentDetails portfolioFragmentDetails =
                new PortfolioFragmentDetails();

        //send portfolio item to portfolio dialog fragment
        Bundle bundle = new Bundle();
        bundle.putSerializable("object", portfolioItems.get(pos));
        portfolioFragmentDetails.setArguments(bundle);

        //open the portfolio bottom sheet fragment
        portfolioFragmentDetails.show(getActivity().getSupportFragmentManager(),"tagname");
    }
}
