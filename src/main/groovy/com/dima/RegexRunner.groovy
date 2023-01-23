package com.dima

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {
    static void main(String[] args) {
        String value = "one 1 two 22 three 333"
//        String regex = "\\w+ \\d+"
        String regex = /(\w+) (\d+)/

//        Pattern pattern = Pattern.compile(regex)
//        Matcher matcher = pattern.matcher(value)
        Pattern pattern = ~regex
        Matcher matcher = value =~ pattern

//        boolean result = matcher.matches()
        boolean result = value ==~ regex
        println(result)

//        while (matcher.find()) {
//            println matcher.group()
//            println matcher.group(1)
//            println matcher.group(2)
//            println "-----"
//        }

        println matcher[0]
        println matcher[1]
        println matcher[2]

        println matcher[1..2]

        matcher.each { group -> println group}
        matcher.each { group, group1, group2 ->
            println group
            println group1
            println group2
        }
    }
}
