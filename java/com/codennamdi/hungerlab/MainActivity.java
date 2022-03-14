package com.codennamdi.hungerlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Class variables
    CardView cardViewStarters;
    CardView cardViewMainCourses;
    CardView dessertCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardViewStarters = findViewById(R.id.card_view_starter);
        cardViewMainCourses = findViewById(R.id.card_view_main_courses);
        dessertCardView = findViewById(R.id.card_view_dessert);

        TextView emailTextView = findViewById(R.id.email_id_text_view);


        //Setting onClickListener for the cardViews to act like a button.
        cardViewStarters.setOnClickListener(new View.OnClickListener() {    //For Starters cardView
            @Override
            public void onClick(View view) {

                // We use Intent to move to a new activity
                Intent starterActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(starterActivityIntent);
            }
        });

        cardViewMainCourses.setOnClickListener(new View.OnClickListener() {     //For Main Courses cardView
            @Override
            public void onClick(View view) {
                Intent mainCoursesActivity = new Intent(MainActivity.this, MainCoursesActivity.class);     // <- An Explicit intent
                startActivity(mainCoursesActivity);
            }
        });

        emailTextView.setOnClickListener(new View.OnClickListener() {       //For the email TextView.
            @Override
            public void onClick(View view) {
                Intent launchTheEmailApp = new Intent(Intent.ACTION_SENDTO);
                launchTheEmailApp.setData(Uri.parse("mailto:nnamdi6000@outlook.com"));
                startActivity(launchTheEmailApp);
            }
        });

        dessertCardView.setOnClickListener(new View.OnClickListener() {     //For the dessert cardView
            @Override
            public void onClick(View view) {
                Intent dessertIntent = new Intent(MainActivity.this, DessertActivity.class);
                startActivity(dessertIntent);
            }
        });
    }
}