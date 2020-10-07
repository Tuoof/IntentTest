package com.tuoof.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvPaimon;
    Button btnBalikActivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvPaimon = findViewById(R.id.tv_paimon);
        tvPaimon.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

        btnBalikActivity1 = findViewById(R.id.btn_balik_activity1);
        btnBalikActivity1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_balik_activity1:
                balikActivity1();
                break;
            default:
                break;
        }
    }

    private void balikActivity1() {
        Intent moveIntent = new Intent(ThirdActivity.this, MainActivity.class);
        startActivity(moveIntent);
        this.finish();
    }
}