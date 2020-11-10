package com.yj.controller;

import com.yj.pojo.Books;
import com.yj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author yj
 * @create 2020-11-10 20:52
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller层调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;
    //查询全部的书籍并返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
}
