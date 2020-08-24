package com.app.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class desginmenu extends AppCompatActivity {
    ViewFlipper V_flip;
    Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desginmenu);
        button1 = (Button)findViewById(R.id.Btndesi);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),desiorder.class));
            }
        });

        int images [] = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4,R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9};
        V_flip = (ViewFlipper)findViewById(R.id.ViewFlip);
        for (int image: images){
            flipperimages(image);
        }

    }
 public void flipperimages(int image){
     ImageView imageView = new ImageView(this);
     imageView.setBackgroundResource(image);
     V_flip.addView(imageView);
     V_flip.setFlipInterval(2000);
     V_flip.setAutoStart(true);
     V_flip.setInAnimation(this, android.R.anim.slide_in_left);
     V_flip.setOutAnimation(this, android.R.anim.slide_out_right);
 }

}
