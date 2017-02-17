package com.codeatomic.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring framework description."),
			new Topic("java", "Core Java", "Core Java description."),
			new Topic("php", "Core PHP", "Core PHP description.")
			);
	
	public List<Topic> getAllTopics() {
		return this.topics;
	}
}
