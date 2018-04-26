package by.epam.library.view;

import java.util.*;

import by.epam.library.entity.PrintedEdition;

public class ViewAction {
	public static void print(Printable printObj, List<PrintedEdition> items) {
		printObj.print(items);
	}
}
