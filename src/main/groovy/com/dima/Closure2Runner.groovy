package com.dima

class Closure2Runner {
    static void main(String[] args) {

        Closure closure = {
            firstName = "Sveta"
        }

        def student = new Student("Ivan", "Ivanov", 29)
        println student

        println closure.delegate
        println closure.owner
        println closure.thisObject

//        closure.delegate = student
//        closure.resolveStrategy = Closure.DELEGATE_FIRST
//        closure()

        student.with closure

        println student

        student.getInfo()()
    }
}
