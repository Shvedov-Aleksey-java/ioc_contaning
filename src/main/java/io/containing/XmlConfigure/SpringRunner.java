package io.containing.XmlConfigure;

import io.containing.XmlConfigure.model.User;
import io.containing.XmlConfigure.repository.UserRepository;
import io.containing.XmlConfigure.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * создаем контекст из файла application.xml где содержится все наши бины
 */
public class SpringRunner {
    /*
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        var repository = context.getBean("id1");
        UserRepository repo2 = context.getBean("repo2", UserRepository.class);
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user2", User.class);
        User user3 = context.getBean("user3", User.class);
        System.out.println(repository);
        System.out.println(user);
        System.out.println(user2);
        System.out.println(user3);
        context.close();

        var context2 = new ClassPathXmlApplicationContext("application2.xml");
        UserService service = context2.getBean("service", UserService.class);
        User userC2 = context2.getBean("user1", User.class);
        System.out.println(service);
        System.out.println(userC2);
        context2.close();

        var context3 = new ClassPathXmlApplicationContext("application3.xml");
        User userC3 = context3.getBean("user3", User.class);
        System.out.println(userC3);
        context3.close();
    }

     */
}