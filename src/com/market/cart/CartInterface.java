package com.market.cart;

import java.util.ArrayList;
import com.market.bookitem.Book;

public interface CartInterface {
	void printBookList(ArrayList<Book> p );
	boolean isCartInterBook(String id);
	void insertBook(Book p);
	void removwCart (int numId);
	void deleteBook();
}
