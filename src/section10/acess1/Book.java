package section10.acess1;

public class Book {
	//속성 -멤버변수
	public String title;
	protected int price;
	int totalPage;
	private String author;
	
	public Book() {
		//Book 생성자 만듬
	}
	public Book(String title, int price, int totalPage,String author) {//생성자
		this.title=title;
		this.price=price;
		this.totalPage=totalPage;
		this.author=author;

	}

}
