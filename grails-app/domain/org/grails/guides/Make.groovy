package org.grails.guides

import grails.compiler.GrailsCompileStatic

class Make {

    String name

    static constraints = {
    }

    String toString() {
        name
    }
}