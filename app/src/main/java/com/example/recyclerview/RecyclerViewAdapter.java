package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CyclerViewHolder>
{
    private int[] icons;
    private String[] names;

    public RecyclerViewAdapter(int[] icons, String[] names)
    {
        this.icons = icons;
        this.names = names;
    }

    @NonNull
    @Override
    public CyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new CyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CyclerViewHolder holder, int position)
    {
        int image_id = icons[position];
        String name = names[position];
        holder.imageIcon.setImageResource(image_id);
        holder.iconText.setText(name);
    }

    @Override
    public int getItemCount()
    {
        return icons.length;
    }

    public static class CyclerViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageIcon;
        TextView iconText;

        public CyclerViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageIcon = itemView.findViewById(R.id.image_icon);
            iconText = itemView.findViewById(R.id.icon_text);
        }
    }
}
