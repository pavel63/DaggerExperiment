package com.example.ios_razrab.daggerexperiments;

import dagger.Module;
import dagger.Provides;

@Module
public class StringModule {

    @Provides
    public String getStringoo(){
        return "abc";
    }
}
