//package com.example.gridlayout;
//
//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.os.Build;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class AdapterRecycle extends RecyclerView.Adapter<AdapterRecycle.MyHolder> {
//
//    Context context;
//    ArrayList<Pojo> arrayList;
//
//    public AdapterRecycle(Context context, ArrayList<Pojo> arrayList) {
//        this.context = context;
//        this.arrayList = arrayList;
//    }
//
//    @NonNull
//    @Override
//    public AdapterRecycle.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.custom_recycle_grid, parent, false);
//        MyHolder myHolder = new MyHolder(view);
//        return myHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyHolder holder, @SuppressLint("RecyclerView") int position) {
//
//        holder.name.setText(arrayList.get(position).getName());
//        holder.image.setImageResource(arrayList.get(position).getImage());
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            holder.itemView.setOnContextClickListener(new View.OnContextClickListener() {
//                @Override
//                public boolean onContextClick(View view) {
//                    Toast.makeText(context, "" + arrayList.get(position).getName(), Toast.LENGTH_SHORT).show();
//                    return true;
//                }
//            });
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        return arrayList.size();
//    }
//
//    public static class MyHolder extends RecyclerView.ViewHolder {
//        TextView name;
//        ImageView image;
//        public MyHolder(@NonNull View itemView) {
//            super(itemView);
//            image = itemView.findViewById(R.id.name);
//            image = itemView.findViewById(R.id.image);
//        }
//    }
//}
