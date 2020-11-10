package com.yj.service;

import com.yj.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yj
 * @create 2020-11-10 20:11
 */
public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询全部图书
    List<Books> queryAllBook();
}
