package com.codermonkeys.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView mNavigationView;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationView = findViewById(R.id.bottomNavigation_id);
        mTextView = findViewById(R.id.textView);

        mNavigationView.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.recents_nav:
                mTextView.setText(getResources().getText(R.string.recents));
                break;

            case R.id.favourites_nav:
                mTextView.setText(getResources().getText(R.string.favourites));
                break;

            case R.id.nearby_nav:
                mTextView.setText(getResources().getText(R.string.near_by));
                break;
        }
        return false;
    }
}
