package com.example.fragmenttwo.demothree;

public class ChatItems
{
    int person_img;
    String person_names;

    public ChatItems(int person_img, String person_names) {
        this.person_img = person_img;
        this.person_names = person_names;
    }

    //create getter

    public int getPerson_img() {
        return person_img;
    }

    public String getPerson_names() {
        return person_names;
    }


}
