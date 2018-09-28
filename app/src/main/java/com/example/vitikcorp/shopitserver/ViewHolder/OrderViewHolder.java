package com.example.vitikcorp.shopitserver.ViewHolder;


import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;


import com.example.vitikcorp.shopitserver.Interface.ItemClickListener;
import com.example.vitikcorp.shopitserver.R;

public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener, View.OnClickListener{
    public TextView txtOrderId,txtOrderStatus,txtOrderPhone,txtOrderAddress;
    private ItemClickListener itemClickListener;

    public OrderViewHolder(View itemView){
        super(itemView);

        txtOrderAddress=(TextView)itemView.findViewById(R.id.order_address);
        txtOrderId=(TextView)itemView.findViewById(R.id.order_id);
        txtOrderPhone=(TextView)itemView.findViewById(R.id.order_phone);
        txtOrderStatus=(TextView)itemView.findViewById(R.id.order_status);

        itemView.setOnClickListener(this);
        itemView.setOnCreateContextMenuListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view)
    {
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Select the Action");
        menu.add(0,0,getAdapterPosition(),"Update");
        menu.add(0,1,getAdapterPosition(),"Update");
    }
}

