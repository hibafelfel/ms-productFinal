package tn.esprit.products.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.products.Entity.Produit;
import tn.esprit.products.Repository.ProduitRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService implements IProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> getAllProduits() {
        return (List<Produit>) produitRepository.findAll();
    }

    public Optional<Produit> getProduitById(Long id) {
        return produitRepository.findById(id);
    }

    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public Produit updateProduit(Long id, Produit produit) {
        if (produitRepository.existsById(id)) {
            produit.setId(id);
            return produitRepository.save(produit);
        } else {
            throw new IllegalArgumentException("Le produit avec l'ID " + id + " n'existe pas.");
        }
    }

    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }
}

