package com.djamware

class UrlMappings {

    static excludes = ['/login/authenticate', '/login/impersonate', '/logout/impersonate', '/logoff', '/zkau/*', '/zkcomet/*', '/static/*', '/assets/**']

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(view: "/index.zul")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
