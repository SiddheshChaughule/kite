package com.example.kite.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.kite.R;
import com.example.kite.adapter.ViewPagerAdapter;
import com.example.kite.fragment.viewPagerWatchlist.WatchlistPageOneFragment;
import com.example.kite.fragment.viewPagerWatchlist.WatchlistPageThreeFragment;
import com.example.kite.fragment.viewPagerWatchlist.WatchlistPageTwoFragment;
import com.google.android.material.tabs.TabLayout;


public class WatchlistFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    public WatchlistFragment() {
        // Required empty public constructor
    }

    public static WatchlistFragment newInstance(String param1, String param2) {
        WatchlistFragment fragment = new WatchlistFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_watchlist, container, false);

        viewPager = view.findViewById(R.id.pager);

        // setting up the adapter
        viewPagerAdapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());

        // add the fragments
        viewPagerAdapter.add(new WatchlistPageOneFragment(), "Favorites");
        viewPagerAdapter.add(new WatchlistPageTwoFragment(), "My List");
        viewPagerAdapter.add(new WatchlistPageThreeFragment(), "Must Watch");

        // Set the adapter
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout = view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }
}