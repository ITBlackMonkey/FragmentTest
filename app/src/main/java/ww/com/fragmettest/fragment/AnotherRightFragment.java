package ww.com.fragmettest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ww.com.fragmettest.R;

/**
 * @author: WANGWEI on 2017/11/30 0030.
 */

public class AnotherRightFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.another_right_fragment,container,false);
    }
}
