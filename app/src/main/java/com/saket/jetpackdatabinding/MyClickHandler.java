package com.saket.jetpackdatabinding;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {

    Context mContext;
    public MyClickHandler(Context context) {
        mContext = context;
    }

    public void onViewClicked(View view) {
        Toast.makeText(mContext, "View Clicked", Toast.LENGTH_SHORT).show();
        Log.i("MyClickHandler","View Clicked");
    }
}
