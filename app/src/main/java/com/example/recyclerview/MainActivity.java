package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView mRecyclerView;
    private int[] icons = {R.drawable.jobs, R.drawable.ic_person, R.drawable.ic_mail,
                           R.drawable.ic_check, R.drawable.resume, R.drawable.settings};

    private String[] names = {"Jobs", "My Profile", "Messages", "Applied Jobs", "Resume", "Settings"};

    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view);
        mLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        adapter = new RecyclerViewAdapter(icons, names);
        mRecyclerView.setAdapter(adapter);
    }
}
