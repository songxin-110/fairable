package com.atguigu;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestPerson {

    public void test(){
        //实例化ioc容器,读取外部配置文件,最终会在容器内进行ioc和di动作
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-01.xml");
        Person person = (Person)context.getBean("person");

        System.out.println(person);
        person.setName("张三");
        person.setAge(22);
        System.out.println(person);




    }
}
