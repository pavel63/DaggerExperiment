package com.example.ios_razrab.daggerexperiments;

import dagger.Module;
import dagger.Provides;

@Module
public class IntegerModule {

    @Provides
    Integer getInteger(){

        return 5;
    }

}
