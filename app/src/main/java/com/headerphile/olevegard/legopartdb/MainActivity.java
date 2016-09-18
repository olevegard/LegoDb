package com.headerphile.olevegard.legopartdb;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import Database.LegoPart;
import Database.MyDBHandler;

public class MainActivity extends AppCompatActivity {

    private MyDBHandler mdbh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout main = (RelativeLayout) findViewById(R.id.main_layout);

        final EditText enterId = (EditText) findViewById(R.id.enter_id_edit);
        Button goButton = (Button) findViewById(R.id.enter_id_edit_go);

        mdbh = new MyDBHandler(this, null, null, 1);
        mdbh.buildDb();

        addTableRow("Part Id", "Description", "Width", "Length", "Height");

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LegoPart part = mdbh.getPart(enterId.getText().toString());
                if (part != null){
                    addTableRow(part);
                }
            }
        });
    }

    private void addTableRow(LegoPart p) {
        addTableRow(
            p.getId(),
            p.getDescription(),
            Integer.toString(p.getWidth()),
            Integer.toString(p.getLength()),
            Integer.toString(p.getHeight()));
    }

    private void addTableRow(String id, String descritpion, String width, String length, String height) {
        final TableLayout table = (TableLayout) findViewById(R.id.my_table);
        final TableRow tr = (TableRow) getLayoutInflater().inflate(R.layout.view_table_row_item, null);
        TextView tv;

        tv = (TextView) tr.findViewById(R.id.row_id);
        tv.setText(id);

        tv = (TextView) tr.findViewById(R.id.row_description);
        tv.setText(descritpion);

        tv = (TextView) tr.findViewById(R.id.row_width);
        tv.setText(width);

        tv = (TextView) tr.findViewById(R.id.row_length);
        tv.setText(length);

        tv = (TextView) tr.findViewById(R.id.row_height);
        tv.setText(height);

        table.addView(tr);

        // Draw separator
        tv = new TextView(this);
        tv.setBackgroundColor(Color.parseColor("#80808080"));
        tv.setHeight(2);
        table.addView(tv);

        // If you use context menu it should be registered for each table row
        registerForContextMenu(tr);
    }
}
