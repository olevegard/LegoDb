package com.headerphile.olevegard.legopartdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.headerphile.olevegard.legopartdb.Database.LegoSet;

import com.headerphile.olevegard.legopartdb.Database.MyDBHandler;
import com.headerphile.olevegard.legopartdb.PartList.LegoSetPartListAdapter;

public class MainActivity extends AppCompatActivity {

    private MyDBHandler mdbh;

    RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdbh = new MyDBHandler(this, null, null, 1);
        mdbh.buildDb();
        LegoSet set = mdbh.getLegoSetWithParts(1477);

        header = (TextView) findViewById(R.id.set_overview_header);
        header.setText("Showing all parts for " + set.getName() + " ( " + set.getId() + " )");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recylerViewLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recylerViewLayoutManager);

        recyclerViewAdapter = new LegoSetPartListAdapter(this, set.getParts());
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
