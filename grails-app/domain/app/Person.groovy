package app

import grails.rest.Resource

/**
 * User: danielwoods
 * Date: 3/2/14
 */
@Resource(formats = ['api', 'apiv2'])
class Person {

  String firstName
  String lastName
  Boolean isSuperSweet

  static hasMany = [hobbies: Hobby]
  static mappedBy = ['hobbies': 'person']

  static constraints = {
  }
}
