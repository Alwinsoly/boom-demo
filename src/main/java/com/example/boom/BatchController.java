package com.example.boom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/batches")
public class BatchController {


//    public String index() {
//        return "index";
//    }
	
    @Autowired
    private BatchRepository batches;
    
    @Autowired
    private scheduleRepository graph;
    
//    @CrossOrigin
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Batches> create(@RequestBody Batches batch) {
//
//        System.out.println("add/update " + batch);
//
//        Batches saved = batches.save(batch);
//        return new ResponseEntity<>(saved, HttpStatus.CREATED);
//    }
//    
    @CrossOrigin
    @GetMapping(path = "/batchDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Test>> getBatches() {
        System.out.println("listing all batches...");

        List<Test> result = new ArrayList<>();
        batches.findAll().iterator().forEachRemaining(result::add);
        return new ResponseEntity<List<Test>>(result, HttpStatus.OK);
    }
    
    @CrossOrigin
    @GetMapping(path = "/barGraph", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BatchGraph>> getGraph() {
        System.out.println("listing all graphData...");

        List<BatchGraph> result = new ArrayList<>();
        graph.findAll().iterator().forEachRemaining(result::add);
        return new ResponseEntity<List<BatchGraph>>(result, HttpStatus.OK);
    }
}
