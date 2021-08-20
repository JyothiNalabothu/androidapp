package uk.ac.tees.aad.W9462875;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CharityView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charity_view);

        ImageView imageView = findViewById(R.id.imagemain);
        TextView title  = findViewById(R.id.textViewtitle);
        TextView description = findViewById(R.id.textViewdes);
        TextView bank   =  findViewById(R.id.textViewbank);

        SharedPreferences sharedPref = getSharedPreferences("selectedCharity", Context.MODE_PRIVATE);

        title.setText(sharedPref.getString("name",""));
        description.setText(sharedPref.getString("des",""));
        bank.setText("BANK ACC: "+sharedPref.getString("bank",""));
        Glide.with(getApplicationContext()).load(sharedPref.getString("image","")).into(imageView);
    }
}
