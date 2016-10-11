package qianfeng.com.fragment_aaa;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by liujie on 2016/6/25.
 */
public class BlankFragmentAdapter extends FragmentPagerAdapter{
    private final Context context;
    private List<MyFargment> fragments;
    private List<String> titles;

    public BlankFragmentAdapter(List<MyFargment> fragments, List<String> titles, FragmentManager fm, Context context){
        super(fm);
        this.context = context;
       
        this.fragments=fragments;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position){
        return fragments.get(position);
    }

    @Override
    public int getCount(){
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return titles.get(position);
    }
}
