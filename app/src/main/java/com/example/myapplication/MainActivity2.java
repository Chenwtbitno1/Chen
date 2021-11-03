package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        final String yuwen=bundle.getString("yuwen");
        final String shuxue=bundle.getString("shuxue");
        final String yingyu=bundle.getString("yingyu");
        final String jisuanji=bundle.getString("jisuanji");
        String yuwenxuefen=bundle.getString("yuwenxuefen");
        String shuxuexuefen=bundle.getString("shuxuexuefen");
        String yingyuxuefen=bundle.getString("yingyuxuefen");
        String jisuanjixuefen=bundle.getString("jisuanjixuefen");
        Double zonghechengji=bundle.getDouble("zonghechengji");
        Double yuwen2=Double.parseDouble(yuwen);
        Double shuxue2=Double.parseDouble(shuxue);
        Double yingyu2=Double.parseDouble(yingyu);
        Double jisuanji2=Double.parseDouble(jisuanji);
        String zonghepingji;String wendingxing;
        Double pingjunfen=(yuwen2+shuxue2+yingyu2+jisuanji2)/4;
        TextView tv_zonghepingji =(TextView) findViewById(R.id.zonghepingji);
        TextView tv_wendingxing =(TextView)findViewById(R.id.wendingxing) ;
        if (zonghechengji>=90&&zonghechengji<=100)
            tv_zonghepingji.setText("A");
        if (zonghechengji>=86&&zonghechengji<=89)
            tv_zonghepingji.setText("A-");
        if (zonghechengji>=83&&zonghechengji<=85)
            tv_zonghepingji.setText("B+");
        if (zonghechengji>=80&&zonghechengji<=82)
            tv_zonghepingji.setText("B");
        if (zonghechengji>=76&&zonghechengji<=79)
            tv_zonghepingji.setText("B-");
        if (zonghechengji>=73&&zonghechengji<=75)
            tv_zonghepingji.setText("C+");
        if (zonghechengji>=70&&zonghechengji<=72)
            tv_zonghepingji.setText("C");
        if (zonghechengji>=66&&zonghechengji<=69)
            tv_zonghepingji.setText("C-");
        if (zonghechengji>=63&&zonghechengji<=65)
            tv_zonghepingji.setText("D+");
        if (zonghechengji>=60&&zonghechengji<=62)
            tv_zonghepingji.setText("D");
        if (zonghechengji>=0&&zonghechengji<=59)
            tv_zonghepingji.setText("F");

        if ((yuwen2-pingjunfen)*(yuwen2-pingjunfen)/4+(shuxue2-pingjunfen)*(shuxue2-pingjunfen)/4+(yingyu2-pingjunfen)*(yingyu2-pingjunfen)/4+(jisuanji2-pingjunfen)*(jisuanji2-pingjunfen)/4>=0&&(yuwen2-pingjunfen)*(yuwen2-pingjunfen)/4+(shuxue2-pingjunfen)*(shuxue2-pingjunfen)/4+(yingyu2-pingjunfen)*(yingyu2-pingjunfen)/4+(jisuanji2-pingjunfen)*(jisuanji2-pingjunfen)/4<=0.99)
            tv_wendingxing.setText("优秀");
        if ((yuwen2-pingjunfen)*(yuwen2-pingjunfen)/4+(shuxue2-pingjunfen)*(shuxue2-pingjunfen)/4+(yingyu2-pingjunfen)*(yingyu2-pingjunfen)/4+(jisuanji2-pingjunfen)*(jisuanji2-pingjunfen)/4>=1&&(yuwen2-pingjunfen)*(yuwen2-pingjunfen)/4+(shuxue2-pingjunfen)*(shuxue2-pingjunfen)/4+(yingyu2-pingjunfen)*(yingyu2-pingjunfen)/4+(jisuanji2-pingjunfen)*(jisuanji2-pingjunfen)/4<=3.99)
            tv_wendingxing.setText("优秀");
        if ((yuwen2-pingjunfen)*(yuwen2-pingjunfen)/4+(shuxue2-pingjunfen)*(shuxue2-pingjunfen)/4+(yingyu2-pingjunfen)*(yingyu2-pingjunfen)/4+(jisuanji2-pingjunfen)*(jisuanji2-pingjunfen)/4>=4&&(yuwen2-pingjunfen)*(yuwen2-pingjunfen)/4+(shuxue2-pingjunfen)*(shuxue2-pingjunfen)/4+(yingyu2-pingjunfen)*(yingyu2-pingjunfen)/4+(jisuanji2-pingjunfen)*(jisuanji2-pingjunfen)/4<=9.99)
            tv_wendingxing.setText("优秀");
        if ((yuwen2-pingjunfen)*(yuwen2-pingjunfen)/4+(shuxue2-pingjunfen)*(shuxue2-pingjunfen)/4+(yingyu2-pingjunfen)*(yingyu2-pingjunfen)/4+(jisuanji2-pingjunfen)*(jisuanji2-pingjunfen)/4>=10)
            tv_wendingxing.setText("优秀");


        TextView tv_yuwen = (TextView) findViewById(R.id.yuwen);
        TextView tv_shuxue =(TextView) findViewById(R.id.shuxue);
        TextView tv_yingyu =(TextView) findViewById(R.id.yingyu);
        TextView tv_jisuanji =(TextView) findViewById(R.id.jisuanji);
        TextView tv_yuwenxuefen = (TextView) findViewById(R.id.yuwenxuefen);
        TextView tv_shuxuexuefen =(TextView) findViewById(R.id.shuxuexuefen);
        TextView tv_yingyuxuefen =(TextView) findViewById(R.id.yingyuxuefen);
        TextView tv_jisuanjixuefen =(TextView) findViewById(R.id.jisuanjixuefen);
        TextView tv_zonghechengji =(TextView)findViewById(R.id.zonghechengji) ;
        TextView tv_yuwendengji = (TextView) findViewById(R.id.yuwendengji);
        TextView tv_shuxuedengji =(TextView) findViewById(R.id.shuxuedengji);
        TextView tv_yingyudengji =(TextView) findViewById(R.id.yingyudengji);
        TextView tv_jisuanjidengji =(TextView) findViewById(R.id.jisuanjidengji);
        if (yuwen2>=90&&yuwen2<=100)
            tv_yuwendengji.setText("等级A\n绩点4.0");
        if (yuwen2>=86&&zonghechengji<=89)
            tv_yuwendengji.setText("等级A-\n绩点3.7");
        if (zonghechengji>=83&&zonghechengji<=85)
            tv_yuwendengji.setText("等级B+\n绩点3.3");
        if (zonghechengji>=80&&zonghechengji<=82)
            tv_yuwendengji.setText("等级B\n绩点3.0");
        if (zonghechengji>=76&&zonghechengji<=79)
            tv_yuwendengji.setText("等级B-\n绩点2.7");
        if (zonghechengji>=73&&zonghechengji<=75)
            tv_yuwendengji.setText("等级C+\n绩点2.3");
        if (zonghechengji>=70&&zonghechengji<=72)
            tv_yuwendengji.setText("等级C\n绩点2.0");
        if (zonghechengji>=66&&zonghechengji<=69)
            tv_yuwendengji.setText("等级C-\n绩点1.7");
        if (zonghechengji>=63&&zonghechengji<=65)
            tv_yuwendengji.setText("等级D+\n绩点1.3");
        if (zonghechengji>=60&&zonghechengji<=62)
            tv_yuwendengji.setText("等级D\n绩点1.0");
        if (zonghechengji>=0&&zonghechengji<=59)
            tv_yuwendengji.setText("等级F\n绩点0");

        if (shuxue2>=90&&shuxue2<=100)
            tv_shuxuedengji.setText("等级A\n绩点4.0");
        if (shuxue2>=86&&shuxue2<=89)
            tv_shuxuedengji.setText("等级A-\n绩点3.7");
        if (shuxue2>=83&&shuxue2<=85)
            tv_shuxuedengji.setText("等级B+\n绩点3.3");
        if (shuxue2>=80&&shuxue2<=82)
            tv_shuxuedengji.setText("等级B\n绩点3.0");
        if (shuxue2>=76&&shuxue2<=79)
            tv_shuxuedengji.setText("等级B-\n绩点2.7");
        if (shuxue2>=73&&shuxue2<=75)
            tv_shuxuedengji.setText("等级C+\n绩点2.3");
        if (shuxue2>=70&&shuxue2<=72)
            tv_shuxuedengji.setText("等级C\n绩点2.0");
        if (shuxue2>=66&&shuxue2<=69)
            tv_shuxuedengji.setText("等级C-\n绩点1.7");
        if (shuxue2>=63&&shuxue2<=65)
            tv_shuxuedengji.setText("等级D+\n绩点1.3");
        if (shuxue2>=60&&shuxue2<=62)
            tv_shuxuedengji.setText("等级D\n绩点1.0");
        if (shuxue2>=0&&shuxue2<=59)
            tv_shuxuedengji.setText("等级F\n绩点0");

        if (yingyu2>=90&&yingyu2<=100)
            tv_yingyudengji.setText("等级A\n绩点4.0");
        if (yingyu2>=86&&yingyu2<=89)
            tv_yingyudengji.setText("等级A-\n绩点3.7");
        if (yingyu2>=83&&yingyu2<=85)
            tv_yingyudengji.setText("等级B+\n绩点3.3");
        if (yingyu2>=80&&yingyu2<=82)
            tv_yingyudengji.setText("等级B\n绩点3.0");
        if (yingyu2>=76&&yingyu2<=79)
            tv_yingyudengji.setText("等级B-\n绩点2.7");
        if (yingyu2>=73&&yingyu2<=75)
            tv_yingyudengji.setText("等级C+\n绩点2.3");
        if (yingyu2>=70&&yingyu2<=72)
            tv_yingyudengji.setText("等级C\n绩点2.0");
        if (yingyu2>=66&&yingyu2<=69)
            tv_yingyudengji.setText("等级C-\n绩点1.7");
        if (yingyu2>=63&&yingyu2<=65)
            tv_yingyudengji.setText("等级D+\n绩点1.3");
        if (yingyu2>=60&&yingyu2<=62)
            tv_yingyudengji.setText("等级D\n绩点1.0");
        if (yingyu2>=0&&yingyu2<=59)
            tv_yingyudengji.setText("等级F\n绩点0");

        if (jisuanji2>=90&&jisuanji2<=100)
            tv_jisuanjidengji.setText("等级A\n绩点4.0");
        if (jisuanji2>=86&&jisuanji2<=89)
            tv_jisuanjidengji.setText("等级A-\n绩点3.7");
        if (jisuanji2>=83&&jisuanji2<=85)
            tv_jisuanjidengji.setText("等级B+\n绩点3.3");
        if (jisuanji2>=80&&jisuanji2<=82)
            tv_jisuanjidengji.setText("等级B\n绩点3.0");
        if (jisuanji2>=76&&jisuanji2<=79)
            tv_jisuanjidengji.setText("等级B-\n绩点2.7");
        if (jisuanji2>=73&&jisuanji2<=75)
            tv_jisuanjidengji.setText("等级C+\n绩点2.3");
        if (jisuanji2>=70&&jisuanji2<=72)
            tv_jisuanjidengji.setText("等级C\n绩点2.0");
        if (jisuanji2>=66&&jisuanji2<=69)
            tv_jisuanjidengji.setText("等级C-\n绩点1.7");
        if (jisuanji2>=63&&jisuanji2<=65)
            tv_jisuanjidengji.setText("等级D+\n绩点1.3");
        if (jisuanji2>=60&&jisuanji2<=62)
            tv_jisuanjidengji.setText("等级D\n绩点1.0");
        if (jisuanji2>=0&&jisuanji2<=59)
            tv_jisuanjidengji.setText("等级F\n绩点0");


        final String zonghechengji2=String.valueOf(zonghechengji);
        tv_yuwen.setText(yuwen);
        tv_shuxue.setText(shuxue);
        tv_yingyu.setText(yingyu);
        tv_jisuanji.setText(jisuanji);
        tv_yuwenxuefen.setText(yuwenxuefen);
        tv_shuxuexuefen.setText(shuxuexuefen);
        tv_yingyuxuefen.setText(yingyuxuefen);
        tv_jisuanjixuefen.setText(jisuanjixuefen);
        tv_zonghechengji.setText(zonghechengji2);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                Bundle bundle=new Bundle();
                String yuwen2=yuwen;
                String shuxue2=shuxue;
                String yingyu2=yingyu;
                String jisuanji2=jisuanji;
                String zonghechengji=zonghechengji2;
                bundle.putCharSequence("yuwen",yuwen2);
                bundle.putCharSequence("shuxue",shuxue2);
                bundle.putCharSequence("yingyu",yingyu2);
                bundle.putCharSequence("jisuanji",jisuanji2);
                bundle.putCharSequence("zonghechengji",zonghechengji);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }}
