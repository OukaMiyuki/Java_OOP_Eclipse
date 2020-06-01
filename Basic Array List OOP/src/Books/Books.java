package Books;

public class Books {
	private int id;
	private String title;
	private String author;
	private int pages;
	private int year;
	
	public Books(int id, String title, String author, int pages, int year){
		this.id = id;
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.year = year;
	}
	
	public int getid(){
		return this.id;
	}
	
	public String gettitle(){
		return this.title;
	}
	
	public String getauthor(){
		return this.author;
	}
	
	public int getpages(){
		return this.pages;
	}
	
	public int getyear(){
		return this.year;
	}
}
