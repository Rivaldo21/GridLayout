package com.example.gridlayout;

import android.os.Bundle;
import android.view.SubMenu;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pojo> arrayList;
    GridView gridView;
    AdapaterGridView adapaterGridView;
    SubMenu subMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_list);

        gridItemShow();

        adapaterGridView = new AdapaterGridView(this, arrayList);
        gridView.setAdapter(adapaterGridView);
    }

    private void gridItemShow() {
        arrayList = new ArrayList<Pojo>();

        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Realme", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Xiomi", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Advan", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Vivo", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Politron", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "LG", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Sony", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Google Pixel", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));
        arrayList.add(new Pojo("Mobile", "Samsung", R.drawable.ic_launcher_background));

    }
}