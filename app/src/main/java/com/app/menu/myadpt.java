package com.app.menu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class myadpt extends RecyclerView.Adapter<FoodViewHolder> {
    private Context mContext;
    private List <fooddata> myFoodlist;

    public myadpt(Context mContext, List<fooddata> myFoodlist) {
        this.mContext = mContext;
        this.myFoodlist = myFoodlist;
    }

    @NotNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_design_item,parent,false);
        return new FoodViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final FoodViewHolder holder, int position) {
        holder.imageView.setImageResource(myFoodlist.get(position).getItemImage());
        holder.mTitle.setText(myFoodlist.get(position).getItemTitle());
        holder.mDescription.setText(myFoodlist.get(position).getItemDescription());
        holder.mPrice.setText(myFoodlist.get(position).getItemPrice());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,detail1.class);
                intent.putExtra("Image",myFoodlist.get(holder.getAdapterPosition()).getItemImage());
                intent.putExtra("Description",myFoodlist.get(holder.getAdapterPosition()).getItemDescription());

                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myFoodlist.size();
    }
}
class FoodViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView mTitle, mDescription, mPrice;
    CardView cardView;

    public FoodViewHolder( View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mDescription = itemView.findViewById(R.id.tvDescription);
        mPrice = itemView.findViewById(R.id.tvPrice);
        cardView = itemView.findViewById(R.id.cardViewer);
    }
}