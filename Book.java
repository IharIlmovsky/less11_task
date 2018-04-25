package by.epam.library.entity;

import java.util.*;
import java.lang.*;

public class Book extends PrintedEdition{
	
	private String printedBy;
	private int yearPublished;
	
	public Book(String _title, double _price, String _printedBy, int year) {
		super(_title, _price);
		this.printedBy = _printedBy;
		yearPublished = year;
	}

	@Override
	public String toString() {
		return "Book [printedBy=" + printedBy + ", yearPublished=" + yearPublished + ", getPrice()=" + getPrice()
				+ ", getTitle()='" + getTitle() + "']";
	}
		
	public String formatStr() {
		return String.format("| %20s | %20s | %12.2f | %4d |       |", getTitle(), getPrintedBy(), getPrice(), getYearPublished());
	}
	
	public String paramStr() {
		return String.format("title: '%s'; printedBy: '%s'; price: %12.2f; yearPublished: %4d", getTitle(), getPrintedBy(), getPrice(), getYearPublished());
	}

	public String getPrintedBy() {
		return printedBy;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public void setPrintedBy(String printedBy) {
		this.printedBy = printedBy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((printedBy == null) ? 0 : printedBy.hashCode());
		result = prime * result + yearPublished;
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
		
		Book other = (Book) obj;
		if (printedBy == null) {
			if (other.printedBy != null)
				return false;
		} else if (!printedBy.equals(other.printedBy))	return false;
		if (yearPublished != other.yearPublished)	return false;
		if (getPrice() != other.getPrice()) return false;
		if (getTitle() != other.getTitle()) return false;
		
		return true;
	}

	
	
	

}
