package io.javaBrains.SpringBootQuickstart.course_api.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service  //registers this class as a business service
public class TopicService {
    private List<Topic> topics= new ArrayList<>(Arrays.asList(
            new Topic("Spring","Spring Framework","Spring FrameWork Description"),
                new Topic("Java","Core Java","Java Description"),
                new Topic("JavaScript","JavaScript Framework","JavaScript Description")
        ));
    public List<Topic> getAllTopic(){
    return topics;
    }

    //GET Topic Request
    public Topic getTopic(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
    //POST Request
    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for(int i=0;i<topics.size();i++){
            Topic t=topics.get(i);
           if(t.getId().equals(id)){
               topics.set(i, topic);
               return;
           }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t->t.getId().equals(id));
    }
}
