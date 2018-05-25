package com.example.ios_razrab.daggerexperiments;

import dagger.Component;

@Component(modules = {StringModule .class, BooleanModuleee .class})
public interface StrComponent {

    String getStringoo();
    Boolean getBll();
}
