//package com.core.configurations;
//
//import org.elasticsearch.client.Client;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com.core.repositories")
//public class ElasticsearchConfiguration {
//    @Bean
//    public static Client client() throws UnknownHostException {
//
//        Client client = new PreBuiltTransportClient(Settings.EMPTY)
//                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));
//    
//        return client;
//        
//    }
//
//    @Bean
//    public ElasticsearchOperations elasticsearchTemplate() throws UnknownHostException
//    {
//        return new ElasticsearchTemplate(client());
//    }
//}
