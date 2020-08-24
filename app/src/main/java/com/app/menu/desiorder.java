package com.app.menu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class desiorder extends AppCompatActivity {

    ListView listView;
    String mFood [] = {"Karahi", "Bihari Boti","Biryani"};
    String mChoice [] = {"chicken/beef","chicken/beef","mutton/beef/chicken"};
    int images[] = {R.drawable.image4, R.drawable.image9, R.drawable.image5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desiorder);
        listView = findViewById(R.id.List1);
        MyAdapter adapter = new MyAdapter(this, mFood,mChoice,images );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Toast.makeText(desiorder.this, "Order tranfered",Toast.LENGTH_SHORT);
                }
            }
        });
        }
        class MyAdapter extends ArrayAdapter<String>
        {
        Context context;
        String rFood [];
        String rChoice [];
        int rimages [];
        MyAdapter (Context c, String Food[], String Choice [], int mimages []){
            super(c, R.layout.list, R.id.txtview1,Food);
            this.context=c;
            this.rFood = Food;
            this.rChoice = Choice;
            this.rimages =mimages;

        }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View list = layoutInflater.inflate(R.layout.list,parent,false);
                ImageView myimages = list.findViewById(R.id.iv1);
                TextView myFood = list.findViewById(R.id.txtview1);
                TextView myChoice = list.findViewById(R.id.txtview2);
                myimages.setImageResource(rimages[position]);
                myChoice.setText(rChoice[position]);
                myFood.setText(rFood[position]);

                return list;

            }
        }


}
