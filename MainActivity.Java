package com.example.a16777216.gorilla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

String[] Cities={"Ankara","İstanbul","İzmir","Bursa","Kars","Erzurum","Adiyaman"};
String truth;
Random ali=new Random();
Random siksin= new Random();
Random seni=new Random();
Button degis,b1,b2,b3,b4;
int d1,d2,d3,d4,d,sebek;
TextView tv,tv2,tv3,tv4;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tv=(TextView)findViewById(R.id.textView);
    tv2=(TextView)findViewById(R.id.textView2);
    tv3=(TextView)findViewById(R.id.textView3);
    tv4=(TextView)findViewById(R.id.textView4);
    degis=(Button)findViewById(R.id.button);
    b1=(Button)findViewById(R.id.button2);
    b2=(Button)findViewById(R.id.button3);
    b3=(Button)findViewById(R.id.button4);
    b4=(Button)findViewById(R.id.button5);
    degis.setOnClickListener(this);
    b1.setOnClickListener(this);
    b2.setOnClickListener(this);
    b3.setOnClickListener(this);
    b4.setOnClickListener(this);
}
@Override
public void onClick(View salak){
    switch (salak.getId()){
        case R.id.button:
d=seni.nextInt(7);
while(d==0)
{
d=seni.nextInt(7);
}
tv4.setText(""+d);
sebek=ali.nextInt(d+1);

            tv2.setText(""+sebek);
            truth=Cities[sebek];
            tv.setText(truth);
            d1=siksin.nextInt(d+1);
            tv3.setText(""+d1);
            d2=(d1+d)%(7);
            d3=(d2+d)%(7);
            d4=(d3+d)%(7);
            b1.setText(Cities[d1]);
            b2.setText(Cities[d2]);
            b3.setText(Cities[d3]);
            b4.setText(Cities[d4]);

           /* switch (sebek){
                case 0:
                    d1=1;
                    break;
                case 1:
                    d2=1;
                    break;
                case 2:
                    d3=1;
                    break;
                case 3:
                    d4=1;
                    break;
            }
                                   */
            while((sebek!=d1)&&(sebek!=d2)&&(sebek!=d3)&&(sebek!=d4))
            {
                Toast.makeText(MainActivity.this,"I cant believe its happening",Toast.LENGTH_SHORT).show();
                d=seni.nextInt(7);
                while(d==0)
                {
                    d=seni.nextInt(7);
                }
                tv4.setText(""+d);
                sebek=ali.nextInt(d+1);

                tv2.setText(""+sebek);
                truth=Cities[sebek];
                tv.setText(truth);
                d1=siksin.nextInt(d+1);
                tv3.setText(""+d1);
                d2=(d1+d)%(7);
                d3=(d2+d)%(7);
                d4=(d3+d)%(7);
                b1.setText(Cities[d1]);
                b2.setText(Cities[d2]);
                b3.setText(Cities[d3]);
                b4.setText(Cities[d4]);
            }
            break;
        case R.id.button2:
            if(sebek==d1){
                truet();

            }
            else
            {
                falset();
            }
            break;
        case R.id.button3:
            if(sebek==d2){
                truet();

            }
            else
            {
                falset();
            }
            break;
        case R.id.button4:
            if(sebek==d3){
                truet();

            }
            else
            {
                falset();
            }
            break;
        case R.id.button5:
            if(sebek==d4){
                truet();

            }
            else
            {
                falset();
            }
            break;
    }
}
/*public void submit(){

    if

}*/
public void truet(){
    Toast.makeText(MainActivity.this,"true",Toast.LENGTH_SHORT).show();
}
public void falset(){
    Toast.makeText(MainActivity.this,"false",Toast.LENGTH_SHORT).show();
}}
