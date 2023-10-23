package tn.esprit.products.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.products.Entity.Produit;
import tn.esprit.products.Service.ProduitService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/produits")
public class ProduitsController {
    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    @GetMapping("/{id}")
    public Produit getProduitById(@PathVariable Long id) {
        return produitService.getProduitById(id)
                .orElseThrow(() -> new IllegalArgumentException("Le produit avec l'ID " + id + " n'existe pas."));
    }

    @PostMapping
    public Produit createProduit(@RequestBody Produit produit) {
        return produitService.createProduit(produit);
    }

    @PutMapping("/{id}")
    public Produit updateProduit(@PathVariable Long id, @RequestBody Produit produit) {
        return produitService.updateProduit(id, produit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id) {
        produitService.deleteProduit(id);
    }
}
