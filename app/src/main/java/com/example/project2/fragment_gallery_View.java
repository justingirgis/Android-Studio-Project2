package com.example.project2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_gallery_View#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_gallery_View extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    GridView listView;

    public fragment_gallery_View() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_gallery_View.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_gallery_View newInstance(String param1, String param2) {
        fragment_gallery_View fragment = new fragment_gallery_View();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery__view, container, false);

        int animals[] = {R.drawable.animal1, R.drawable.animal2, //add this Mark
                R.drawable.animal3,
                R.drawable.animal4, R.drawable.animal5,
                R.drawable.animal6,
                R.drawable.animal7, R.drawable.animal8};

        listView = view.findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new
                CustomAdapter(getContext(), animals);
        listView.setAdapter(customAdapter);

        //listView.setOnItemClickListener(new OnItemClickListener());

        // Inflate the layout for this fragment
        return view;

    }
}