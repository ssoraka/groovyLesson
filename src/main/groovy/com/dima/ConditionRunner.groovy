package com.dima

class Person {
    int id;

    Person(int id) {
        this.id = id
    }

    boolean isCase(Object switchValue) { //switch, in, grep
        println ("invoke isCase " + switchValue)
        return false
    }

    boolean asBoolean() {
        return id > 0;
    }
}

class ConditionRunner {
    /*
    boolean is true
    Collection/Map
    Matcher has match
    String/GString is not empty
    Number/Char != 0
    reference != null
     */
    static void main(String[] args) {
        String x = "";

        if (x) {
            println x
        }

        def person = new Person(1);
        if (person) {
            println person
        }
    }
}
