package com.example.myportfolioapp.portfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.myportfolioapp.R;
import java.util.List;

public class PortfolioAdapter extends RecyclerView.Adapter<PortfolioAdapter.PortfolioViewHolder> {

    List<PortfolioItem> portfolioItems;
    PortfolioCallback listener;

    public PortfolioAdapter(List<PortfolioItem> portfolioItems,PortfolioCallback listener) {
        this.portfolioItems = portfolioItems;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PortfolioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_portfolio,parent,false) ;

        return new PortfolioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PortfolioViewHolder holder, int position) {

        Glide.with(holder.itemView.getContext()).load(portfolioItems.get(position).getImage()).into(holder.itemPortfolioImg);
        holder.itemPortfolioTitle.setText(portfolioItems.get(position).getTitle());
        holder.itemPortfolioShortDescription.setText(portfolioItems.get(position).getShortDescription());
    }

    @Override
    public int getItemCount() {
        return portfolioItems.size();
    }

    public class PortfolioViewHolder extends RecyclerView.ViewHolder {
        ImageView itemPortfolioImg;
        TextView itemPortfolioTitle, itemPortfolioShortDescription;

        public PortfolioViewHolder(@NonNull View itemView) {
            super(itemView);

            itemPortfolioImg = itemView.findViewById(R.id.item_portfolio_img);
            itemPortfolioTitle = itemView.findViewById(R.id.item_portfolio_title);
            itemPortfolioShortDescription = itemView.findViewById(R.id.item_portfolio_shortDescription);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onPortfolioItemClick(getAdapterPosition());
                }
            });
        }
    }
}
