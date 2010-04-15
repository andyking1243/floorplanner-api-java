package com.floorplanner.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.floorplanner.rest.beans.Project;
import com.floorplanner.rest.beans.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.apache.commons.codec.binary.Base64;

public class FloorplannerClient {
	
	private final String authentication;
	private static final String AUTHENTICATION_HEADER = "Authorization";
    private final WebResource userResource;
    private String token;
    
	public FloorplannerClient(String apikey, String host)
	{
		authentication = "Basic " + Base64.encodeBase64URLSafeString((apikey + ":x").getBytes());
		ClientConfig config = new DefaultClientConfig();
		
        Client client = Client.create(config);
        userResource = client.resource(host);
	}
	
	public User getUserWithToken(int userId)
	{
		return userResource.path("users").path(Integer.toString(userId)).path("token")
			.header(AUTHENTICATION_HEADER, authentication)
			.accept(MediaType.APPLICATION_XML_TYPE)
			.get(new GenericType<User>() {});
	}
	
    public List<User> getUsers(int page, int perPage) {
    	return userResource.queryParam("page",Integer.toString(page))
			.queryParam("per_page", Integer.toString(perPage))
    		.path("users.xml")
    		.header(AUTHENTICATION_HEADER, authentication)
    		.accept(MediaType.APPLICATION_XML_TYPE)
    		.get(new GenericType<List<User>>() {});
    }
    
    public User getUserById(int id) {
    	return userResource.path("users").path(id + ".xml")
    		.header(AUTHENTICATION_HEADER, authentication)
    		.accept(MediaType.APPLICATION_XML_TYPE)
    		.get(new GenericType<User>() {});
    }
   
    public User createUser(User user) {
    	return userResource.path("users.xml")
    		.header(AUTHENTICATION_HEADER, authentication)
    		.accept(MediaType.APPLICATION_XML_TYPE)
    		.post(User.class, user);
    }
   
    public Project createProject(int userId, Project project) {
    	return userResource.path("users").path(Integer.toString(userId)).path("projects.xml")
    		.header(AUTHENTICATION_HEADER, authentication)
    		.accept(MediaType.APPLICATION_XML_TYPE)
    		.post(Project.class, project);
    }
    
    public List<Project> getProjectsByUser(int userId, int page, int perPage) {
    	return userResource.queryParam("page",Integer.toString(page))
			.queryParam("per_page", Integer.toString(perPage))
    		.path("users").path(Integer.toString(userId)).path("projects.xml")
    		.header(AUTHENTICATION_HEADER, authentication)
    		.accept(MediaType.APPLICATION_XML_TYPE)
    		.get(new GenericType<List<Project>>() {});
    } 
    
    public Project getProjectById(int id) {
    	return userResource.path("projects").path(id + ".xml")
    		.header(AUTHENTICATION_HEADER, authentication)
    		.accept(MediaType.APPLICATION_XML_TYPE)
    		.get(new GenericType<Project>() {});
    }
   
    public List<Project> getProjects(int page, int perPage) {
    	return userResource.queryParam("page",Integer.toString(page))
    		.queryParam("per_page", Integer.toString(perPage))
    		.path("projects.xml")
    		.header(AUTHENTICATION_HEADER, authentication)
    		.accept(MediaType.APPLICATION_XML_TYPE)
    		.get(new GenericType<List<Project>>() {});
    } 
    
}
