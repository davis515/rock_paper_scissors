package com.example.clown.rock_paper_scissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CodeActivity extends AppCompatActivity {

    private ListView listview;
    private static final String his="his";
    private ArrayList alist=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        alist=getIntent().getStringArrayListExtra("his");

        listview=(ListView)findViewById(R.id.listView);
        listview.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alist));
    }
}
