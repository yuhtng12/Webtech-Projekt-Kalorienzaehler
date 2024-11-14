package de.htwberlin.webtech.web;


import de.htwberlin.webtech.model.Lebensmittel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LebensmittelController {

    private List<Lebensmittel> lebensmittelListe = new ArrayList<>();

    public LebensmittelController() {
        lebensmittelListe.add(new Lebensmittel("Apfel", 52));
        lebensmittelListe.add(new Lebensmittel("Banane", 89));
        lebensmittelListe.add(new Lebensmittel("Kartoffel", 77));
    }

    @GetMapping(path = "/api/lebensmittel") //funktioniert noch nicht, Fehlermeldung unbekannt
    public ResponseEntity<List<Lebensmittel>> getLebensmittelListe() {
        return ResponseEntity.ok(lebensmittelListe);
    }
}


