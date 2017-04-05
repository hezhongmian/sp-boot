package com.testsax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/5.
 */
public class Sax1Cont extends DefaultHandler {
    private List<Books> books = null;
    private List<BookOther> bookOtherList = null;
    private Books book = null;
    private BookOther bookOther = null;
    private String preTag = null;//作用是记录解析时的上一个节点名称

    public List<Books> getBooks(InputStream xmlStream) throws Exception{
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        Sax1Cont handler = new Sax1Cont();
        parser.parse(xmlStream, handler);
        return handler.getBooks();
    }

    public List<Books> getBooks(){
        return books;
    }

    @Override
    public void startDocument() throws SAXException {
        books = new ArrayList<Books>();
        bookOtherList = new ArrayList<BookOther>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if("rec".equalsIgnoreCase(qName)){
            book = new Books();
            bookOther = new BookOther();
        }
        preTag = qName;//将正在解析的节点名称赋给preTag
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        if("rec".equalsIgnoreCase(qName)){
            books.add(book);
            bookOtherList.add(bookOther);
            book = null;
            bookOther = null;
        }
        preTag = null;/**当解析结束时置为空。这里很重要，例如，当图中画3的位置结束后，会调用这个方法
         ，如果这里不把preTag置为null，根据startElement(....)方法，preTag的值还是book，当文档顺序读到图
         中标记4的位置时，会执行characters(char[] ch, int start, int length)这个方法，而characters(....)方
         法判断preTag!=null，会执行if判断的代码，这样就会把空值赋值给book，这不是我们想要的。*/
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(preTag!=null){
            String content = new String(ch,start,length);
            if("Bookid".equalsIgnoreCase(preTag)){
                book.setBookId(content);
            }else if("BookName".equalsIgnoreCase(preTag)){
                book.setBookName(content);
            }else if ("ChapterNo".equalsIgnoreCase(preTag)){
                book.setChapterNo(content);
            }else if ("ChapterName".equalsIgnoreCase(preTag)){
                book.setChapterName(content);
            }else if ("ChapterParent".equalsIgnoreCase(preTag)){
                book.setChapterParentAll(content);
            }else if ("Homepage".equalsIgnoreCase(preTag)){
                book.setHomePage(content);
            }else if ("PageNo".equalsIgnoreCase(preTag)){
                book.setPageNo(content);
            }else if ("Chapterlevel".equalsIgnoreCase(preTag)){
                book.setChapterLevel(content);
            }else if ("Content".equalsIgnoreCase(preTag)){
                book.setContents(content);
            }
        }
    }
}
