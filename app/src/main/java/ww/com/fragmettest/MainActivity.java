package ww.com.fragmettest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import ww.com.fragmettest.fragment.FragmentFactory;
import ww.com.fragmettest.fragment.LeftFragment;

public class MainActivity extends AppCompatActivity  {

    private Button btn;
    private boolean aBoolean =false;
    private LeftFragment leftFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftFragment = (LeftFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_left);
        leftFragment.lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment = FragmentFactory.getFragment(position);
                replaceFragment(fragment);
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FragmentTransaction replace = transaction.replace(R.id.right_layout,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private Fragment getFragmentInsyance(){
        LeftFragment leftFragment = (LeftFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_left);
        return leftFragment;

    }
}
