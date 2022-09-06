package myapp
import myapp.*
import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    MakeService makeService
    ModelService modelService
    VehicleService vehicleService
    def init = { servletContext ->

        Make nissan = makeService.save('Nissan')
        Make ford = makeService.save('Ford')

        Model titan = modelService.save('Titan', nissan as Make)
        Model leaf = modelService.save('Leaf', nissan as Make)
        Model windstar = modelService.save('Windstar', ford as Make)

        vehicleService.save(2012, 'Pickup', titan as Model, nissan as Make)
        vehicleService.save(2014, 'Economy', leaf as Model, nissan as Make)
        vehicleService.save(1990, 'Minivan', windstar as Model, ford as Make)
    }
    def destroy = {
    }
}
