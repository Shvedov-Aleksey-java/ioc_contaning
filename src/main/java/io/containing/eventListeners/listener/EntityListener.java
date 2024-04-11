package io.containing.eventListeners.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @EventListener(condition = "#event.accessType.name() == 'READ'") - этот метод слушатель он будет отслеживать
 * все приходящие EntityEvent в параметрах condition = можно зделать более дитальные настройки
 */
@Component
public class EntityListener {

    @EventListener(condition = "#event.accessType.name() == 'READ'")
    public void acceptEvent(EntityEvent event) {
        System.out.println(event);
    }
}
