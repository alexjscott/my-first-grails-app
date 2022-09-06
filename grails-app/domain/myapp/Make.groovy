package myapp

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Make {

    String name

    static constraints = {
    }

    String toString(){
        name
    }
}
