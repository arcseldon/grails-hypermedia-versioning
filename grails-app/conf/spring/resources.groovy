import app.Hobby
import app.Person
import grails.rest.render.json.JsonCollectionRenderer
import grails.rest.render.json.JsonRenderer
import org.codehaus.groovy.grails.web.mime.MimeType

beans = {

  final API_MIME_TYPE = "application/vnd.app.api+json"
  final v1_MIME_TYPE = new MimeType(API_MIME_TYPE, [v: '1.0'])
  final v2_MIME_TYPE = new MimeType(API_MIME_TYPE, [v: '2.0'])

  /* !! PERSON V1 !! */
  final v1_PERSON_INCLUDES = ['id']
  personV1Renderer(JsonRenderer, Person, v1_MIME_TYPE) {
    includes = v1_PERSON_INCLUDES
  }

  personV1CollectionRenderer(JsonCollectionRenderer, Person, v1_MIME_TYPE) {
    includes = v1_PERSON_INCLUDES
  }

  /* !! PERSON V2 !! */
  final v2_PERSON_EXCLUDES = ['id', 'isSuperSweet']
  personV2Renderer(JsonRenderer, Person, v2_MIME_TYPE) {
    excludes = v2_PERSON_EXCLUDES
  }

  personV2CollectionRenderer(JsonCollectionRenderer, Person, v2_MIME_TYPE) {
    excludes = v2_PERSON_EXCLUDES
  }

  /* !! HOBBY V1 !! */
  final v1_HOBBY_INCLUES = ['id']
  hobbyV1Renderer(JsonRenderer, Hobby, v1_MIME_TYPE) {
    includes = v1_HOBBY_INCLUES
  }

  hobbyV1CollectionRenderer(JsonCollectionRenderer, Hobby, v1_MIME_TYPE) {
    includes = v1_HOBBY_INCLUES
  }

  /* !! HOBBY V2 !! */
  final v2_HOBBY_EXCLUDES = ['id', 'class', 'person']
  hobbyV2Renderer(JsonRenderer, Hobby, v2_MIME_TYPE) {
    excludes = v2_HOBBY_EXCLUDES
  }

  hobbyV2CollectionRenderer(JsonCollectionRenderer, Hobby, v2_MIME_TYPE) {
    excludes = v2_HOBBY_EXCLUDES
  }
}
