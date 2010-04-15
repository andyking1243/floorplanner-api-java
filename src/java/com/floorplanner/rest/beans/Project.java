package com.floorplanner.rest.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Project {

	private String name, description, externalIentifier, id;
	private Floors floors;
	
	public Project()
	{
		setFloors(new Floors());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExternalIentifier() {
		return externalIentifier;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Floors getFloors()
	{
		return floors;
	}

	public void setFloors(Floors floors)
	{
		this.floors = floors;
	}
}
