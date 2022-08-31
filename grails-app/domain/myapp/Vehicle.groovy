package myapp

class Vehicle {
    Sring name
    String make
    String Model

    static constraints = {
        name maxSIze: 255
        make inList: ['Ford', 'Chevrolet', 'Nissan']
        model nulllable: true
    }
}
