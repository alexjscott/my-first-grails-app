package myapp
import grails.gorm.services.Service

@Service(Make)
interface MakeService {

    Make get(Serializable id)

    List<Make> list(Map args)

    Long count()

    Make delete(Serializable id)

    Make save(String name)
}