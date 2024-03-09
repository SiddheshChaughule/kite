package com.example.kite;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.kite.fragment.AcountFragment;
import com.example.kite.fragment.BidsFragment;
import com.example.kite.fragment.OrdersFragment;
import com.example.kite.fragment.PortfolioFragment;
import com.example.kite.fragment.WatchlistFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        openFragment(WatchlistFragment.newInstance("", ""));
    }

    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            item -> {
                int id = item.getItemId();
                if (id == R.id.navigation_watchlist) {
                    HomeActivity.this.openFragment(WatchlistFragment.newInstance("", ""));
                    return true;
                } else if (id == R.id.navigation_orders) {
                    HomeActivity.this.openFragment(OrdersFragment.newInstance("", ""));
                    return true;
                } else if (id == R.id.navigation_portfolio) {
                    HomeActivity.this.openFragment(PortfolioFragment.newInstance("", ""));
                    return true;
                } else if (id == R.id.navigation_bids) {
                    HomeActivity.this.openFragment(BidsFragment.newInstance("", ""));
                    return true;
                } else if (id == R.id.navigation_account) {
                    HomeActivity.this.openFragment(AcountFragment.newInstance("", ""));
                    return true;
                }
                return false;
            };
}