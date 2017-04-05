package com.testsax;

import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
public class Sax1ContTest {

    @Test
    public void testSAX1() throws Throwable{
        Sax1Cont sax = new Sax1Cont();
        InputStream input = this.getClass().getClassLoader().getResourceAsStream("600015-cont_all.xml");
        List<Books> books = sax.getBooks(input);
        for(Books book : books){
            System.out.println(book.toString());
        }
    }

}
