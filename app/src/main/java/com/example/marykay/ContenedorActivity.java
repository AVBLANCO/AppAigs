package com.example.marykay;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ContenedorActivity extends AppCompatActivity {
    private TabItem reporte;
    private TabItem lista;
    private TabItem favoritos;
    private TabLayout tabLayout;
    private ViewPager contenedor;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor);
        this.tabLayout = findViewById(R.id.my_tabLayout);
        this.reporte = findViewById(R.id.verReportes);
        this.lista = findViewById(R.id.verLista);
        this.favoritos = findViewById(R.id.verFavoritos);
        this.contenedor = findViewById(R.id.contenedor_fragment);
        this.pagerAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        contenedor.setAdapter(this.pagerAdapter);

    }



}
