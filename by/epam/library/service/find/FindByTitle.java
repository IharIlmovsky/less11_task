package by.epam.library.service.find;

import java.util.ArrayList;
import java.util.List;

import by.epam.library.entity.PrintedEdition;

public class FindByTitle implements Findable{
	private String title;
	
	public FindByTitle(String title) {
		this.title = title;
	}

	@Override
	public List<PrintedEdition> find(List<PrintedEdition> items) {
		List<PrintedEdition> result = new ArrayList<PrintedEdition>();
		
		for(int i=0; i < items.size(); i++) {
			PrintedEdition obj = items.get(i);
			if(title == obj.getTitle()) {
				result.add(obj);
			}
		}
		return result;
	}

}
