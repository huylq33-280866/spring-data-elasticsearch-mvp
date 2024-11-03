package vn.com.huylq.springdataelasticsearchmvp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "vn.com.huylq.springdataelasticsearchmvp.repository")
@ComponentScan(basePackages = "vn.com.huylq.springdataelasticsearchmvp")
public class ElasticSearchConfiguration {

}
