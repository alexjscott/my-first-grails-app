package myapp

import grails.gorm.services.Service

@Service(Model)
interface ModelService {

    Model get(Serializable id)

    List<Model> list(Map args)

    Long count()

    Model delete(Serializable id)

    Model save(Model model)

    Model save(String name, Make make)
}