import app.Hobby
import app.Person

class BootStrap {

    def init = { servletContext ->
      def dan = new Person(firstName: "Dan", lastName: "Woods", isSuperSweet: true).save(flush: true, failOnError: true)
      new Hobby(name: "Groovy", person: dan).save(flush: true, failOnError: true)
      def bobby = new Person(firstName: "Bobby", lastName: "Warner", isSuperSweet: false).save(flush: true, failOnError: true)
      new Hobby(name: "Grails", person: bobby).save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}
