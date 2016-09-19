package com.headerphile.olevegard.legopartdb.PartList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.headerphile.olevegard.legopartdb.Database.LegoPart;
import com.headerphile.olevegard.legopartdb.Database.LegoSet;
import com.headerphile.olevegard.legopartdb.R;

import java.util.ArrayList;

public class LegoSetListAdapter extends RecyclerView.Adapter<LegoSetListAdapter.ViewHolder>{

    Context context;
    View view;
    ViewHolder viewHolder;
    TextView textView;
    ArrayList<LegoSet> setList;

    public LegoSetListAdapter(Context context, ArrayList<LegoSet> setList){
        this.context = context;
        this.setList = setList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView id;
        public TextView name;

        public ViewHolder(View v){
            super(v);

            id = (TextView)v.findViewById(R.id.set_id);
            name = (TextView)v.findViewById(R.id.set_name);
        }
    }

    @Override
    public LegoSetListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        view = LayoutInflater.from(context).inflate(R.layout.view_set_list_item,parent,false);
        viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        LegoSet p = setList.get(position);
        holder.id.setText(p.getId());
        holder.name.setText(p.getName());
    }

    @Override
    public int getItemCount(){
        return setList.size();
    }
}
