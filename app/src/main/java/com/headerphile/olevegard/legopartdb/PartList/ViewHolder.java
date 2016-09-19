package com.headerphile.olevegard.legopartdb.PartList;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.headerphile.olevegard.legopartdb.R;


public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView countryName;

    public ViewHolder (View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        countryName = (TextView)itemView.findViewById(R.id.part_id);
    }

    @Override
    public void onClick(View view) {
    }
}
