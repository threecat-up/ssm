import com.yj.pojo.Books;
import com.yj.service.BookService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

/**
 * @author yj
 * @create 2020-11-10 21:01
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for(Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }

}
