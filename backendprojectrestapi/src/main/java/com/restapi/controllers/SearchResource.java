package com.restapi.controllers;
//package com.core.controllers;
//
//import com.core.models.Dataset;
//import com.core.repositories.DatasetsRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/rest/search")
//public class SearchResource {
//
//    @Autowired
//    DatasetsRepository datasetsRepository;
//
//    @Autowired
//    ElasticsearchTemplate elasticsearchTemplate;
//
//  
//
//    @GetMapping(value = "/all")
//    public List<Dataset> searchAll() {
//        List<Dataset> usersList = new ArrayList<>();
//        Iterable<Dataset> users = datasetsRepository.findAll();
//        users.forEach(usersList::add);
//        return usersList;
//    }
//
//
//
//
//}
