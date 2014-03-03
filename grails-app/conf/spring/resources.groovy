import app.Person
import grails.rest.render.json.JsonCollectionRenderer
import grails.rest.render.json.JsonRenderer
import org.codehaus.groovy.grails.web.mime.MimeType

beans = {
  final PERSON_MIME_TYPE = "application/vnd.app.person+json"

  personV1Renderer(JsonRenderer, Person, new MimeType(PERSON_MIME_TYPE, [v: '1.0'])) {
    includes = ['id']
  }

  personV2Renderer(JsonRenderer, Person, new MimeType(PERSON_MIME_TYPE, [v: '2.0'])) {
    excludes = ['id', 'isSuperSweet']
  }

  personV1CollectionRenderer(JsonCollectionRenderer, Person, new MimeType(PERSON_MIME_TYPE, [v: '1.0'])) {
    includes = ['id']
  }

  personV2CollectionRenderer(JsonCollectionRenderer, Person, new MimeType(PERSON_MIME_TYPE, [v: '2.0'])) {
    excludes = ['id', 'isSuperSweet']
  }
}
