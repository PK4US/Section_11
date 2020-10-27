package com.MyApp_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);

        int[] imageRes = new int[]{R.drawable.abc_1, R.drawable.abc_2, R.drawable.abc_3, R.drawable.abc_4, R.drawable.abc_5, R.drawable.abc_6, R.drawable.abc_7, R.drawable.abc_8, R.drawable.abc_9};
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random r = new Random();
                imageView.setImageResource(imageRes[r.nextInt(imageRes.length)]);
            }
        });
    }
}