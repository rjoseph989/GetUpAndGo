package com.example.rjoseph.getupandgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FindHikingTrail extends AppCompatActivity {

    EditText _cityTrailNameTxt;
    Button _searchBtn;
    ImageView _mapImg;
    ListView _trailLst;

    List<String> _tempList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_hiking_trail);

        _tempList = new ArrayList<String>();
        _tempList.add("Bronte Creek Provincial Park --> 2km");
        _tempList.add("Taplow Creek Trail --> 4km");
        _tempList.add("Lions Valley Park  --> 5km");
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, _tempList);

        _cityTrailNameTxt = findViewById(R.id.cityTrailNameTxt);
        _searchBtn = findViewById(R.id.searchBtn);
        _mapImg = findViewById(R.id.mapImg);
        _trailLst = findViewById(R.id.trailLst);


        _mapImg.setVisibility(View.GONE);

        _searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _mapImg.setVisibility(View.VISIBLE);

                _trailLst.setAdapter(arrayAdapter);
            }
        });
    }
}
