package com.example.fragmenttwo.demothree;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WhatsAppAdapter extends FragmentStateAdapter
{
    public WhatsAppAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch (position)
        {
            case 0:
                Chat chat = new Chat();
                return chat;
            case 1:
                Status status = new Status();
                return status;
            case 2:
                return new Call();
            default:
                return  null;
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
