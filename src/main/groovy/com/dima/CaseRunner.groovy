package com.dima

class CaseRunner {
    static void main(String[] args) {
        int x = 12;

        switch (x) {
            case String:
                println 0
                break
            case 5:
                println 1
                break
            case new Person(29):
                println 2
                break
            case ~/\d+/:
                println 3
                break
            case { it % 5 == 0}:
                println 4
                break
            case [0, 3, 5, 9]:
                println 5
                break
            default :
                println "None"
        }

        if (x in [0, 2, 3, 12]) {
            println "yes"
        }
    }
}
