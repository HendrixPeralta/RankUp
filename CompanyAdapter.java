package com.hdx.rankup;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<ModelCompany> mlist;

    CompanyAdapter (Context context, ArrayList<ModelCompany> list) {
        mContext = context;
        mlist = list;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.information_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ModelCompany companyItem = mlist.get(position);
        ImageView image = holder.itemImage;
        TextView name, address, salaryRank, ambientRank;


        name = holder.itemName;
        salaryRank = holder.itemSalaryRank;
        ambientRank = holder.itemAmbientRank;

        image.setImageResource(companyItem.getImage());

        name.setText(companyItem.getName());
//        address.setText(companyItem.getAddress());
        salaryRank.setText(companyItem.getSalaryRank());
        ambientRank.setText(companyItem.getAmbientRank());

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemName, itemAddress, itemSalaryRank, itemAmbientRank;
        public ViewHolder(View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            itemName = itemView.findViewById(R.id.item_name);
            itemAddress = itemView.findViewById(R.id.item_address);
            itemSalaryRank = itemView.findViewById(R.id.item_salary_rank);
            itemAmbientRank = itemView.findViewById(R.id.item_ambient_rank);
        }
    }
}
