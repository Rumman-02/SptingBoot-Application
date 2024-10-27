package io.javaBrains.SpringBootQuickstart.course_api.topic;

public class Topic {
    private String id;
    private String name;
    private String description;

//    public String Topic(String id, String name, String description){
//        super();  !! A method, as it has return type (String)

    public Topic (String id, String name, String description){
        super();  //!! A Constructor, must not have "void"
        this.id=id;
        this.name=name;
        this.description=description;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
}
