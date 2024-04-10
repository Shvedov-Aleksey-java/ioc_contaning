package io.containing.annotationConfigure.pool;

import jakarta.annotation.Resource;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Autowired сама подтягивает нужный нам бин в контекст она достаточно умная и сравниваеи имя переменной
 * с именем бина и его ид. так же есть конструктор с одним параметром  @Autowired(required = false) если true
 * он же стоит по дефолту то обезательно должен быть обьект если false то нет
 * @Resource(name = "pool") на практике как правило не используется она подтягивает бин с определенным названием
 * @Qualifier("pool") служит только для подтягивания определенного бина по его именни используется вместе с @Autowired
 * @Value("${db.size}") из библиотеки org.springframework.beans.factory.annotation.Value; так же можно подстовлять
 * значения из файла пропертиез которые нам нужны
 * онотации которые автомотические определяются как бины и сразу позволяют добовлять их в контекс одинаковые по
 * фунциональности только логичекое разделение
 * @Service: классы сервисов
 * @Repository: классы репозитории
 * @Controller: классы контроллеры
 * @Component: все остальное обзываем компанентом
 */
//@Component
//@Service
//@Repository
//@Controller
@ToString
public class UserPool {
    //@Autowired(required = false)
    //@Resource(name = "pool")
    //@Qualifier("pool")
    @InjectBeen
    private Pool pool;

    @Value("${db.size}")
    private Integer size;

}
