package com.example.kite.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kite.R;
import com.example.kite.model.CompanyModel;
import java.util.List;


public class ListDetailsAdapter extends RecyclerView.Adapter<ListDetailsAdapter.ViewHolder> {
    private static final String TAG = ListDetailsAdapter.class.getName();
    Context mContext;
    List<CompanyModel> list;


    public ListDetailsAdapter(Context mContext, List<CompanyModel> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.company_list_item, parent, false);
        ViewHolder v = new ViewHolder(view);
        return v;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txt_company_name.setText(list.get(position).getCompanyName());
        holder.txt_value.setText(list.get(position).getValue());
        holder.txt_company_type.setText(list.get(position).getType());
        holder.txt_percentage.setText(list.get(position).getPercentage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_company_name, txt_value, txt_company_type, txt_percentage;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_company_name = itemView.findViewById(R.id.txt_company_name);
            txt_value = itemView.findViewById(R.id.txt_value);
            txt_company_type = itemView.findViewById(R.id.txt_company_type);
            txt_percentage = itemView.findViewById(R.id.txt_percentage);
        }
    }
}
