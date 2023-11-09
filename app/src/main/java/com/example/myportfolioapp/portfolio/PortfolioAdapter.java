package com.example.myportfolioapp.portfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myportfolioapp.R;

import java.util.List;

public class PortfolioAdapter extends RecyclerView.Adapter<PortfolioAdapter.PortfolioViewHolder> {

        List<PortfolioItem> mdata;

    public PortfolioAdapter(List<PortfolioItem> mdata) {
        this.mdata = mdata;
    }

    // Implement methods
    @NonNull
    @Override
    public PortfolioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_portfolio,parent,false);
        return new PortfolioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PortfolioViewHolder holder, int position) {

        holder.tvPorsition.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class PortfolioViewHolder extends RecyclerView.ViewHolder {

        TextView tvPorsition;
        public PortfolioViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPorsition = itemView.findViewById(R.id.item_port_text);
        }
    }
}
