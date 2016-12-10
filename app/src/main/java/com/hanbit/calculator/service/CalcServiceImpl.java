package com.hanbit.calculator.service;

import com.hanbit.calculator.domain.CalcDTO;

/**
 * Created by hb2004 on 2016-12-10.
 */

public class CalcServiceImpl implements CalcService{
    @Override
    public int plus(CalcDTO param) {
       // int num1 = param.getNum1();
        // int num2 = param.getNum2();

        return param.getNum1() + param.getNum2() ;
    }

    @Override
    public int minus(CalcDTO param) {
        return param.getNum1() - param.getNum2() ;
    }

    @Override
    public int multi(CalcDTO param) {
        return param.getNum1() * param.getNum2() ;
    }

    @Override
    public int divide(CalcDTO param) {
        return param.getNum1() / param.getNum2() ;
    }

    @Override
    public int mod(CalcDTO param) {
        return param.getNum1() % param.getNum2() ;
    }
}
