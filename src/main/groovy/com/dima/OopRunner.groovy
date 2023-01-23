package com.dima

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Student implements WithId {
    String firstName;
    String lastName;
    int age;

    def getAt(int n) {
        n == 0 ? firstName: lastName
    }


    def methodMissing(String name, Object args) {
        println "missing method $name is invoked: $args"
    }

    def propertyMissing(String name) {
        println "missing property $name"
    }


    def getInfo() {
        Closure closure = {
            println thisObject
            println owner
            println delegate

            Closure second = {
                println thisObject
                println owner
                println delegate
            } //declaration
            second() //execution
        }
        closure
    }

}

class OopRunner {
    static void main(String[] args) {
        def student = new Student()
        student.firstName = "Ivan" //setFirstName
        println student.firstName // getFirstName
        println student['firstName']
        println student.'firstName'
        println student.@firstName //not recommended

        def student1 = new Student(firstName: "Ivan", lastName: "Ivanov", age: 20, id: 222)
        println student1

        Student student2 = ["Petr", "Petrov", 20]
        println student2

        def (fn, ln) = student2
        println(fn)
        println(ln)

        assert [student1, student2].collect {it.firstName} == ['Ivan', 'Petr']
        assert [student1, student2]*.firstName == ['Ivan', 'Petr']
        assert [student1, student2].firstName == ['Ivan', 'Petr']

        String.mixin(OopRunner)

        "Dima".printStr()
    }

    static def printStr(String self) {
        println "It's mixin $self"
    }
}
