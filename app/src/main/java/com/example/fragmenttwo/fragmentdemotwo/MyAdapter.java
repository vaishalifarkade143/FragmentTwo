package com.example.fragmenttwo.fragmentdemotwo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


            //using ViewPager
//public class MyAdapter extends FragmentPagerAdapter
//{
//
//    public MyAdapter(@NonNull FragmentManager fm)
//    {
//        super(fm);
//    }
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position)
//    {
//        switch (position)
//      {
//            case 0:
//                FragmentOne one = new FragmentOne();
//                return one;
//            case 1:
//                FragmentTwo two = new FragmentTwo();
//                return two;
//            case 2:
//                FragmentThree three = new FragmentThree();
//                return three;
//            case 3:
//                FragmentFour four = new FragmentFour();
//                return four;
//            default:
//                return null;
//
//        }
//
//    }
//
//    @Override
//    public int getCount() {
//        return 4;
//    }
//}
            //using viewPager2
public class MyAdapter extends FragmentStateAdapter
{
    // override constuctor n menthods
    public MyAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch (position)
        {
            case 0:
                FragmentOne one = new FragmentOne();
                return one;
            case 1:
                FragmentTwo two = new FragmentTwo();
                return two;
            case 2:
                FragmentThree three = new FragmentThree();
                return three;
            case 3:
                FragmentFour four = new FragmentFour();
                return four;
            default:
                return null;

        }

    }

    @Override
    public int getItemCount() {
        return 4; //no of fragment provide
    }
}
