package qianfeng.com.fragment_aaa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangsong on 2016/3/31.
 */
public class FoodHomeFragment extends Fragment{

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<String> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_my, null);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        initData();
        return view;
    }

    private void initData(){
        list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("田七");
        list.add("王八");
        List<MyFargment> myfragment = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            myfragment.add(MyFargment.newInstance(list.get(i)));
        }

        BlankFragmentAdapter a = new BlankFragmentAdapter(myfragment, list, getChildFragmentManager(), getContext());
        viewPager.setAdapter(a);
        tabLayout.setupWithViewPager(viewPager);
    }





}
