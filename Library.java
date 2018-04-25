package by.epam.library.entity;

import java.util.ArrayList;
import java.util.List;

import by.epam.library.service.find.Findable;

public class Library {
	private List<PrintedEdition> items = new ArrayList<PrintedEdition>();

	public Library() {
	}

	public void add(PrintedEdition unit) {
		items.add(unit);
	}

	public void remove(PrintedEdition unit) {
		items.remove(unit);
	}

	public List<PrintedEdition> getItems() {
		return items;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		return true;
	}

}
