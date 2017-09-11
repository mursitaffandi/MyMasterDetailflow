package com.mursitaffandi.mylearnfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BodyPartFragement extends Fragment {
private static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";

    private static final String TAG = "BodyPartFragment";

    private List<Integer> mImageIds;
    private int mListIndex;
    public BodyPartFragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     if (savedInstanceState==null){
         mImageIds= savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
         mListIndex=savedInstanceState.getInt(LIST_INDEX);
     }
        // Inflate the layout for this fragment
    View rootview = inflater.inflate(R.layout.fragment_body_part_fragement, container, false);
        final ImageView imageView = (ImageView) rootview.findViewById(R.id.body_part_image_view);
        if (mImageIds == null) {
            imageView.setImageResource(mImageIds.get(mListIndex));
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mListIndex < mImageIds.size()-1 ) mListIndex++;

                    else mListIndex =0;

                    imageView.setImageResource(mImageIds.get(mListIndex));
                }
            });
        } else Log.d(TAG, "Image ids in Fragment is null");

        return rootview;
    }

    public void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    public void setmListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        outState.putInt(LIST_INDEX, mListIndex);
    }
}
