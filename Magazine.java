package by.epam.library.entity;

import java.util.*;

public class Magazine extends PrintedEdition{
	private int pageCount;
	
	public Magazine(String _title, double _price, int pageCount) {
		super(_title, _price);
		this.pageCount = pageCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Magazine [pageCount=" + pageCount + ", getPrice()=" + getPrice() + ", getTitle()=" + getTitle() + "]";
	}
	
	@Override
	public String formatStr() {
		return String.format("| %20s |                      | %12.2f |      | %5d |", getTitle(), getPrice(), getPageCount());
	}
	public String paramStr() {
		return String.format("title: '%s'; price: %12.2f; pages: %4d", getTitle(), getPrice(), getPageCount());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pageCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazine other = (Magazine) obj;
		if (pageCount != other.pageCount) return false;
		if (getPrice() != other.getPrice()) return false;
		if (getTitle() != other.getTitle()) return false;
		return true;
	}

}
