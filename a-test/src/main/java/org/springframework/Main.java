package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ${USER}
 * @date ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Object bean = context.getBean("props1");
        System.out.println("bean = " + bean);
    }
}
