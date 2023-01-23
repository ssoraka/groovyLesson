package com.dima

class MakeRunner {
    static void main(String[] args) {

        Class.metaClass.make = { Object[] values ->
            println owner
            println thisObject
            println delegate

            delegate.metaClass.invokeConstructor(values)
        }

        def set = HashSet.make([1,2,3,4,4])
        def student = Student.make("Ivan", "Ivanov", 29)
        def student2 = Student.make()

        println set
        println student
        println student2

    }
}
