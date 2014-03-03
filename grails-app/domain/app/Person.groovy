package app

import grails.rest.Resource

/**
 * User: danielwoods
 * Date: 3/2/14
 */
@Resource(uri = '/person', formats = ['person', 'personv2'])
class Person {

  String firstName
  String lastName
  Boolean isSuperSweet

  static constraints = {
  }
}
