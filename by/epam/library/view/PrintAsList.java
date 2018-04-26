package by.epam.library.view;

import java.util.*;

import by.epam.library.entity.PrintedEdition;

public class PrintAsList implements Printable {

	@Override
	public void print(List<PrintedEdition> items) {

		for (int i = 0; i < items.size(); i++) {
			PrintedEdition edition = items.get(i);			
			System.out.println( edition.toString() );
		}
	}

}
