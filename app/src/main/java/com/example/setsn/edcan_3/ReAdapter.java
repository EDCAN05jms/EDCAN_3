package com.example.setsn.edcan_3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by setsn on 2018-05-14.
 */

public class ReAdapter extends RecyclerView.Adapter<ReAdapter.Viewholder> {


    private ArrayList<ListItem> items =new ArrayList<>();
    private View.OnClickListener onClickListener=null;

    public ReAdapter(ArrayList<ListItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.title.setText(items.get(position).title);
        holder.content.setText(items.get(position).content);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{
        TextView title;
        TextView content;

        public Viewholder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            content=itemView.findViewById(R.id.content);
        }
    }
}
