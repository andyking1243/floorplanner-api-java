package com.floorplanner.rest.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Floors {

	private List<Floor> floor;
	//@XmlAttribute public static final String type = "array";
	
	public Floors()
	{
		floor = new ArrayList<Floor>();
	}
	
	public void setFloor(List<Floor> floor)
	{
		this.floor = floor;
	}
	
	public List<Floor> getFloor()
	{
		return floor;
	}
}
