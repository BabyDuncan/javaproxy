package com.babyduncan.proxy.staticproxy.internal;

import com.babyduncan.proxy.staticproxy.BookService;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 4/21/14 17:40
 */
public class BookServiceImpl implements BookService {
    @Override
    public String getBook(String author) {
        return "<<india>>";
    }

    @Override
    public String getBookPrice(String bookName) {
        return "$30";
    }
}
