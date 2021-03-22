/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmasapp;

import java.io.Serializable;

/**
 *
 * @author vinicius
 */
public class Christmas implements Serializable{
    //Data Types
    private String name;
    private String idea;
    private String url;
    
    //Constructors

    public Christmas(String name, String idea, String url) {
        this.name = name;
        this.idea = idea;
        this.url = url;
    }

    public Christmas(){
        name = new String();
        idea = new String();
        url = new String();
    }

    //Setters and getters 

    public void setName(String name) {
        this.name = name;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getIdea() {
        return idea;
    }

    public String getUrl() {
        return url;
    }
    
    @Override
    public String toString(){
        return "Name: "+name+". Idea: "+idea+". Link: "+url+"\n";
    }
        
}
