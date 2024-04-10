package io.containing.annotationConfigure.pool;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.ReflectionUtils;

import java.util.Arrays;

/**
 * мы имплементируем BeanPostProcessor у которой есть два метода postProcessBeforeInitialization и
 * postProcessAfterInitialization инцилизируется после создания бина. postProcessBeforeInitialization
 * инцилизируется на уровне создания бина. на вход она получает бин и его имя после чего мы все бины
 * через стрим фильтруем и остовляем только нашу созданную анатайыю
 * .filter(field -> field.isAnnotationPresent(InjectBeen.class))
 * потом проходимся циклом и получаем нужный нам бин
 * var objectToInject = applicationContext.getBean(field.getType());
 * следущим шагом мы имплементировали ApplicationContextAware это спецыальный интерфейс который
 * имплементирует Aware это метка для того что бы понимать что этот обьект нужен для внедрения
 * и мы переопределили у него один единственный метод setApplicationContext который и назначает
 * контекст(множество бинов)
 * после чего мы использовали ReflectionUtils.makeAccessible(field); это делает поле изменяемым
 * если это не так, аналог: field.setAccessible(true);
 * следующий шаг ReflectionUtils.setField(field, bean, objectToInject);
 * где мы в текущий обьект field В UserPool обьект Pool
 * bean это UserPool
 * objectToInject обьект который мы встовляем в Pool
 */
public class InjectBeenPostProcessor implements BeanPostProcessor, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Arrays.stream(bean.getClass().getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(InjectBeen.class))
                .forEach(field -> {
                    var objectToInject = applicationContext.getBean(field.getType());
                    ReflectionUtils.makeAccessible(field);
                    //field.setAccessible(true);
                    ReflectionUtils.setField(field, bean, objectToInject);
                    //field.set(bean, objectToInject);
                });
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
