package com.pristyn.care.locationlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class hospitalListApater extends RecyclerView.Adapter<hospitalListApater.ViewHolder>{

private ArrayList<String> hospitals = new ArrayList<>();


public hospitalListApater(ArrayList<String> users) {
        this.hospitals= users;
        }


@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hospital_list_item, parent, false);
       final ViewHolder holder = new ViewHolder(view);
        return holder;
        }

@Override
public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ((ViewHolder)holder).hospital.setText(hospitals.get(position));
        ((ViewHolder)holder).address.setText(hospitals.get(position));
        }

@Override
public int getItemCount() {
        return hospitals.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder
{
    TextView hospital, address;

    public ViewHolder(View itemView) {
        super(itemView);
        hospital = itemView.findViewById(R.id.hosptial_name);
        address = itemView.findViewById(R.id.hospital_address);
    }


}

}



