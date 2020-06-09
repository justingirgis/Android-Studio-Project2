package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private ImageButton leftButton;
    private ImageButton rightButton;
    private CheckBox checkboxGallery;
    GridView simpleGrid;
    private PictureGalleryFragment pictureFragment;
    int imageCount = 1;

    int animals[] = {R.drawable.animal1, R.drawable.animal2, //add this Mark
            R.drawable.animal3,
            R.drawable.animal4, R.drawable.animal5,
            R.drawable.animal6,
            R.drawable.animal7, R.drawable.animal8};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.animal1);



        leftButton = findViewById(R.id.imageButtonLeft);
        rightButton = findViewById(R.id.imageButtonRight);

        rightButton.setOnClickListener(v -> {

            incrementImageCount();
            pictureFragment = PictureGalleryFragment.newInstance("animal",getImageCount());

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.pictureGalleryFragment, pictureFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        });



        leftButton.setOnClickListener(v -> {

            decrementImageCount();
            pictureFragment = PictureGalleryFragment.newInstance("animal",getImageCount());

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.pictureGalleryFragment, pictureFragment);
            transaction.addToBackStack(null);
            transaction.commit();

        });

        /**********************MY ADDED CODE***********************/
        checkboxGallery = (CheckBox) findViewById(R.id.checkBoxGallery);

        checkboxGallery.setOnClickListener(v -> {
            simpleGrid = findViewById(R.id.simpleGridView);
            CustomAdapter customAdapter = new
                    CustomAdapter(getApplicationContext(), animals);
            simpleGrid.setAdapter(customAdapter);
        });


    }

    public int getImageCount() {
        return imageCount;
    }

    public void incrementImageCount() {
        if(imageCount < 8) {
            imageCount++;
        }
    }

    public void decrementImageCount() {
        if(imageCount > 1) {
            imageCount--;
        }
    }
}


