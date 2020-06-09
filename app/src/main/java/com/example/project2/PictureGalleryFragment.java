package com.example.project2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PictureGalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PictureGalleryFragment extends Fragment {

    private ImageView image;
    int counter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PictureGalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PictureGalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PictureGalleryFragment newInstance(String param1, int param2) {
        PictureGalleryFragment fragment = new PictureGalleryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, String.valueOf(param2));
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

        View view;
        view = inflater.inflate(R.layout.fragment_picture_gallery, container, false);
        image = view.findViewById(R.id.imageView);

        //System.out.println(mParam1 + mParam2);
        //String temp = "R.drawable.".concat(mParam1+mParam2);
        String temp = mParam1 + mParam2;
        int drawableResourceId = getContext().getResources().getIdentifier(temp, "drawable", getContext().getPackageName());
        System.out.println(drawableResourceId);
        System.out.println(R.drawable.animal1);
        image.setImageResource(drawableResourceId);


        // Inflate the layout for this fragment
        return view;
    }



}


