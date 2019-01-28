package com.databindingdemo.android.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.databindingdemo.android.adapters.RecyclerViewAdapter;
import com.databindingdemo.android.models.User;
import com.example.custommanager_recyclerview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<User> mArrayListUser = new ArrayList<>();

    private String[] fname = {"First name User 1", "First name User 2",
            "First name User 3", "First name User 4"};
    private String[] lname = {"Last name User 1", "Last name User 2",
            "Last name User 3", "Last name User 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setup recyclerview
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(this);
        mRecyclerView.setAdapter(mAdapter);

        //add data to arraylist
        for (int i = 0; i < fname.length; i++) {
            User mUser = new User();
            mUser.setFname(fname[i]);
            mUser.setLname(lname[i]);
            mArrayListUser.add(mUser);
        }

        mAdapter.setArrayListUser(mArrayListUser);
    }
}
