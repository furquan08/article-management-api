package com.furquan.article.dto;

import java.util.Arrays;

import javax.validation.constraints.NotEmpty;


public class ArticleDTO {

	@NotEmpty(message = "Title is mandatory")
	private String title;
	
	@NotEmpty(message = "Description is mandatory")
	private String description;
	
	@NotEmpty(message = "Body is mandatory")
	private String body;
	private String[] tags;
	
	public ArticleDTO() {
		
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "ArticleDTO [title=" + title + ", description=" + description + ", body=" + body + ", tags="
				+ Arrays.toString(tags) + "]";
	}
	
	

}
