package com.main;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BaikeController {
	
	@Autowired
	private MongoTemplate mongoTemplate;
	@GetMapping("/addBaike")
	public Baike addBaike(Baike baike) {
		baike.setCreateDate(new Date());
		mongoTemplate.insert(baike);
		return baike;
	}
}
