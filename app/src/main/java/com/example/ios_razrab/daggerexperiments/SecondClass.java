package com.example.ios_razrab.daggerexperiments;

import android.util.Log;

import javax.inject.Inject;

public class SecondClass {

    @Inject
    String string;


    public void printResult(){

        DaggerStrComponent .create() .inject(this);
        Log .i("SecondResult: ",string);
    }

}
