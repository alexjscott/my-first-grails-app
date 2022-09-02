package myapp

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Vehicle {

    int year
    String name
    String make
    String model

    static constraints = {
        year min: 1900
        name maxSize: 255
    }
}
