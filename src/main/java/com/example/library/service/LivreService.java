package com.example.library.service;

import com.example.library.entity.Livre;

import java.util.List;
import java.util.Optional;

public interface LivreService {

    public List<Livre> getAllLivres();
    public Livre addLivre(Livre livre);
    public Optional<Livre> getLivreById(Long id);
    public Livre updateLivre();
    public void deleteLivre(Livre livre);
    public void deleteLivreById(Long id);
    public void deleteAllLivre();
}
