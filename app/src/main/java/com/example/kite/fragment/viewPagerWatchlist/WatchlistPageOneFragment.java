package com.example.kite.fragment.viewPagerWatchlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kite.R;
import com.example.kite.adapter.ListDetailsAdapter;
import com.example.kite.model.CompanyModel;

import java.util.ArrayList;
import java.util.List;

public class WatchlistPageOneFragment extends Fragment {

    private RecyclerView rv_company;
    private List<CompanyModel> companyModels;

    public WatchlistPageOneFragment() {
        // required empty public constructor.
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_watchlist_page_one, container, false);

        rv_company = view.findViewById(R.id.rv_company);
        rv_company.setHasFixedSize(true);
        rv_company.setItemAnimator(new DefaultItemAnimator());
        rv_company.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListDetailsAdapter mAdapter = new ListDetailsAdapter(getActivity(), getModel());
        rv_company.setAdapter(mAdapter);

        return view;
    }

    private List<CompanyModel> getModel() {
        companyModels = new ArrayList<>();
        CompanyModel model1 = new CompanyModel("SENSEX", "INDICES", "61560.64", "-371.83(-0.60%)");
        companyModels.add(model1);
        CompanyModel model2 = new CompanyModel("NIFTY50", "INDICES", "18181.75", "-104.75(-0.57%)");
        companyModels.add(model2);
        CompanyModel model3 = new CompanyModel("ASTRON", "NSE", "26.05", "-0.35(-1.33%)");
        companyModels.add(model3);
        CompanyModel model4 = new CompanyModel("ASIANPAINT", "NSE", "3092.45", "-45.65(-1.45%)");
        companyModels.add(model4);
        CompanyModel model5 = new CompanyModel("RITES", "NSE", "396.50", "+8.15(+2.10%)");
        companyModels.add(model5);
        CompanyModel model6 = new CompanyModel("BHEL", "NSE", "82.30", "+0.74(+0.91%)");
        companyModels.add(model6);
        CompanyModel model7 = new CompanyModel("SENSEX", "INDICES", "61560.64", "-371.83(-0.60%)");
        companyModels.add(model7);
        CompanyModel model8 = new CompanyModel("NIFTY50", "INDICES", "18181.75", "-104.75(-0.57%)");
        companyModels.add(model8);
        CompanyModel model9 = new CompanyModel("ASTRON", "NSE", "26.05", "-0.35(-1.33%)");
        companyModels.add(model9);

        return companyModels;
    }
}