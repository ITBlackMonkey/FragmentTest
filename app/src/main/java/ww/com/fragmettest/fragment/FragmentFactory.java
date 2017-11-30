package ww.com.fragmettest.fragment;

import android.support.v4.app.Fragment;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: WANGWEI on 2017/11/30 0030.
 */

public class FragmentFactory {

    static Map<Integer, Fragment> fragmentMap = new HashMap<>();

    public static Fragment getFragment(int position) {
        Fragment fragment = fragmentMap.get(position);

        if (fragment == null) {

            switch (position) {
                case 0:
                    fragment = new LeftFragment();
                    break;

                case 1:
                    fragment = new RightFragment();
                    break;

                case 2:
                    fragment = new AnotherRightFragment();
                    break;
                case 3:
                    fragment = new Fragment1();
                    break;

                case 4:
                    fragment = new Fragment2();
                    break;

                case 5:
                    fragment = new Fragment3();
                    break;

                case 6:
                    fragment = new Fragment4();
                    break;

                case 7:
                    fragment = new RightFragment();
                    break;

                case 8:
                    fragment = new AnotherRightFragment();
                    break;

                case 9:
                    fragment = new Fragment3();
                    break;

                case 10:
                    fragment = new Fragment1();
                    break;
                default:
                    break;
            }
            fragmentMap.put(position, fragment);
        }
        return fragment;
    }

}
