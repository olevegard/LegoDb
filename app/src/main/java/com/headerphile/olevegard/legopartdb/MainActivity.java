package com.headerphile.olevegard.legopartdb;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import Database.MyDBHandler;

public class MainActivity extends AppCompatActivity {

    private static final String DATABASE_NAME = "Lego";
    private static final String TABLE_PART = "Part";
    public static final String COLUMN_PART_ID = "PartId";
    public static final String COLUMN_DESCRITION = "Description";
    public static final String COLUMN_WIDTH = "Width";
    public static final String COLUMN_LENGTH = "Length";
    public static final String COLUMN_HEIGHT = "Height";
    MyDBHandler mdbh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout main = (RelativeLayout) findViewById(R.id.main_layout);

        final TextView description = (TextView) findViewById(R.id.item_description);
        final EditText enterId = (EditText) findViewById(R.id.enter_id_edit);
        Button goButton = (Button) findViewById(R.id.enter_id_edit_go);

        mdbh = new MyDBHandler(this, null, null, 1);
        // ArrayList<String> parts = mdbh.getAllParts();
        mdbh.buildDb();

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = enterId.getText().toString();
                String desc = mdbh.getPart(str);
                Log.d("DEBUG", "Got string " +  desc);
                description.setText(desc);
            }
        });

    }
}
