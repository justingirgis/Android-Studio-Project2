package com.example.project2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
public class CustomAdapter extends BaseAdapter {
    Context context; //hello
    int[] animals;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, int[] animals) {
        this.context = applicationContext;
        this.animals = new int[]{R.drawable.animal1, R.drawable.animal2, //add this Mark
                R.drawable.animal3,
                R.drawable.animal4, R.drawable.animal5,
                R.drawable.animal6,
                R.drawable.animal7, R.drawable.animal8};
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return animals.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.icon,null);
        ImageView icon = view.findViewById(R.id.icon);
        icon.setImageResource(animals[i]);

        return view;
    }
}