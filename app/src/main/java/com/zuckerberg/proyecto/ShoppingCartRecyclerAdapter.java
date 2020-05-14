package com.zuckerberg.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShoppingCartRecyclerAdapter extends RecyclerView.Adapter<ShoppingCartRecyclerAdapter.ShoppingCartViewHolder> {

    private Context context;
    private ArrayList<Productos> productos;
    private OnShoppingCartClickListener onShoppingCartClickListener;

    public ShoppingCartRecyclerAdapter(Context context, ArrayList<Productos> productos) {
        this.context = context;
        this.productos = productos;
    }

    public void setOnShoppingCartClickListener(OnShoppingCartClickListener onShoppingCartClickListener) {
        this.onShoppingCartClickListener = onShoppingCartClickListener;
    }

    public void updateProducts(ArrayList<Productos> productos) {
        this.productos = productos;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ShoppingCartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_cart, parent, false);
        return new ShoppingCartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingCartViewHolder holder, final int position) {
        holder.onBind(productos.get(position));
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onShoppingCartClickListener.onDeleteItemClick(productos.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public class ShoppingCartViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;
        ImageButton button;

        public ShoppingCartViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tvProducto1);
            imageView = itemView.findViewById(R.id.ivProducto1);
            button = itemView.findViewById(R.id.ibDelete);
        }

        public void onBind(Productos product) {
            textView.setText(product.getNombre());
            imageView.setImageResource(product.getImagen());
        }
    }
}
