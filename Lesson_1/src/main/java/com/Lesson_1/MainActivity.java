package com.Lesson_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = findViewById(R.id.imageView);
                String tag = imageView.getTag().toString();
                switch(tag){
                    case "abc_1":{
                        imageView.setImageResource(R.drawable.abc_2);
                        imageView.setTag("abc_2");
                        break;
                    }
                    case "abc_2":{
                        imageView.setImageResource(R.drawable.abc_3);
                        imageView.setTag("abc_3");
                        break;
                    }
                    case "abc_3":{
                        imageView.setImageResource(R.drawable.abc_4);
                        imageView.setTag("abc_4");
                        break;
                    }
                    case "abc_4":{
                        imageView.setImageResource(R.drawable.abc_5);
                        imageView.setTag("abc_5");
                        break;
                    }
                    case "abc_5":{
                        imageView.setImageResource(R.drawable.abc_6);
                        imageView.setTag("abc_6");
                        break;
                    }
                    case "abc_6":{
                        imageView.setImageResource(R.drawable.abc_7);
                        imageView.setTag("abc_7");
                        break;
                    }
                    case "abc_7":{
                        imageView.setImageResource(R.drawable.abc_8);
                        imageView.setTag("abc_8");
                        break;
                    }
                    case "abc_8":{
                        imageView.setImageResource(R.drawable.abc_9);
                        imageView.setTag("abc_9");
                        break;
                    }
                    case "abc_9":{
                        imageView.setImageResource(R.drawable.abc_1);
                        imageView.setTag("abc_1");
                        break;
                    }
                }
            }
        });
    }
}