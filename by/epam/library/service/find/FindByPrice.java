package by.epam.library.service.find;

import java.util.ArrayList;
import java.util.List;

import by.epam.library.entity.PrintedEdition;

public class FindByPrice implements Findable{
	private double price;
	
	public FindByPrice(double price) {
		this.price = price;
	}

	@Override
	public List<PrintedEdition> find(List<PrintedEdition> items) {
		List<PrintedEdition> result = new ArrayList<PrintedEdition>();
		
		for(int i=0; i < items.size(); i++) {
			PrintedEdition obj = items.get(i);
			if(price == obj.getPrice()) {
				result.add(obj);
			}
		}
		return result;
	}

}
