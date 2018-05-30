package com.example.ios_razrab.daggerexperiments;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String string;

    @Inject
    Boolean aBoolean;

    @Inject
    Integer integer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // StrComponent strComponent = DaggerStrComponent .builder()
           //     .stringModule(new StringModule())
            //    .booleanModuleee(new BooleanModuleee())
           //     .build();


      //  Log .d("Key", strComponent .getStringoo()+ " " + String .valueOf(strComponent .getBll()) );

        Integer i = integer;
        Log .i("Наш интегер: ", String .valueOf(i));

        DaggerStrComponent .create() .injectMa(this);

        new SecondClass() .printResult();


    }
}
