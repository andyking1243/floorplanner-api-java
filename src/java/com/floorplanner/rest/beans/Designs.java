package com.floorplanner.rest.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Designs {

	private List<Design> design;
	@XmlAttribute public static final String type = "array";
	
	public Designs()
	{
		design = new ArrayList<Design>();
	}
	
	public void setDesign(List<Design> design)
	{
		this.design = design;
	}
	
	public List<Design> getDesign()
	{
		return design;
	}
}
