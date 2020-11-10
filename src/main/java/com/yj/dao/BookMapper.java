package com.yj.dao;

import com.yj.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yj
 * @create 2020-11-10 19:55
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);

    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookId")int id);
    //查询全部图书
    List<Books> queryAllBook();
}
