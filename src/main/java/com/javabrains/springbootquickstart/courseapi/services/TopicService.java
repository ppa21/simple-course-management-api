package com.javabrains.springbootquickstart.courseapi.services;

import com.javabrains.springbootquickstart.courseapi.models.Topic;
import com.javabrains.springbootquickstart.courseapi.repositories.TopicRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private final TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
    ));

    public List<Topic> getTopics() {
        return (List<Topic>) topicRepository.findAll();
    }

    public Topic getTopic(String id) {
        List<Topic> topics = (List<Topic>) topicRepository.findAll();

        for (Topic topic : topics) {
            if (topic.getId().equals(id)) {
                return topic;
            }
        }

        return null;
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}

