package com.example.industrialpark;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListParkAdapter extends RecyclerView.Adapter<ListParkAdapter.ListViewHolder> {

    private ArrayList<indPark> listPark;

    public ListParkAdapter(ArrayList<indPark> list) {
        this.listPark = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_ipark, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        final indPark indpark = listPark.get(position);
        Glide.with(holder.itemView.getContext())
                .load(indpark.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.parkName.setText(indpark.getName());
        holder.parkLocation.setText(indpark.getLocation());
        holder.parkDeveloper.setText(indpark.getDeveloper());
        holder.parkWide.setText(indpark.getWide());
        holder.parkWeb.setText(indpark.getWeb());
        holder.parkDesc.setText(indpark.getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(holder.itemView.getContext(), "Kamu milih " + listPark.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_LONG).show();
                Intent dtlIntent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                dtlIntent.putExtra(DetailActivity.Extra_ParkName, listPark.get(holder.getAdapterPosition()).getName());
                dtlIntent.putExtra(DetailActivity.Extra_ParkLocation, listPark.get(holder.getAdapterPosition()).getLocation());
                dtlIntent.putExtra(DetailActivity.Extra_ParkWide, listPark.get(holder.getAdapterPosition()).getWide());
                dtlIntent.putExtra(DetailActivity.Extra_ParkDeveloper, listPark.get(holder.getAdapterPosition()).getDeveloper());
                dtlIntent.putExtra(DetailActivity.Extra_ParkWeb, listPark.get(holder.getAdapterPosition()).getWeb());
                dtlIntent.putExtra(DetailActivity.Extra_ParkDesc, listPark.get(holder.getAdapterPosition()).getDesc());
                dtlIntent.putExtra(DetailActivity.Extra_ParkImg, listPark.get(holder.getAdapterPosition()).getPhoto());

                holder.itemView.getContext().startActivity(dtlIntent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listPark.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView parkName, parkLocation, parkDeveloper, parkWeb, parkWide,parkDesc;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            parkName = itemView.findViewById(R.id.tv_ipark_name);
            parkLocation = itemView.findViewById(R.id.tv_ipark_location);
            parkDeveloper = itemView.findViewById(R.id.tv_ipark_developer);
            parkWeb = itemView.findViewById(R.id.tv_ipark_web);
            parkWide = itemView.findViewById(R.id.tv_ipark_wide);
            parkDesc = itemView.findViewById(R.id.tv_ipark_desc);
        }
    }

}
