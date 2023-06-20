package com.example.fragmenttwo.demothree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fragmenttwo.R;

import java.util.ArrayList;

public class ChatAdapter extends ArrayAdapter
{
    ArrayList al;


    public ChatAdapter(@NonNull Context context, int resource, @NonNull ArrayList  objects) {
        super(context, resource, objects);

        al= objects;

    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater =(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE );
        View view =inflater.inflate(R.layout.chat_box,null);

        ImageView imageView = (ImageView) view.findViewById(R.id.person_images);
        TextView textView = (TextView) view.findViewById(R.id.person_name);

        ChatItems ci =(ChatItems) al.get(position);
        imageView.setImageResource(ci.getPerson_img());
        textView.setText(ci.getPerson_names());

        return view;


    }
}
