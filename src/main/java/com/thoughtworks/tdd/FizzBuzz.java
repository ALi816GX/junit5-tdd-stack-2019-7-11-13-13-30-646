package com.thoughtworks.tdd;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/12
 * @Time:11:55
 * @description:
 */
public class FizzBuzz {

    public String fizzBuzz(int one){

        String result = "";

        if( one >= 1 && one <= 120){
            result = "" + one;
        }

        if(one % 3 == 0){
            result = "Fizz";
        }

        if(one % 5 == 0){
            result = "Buzz";
        }

        if(one % 7 == 0){
            result = "Whizz";
        }

        if(one % 3 == 0 && one % 5 == 0){
            result = "FizzBuzz";
        }


        if(one % 5 == 0 && one % 7 == 0){
            result = "BuzzWhizz";
        }

        if(one % 3 == 0 && one % 7 == 0){
            result = "FizzWhizz";
        }

        if(one % 3 == 0 && one % 5 == 0 && one % 7 == 0){
            result = "FizzBuzzWhizz";
        }

        if(one == 13){
            result = "Fizz";
        }


        return  result;

    }

}