package org.wits.coindesk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wits.coindesk.model.dto.entity.CurrencyEntity;

import java.util.Optional;

public interface CurrencyDAO extends JpaRepository<CurrencyEntity, Integer> {

    Optional<CurrencyEntity> deleteByCode(String code);

    Optional<CurrencyEntity> findByCode(String code);
}
