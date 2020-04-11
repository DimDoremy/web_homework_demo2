package org.cart;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class BookDB {
    private static final Map<String,Book> books= new LinkedHashMap<>();
    static {
        books.put("1",new Book("1","高等数学"));
        books.put("2",new Book("2","大学英语"));
        books.put("3",new Book("3","大学体育"));
        books.put("4",new Book("4","美术鉴赏"));
        books.put("5",new Book("5","生理保健"));
    }
    public static Collection<Book> getAll(){return books.values();}
    public static Book getBook(String id){
        return books.get(id);
    }
}