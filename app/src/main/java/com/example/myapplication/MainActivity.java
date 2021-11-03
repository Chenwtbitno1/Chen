package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String yuwen=((EditText)findViewById(R.id.et_yuwen)).getText().toString();
                String shuxue=((EditText)findViewById(R.id.et_shuxue)).getText().toString();
                String yingyu=((EditText)findViewById(R.id.et_yingyu)).getText().toString();
                String jisuanji=((EditText)findViewById(R.id.et_jisuanji)).getText().toString();
                String yuwenxuefen=((EditText)findViewById(R.id.et_yuwenxuefen)).getText().toString();
                String shuxuexuefen=((EditText)findViewById(R.id.et_shuxuexuefen)).getText().toString();
                String yingyuxuefen=((EditText)findViewById(R.id.et_yingyuxuefen)).getText().toString();
                String jisuanjixuefen=((EditText)findViewById(R.id.et_jisuanjixuefen)).getText().toString();
                if (!"".equals(yuwen)&&!"".equals(shuxue)&&!"".equals(yingyu)&&!"".equals(jisuanji)&&!"".equals(yuwenxuefen)&&!"".equals(shuxuexuefen)&&!"".equals(yingyuxuefen)&&!"".equals(jisuanjixuefen)){
                Double yuwen2=Double.parseDouble(yuwen);
                Double shuxue2=Double.parseDouble(shuxue);
                Double yingyu2=Double.parseDouble(yingyu);
                Double jisuanji2=Double.parseDouble(jisuanji);
                Double yuwenxuefen2=Double.parseDouble(yuwenxuefen);
                Double shuxuexuefen2=Double.parseDouble(shuxuexuefen);
                Double yingyuxuefen2=Double.parseDouble(yingyuxuefen);
                Double jisuanjixuefen2=Double.parseDouble(jisuanjixuefen);
                Double zonghechengji;
                zonghechengji=(yuwen2*yuwenxuefen2+shuxue2*shuxuexuefen2+yingyu2*yingyuxuefen2+jisuanji2*jisuanjixuefen2)/(yuwenxuefen2+shuxuexuefen2+yingyuxuefen2+jisuanjixuefen2);

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                Bundle bundle=new Bundle();
                bundle.putCharSequence("yuwen",yuwen);
                bundle.putCharSequence("shuxue",shuxue);
                bundle.putCharSequence("yingyu",yingyu);
                bundle.putCharSequence("jisuanji",jisuanji);
                bundle.putCharSequence("yuwenxuefen",yuwenxuefen);
                bundle.putCharSequence("shuxuexuefen",shuxuexuefen);
                bundle.putCharSequence("yingyuxuefen",yingyuxuefen);
                bundle.putCharSequence("jisuanjixuefen",jisuanjixuefen);
                bundle.putDouble("zonghechengji",zonghechengji);
                intent.putExtras(bundle);
                startActivity(intent);}
                else Toast.makeText(MainActivity.this,"请输入完整！",
                Toast.LENGTH_SHORT).show();

            }
        });
    }



}