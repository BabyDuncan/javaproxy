package com.babyduncan.proxy.dynamicProxy;

import com.babyduncan.proxy.dynamicProxy.jdk.BookServiceFacade;
import com.babyduncan.proxy.staticproxy.BookService;
import com.babyduncan.proxy.staticproxy.internal.BookServiceImpl;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 4/21/14 17:46
 */
public class JDKMain {

    public static void main(String... args) {
        BookService bookService = new BookServiceImpl();
        BookServiceFacade bookServiceFacade = new BookServiceFacade();
        BookService bookServiceProxy = (BookService) bookServiceFacade.bind(new BookServiceImpl());

        System.out.println(bookService.getBook("babyduncan"));
        System.out.println(bookServiceProxy.getBook("babyduncan"));

        System.out.println("=============================");

        System.out.println(bookService.getBookPrice("<<india>>"));
        System.out.println(bookServiceProxy.getBookPrice("<<india>>"));
    }

}
