package com.hanbit.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hanbit.calculator.domain.CalcDTO;
import com.hanbit.calculator.service.CalcService;
import com.hanbit.calculator.service.CalcServiceImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{//필드 instance 변수로
    //
    EditText etNum1, etNum2;
    Button btPlus,btMinus,btMultl,btDivied,btMod,btEqual;
    TextView tvResult ;
    int result;
    CalcService service;
    CalcDTO cal;




    //클래스안에는 메소드

    @Override //다형성
    protected void onCreate(Bundle savedInstanceState) {//area -> 지역변수
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 =(EditText)findViewById(R.id.etNum2);
        btPlus = (Button) findViewById(R.id.btPlus);
        btMinus = (Button)findViewById(R.id.btMinus);
        btDivied = (Button)findViewById(R.id.btDivied);
        btMultl = (Button)findViewById(R.id.btMultl);
        btEqual = (Button)findViewById(R.id.btEqual);
        btMod=(Button)findViewById(R.id.btMod);
        tvResult=(TextView)findViewById(R.id.tvResult);

       //버튼누르면 밑에 온클릭 리스너가 작동
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btDivied.setOnClickListener(this);
        btMultl.setOnClickListener(this);
        btEqual.setOnClickListener(this);
        btMod.setOnClickListener(this);
        service= new CalcServiceImpl();
        cal = new CalcDTO();



    //메소드 안
    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(String.valueOf(etNum1.getText()));
        int num2 = Integer.parseInt(String.valueOf(etNum2.getText()));

        cal.setNum1(num1);
        cal.setNum2(num2);

        //String 타입인데 getText 타입으로 들어옴
        //et.Num1.getText().toString -> String 타입으로 변환
        //num1은 숫자니까 String 에서 int 로 변환 후 alt +enter .parse int로



        switch (v.getId()) {
            case R.id.btPlus:
                result = service.plus(cal);
                break;

            case R.id.btMinus:
                result = num1 - num2 ;
                break;
            case R.id.btDivied:
                result = num1 / num2 ;
                break;

            case R.id.btMultl:
                result = num1 * num2 ;
                break;

            case R.id.btMod:
                result = num1 % num2 ;
                break;

            case R.id.btEqual:
                tvResult.setText("RESULT:"+result);
                break;
        }


    }
}
