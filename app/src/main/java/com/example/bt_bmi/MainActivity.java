package com.example.bt_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etChieucao, etCannang;
    Button btn_tinh;
    TextView txt_ketqua, txt_nhanxet;
    double ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etChieucao = findViewById(R.id.et_chieucao);
        etCannang = findViewById(R.id.et_cannang);
        btn_tinh = findViewById(R.id.btn_tinh);
        txt_ketqua = findViewById(R.id.txt_ketqua);
        txt_nhanxet = findViewById(R.id.txt_nhanxet);

        btn_tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double chieucao = Double.parseDouble(etChieucao.getText().toString()) / 100;
                double cannang = Double.parseDouble(etCannang.getText().toString());
                ketqua = Math.round(cannang / Math.pow(chieucao, 2) * 10.0) / 10.0;
                if (ketqua < 18) {
                    txt_ketqua.setText(String.valueOf(ketqua));
                    txt_nhanxet.setText("Người gầy");
                } else if (ketqua < 24.9) {
                    txt_ketqua.setText(String.valueOf(ketqua));
                    txt_nhanxet.setText("Người bình thường");
                } else if (ketqua < 29.9) {
                    txt_ketqua.setText(String.valueOf(ketqua));
                    txt_nhanxet.setText("Người béo phì đô I");
                } else if (ketqua < 34.9) {
                    txt_ketqua.setText(String.valueOf(ketqua));
                    txt_nhanxet.setText("Người béo phì độ IIg");
                } else {
                    txt_ketqua.setText(String.valueOf(ketqua));
                    txt_nhanxet.setText("Người béo phì độ III");
                }
            }
        });
    }
}