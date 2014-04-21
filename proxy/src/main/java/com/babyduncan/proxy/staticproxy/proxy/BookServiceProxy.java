package com.babyduncan.proxy.staticproxy.proxy;

import com.babyduncan.proxy.staticproxy.BookService;
import com.babyduncan.proxy.staticproxy.internal.BookServiceImpl;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 4/21/14 17:40
 */
public class BookServiceProxy implements BookService {

    private BookService bookService = new BookServiceImpl();

    @Override
    public String getBook(String author) {
        return bookService.getBook(author);
    }

    @Override
    public String getBookPrice(String bookName) {
        return bookService.getBookPrice(bookName);
    }
}
