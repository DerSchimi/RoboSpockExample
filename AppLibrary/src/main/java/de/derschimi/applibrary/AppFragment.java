package de.derschimi.applibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.TextView;

/**
 * Created by daniel on 21.09.2014.
 */
public class AppFragment extends Fragment {


    private String name;

    public AppFragment(String name) {
        this.name = name;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View v = inflater.inflate(R.layout.fragment, container, false);

        TextView tv = (TextView) v.findViewById(R.id.fragmentname);
        tv.setText(name);
        return v;
    }


}
