package com.saket.jetpackdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.saket.jetpackdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User myUser = new User();
/*        myUser.setFirstName("Saket");
        myUser.setLastName("Shriwas");*/
        binding.setUser(myUser);
        binding.setHandler(new MyClickHandler(this));
    }
}
