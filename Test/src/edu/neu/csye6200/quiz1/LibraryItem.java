package edu.neu.csye6200.quiz1;

/**
 * Class to model an Item contained in a library. 
 * 
 * @author dpeters
 *
 */
public class LibraryItem extends AbstractLibraryMaterialAPI {
//	private static String category = null;
	public static final int MAJOR_VERSION = 1;
	public static final int MINOR_VERSION = 0;
	public static final String REVISION = new Integer(MAJOR_VERSION) +  "." + new Integer(MINOR_VERSION);
	private int id;
	private String title = null;
	private String category = null;
	private String subject = null;
	private String author = null;
	private String isbn = null;
	private double price;

	/**
	 * Object Initializer Block
	 * executed with each class constructor
	 * to set default values
	 */
	{
		this.id = 1;
		this.category = "My Chosen Career";
		this.title = "My Chosen Career";
		this.author = "Daniel Peters";
		this.subject = "Non-Fiction";
		this.isbn = "212-217237718-7";
		this.price = 0.99;
	}

	/**
	 * Default constructor
	 */
	public LibraryItem() {
		super();
	}
	
	/**
	 * Create an Item object with it's state
	 * set to values in CSV string formatted as follows:
	 * 
	 * 	"ID,CATEGORY,TITLE,AUTHOR,SUBJECT,ISBN,PRICE"
	 * 
	 * example CSV String data:
	 * 
	 * 	"1,BOOK,My Chosen Career,Daniel Peters,Non-Fiction,212-217237718-7,1.49"
	 * 
	 * @param csvData	Comma Separated Value data
	 */
	public LibraryItem(String csvData) {
		super();
		String[] tokens = csvData.split(",");
		/**
		 * Parse CSV data 
		 * If insufficient tokens or error,
		 * default values of object initializer block are used
		 */
		if (7 == tokens.length) {
//			this.id = Conversions.stringToInt(tokens[0]);
//			this.category = tokens[1];
//			this.title = tokens[2];
//			this.author = tokens[3];
//			this.subject = tokens[4];
//			this.isbn = tokens[5];
//			this.price = Conversions.stringToDouble(tokens[6]);
		}
	}

	@Override
	public int getId() {
		return id;
	}
	@Override
	public String getCategory() {
		return category;
	}
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public String getAuthor() {
		return author;
	}
	@Override
	public String getSubject() {
		return subject;
	}
	@Override
	public String getIsbn() {
		return isbn;
	}
	@Override
	public double getPrice() {
		return price;
	}
	
	/**
	 * Return a String description of representation of the State of the object
	 */
	@Override
	public String toString() {
		return "#" + getId() + " [" + getCategory() + "] $" + getPrice() + " '" + getTitle() + "' by " + getAuthor() + " " + getSubject() + " " + "ISBN-13: " + getIsbn();
	}
}
