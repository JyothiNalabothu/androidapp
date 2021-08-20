package uk.ac.tees.aad.W9462875;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CharityListAdapter extends ArrayAdapter<Charity> {

    public CharityListAdapter(Context context, ArrayList<Charity> userArrayList){

        super(context,R.layout.list,userArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Charity user = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.imagelogo);
        TextView title = convertView.findViewById(R.id.title);
        TextView description = convertView.findViewById(R.id.description);
        TextView location = convertView.findViewById(R.id.locationMa);
        location.setText(user.getAddress());


        title.setText(user.getName());
        description.setText(user.getDescription());
        Glide.with(convertView).load(user.getImage()).into(imageView);


        return convertView;
    }
}
