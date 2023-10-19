package com.example.project;

import java.util.List;

public class Project {
    private Long id;
    private String name;

    public Project(){
        System.out.println("Project been created");
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
