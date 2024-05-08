package com.Facture.Facture.java.service;

import com.Facture.Facture.java.model.Facture;

import java.util.List;
import java.util.Optional;

public interface FactureService {

    public Facture createFacture(Facture F);
    public Optional<Facture> getFacture(int id);
    public List<Facture> getAllFacture();
    public void deleteFacture(int id);

    public Facture putFacture(int id, Facture facture);






}
