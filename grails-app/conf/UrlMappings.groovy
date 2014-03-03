class UrlMappings {

	static mappings = {
    "/person"(resources: "person") {
      "/hobbies"(resources: "hobby")
    }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
