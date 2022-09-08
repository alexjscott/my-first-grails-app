package org.grails.guides

import grails.compiler.GrailsCompileStatic

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Make {

    String name

    static constraints = {
    }

    String toString() {
        name
    }
}