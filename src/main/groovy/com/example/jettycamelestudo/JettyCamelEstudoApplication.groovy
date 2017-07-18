package com.example.jettycamelestudo

import com.codahale.metrics.MetricRegistry
import org.apache.camel.CamelContext
import org.apache.camel.component.metrics.MetricsComponent
import org.apache.camel.component.metrics.routepolicy.MetricsRoutePolicyFactory
import org.apache.camel.spring.boot.CamelContextConfiguration
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class JettyCamelEstudoApplication {

	static void main(String[] args) {
		SpringApplication.run JettyCamelEstudoApplication, args


	}

    @Bean
    CamelContextConfiguration contextConfiguration(){
        return new CamelContextConfiguration() {
            @Override
            void beforeApplicationStart(CamelContext camelContext) {
                camelContext.addRoutePolicyFactory(new MetricsRoutePolicyFactory())
            }

            @Override
            void afterApplicationStart(CamelContext camelContext) {

            }
        }
    }
}
