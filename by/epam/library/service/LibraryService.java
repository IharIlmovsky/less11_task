package by.epam.library.service;

import java.util.*;

import by.epam.library.entity.Library;
import by.epam.library.entity.PrintedEdition;
import by.epam.library.service.find.Findable;

public class LibraryService {
	
	public List<PrintedEdition> find(Library theLib, Findable findMatcher) {
		List<PrintedEdition> items = theLib.getItems();
		List<PrintedEdition> Matched = null;
		
		Matched = findMatcher.find(items);
		return Matched;
	}
}
