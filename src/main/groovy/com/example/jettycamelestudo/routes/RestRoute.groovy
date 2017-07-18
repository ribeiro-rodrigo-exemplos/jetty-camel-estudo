package com.example.jettycamelestudo.routes

import org.apache.camel.Exchange
import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

/**
 * Created by Rodrigo Ribeiro on 09/07/17.
 */

@Component
class RestRoute extends RouteBuilder {

    @Override
    void configure() throws Exception {
        Exchange.HTTP_METHOD
        from("jetty:http://localhost:8080/teste?httpMethodRestrict=PUT").
            log('recebeu requisicao').
            log('${body}').
            setHeader(Exchange.HTTP_RESPONSE_CODE,constant(204)).
        end()
    }
}
