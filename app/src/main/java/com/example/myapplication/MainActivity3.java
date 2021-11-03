package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","Task id is"+getTaskId());
        setContentView(R.layout.activity_main3);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        final String yuwen=bundle.getString("yuwen");
        final String shuxue=bundle.getString("shuxue");
        final String yingyu=bundle.getString("yingyu");
        final String jisuanji=bundle.getString("jisuanji");
        final String zonghechengji=bundle.getString("zonghechengji");
        Double yuwen2=Double.parseDouble(yuwen);
        Double shuxue2=Double.parseDouble(shuxue);
        Double yingyu2=Double.parseDouble(yingyu);
        Double jisuanji2=Double.parseDouble(jisuanji);
        Double zonghechengji2=Double.parseDouble(zonghechengji);
        TextView tv_yuwen = (TextView) findViewById(R.id.yuwenbaogao);
        TextView tv_shuxue =(TextView) findViewById(R.id.shuxuebaogao);
        TextView tv_yingyu =(TextView) findViewById(R.id.yingyubaogao);
        TextView tv_jisuanji =(TextView) findViewById(R.id.jisuanjibaogao);
        TextView tv_zonghechengji =(TextView) findViewById(R.id.zonghebaogao);
        if (yuwen2>=90&&yuwen2<=100)
            tv_yuwen.setText("成绩表现优异，继续努力！");
        if (yuwen2>=85&&yuwen2<=89)
            tv_yuwen.setText("成绩良好，再接再厉！");
        if (yuwen2>=75&&yuwen2<=84)
            tv_yuwen.setText("成绩一般，要加把劲了。");
        if (yuwen2>=60&&yuwen2<=74)
            tv_yuwen.setText("你已经处在挂科边缘了！");
        if (yuwen2<60)
            tv_yuwen.setText("哎呀挂科了，重开吧！");

        if (shuxue2>=90&&shuxue2<=100)
            tv_shuxue.setText("成绩表现优异，继续努力！");
        if (shuxue2>=85&&shuxue2<=89)
            tv_shuxue.setText("成绩良好，再接再厉！");
        if (shuxue2>=75&&shuxue2<=84)
            tv_shuxue.setText("成绩一般，要加把劲了。");
        if (shuxue2>=60&&shuxue2<=74)
            tv_shuxue.setText("你已经处在挂科边缘了！");
        if (shuxue2<60)
            tv_shuxue.setText("哎呀挂科了，重开吧！");

        if (yingyu2>=90&&yingyu2<=100)
            tv_yingyu.setText("成绩表现优异，继续努力！");
        if (yingyu2>=85&&yingyu2<=89)
            tv_yingyu.setText("成绩良好，再接再厉！");
        if (yingyu2>=75&&yingyu2<=84)
            tv_yingyu.setText("成绩一般，要加把劲了。");
        if (yingyu2>=60&&yingyu2<=74)
            tv_yingyu.setText("你已经处在挂科边缘了！");
        if (yingyu2<60)
            tv_yingyu.setText("哎呀挂科了，重开吧！");

        if (jisuanji2>=90&&jisuanji2<=100)
            tv_jisuanji.setText("成绩表现优异，继续努力！");
        if (jisuanji2>=85&&jisuanji2<=89)
            tv_jisuanji.setText("成绩良好，再接再厉！");
        if (jisuanji2>=75&&jisuanji2<=84)
            tv_jisuanji.setText("成绩一般，要加把劲了。");
        if (jisuanji2>=60&&jisuanji2<=74)
            tv_jisuanji.setText("你已经处在挂科边缘了！");
        if (jisuanji2<60)
            tv_jisuanji.setText("哎呀挂科了，重开吧！");

        if (zonghechengji2>=90&&zonghechengji2<=100)
            tv_zonghechengji.setText("成绩表现优异，继续努力！");
        if (zonghechengji2>=85&&zonghechengji2<=89)
            tv_zonghechengji.setText("成绩良好，再接再厉！");
        if (zonghechengji2>=75&&zonghechengji2<=84)
            tv_zonghechengji.setText("成绩一般，要加把劲了。");
        if (zonghechengji2>=60&&zonghechengji2<=74)
            tv_zonghechengji.setText("你综合成绩较差，加油啊！");
        if (zonghechengji2<60)
            tv_zonghechengji.setText("综合成绩不合格，多花些心思在学习上吧！");
        Button button3=(Button)findViewById(R.id.tuichu);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
               System.exit(0);
               overridePendingTransition(0,0);
            }
        });
    }
}