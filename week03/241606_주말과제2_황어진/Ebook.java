package homework2;

public class Ebook extends Book {
	int sizeInMB;

	
	public Ebook(String title, String author, int size) {
		super(title, author, size);
		this.title = title;
		this.author = author;
		this.sizeInMB = size;
	}


}
