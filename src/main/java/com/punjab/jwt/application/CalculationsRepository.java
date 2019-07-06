package com.punjab.jwt.application;

import com.punjab.jwt.domain.Calculations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationsRepository extends JpaRepository<Calculations, Long> {
}
