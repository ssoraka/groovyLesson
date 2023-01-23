package com.dima

enum WeekDay {
    MO, TU, WE, TH, FR, SA, SU;
}

class RangeRunner {
    static void main(String[] args) {
//        def range = 2..8
        def range = 2..<8
        assert range.getClass() == IntRange

        assert range.get(3) == 5
        assert !range.contains(8)

        range.each {println it}

        ('a'..'d').each {println it}

        (WeekDay.MO..WeekDay.SU).each {println it}
    }
}
