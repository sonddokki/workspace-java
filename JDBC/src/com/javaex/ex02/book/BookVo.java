package com.javaex.ex02.book;

public class BookVo {

	// 필드
	private int bookId;
	private String title;
	private String pubs;
	private String pubDate;
	private int authorId;
	private String authorName;

	// 생성자
	public BookVo() {
		
	}

	public BookVo(int bookId, String title, String pubs, String pubDate, int authorId, String authorName) {
		this.bookId = bookId;
		this.title = title;
		this.pubs = pubs;
		this.pubDate = pubDate;
		this.authorId = authorId;
		this.authorName = authorName;
	}
	

	// 메소드-gs

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPubs() {
		return pubs;
	}

	public void setPubs(String pubs) {
		this.pubs = pubs;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	// 메소드-일반
	
	@Override
	public String toString() {
		return "책 일렬번호: " + bookId + " / 책제목: " + title + " / 출판사: " + pubs + "/ 출판일: " + pubDate
				+ " / 작가아이디: " + authorId + " / 작가이름" + authorName;
	}
	
	
	

}
