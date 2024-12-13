package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.Lebensmittel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LebensmittelController {

    private final List<Lebensmittel> lebensmittelListe = new ArrayList<>();

    public LebensmittelController() {
        lebensmittelListe.add(new Lebensmittel("Apfel", 52));
        lebensmittelListe.add(new Lebensmittel("Banane", 89));
        lebensmittelListe.add(new Lebensmittel("Kartoffel", 77));
    }

    @CrossOrigin(origins = "https://frontend-kalorienzaehler.onrender.com")
    @GetMapping(path = "/api/lebensmittel")
    @ResponseBody
    public ResponseEntity<List<Lebensmittel>> getLebensmittelListe() {
        return ResponseEntity.ok()
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Pragma", "no-cache")
                .header("Expires", "0")
                .body(lebensmittelListe);
    }
}
