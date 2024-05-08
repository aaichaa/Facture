package com.Facture.Facture.java.service;

import com.Facture.Facture.java.model.Facture;
import com.Facture.Facture.java.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FactureServiceImpl implements FactureService{

    @Autowired
    public FactureRepository factureRep;
    @Override
    public Facture createFacture(Facture F) {

        return factureRep.save(F);
    }

    @Override
    public Optional<Facture> getFacture(int id) {
        return factureRep.findById(id);
    }
    @Override
    public List<Facture> getAllFacture()
    {
        return factureRep.findAll();
    }
    @Override
    public void deleteFacture(int id)
    {
        factureRep.deleteById(id);
    }
    private Facture getId(int id)
    {
        Optional<Facture> updataFacture = factureRep.findById(id);
        return  updataFacture.get();
    }
    @Override
    public Facture putFacture(int id, Facture newfacture){

        Facture updataFacture = getId(id);
        updataFacture.setNom(newfacture.getNom());
        updataFacture.setPrenom(newfacture.getPrenom());
        updataFacture.setAdresse(newfacture.getAdresse());
        updataFacture.setMontant(newfacture.getMontant());
        updataFacture.setN_client(newfacture.getN_client());
        updataFacture.setDateFac(newfacture.getDateFac());

        return factureRep.save(updataFacture);
    }
}
