package com.pattern.prototype;

public class Movie implements PrototypeCapable {

    private String name = null;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
     
    @Override
    public Movie clone() throws CloneNotSupportedException {
        return (Movie) super.clone();
    }
    
    @Override
    public String toString() {
        return "Movie";
    }

}
