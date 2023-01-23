package com.dima

class LoopsRunner {
    static void main(String[] args) {

        def list = [0, 1,2,3,4]

        for (i in 0..<list.size()) {
            println(i)
        }
        println "-------------"

        for (value in list) {
            println(value)
        }
        println "-------------"

        0.upto(list.size()) {
            println it
        }
        println "-------------"

        list.size().downto(0) {
            println it
        }
        println "-------------"

        0.step(5, 2) {
            println it
        }


    }
}
