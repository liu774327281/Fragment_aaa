package qianfeng.com.fragment_aaa;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by liujie on 2016/7/2.
 */
public class MyFargment extends Fragment{
    public static MyFargment newInstance(String title){
        MyFargment fragment = new MyFargment();
        Bundle args = new Bundle();
        args.putString("title", title);
        fragment.setArguments(args);
        return fragment;
    }
}
