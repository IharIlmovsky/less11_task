package by.epam.library.main;

import java.util.*;

import by.epam.library.entity.Book;
import by.epam.library.entity.Library;
import by.epam.library.entity.Magazine;
import by.epam.library.entity.PrintedEdition;
import by.epam.library.service.LibraryService;
import by.epam.library.service.find.FindByPrice;
import by.epam.library.service.find.FindByTitle;
import by.epam.library.service.find.Findable;
import by.epam.library.view.*;

public class libTest {

	public static void main(String[] args) {
		Library theLibrary = new Library();
		
		theLibrary.add(new Book("Java in deep", 300, "O’Reilly", 2014));
		theLibrary.add(new Book("C++ for beginners", 290, "O’Reilly", 2010));
		theLibrary.add(new Magazine("Animal planet", 40, 50));
		theLibrary.add(new Book("Design Patterns", 320, "Addison-Wesley", 1994));
		theLibrary.add(new Magazine("Handy made stuff", 25, 90));
						
		LibraryService libService = new LibraryService();
		Printable printList       = new PrintAsList();
		Printable printAsTable    = new PrintAsTable();
		Findable price_finder     = new FindByPrice(290);
		
		List<PrintedEdition> found_byPrice = libService.find(theLibrary, price_finder);
				
		int countFound = found_byPrice.size();
		System.out.printf( "The Library has the '%d' items of price 290\n", countFound); 
		printList.print( found_byPrice);
		
		String str_search = "Animal planet";
		Findable title_finder     = new FindByTitle(str_search);
		List<PrintedEdition> found_byTitle = libService.find(theLibrary, title_finder);
		if (found_byTitle != null) {
		  try {
		    System.out.printf( "\nThe Library has the '%d' items of title='%s' ", 
		    		 found_byTitle.size(), str_search); 
		    printList.print( found_byTitle);
		  }
		  catch ( Exception e) {
			System.out.println("Exception: error due to List.size() call");
			e.printStackTrace();
		  }
		} 		
		System.out.println("\n All Library items:");
		printAsTable.print(theLibrary.getItems());

		//ViewAction.print(new PrintAsList(), lists);
	}

}
