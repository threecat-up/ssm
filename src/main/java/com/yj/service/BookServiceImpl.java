package com.yj.service;

import com.yj.dao.BookMapper;
import com.yj.pojo.Books;

import java.util.List;

/**
 * @author yj
 * @create 2020-11-10 20:12
 */
public class BookServiceImpl implements BookService{

    //service层调dao层，组合dao
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
