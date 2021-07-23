package edu.neu.csye6200.quiz1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library extends AbstractStoreAPI {
	private List<AbstractLibraryMaterialAPI> items = new ArrayList<AbstractLibraryMaterialAPI>();

	@Override
	public void add(AbstractLibraryMaterialAPI e) {
		items.add(e);
	}

	@Override
	public void sortInventory() {
		this.items.sort(null);
	}

	@Override
	public void sortInventory(Comparator<AbstractLibraryMaterialAPI> c) {
		this.items.sort(c);
	}

	@Override
	public void showInventory() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.items).append(" items in library.");
		for (AbstractLibraryMaterialAPI item : items) {
			sb.append(item).append("\n");
		}
		
		return sb.toString();
	}

	/**
	 * Demonstrate the use of this class
	 */
	public static void demo() {
		System.out.println("\n\t" + Library.class.getName() + ".demo()...");		
		Library obj = new Library();

		/**
		 * Add items to library
		 */
		obj.add(new LibraryItem("3,DVD,Java Easy,Adam Peterson,Science,212-217237711-7,7.49"));
		obj.add(new LibraryItem("1,BOOK,My Chosen Career,Daniel Peters,Non-Fiction,212-217237718-7,2.49"));
		obj.add(new LibraryItem("2,CD,Born Free,Sam Jones,Non-Fiction,212-217237713-7,11.49"));
		
		/**
		 * Show Library Inventory
		 */
		obj.showInventory();

		/**
		 * Default sort of List of Item objects
		 * Item class ALREADY implements the Comparable Interface
		 * for a Default or Natural Order of Item objects.
		 * 
		 * REQUIREMENT:
		 * 
		 * 	Item class implements Comparable interface (compareTo method)
		 */
		System.out.println("Sort Item object BY Title (Default Natural Comparable Order)...");
		obj.sortInventory(); 
		obj.showInventory();
		
		/**
		 * Explicit sort of List of Item objects
		 * 
		 * REQUIREMENT:
		 * 
		 * 	Use a Comparator to specify a sort order
		 * 
		 * Item class ALREADY implements the Comparator Interface
		 * for a Specific Order of Item objects.
		 */
		System.out.println("Sort Item object BY ID (Specific Item Comparator Order)...");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getId)); 
		obj.showInventory();
		
		System.out.println("Sort Item object BY CATEGORY (Specific Item Comparator Order)...");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getCategory)); 
		obj.showInventory();
		
		System.out.println("Sort Item object BY Author (Specific Item Comparator Order)...");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getAuthor)); 
		obj.showInventory();
		
		System.out.println("Sort Item object BY SUBJECT (Specific Item Comparator Order)...");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getSubject)); 
		obj.showInventory();
		
		System.out.println("Sort Item object BY ISBN (Specific Item Comparator Order)...");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getIsbn)); 
		obj.showInventory();
		
		System.out.println("Sort Item object BY PRICE (Specific Item Comparator Order)...");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getPrice)); 
		obj.showInventory();
		
		/**
		 * Reverse the sort order of a Comparator
		 */
		System.out.println("Sort Item object BY NAME REVERSED (Specific Item Comparator Order)...");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getAuthor).reversed()); 
		obj.showInventory();
		
		
		System.out.println("\n\t" + Library.class.getName() + " .demo()... done!");		
	}

}
