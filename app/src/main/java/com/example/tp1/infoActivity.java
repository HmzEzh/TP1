package com.example.tp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tp1.beans.Pizza;
import com.example.tp1.service.ProduitService;

public class infoActivity extends AppCompatActivity {

    ProduitService ps = ProduitService.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Pizza recipes");
        Intent intent = getIntent();
        Pizza pizza = ps.findById(Integer.parseInt(intent.getStringExtra("id")));
        TextView nom = findViewById(R.id.nom);
        ImageView image = findViewById(R.id.image);
        TextView dataisingred = findViewById(R.id.dataisingred);
        TextView descreption = findViewById(R.id.descreption);


        nom.setText(pizza.getNom());
        descreption.setText(pizza.getDescreption());
        dataisingred.setText(pizza.getDataisingred());
        image.setImageResource(pizza.getPhoto());
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = getIntent();
        Pizza pizza = ps.findById(Integer.parseInt(intent.getStringExtra("id")));
        switch (item.getItemId()){
            case R.id.share:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, pizza.getNom()+"\n---------descreption---------\n"+pizza.getDescreption()+"\n---------ingredients---------\n"+pizza.getDataisingred());
                sendIntent.setType("text/plain");
                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}