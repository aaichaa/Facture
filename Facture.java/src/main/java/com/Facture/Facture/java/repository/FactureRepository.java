package com.Facture.Facture.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Facture.Facture.java.model.Facture;
@Repository
public interface FactureRepository extends JpaRepository<Facture, Integer> {
}
