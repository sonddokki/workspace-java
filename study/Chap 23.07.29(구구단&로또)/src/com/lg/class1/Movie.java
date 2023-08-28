package com.lg.class1;

// 영화관련 클래스를 만드는 예제

public class Movie {
	
	private String title;
	private String genre;
	private String actor;
	private String actress;
	private int rating;
	
	
	public Movie() {}


	public Movie(String title, String genre, String actor, String actress, int rating) {
		super();
		this.title = title;
		this.genre = genre;
		this.actor = actor;
		this.actress = actress;
		if (rating > 0)
			this.rating = rating;
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getActor() {
		return actor;
	}


	public void setActor(String actor) {
		this.actor = actor;
	}


	public String getActress() {
		return actress;
	}


	public void setActress(String actress) {
		this.actress = actress;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", actor=" + actor + ", actress=" + actress + ", rating="
				+ rating + "]";
	}
	
	
	public void playMovie() {
		System.out.println(title);
	}
	
	


}
