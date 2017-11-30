package ww.com.fragmettest.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ww.com.fragmettest.R;

import static ww.com.fragmettest.R.id.lv;

/**
 * @author: WANGWEI on 2017/11/30 0030.
 */

public class LeftFragment extends Fragment {

    public ListView lvList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.left_fragment, container, false);

        lvList = (ListView) view.findViewById(lv);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvList.setAdapter(new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,data()));

    }

    private String[] data (){
        String[] strData = new String[10];
        for (int i = 0; i <strData.length ; i++) {
             strData[i] = "this is "+ i + "Message";
        }
        return strData;
    }

    class MyAdapter extends ArrayAdapter<String>{

        public MyAdapter(@NonNull Context context, @LayoutRes int resource, @IdRes int textViewResourceId, @NonNull String[] objects) {
            super(context, resource, textViewResourceId, objects);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            return super.getView(position, convertView, parent);

        }
    }

    public void setOnItemClick(int position){

    }
}
