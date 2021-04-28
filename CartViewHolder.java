package com.example.myecommerceapp.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myecommerceapp.Interface.ItemsClickListener;
import com.example.myecommerceapp.R;

public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtProductName, txtProductPrice, txtProductQuantity;
    private ItemsClickListener itemsClickListener;

    public CartViewHolder(@NonNull View itemView) {
        super(itemView);

        txtProductName=itemView.findViewById(R.id.cart_product_name);
        txtProductPrice=itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity=itemView.findViewById(R.id.cart_product_quantity);
    }


    @Override
    public void onClick(View view) {
        itemsClickListener.onClick(view, getAdapterPosition(),false);

    }

    public void setItemsClickListener(ItemsClickListener itemsClickListener) {
        this.itemsClickListener = itemsClickListener;
    }
}

