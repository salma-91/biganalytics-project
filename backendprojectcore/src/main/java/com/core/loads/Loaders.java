//package com.core.loads;
//
//import com.core.models.Dataset;
//import com.core.repositories.DatasetsRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//import javax.annotation.PostConstruct;
//import java.io.IOException;
//
//
//@Component
//public class Loaders {
//
//    @Autowired
//    ElasticsearchOperations operations;
//
//    @Autowired
//    DatasetsRepository datasetsRepository;
//
//    @PostConstruct
//    @Transactional
//    public void loadAll() throws IOException{
//
//        operations.putMapping(Dataset.class);
//		Dataset dataset = new Dataset(1325317980, 4.39, 4.39, 4.39, 4.39, 0.45558087, 2.0000000193,4.39);
//
//        System.out.println("Starting loading Data");
//    	datasetsRepository.save(dataset);
//		System.out.printf("Loading Completed");
//    }
//
//   
//}