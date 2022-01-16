package com.hotel.demo.service;


import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import com.hotel.demo.model.DatabaseSequence;

public class SequenceGeneratorService {
	
	@Autowired
	 private MongoOperations mongoOperations;
	 
	 @Autowired
	    public SequenceGeneratorService(MongoOperations mongoOperations) {
	        this.mongoOperations = mongoOperations;
	    }
	 
	 public int getSequence (String sequence) {
		 Query query= new Query(Criteria.where("id").is(sequence));
		 Update update= new Update().inc("seq",1);
		 DatabaseSequence counter= mongoOperations.findAndModify(query, update, options().returnNew(true).upsert(true), DatabaseSequence.class);
		 return (int) (!Objects.isNull(counter) ? counter.getSeq() : 1);
	 }
	
//	public long generateSequence(String seqName) {
//	    DatabaseSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
//	      new Update().inc("seq",1), options().returnNew(true).upsert(true),
//	      DatabaseSequence.class);
//	    return !Objects.isNull(counter) ? counter.getSeq() : 1;
//	}

}
