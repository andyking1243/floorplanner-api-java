package com.floorplanner.rest.beans;

import java.util.List;
import java.util.ListIterator;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Floor {

	private String name, height, level, id;
	private List<Design> design;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

    public List<Design> getDesign() {
        return design;
    }
    
    public void setDesign(List<Design> design) {
        this.design = design;
    }
}
