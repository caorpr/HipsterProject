package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;

	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "Bro, don't be mainstream";
		hipsterPhrases[1] = "I listened to Daft Punk before it was cool";
		hipsterPhrases[2] = "You eat meat? I'm a vegan.";
		hipsterPhrases[3] = "I like that Scarf dude.";
	}
	

	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}
	
	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("Gage Hopkins");
		firstBook.setTitle("Gage's Life");
		firstBook.setSubject("Sci-Fi Fantasy");
		firstBook.setPageCount(302);
		firstBook.setPrice(23.98);
		
		secondBook = new Book();
		secondBook.setAuthor("Brandon Sanderson");
		secondBook.setTitle("Alcatraz vs the Evil Librarians");
		secondBook.setSubject("fantasy");
		secondBook.setPageCount(300);
		secondBook.setPrice(23.98);
		
		thirdBook = new Book();
		thirdBook.setAuthor("J. K. Rowlings");
		thirdBook.setTitle("Harry Potter and the Sorcerer's Stone");
		thirdBook.setSubject("Fantasy");
		thirdBook.setPageCount(300);
		thirdBook.setPrice(252.58);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
		
	}
	
	public Hipster(String name)
	{
		this.name = name;
	}

	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	
}
