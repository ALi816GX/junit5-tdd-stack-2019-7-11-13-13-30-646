package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/13
 * @Time:21:41
 * @description:
 */
public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @BeforeAll
    static void initTestEnv() {

    }

    @BeforeEach
    void initEveryMethod() {
    }

    @Test
    public void should_return_Fizz_when_call_fizzBuzz_given_3() {
        assertThat(fizzBuzz.fizzBuzz(3), is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_call_fizzBuzz_given_5() {
        assertThat(fizzBuzz.fizzBuzz(5), is("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_call_fizzBuzz_given_7() {
        assertThat(fizzBuzz.fizzBuzz(7), is("Whizz"));
    }

    @Test
    public void should_return_FizzBuzz_when_call_fizzBuzz_given_15() {
        assertThat(fizzBuzz.fizzBuzz(15), is("FizzBuzz"));
    }

    @Test
    public void should_return_FizzWhizz_when_call_fizzBuzz_given_21() {
        assertThat(fizzBuzz.fizzBuzz(21), is("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_call_fizzBuzz_given_35() {
        assertThat(fizzBuzz.fizzBuzz(35), is("BuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_call_fizzBuzz_given_105() {
        assertThat(fizzBuzz.fizzBuzz(105), is("FizzBuzzWhizz"));
    }

    @Test
    public void should_return_8_when_call_fizzBuzz_given_8() {
        assertThat(fizzBuzz.fizzBuzz(8), is("8"));
    }

    @Test
    public void should_return_13_when_call_fizzBuzz_given_13() {
        assertThat(fizzBuzz.fizzBuzz(13), is("Fizz"));
    }


}
