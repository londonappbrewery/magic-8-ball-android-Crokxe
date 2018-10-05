package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.ballimage)
    ImageView ballimage;
    @BindView(R.id.askButton)
    Button askButton;
    int[] images = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
            R.drawable.ball4, R.drawable.ball5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.askButton)
    public void onViewClicked() {
        Random random = new Random();
        int r = random.nextInt(5);

        ballimage.setImageResource(images[r]);
    }
}
