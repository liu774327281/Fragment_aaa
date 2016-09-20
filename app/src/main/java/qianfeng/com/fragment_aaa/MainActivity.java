package qianfeng.com.fragment_aaa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private ViewPager viewPager;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        List<Fragment> list = new ArrayList<>();
        list.add(new FoodHomeFragment());
        list.add(new HomeFragment());
        HomeFragmentAdapter adapter = new HomeFragmentAdapter(getSupportFragmentManager(), list);
        viewPager = (ViewPager) findViewById(R.id.vp);
        viewPager.setAdapter(adapter);
        radioGroup = (RadioGroup) findViewById(R.id.rb_layout);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels){
            }

            @Override
            public void onPageSelected(int position){
                ((RadioButton) radioGroup.getChildAt(position)).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state){
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                switch(checkedId){
                    case R.id.healthy_life:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.home:
                        viewPager.setCurrentItem(1);
                        break;
                }
            }
        });

        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


}
