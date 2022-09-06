package myapp

import grails.compiler.GrailsCompileStatic

class Model {

    String name

    static belongsTo = [make: Make]

    static constraints = {
    }

    String toString() {
        name
    }
}