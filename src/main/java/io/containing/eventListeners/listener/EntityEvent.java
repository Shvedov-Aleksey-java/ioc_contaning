package io.containing.eventListeners.listener;

import io.containing.eventListeners.type.AccessType;
import org.springframework.context.ApplicationEvent;


/**
 * класс наследует ApplicationEvent который добовляет его в контекст классов за которыми нужну следить
 * должен быть реализован конструктор это своего рода отметка что бы этот класс прослушивался
 */
public class EntityEvent extends ApplicationEvent {

    private final AccessType accessType;


    public EntityEvent(Object source, AccessType accessType) {
        super(source);
        this.accessType = accessType;
    }

    public AccessType getAccessType() {
        return accessType;
    }
}
