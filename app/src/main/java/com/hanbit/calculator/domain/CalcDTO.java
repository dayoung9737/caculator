package com.hanbit.calculator.domain;

/**
 * Created by hb2004 on 2016-12-10.
 */

public class CalcDTO { //pojo
    private int num1, num2; //은닉화

    public int getNum1() { //읽기
        return num1;
    }

    public void setNum1(int num1) { //쓰기
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
