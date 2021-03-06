package com.db.dao;

import java.util.List;

import com.db.model.BookInfo;
import com.db.model.SqlResult;

public interface BookDao {

	public List<BookInfo> listBooks();

	public SqlResult addNewBook(BookInfo b);

	public void editBook(BookInfo b);

	public List<BookInfo> searchBooks(String type, List<String> args);

}
