package com.dima


/*
3.cm + 1.m - 25.mm == 1005
 */
class Task2Runner {
    static void main(String[] args) {
        Integer.metaClass {
            getCm = {
                delegate * 10
            }
            getM = {
                delegate.cm * 100
            }
            getMm = {
                delegate
            }
        }


        def result = 3.cm + 1.m - 25.mm
        assert result == 1005
    }
}
