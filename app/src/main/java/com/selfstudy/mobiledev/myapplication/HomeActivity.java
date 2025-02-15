package com.selfstudy.mobiledev.myapplication;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    private BottomNavigationView bottom_nav_view;
    private FrameLayout fl_fragment_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        bottom_nav_view = findViewById(R.id.bottom_nav_view);
        fl_fragment_container = findViewById(R.id.fl_fragment_container);

        replaceFragment(new HomeFragment());

        bottom_nav_view.setOnItemSelectedListener(item -> {
            String title = item.getTitle().toString();

            if (title.equals(getString(R.string.home))) {
                replaceFragment(new HomeFragment());
            } else if (title.equals(getString(R.string.shop))) {
                replaceFragment(new ShopFragment());
            } else if (title.equals(getString(R.string.bag))) {
                replaceFragment(new BagFragment());
            } else if (title.equals(getString(R.string.favorites))) {
                replaceFragment(new FavoritesFragment());
            } else if (title.equals(getString(R.string.profile))) {
                replaceFragment(new ProfileFragment());
            }

//            switch (item.getItemId()) {
//                case R.id.nav_home:
//                    replaceFragment(new HomeFragment());
//                    break;
//
//                case R.id.nav_shop:
//                    replaceFragment(new ShopFragment());
//                    break;
//
//                case R.id.nav_bag:
//                    replaceFragment(new BagFragment());
//                    break;
//
//                case R.id.nav_favorites:
//                    replaceFragment(new FavoritesFragment());
//                    break;
//
//                case R.id.nav_profile:
//                    replaceFragment(new ProfileFragment());
//                    break;
//            }


            return true;
        });
    }


    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fl_fragment_container, fragment)
                .commit();
    }
}