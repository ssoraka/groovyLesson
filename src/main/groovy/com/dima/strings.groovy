package com.dima

/*

" "
' '
""" """
''' '''
/ /
$/ /$

 */


def name = "Dima"
def value = 'hello "Hi"!!'

def stringVal = "Hello $name"
println stringVal
def stringVal2 = 'Hello $name'
println stringVal2

def stringVal3 = """
hello
${withPrefix(name)}
"""
println stringVal3

def stringVal4 = /Hello "$name" '' $$ /
println(stringVal4)
def stringVal5 = $/Hello "$name" '' $$ /$
println(stringVal5)


def withPrefix(String name) {
    "prefix-" + name
}

println name[2]
println name[-1]
println name[1..3]
println name * 3
println name - 'Di'
println name - 'ma'
