package com.example.bai7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class main1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
    }
    int banhmi=15000;
    int comga=35000;
    int miquang=30000;
    int pho=20000;

    int count_banhmi=0;
    int count_comga=0;
    int count_miquang=0;
    int count_pho=0;
    int dolar;

    public void banhmi_btn(View view){
        String dialog_banhmi = "Số lượng: ";
        TextView soluong_banhmi = (TextView) findViewById(R.id.soluong_banhmi);
        TextView tong=(TextView) findViewById(R.id.tongtien);
        count_banhmi++;
        dialog_banhmi += count_banhmi;
        dolar = banhmi*count_banhmi + comga*count_comga + miquang*count_miquang + pho*count_pho;
        tong.setText(dolar + "VND");
        soluong_banhmi.setText(dialog_banhmi);
    }

    public void comga_btn(View view){
        String dialog_comga = "Số lượng: ";
        TextView soluong_comga = (TextView) findViewById(R.id.soluong_comga);
        TextView tong=(TextView) findViewById(R.id.tongtien);
        count_comga++;
        dialog_comga += count_comga;
        dolar = banhmi*count_banhmi + comga*count_comga + miquang*count_miquang + pho*count_pho;
        tong.setText(dolar + "VND");
        soluong_comga.setText(dialog_comga);
    }

    public void miquang_btn(View view){
        String dialog_miquang = "Số lượng: ";
        TextView soluong_miquang = (TextView) findViewById(R.id.soluong_miquang);
        TextView tong=(TextView) findViewById(R.id.tongtien);
        count_miquang++;
        dialog_miquang += count_miquang;
        dolar = banhmi*count_banhmi + comga*count_comga + miquang*count_miquang + pho*count_pho;
        tong.setText(dolar + "VND");
        soluong_miquang.setText(dialog_miquang);
    }

    public void pho_btn(View view){
        String dialog_pho = "Số lượng: ";
        TextView soluong_pho = (TextView) findViewById(R.id.soluong_pho);
        TextView tong=(TextView) findViewById(R.id.tongtien);
        count_pho++;
        dialog_pho += count_pho;
        dolar = banhmi*count_banhmi + comga*count_comga + miquang*count_miquang + pho*count_pho;
        tong.setText(dolar + "VND");
        soluong_pho.setText(dialog_pho);
    }

    public void huy_btn (View view){
        String dialog_banhmi= "Số lượng: ";
        TextView soluong_banhmi = (TextView) findViewById(R.id.soluong_banhmi);
        String dialog_comga = "Số lượng: ";
        TextView soluong_comga = (TextView) findViewById(R.id.soluong_comga);
        String dialog_miquang = "Số lượng: ";
        TextView soluong_miquang = (TextView) findViewById(R.id.soluong_miquang);
        String dialog_pho = "Số lượng: ";
        TextView soluong_pho = (TextView) findViewById(R.id.soluong_pho);
        TextView tong = (TextView) findViewById(R.id.tongtien);
        count_banhmi=0;
        count_comga=0;
        count_pho=0;
        count_miquang=0;
        dialog_banhmi += count_banhmi;
        dialog_comga += count_comga;
        dialog_pho += count_pho;
        dialog_miquang += count_miquang;
        soluong_banhmi.setText(dialog_banhmi);
        soluong_comga.setText(dialog_comga);
        soluong_pho.setText(dialog_pho);
        soluong_miquang.setText(dialog_miquang);
        tong.setText("0 VND");
    }
    public void pay_btn(View view){
        if(count_banhmi != 0 || count_comga != 0 || count_miquang !=0 || count_pho != 0)
        {
            Intent intent = new Intent(main1.this, main2.class);
            startActivity(intent);
        }
    }


}



