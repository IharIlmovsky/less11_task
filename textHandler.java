package by.epam.library.txtfile;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.epam.library.entity.*;

public class textHandler {
	
	private static String fileName; 
		
	public void textHandler(String _fileName) throws FileNotFoundException {
		fileName = _fileName;
	}
	
	public static PrintedEdition LoadFromLine(String s) {
		PrintedEdition item;
		String vtitle;
		
		if (s.length() >0) {
			if (s.contains("printedBy")) {
				String[] tokens = s.split(";", 4);				
				return (new Book(tokens[0], Double.parseDouble(tokens[1]),
				   		  			tokens[2], Integer.parseInt(tokens[3]) ));
			}
			if (s.contains("pages")) {
				String[] tokens = s.split(";", 3);				
				return (new Magazine(tokens[0], Double.parseDouble(tokens[1]),
				   		  			 Integer.parseInt(tokens[2]) ));
				//return mag;
			}
			
		}
		
		return null;
	}
	
	public static String storeToLine( PrintedEdition item) {
		
		if (item != null) {
			if (item instanceof Book) {				
				return item.paramStr();				
			}
			if (item instanceof Magazine) {
				return item.paramStr();
			}			
		}
		return null;
	}
	
	
	public static List<String> loadTextFile() {
		String s;
		List<String> lines = new ArrayList<String>();
		
	try { 
		FileReader fReader = new FileReader(fileName);
		BufferedReader buffReader = new BufferedReader(fReader);		
		
		while((s = buffReader.readLine()) != null) {
          lines.add(s); 
	    }
		buffReader.close();
	}	
    catch (FileNotFoundException e) {
		System.out.printf("Can't open file '%s'", fileName);
		e.printStackTrace(); }
	catch (IOException e) {
        System.out.printf("Error reading file '%s'", fileName);
        e.printStackTrace(); }
	
	  	return lines;
	}
	
	public static void saveTextFile(List<String> lines) {
		String s;
		if (lines != null) {
		try {
			FileWriter fWriter = new FileWriter(fileName);
			BufferedWriter buffWriter =	new BufferedWriter(fWriter);
			
			for(int i=0; i <lines.size(); i++) {				
				buffWriter.write( lines.get(i) );
				buffWriter.newLine();
			}
			buffWriter.close();
        } catch(IOException e) {
        	System.out.printf("Error writing file '%s'", fileName);
        	e.printStackTrace();
        }
		}
	}
}
