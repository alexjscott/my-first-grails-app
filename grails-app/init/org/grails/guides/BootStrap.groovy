package org.grails.guides

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    MakeService makeService
    ModelService modelService
    VehicleService vehicleService
    def init = { servletContext ->

        Make nissan = makeService.save('Nissan')
        Make ford = makeService.save( 'Ford')

        Model titan = modelService.save('Titan', nissan as Make)
        Model leaf = modelService.save('Leaf', nissan as Make)
        Model windstar = modelService.save('Windstar', ford as Make)

        vehicleService.save('Pickup', nissan as Make, titan as Model, 2012)
        vehicleService.save('Economy', nissan as Make, leaf as Model, 2014)
        vehicleService.save('Minivan', ford as Make, windstar as Model, 1990)
    }
    def destroy = {
    }
}