package com.codeatomic.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring framework description."),
			new Topic("java", "Core Java", "Core Java description."),
			new Topic("php", "Core PHP", "Core PHP description.")
			));
	
	public List<Topic> getAllTopics() {
		return (List<Topic>) this.topicRepository.findAll();
	}

	public Topic getTopic(String id) {
		return (Topic) this.topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		this.topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		this.topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		this.topicRepository.delete(id);;
	}
}
