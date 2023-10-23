package tn.esprit.products.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.products.Entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    // Vous pouvez ajouter des méthodes de recherche personnalisées si nécessaire
}

