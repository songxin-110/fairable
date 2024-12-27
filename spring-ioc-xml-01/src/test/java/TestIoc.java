import com.atguigu.ioc3.Fan;
import com.atguigu.ioc3.HaCome;
import com.atguigu.ioc_04.Water;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.atguigu.ioc_04.Money;
//ioc容器创建和读取组件的测试类
public class TestIoc {

    //创建容器 选择合适的容器实现即可
    //接口
    /*
    * BeanFactory 核心容器接口
    * Application BeanFactory的子接口
     ClassPathXmlApplicationContext|通过读取类路径下的 XML 格式的配置文件创建 IOC 容器对象|
     FileSystemXmlApplicationContext|通过文件系统路径读取 XML 格式的配置文件创建 IOC 容器对象|
     AnnotationConfigApplicationContext|通过读取Java配置类创建 IOC 容器对象|
     WebApplicationContext|专门为 Web 应用准备，基于 Web 环境创建 IOC 容器对象，并将对象引入存入 ServletContext 域中
    *  */

    public void creatIoc(){
        //创建ioc容器的方法
        //1，创建ioc容器和配置xml文件
        ApplicationContext fileSystemXmlApplicationContext =
                new FileSystemXmlApplicationContext("src/main/resources/spring-03.xml");

        //方式2：
        // 1）创建ioc容器
        FileSystemXmlApplicationContext ApplicationContext1 = new FileSystemXmlApplicationContext();

        //配置xml文件
        ApplicationContext1.setConfigLocation("src/main/resources/spring-03.xml");
        // 3)刷新容器
        ApplicationContext1.refresh();

    }

    @Test
    public void readIoc(){
        // 1）创建ioc容器
        FileSystemXmlApplicationContext ApplicationContext1 = new FileSystemXmlApplicationContext();

        //配置xml文件
        ApplicationContext1.setConfigLocation("src/main/resources/spring-03.xml");
        // 3)刷新容器
        ApplicationContext1.refresh();

        //获取组件： 三种方式： 根据bean的id获取
        HaCome bean = (HaCome) ApplicationContext1.getBean("happyness");
        System.out.println(bean);
        System.out.println("------------------------------------");
        //2) 根据bean的类型获取 ，注意：获取的bean只能有一个
        //否则会抛出NoUniqueBeanException, 同时
        HaCome bean1 = (HaCome) ApplicationContext1.getBean(HaCome.class);
        System.out.println(bean1);

        // 3)根据类型和bean的id获取
        HaCome bean2 = (HaCome) ApplicationContext1.getBean("happyness",HaCome.class);
        System.out.println(bean2);
    }

    @Test
    public void ioc4(){
        ClassPathXmlApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("spring-04.xml");
//        Money money = applicationContext.getBean("money", Money.class);
//        applicationContext.close();
        Water person = applicationContext.getBean("person", Water.class);
        Water person1 = applicationContext.getBean("person", Water.class);
        System.out.println(person == person1);
        applicationContext.close();
    }

    @Test
    public void ioc5(){
        ClassPathXmlApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-05.xml");
        Object bean = applicationContext.getBean("javaBean");
        System.out.println(bean);

        applicationContext.close();

    }




}
