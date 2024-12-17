package de.htwberlin.webtech.service;

import de.htwberlin.webtech.model.Lebensmittel;
import de.htwberlin.webtech.repository.LebensmittelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LebensmittelService {

    private final LebensmittelRepository repository;

    public LebensmittelService(LebensmittelRepository repository) {
        this.repository = repository;
    }

    public List<Lebensmittel> findAll() {
        return repository.findAll();
    }

    public Lebensmittel save(Lebensmittel lebensmittel) {
        return repository.save(lebensmittel);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
