package com.dima

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {

//        Function<Integer, Integer> func = value -> value + value
//        Closure<Integer> func = value -> value + value

//        Closure func = { value ->
//            println value
//            value + value
//        }

//        Closure func = {
//            println it
//            it + it
//        }

        Closure func = { value = 78 ->
            println value
            value + value
        }

        def result = func()
        println result

        def result1 = func(6)
        println result1

        Stream.of(1, 2,3 ,4)
        .map(func)
//        .map(String::valueOf)
        .map(String.&valueOf)
        .forEach(System.out::println)

        int x = 10
//        check(x > 0, {println (++x)})
        check(x > 0) {
            println (++x)
        }

        println x
    }

    static check(boolean condition, Closure closure) {
        if (condition) {
            closure()
        }
    }
}
