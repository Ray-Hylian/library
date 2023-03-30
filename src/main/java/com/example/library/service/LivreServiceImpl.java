package com.example.library.service;

import com.example.library.entity.Livre;
import com.example.library.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreServiceImpl implements LivreService{

    @Autowired
    private LivreRepository livreRepository;

    @Override
    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    @Override
    public Livre addLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public Optional<Livre> getLivreById(Long id) {
        return livreRepository.findById(id);
    }

    @Override
    public Livre updateLivre() {
        return null;
    }

    @Override
    public void deleteLivre(Livre livre) {
        livreRepository.delete(livre);
    }

    @Override
    public void deleteLivreById(Long id) {
        livreRepository.deleteById(id);
    }

    @Override
    public void deleteAllLivre() {
        livreRepository.deleteAll();
    }
}
