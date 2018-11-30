package com.example.mvp.v;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.mvp.R;
import com.example.mvp.p.mvPview;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewInterface,AdapterView.OnItemClickListener {
    private mvPview mvPview;
    private ProgressBar progressBar;
    private ListView listView;
    private ListView lv;
    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mvPview = new mvPview(this);
        mvPview.handledata();

    }

    @Override
    public void showLoading() {
        pb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        pb.setVisibility(View.GONE);
    }

    @Override
    public void setListItem(List<String> data) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_dropdown_item_1line, data);
        lv.setAdapter(arrayAdapter);
    }

    @Override
    public void failed() {
        Toast.makeText(this, "load data failse", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showMessage(String message) {

    }

    private void initView() {
        lv = (ListView) findViewById(R.id.lv);
        pb = (ProgressBar) findViewById(R.id.pb);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mvPview.Itemonclik(position);
    }
}
