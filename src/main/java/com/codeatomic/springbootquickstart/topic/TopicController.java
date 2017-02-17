package com.codeatomic.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring framework description."),
				new Topic("java", "Core Java", "Core Java description."),
				new Topic("php", "Core PHP", "Core PHP description.")
				);
	}
}
