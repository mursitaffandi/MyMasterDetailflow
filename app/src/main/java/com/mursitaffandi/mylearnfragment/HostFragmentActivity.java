package com.mursitaffandi.mylearnfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mursitaffandi.mylearnfragment.data.ImageAssets;

public class HostFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_fragment);
        if (savedInstanceState==null){
            BodyPartFragement headFragment = new BodyPartFragement();
            headFragment.setmImageIds(ImageAssets.getHeads());
            headFragment.setmListIndex(1);

        }
    }
}
