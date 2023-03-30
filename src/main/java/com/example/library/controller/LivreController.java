package com.example.library.controller;

import com.example.library.entity.Livre;
import com.example.library.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/livres")
public class LivreController {

    @Autowired
    private LivreService livreService;

    @GetMapping("")
    public List<Livre> getAllLivres(){
        return livreService.getAllLivres();
    }

    @GetMapping("/{id}")
    public Optional<Livre> getLivreById(@PathVariable Long id){
        return livreService.getLivreById(id);
    }

    @PostMapping("")
    public Livre createLivre(@RequestBody Livre livre){
        return livreService.addLivre(livre);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        livreService.deleteLivreById(id);
    }


    // Update du livre
}
