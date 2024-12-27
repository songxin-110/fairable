import com.atguigu.ioc2.SimpleMovie;
import com.atguigu.ioc2.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
    @Test
    public void test() {
        //创建对象
        //编写bean定义信息
        //

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-02.xml");
        UserService bean = (UserService) context.getBean("userService3");

        SimpleMovie bean1 = (SimpleMovie) context.getBean("simpleMovie");
        System.out.println(bean1.getMovieName());
    }

}
