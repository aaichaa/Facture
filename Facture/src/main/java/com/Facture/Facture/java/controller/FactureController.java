package com.Facture.Facture.java.controller;

import com.Facture.Facture.java.model.Facture;
import com.Facture.Facture.java.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Facture")
public class FactureController {
    @Autowired
    private FactureService factureService;

    @PostMapping()
    public Facture createFacture(@RequestBody Facture F){

        return factureService.createFacture(F);
    }

    @GetMapping("/{id}")
    public Optional<Facture> getFacture(@PathVariable int id)
    {
        return factureService.getFacture(id);
    }
    @GetMapping
    public List<Facture> getAllFacture(){
        return factureService.getAllFacture();
    }
    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable int id)
    {
       factureService.deleteFacture(id);
    }
    @PutMapping("/{id}")
    public Facture putFacture(@PathVariable int id,@RequestBody Facture facture){
        return factureService.putFacture(id, facture);
    }







}
