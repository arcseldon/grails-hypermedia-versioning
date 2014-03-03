package app



import static org.springframework.http.HttpStatus.*

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import grails.rest.RestfulController;
import grails.transaction.Transactional

class HobbyController extends RestfulController {
	
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	
	static responseFormats = ['json', 'xml', 'api', 'apiv2']

	HobbyController() {
		super(Hobby)	
	}	
    
    protected def queryForResource(Serializable id) {
		def person = Person.load(params.personId)
		Hobby.findByPersonAndId(person, id)    	
    }

    protected List listAllResources(Map params) {
		def person = Person.load(params.personId)
    	Hobby.findAllByPerson(person, params)
    }
}
