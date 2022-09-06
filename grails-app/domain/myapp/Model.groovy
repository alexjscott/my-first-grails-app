package myapp

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Model {
    String name
    Make make
    static belongTo = [ make: Make ]


    static constraints = {
    }

    String toString() {
        name
    }
}