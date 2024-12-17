package de.htwberlin.webtech.repository;

import de.htwberlin.webtech.model.Lebensmittel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LebensmittelRepository extends JpaRepository<Lebensmittel, Long> {}
