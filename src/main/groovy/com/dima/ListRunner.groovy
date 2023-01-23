package com.dima

class ListRunner {

    static void main(String[] args) {

        def list = [0, 1, 2, 3, 4, 5]

        assert list.getClass() == ArrayList
        assert list[2] == 2
        assert list.get(2) == 2
        assert list[-1] == 5
        assert list[1..3] == [1,2,3]
        assert list[8] == null

        list += 9
        list << 11 << 13 << 0 << 1 << 7 << 7
        assert list == [0, 1, 2, 3, 4, 5, 9, 11, 13, 0, 1, 7, 7]
        list -= 7
        assert list == [0, 1, 2, 3, 4, 5, 9, 11, 13, 0, 1]
        list -= [0, 1]
        assert list == [2, 3, 4, 5, 9, 11, 13]

        list *= 2
        assert list == [2, 3, 4, 5, 9, 11, 13, 2, 3, 4, 5, 9, 11, 13]

        list.push(999)
        assert list.pop() == 999
        assert list.head() == 2
        assert list.tail() == [3, 4, 5, 9, 11, 13, 2, 3, 4, 5, 9, 11, 13]
        assert list.last() == 13

        assert [1, 2, 3, [7, 8, 9], 5].flatten() == [1, 2, 3, 7, 8, 9, 5]
        assert [1,2,3].reverse() == [3, 2, 1]
        assert [1,2,3].intersect([2,3,4]) == [2,3]
        assert [1, 2, 3].disjoint([4, 5, 6])

        def (a,b,c) = [1,2,3,4,5,6]
        assert a == 1
        assert b == 2
        assert c == 3

        func(*[1, 2])
    }

    static def func(int a, int b) {
        println(a)
        println(b)
    }
}
