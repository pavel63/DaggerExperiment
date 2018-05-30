package com.example.ios_razrab.daggerexperiments;

import dagger.Component;

@Component(modules = {StringModule .class, BooleanModuleee .class, IntegerModule .class})
public interface StrComponent {

    void injectMa(MainActivity mainActivity);

    void inject(SecondClass secondClass);
   // String getStringoo();
   // Boolean getBll();
}
