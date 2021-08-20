package uk.ac.tees.aad.W9462875;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CharityView extends AppCompatActivity {

    SharedPreferences sharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charity_view);
         sharedPref = getSharedPreferences("selectedCharity", Context.MODE_PRIVATE);

        ImageView imageView = findViewById(R.id.imagemain);
        TextView title  = findViewById(R.id.textViewtitle);
        TextView description = findViewById(R.id.textViewdes);
        TextView bank   =  findViewById(R.id.textViewbank);
        Button btn = findViewById(R.id.viewin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent =  new Intent(getApplicationContext(),MapsActivity.class);
               intent.putExtra("lat",sharedPref.getFloat("lat",0));
               intent.putExtra("lng",sharedPref.getFloat("lng",0));
               intent.putExtra("name",sharedPref.getString("name",""));
               startActivity(intent);
            }
        });



        title.setText(sharedPref.getString("name",""));
        description.setText(sharedPref.getString("des",""));
        bank.setText("BANK ACC: "+sharedPref.getString("bank",""));
        Glide.with(getApplicationContext()).load(sharedPref.getString("image","")).into(imageView);
    }
}
