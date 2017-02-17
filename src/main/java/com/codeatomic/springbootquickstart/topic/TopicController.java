package com.codeatomic.springbootquickstart.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	//@PostMapping("/topics")
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public String addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		String response = "{\"success\": true, \"message\": Topic has been added successfully.}";
		return response;
	}
	
	//@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	@PutMapping("/topics/{id}")
	public String updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
		String response = "{\"success\": true, \"message\": Topic has been updated successfully.}";
		return response;
	}
	
	//@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	@DeleteMapping("/topics/{id}")
	public String deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
		String response = "{\"success\": true, \"message\": Topic has been deleted successfully.}";
		return response;
	}
}
