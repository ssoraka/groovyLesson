package com.dima

import groovy.io.FileType

class FileRunner {
    static void main(String[] args) {
        def file = new File("pom.xml")

        println file.text

        file.each {line -> println line }
        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }

        def writer = new StringWriter()
        try (def reader = file.newReader()) {
            writer << reader
        }

        def file1 = new File("text.txt")
        file1.text = "Some text"
        file1 << "new line" << System.lineSeparator()

        def srcDir = new File('src')
        srcDir.eachDir { println it }
        srcDir.eachDirRecurse { println it }

        srcDir.eachFileRecurse (FileType.FILES) {println it }

    }
}
