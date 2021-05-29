package com.coforge.Model;

import java.util.ArrayList;
import java.util.List;

public class BookDetails {

	public List<String> findBookByCategory(String category) {
		List<String> bookList=new ArrayList<>();
		if(category.equalsIgnoreCase("fiction")) {
			bookList.add("jotre");
			bookList.add("jhgfd");
			bookList.add("jhgf");
			bookList.add("gfds");
			bookList.add("gfdxs");
		}
		else if (category.equalsIgnoreCase("horor")) {
			bookList.add("uytrew");
			bookList.add("qwert");
			bookList.add("6t5rew");
			bookList.add("kjhgfd");
			bookList.add("jhgfds");
		}
		else if(category.equalsIgnoreCase("animation")) {
			bookList.add("jotre");
			bookList.add("jhgfd");
			bookList.add("jhgf");
			bookList.add("gfds");
			bookList.add("gfdxs");
		}
		
		else {
			bookList=null;
		}
		return bookList;
	}

}
