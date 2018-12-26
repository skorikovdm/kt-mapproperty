package org.test

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType

@Controller("/test")
class TestController (val beanConfigurations: List<BeanConfiguration>) {

    @Get("/")
    fun index(): HttpResponse<String> {
        return HttpResponse.ok(beanConfigurations.toString()).contentType(MediaType.TEXT_PLAIN)
    }
}