package com.example.fragmenttwo.demothree;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.fragmenttwo.R;

import java.util.ArrayList;

public class Chat extends Fragment {

    ListView lv_chat;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

       view =  inflater.inflate(R.layout.fragment_chat, container, false);

       lv_chat = (ListView) view.findViewById(R.id.lv_chat);

       //creating ArrayList
        ArrayList al = new ArrayList();
        al.add(new ChatItems(R.drawable.nature1,"prachi"));
        al.add(new ChatItems(R.drawable.pinkf,"shree"));
        al.add(new ChatItems(R.drawable.redway,"vivek"));
        al.add(new ChatItems(R.drawable.nature1,"manali"));
        al.add(new ChatItems(R.drawable.pinkf,"ritika"));
        al.add(new ChatItems(R.drawable.redway,"rishi"));

        ChatAdapter chatAdapter = new ChatAdapter(getActivity(),R.layout.chat_box,al);
        lv_chat.setAdapter(chatAdapter);
        return view;
    }
}