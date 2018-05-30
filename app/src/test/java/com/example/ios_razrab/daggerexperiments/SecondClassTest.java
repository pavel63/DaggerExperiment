package com.example.ios_razrab.daggerexperiments;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondClassTest {

    SecondClass secondClass;
    @Before
    public void setUp() throws Exception {
        secondClass =new SecondClass();
    }

    @Test
    public void printResult() {
        // обратить внимание, что здесь инджектим не путем this
        DaggerStrComponent .create() .inject(secondClass);
        // И проверяем что не нулл .А если закомментить строку выше, то тест завалится
        assertNotNull(secondClass .string);
    }

    @After
    public void tearDown() throws Exception {
     secondClass = null;
    }

}