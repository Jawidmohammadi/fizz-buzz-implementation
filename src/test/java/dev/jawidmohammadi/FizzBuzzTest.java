package dev.jawidmohammadi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void emitResult(){

        Object[][] testCases = {{0, "FizzBuzz"},
                                {3, "Fizz"},
                                {4, "4"},
                                {15, "FizzBuzz"},
                                {10, "Buzz"},
                                {101, "101"}
        };
    }
}
