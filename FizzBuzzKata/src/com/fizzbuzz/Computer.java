package com.spring2020;

public class Computer {

    public Computer() {
    }

    public String computeNumber(int number){
        String computedNumber = "";

        if(number % 3 == 0){
            computedNumber = computedNumber + "Fizz";
        }
        if(number % 5 ==0){
            computedNumber = computedNumber + "Buzz";
        }

        if(computedNumber.isEmpty()){
            computedNumber = String.valueOf(number);
        }


        return computedNumber ;
    }

    public void compute(){
        for(int i=1;i<=100;i++){

            System.out.println(this.computeNumber(i));
        }
    }
}


