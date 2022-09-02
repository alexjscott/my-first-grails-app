package myapp

import grails.gorm.services.Service

@Service(Vehicle)
interface VehicleService {

    Vehicle get(Serializable id)

    List<Vehicle> list(Map args)

    Long count()

    Vehicle delete(Serializable id)

    Vehicle save(Vehicle vehicle)

}
