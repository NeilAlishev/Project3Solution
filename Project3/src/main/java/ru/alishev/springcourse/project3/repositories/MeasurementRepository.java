package ru.alishev.springcourse.project3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alishev.springcourse.project3.models.Measurement;

/**
 * @author Neil Alishev
 */
@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
