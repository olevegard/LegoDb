package com.headerphile.olevegard.legopartdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

import com.headerphile.olevegard.legopartdb.PartList.PartListAdapter;

import com.headerphile.olevegard.legopartdb.Database.MyDBHandler;

public class MainActivity extends AppCompatActivity {

    private MyDBHandler mdbh;

    RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdbh = new MyDBHandler(this, null, null, 1);
        mdbh.buildDb();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recylerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter = new PartListAdapter(this, mdbh.getAllParts());
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
