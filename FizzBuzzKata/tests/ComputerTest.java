package com.fizzbuzz;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputerTest {

    private static Computer computer;


    @BeforeAll
    static void setUp(){
        computer = new Computer();
    }

    @Test
    public void shouldReturnSameNumber(){
        for(int i=1;i<=100;i++){
            if(i % 3 != 0 && i % 5 != 0){
                assertEquals(String.valueOf(i),computer.computeNumber(i));
            }

        }

    }

    @Test
    public void shouldReturnFizzWhenDivisibleBy3(){
        for(int i = 3; i <= 100; i=i+3){
            if(i % 5 != 0){
                assertEquals( "Fizz",computer.computeNumber(i));
            }
        }

    }

    @Test
    public void shouldReturnBuzzWhenDivisibleBy5(){
        for(int i = 5; i <= 100; i=i+5){
            if(i % 3 != 0){
                assertEquals( "Buzz",computer.computeNumber(i));
            }
        }

    }

    @Test
    public void shouldReturnFizzBuzzWhenDivisibleBy3And5(){
        for(int i = 5; i <= 100; i=i+5){
            if(i % 3 == 0){
                assertEquals( "FizzBuzz",computer.computeNumber(i));
            }
        }

    }


}