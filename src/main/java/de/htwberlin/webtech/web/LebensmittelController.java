package de.htwberlin.webtech.web;

import de.htwberlin.webtech.model.Lebensmittel;
import de.htwberlin.webtech.service.LebensmittelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/lebensmittel")
@CrossOrigin(origins = "https://frontend-kalorienzaehler.onrender.com")
public class LebensmittelController {

    private final LebensmittelService lebensmittelService;

    public LebensmittelController(LebensmittelService lebensmittelService) {
        this.lebensmittelService = lebensmittelService;
    }

    // GET: Alle Lebensmittel abrufen
    @GetMapping
    public ResponseEntity<List<Lebensmittel>> getAllLebensmittel() {
        List<Lebensmittel> lebensmittel = lebensmittelService.findAll();
        return ResponseEntity.ok()
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Pragma", "no-cache")
                .header("Expires", "0")
                .body(lebensmittel);
    }

    // POST: Neues Lebensmittel hinzufügen
    @PostMapping
    public ResponseEntity<Lebensmittel> addLebensmittel(@RequestBody Lebensmittel lebensmittel) {
        Lebensmittel savedLebensmittel = lebensmittelService.save(lebensmittel);
        return ResponseEntity.ok(savedLebensmittel);
    }

    // DELETE: Lebensmittel nach ID löschen
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLebensmittel(@PathVariable Long id) {
        lebensmittelService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
