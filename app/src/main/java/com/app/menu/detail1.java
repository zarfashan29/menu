package com.app.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class detail1 extends AppCompatActivity {
    TextView FoodDescrip;
    ImageView Foodimage;
    Spinner SelectItem;
    String [] item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        FoodDescrip = (TextView) findViewById(R.id.txtdescription);
        Foodimage = (ImageView) findViewById(R.id.imageView);
        //SelectItemspinner = (Spinner) findViewById(R.id.Spinner1);
        //item = getResources().getStringArray(R.array.SelectItem);
        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            FoodDescrip.setText(mBundle.getString("Description"));
            Foodimage.setImageResource(mBundle.getInt("Image"));


            //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item);
            //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            //SelectItemspinner.setAdapter(adapter);

            //SelectItemspinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                //@Override
                //public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                   // Toast.makeText(detail1.this, item[i], Toast.LENGTH_SHORT).show();//

                //}
           // });
        }
    }

}
