package io.javaBrains.SpringBootQuickstart.course_api.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class topicController {

    // If we need an instance from the Topic Service(business service)
    @Autowired //marked dependency Injection
    private TopicService topicService;  //Dependency Injection

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){ // A Constructor
        return topicService.getAllTopic();
    }

    //Get Method
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    //POST Request
    @RequestMapping(method = RequestMethod.POST,value="/topics")//Map this method to any Request that is POST on "topics"
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
    //Update(PUT) Topic
    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id,topic);
    }

    //Delete Topics
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
