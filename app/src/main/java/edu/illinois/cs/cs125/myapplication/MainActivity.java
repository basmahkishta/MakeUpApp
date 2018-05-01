package edu.illinois.cs.cs125.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/**
 * Main class for our UI design lab.
 */
public final class MainActivity extends AppCompatActivity {

    @Override
    protected  void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void browser1 (View view) {
        Intent mascara = new Intent(Intent.ACTION_VIEW, Uri.parse("http://makeup-api.herokuapp.com/api/v1/products?product_tags=Gluten+Free&product_type=mascara"));
        startActivity(mascara);
    }
    public void browser2 (View view) {
        Intent lipstick = new Intent(Intent.ACTION_VIEW, Uri.parse("http://makeup-api.herokuapp.com/api/v1/products?product_tags=Gluten+Free&product_type=lipstick"));
        startActivity(lipstick);
    }
    public void browser3 (View view) {
        Intent eyeliner = new Intent(Intent.ACTION_VIEW, Uri.parse("http://makeup-api.herokuapp.com/api/v1/products?product_tags=Gluten+Free&product_type=eyeliner"));
        startActivity(eyeliner);
    }
    public void browser4 (View view) {
        Intent eyeliner = new Intent(Intent.ACTION_VIEW, Uri.parse("http://makeup-api.herokuapp.com/api/v1/products?product_tags=Gluten+Free&product_type=foundation"));
        startActivity(eyeliner);
    }

}