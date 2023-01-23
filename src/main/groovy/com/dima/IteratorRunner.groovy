package com.dima

class IteratorRunner {
    static void main(String[] args) {
        assert [1,4,7,9].any {it % 2 == 0}
        assert [1,4,7,9].find {it % 2 == 0} == 4
        assert [1,4,7,9].findAll {it % 2 != 0} == [1,7,9]
        assert (2..4).collect() == [2,3,4]

        def person = new Person(25)
        person.each {println it}

        assert ["qwe", "fdsa", "12", "32"].grep(~/\d+/) == ["12", "32"]
        assert ["qwe", "fdsawq", "12", "32"].grep { it.length() > 4 } == ["fdsawq"]
    }
}
