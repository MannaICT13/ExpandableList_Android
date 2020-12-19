package com.mcubes.expandablelist_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;

    private List<String> parentList;
    private  HashMap<String,List<String>> childList;
    private  CustomAdapter customAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = findViewById(R.id.expendableViewId);

        customAdapter = new CustomAdapter(this,parentList,childList);

        prepareList();
    }



    private void prepareList() {


        String[] parentListString = getResources().getStringArray(R.array.parent_name);
        String[] childListString = getResources().getStringArray(R.array.child_name);

        parentList = new ArrayList<>();
        childList = new HashMap<>();


        for(int i=0;i<parentListString.length;i++){

            parentList.add(parentListString[i]);

            List<String> child = new ArrayList<>();
            child.add(childListString[i]);

            childList.put(parentList.get(i),child);


        }




    }
}