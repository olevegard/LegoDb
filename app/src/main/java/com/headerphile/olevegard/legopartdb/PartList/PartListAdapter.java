package com.headerphile.olevegard.legopartdb.PartList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.headerphile.olevegard.legopartdb.R;

import java.util.ArrayList;

import com.headerphile.olevegard.legopartdb.Database.LegoPart;

public class PartListAdapter extends RecyclerView.Adapter<PartListAdapter.ViewHolder>{

    Context context;
    View view;
    ViewHolder viewHolder;
    TextView textView;
    ArrayList<LegoPart> partList;

    public PartListAdapter(Context context, ArrayList<LegoPart> partList){
        this.context = context;
        this.partList = partList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView id;
        public TextView description;
        public TextView width;
        public TextView length;
        public TextView height;

        public ViewHolder(View v){
            super(v);

            id = (TextView)v.findViewById(R.id.part_id);
            description = (TextView)v.findViewById(R.id.part_description);
            width = (TextView)v.findViewById(R.id.part_width);
            length = (TextView)v.findViewById(R.id.part_length);
            height = (TextView)v.findViewById(R.id.part_height);
        }
    }

    @Override
    public PartListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        view = LayoutInflater.from(context).inflate(R.layout.view_part_list_item,parent,false);
        viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        LegoPart p = partList.get(position);
        holder.id.setText(p.getId());
        holder.description.setText(p.getDescription());
        holder.width.setText(p.getWidth());
        holder.length.setText(p.getLength());
        holder.height.setText(p.getHeight());
    }

    @Override
    public int getItemCount(){
        return partList.size();
    }
}
