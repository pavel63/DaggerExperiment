package com.example.ios_razrab.daggerexperiments;

import dagger.Module;
import dagger.Provides;

@Module
public class BooleanModuleee {

    @Provides
    Boolean getBll(){

        return true;
    }
}
