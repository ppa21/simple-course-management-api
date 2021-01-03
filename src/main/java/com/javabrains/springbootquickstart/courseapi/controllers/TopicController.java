package com.javabrains.springbootquickstart.courseapi.controllers;

import com.javabrains.springbootquickstart.courseapi.models.Topic;
import com.javabrains.springbootquickstart.courseapi.services.TopicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PostMapping("/topics/{id}")
    public void updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
