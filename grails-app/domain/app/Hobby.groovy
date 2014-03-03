package app

import grails.rest.Resource

/**
 * User: danielwoods
 * Date: 3/3/14
 */
@Resource(formats = ['api', 'apiv2'])
class Hobby {
  String name
  Person person
}
