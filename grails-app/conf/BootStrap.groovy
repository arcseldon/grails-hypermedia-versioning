import app.Person

class BootStrap {

    def init = { servletContext ->
      new Person(firstName: "Dan", lastName: "Woods", isSuperSweet: true).save(flush: true, failOnError: true)
      new Person(firstName: "Bobby", lastName: "Warner", isSuperSweet: false).save(flush: true, failOnError: true)
    }
    def destroy = {
    }
}
