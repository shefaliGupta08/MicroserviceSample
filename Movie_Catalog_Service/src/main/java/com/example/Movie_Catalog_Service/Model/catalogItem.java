package com.example.Movie_Catalog_Service.Model;

public class catalogItem {
	
	private String title;
	private String description;
	private int rating;
	
public catalogItem(String title, String description, int rating) {
		super();
		this.title = title;
		this.description = description;
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "catalogItem [title=" + title + ", description=" + description + ", rating=" + rating + "]";
	}
	
	
	
	

}
