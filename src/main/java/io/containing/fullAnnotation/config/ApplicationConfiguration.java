package io.containing.fullAnnotation.config;


import io.containing.fullAnnotation.model.User;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

/**
 * данный класс это класс конфигурации который полностью звменяет xml фаил не много про анатации
 * @ImportResource("classpath:application4.xml"): дополнительно добовляет xml конфигурацию если нужно
 * @Configuration: говорит о том что это класс конфигурации
 * @ComponentScan("io.containing.fullAnnotation"): сканирует нужные нам пакеты для добавления в контекст
 * @PropertySource("classpath:application.properties") добовляет фаил проперти в контекст
 * @Import(User.class) можно подключать дополнительные классы конфигурации они добавятся в этот класс
 * @Bean(name) создает нужный нам бин где имя метода есть имя по которому его нужно вызывать параметр name имя бина
 * @Scope(BeanDefinition.SCOPE_SINGLETON) так же два варианта как и в application2.xml строк.61
 */

//@Import(User.class)
//@ImportResource("classpath:application4.xml")
@Configuration
@ComponentScan("io.containing.fullAnnotation")
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {
    @Bean("get")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public User getUser() {
        return new User("aleksey", "pass", "userDriver", 10);
    }
}
