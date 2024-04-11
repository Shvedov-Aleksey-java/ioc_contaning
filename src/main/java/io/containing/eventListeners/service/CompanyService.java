package io.containing.eventListeners.service;

import io.containing.eventListeners.listener.EntityEvent;
import io.containing.eventListeners.repository.CompanyRepository;
import io.containing.eventListeners.dto.CompanyReadDto;
import io.containing.eventListeners.type.AccessType;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * eventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
 * вот эта запись добовляет этот класс в наш лист для отслеживания
 */
@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final ApplicationEventPublisher eventPublisher;

    public Optional<CompanyReadDto> findById(Integer id) {
        return companyRepository.findById(id).map(entity -> {
            eventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
            return new CompanyReadDto(entity.id());
        });
    }
}
