package by.epam.library.view;

import java.util.*;

import by.epam.library.entity.PrintedEdition;

public class PrintAsTable implements Printable{

	@Override
	public void print(List<PrintedEdition> items) {
		System.out.println("|----------------------|----------------------|--------------|------|-------|"); 
		for (int i = 0; i < items.size(); i++) {
			PrintedEdition edition = items.get(i);
			String vs = edition.formatStr();
			System.out.println( vs);
		}
		System.out.println("|----------------------|----------------------|--------------|------|-------|");
	}

}
