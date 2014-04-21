package com.babyduncan.proxy.staticproxy;

import com.babyduncan.proxy.staticproxy.internal.BookServiceImpl;
import com.babyduncan.proxy.staticproxy.proxy.BookServiceProxy;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 4/21/14 17:41
 */
public class Main {

    public static void main(String... args) {
        BookService bookService = new BookServiceImpl();
        BookService bookServiceProxy = new BookServiceProxy();

        System.out.println(bookService.getBook("babyduncan"));
        System.out.println(bookServiceProxy.getBook("babyduncan"));

        System.out.println("=============================");

        System.out.println(bookService.getBookPrice("<<india>>"));
        System.out.println(bookServiceProxy.getBookPrice("<<india>>"));

        /*
        <<india>>
        <<india>>
        =============================
        $30
        $30
         */

    }

}
