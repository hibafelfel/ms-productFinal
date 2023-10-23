package tn.esprit.products.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int refPdt;
    private String designation;
    private String description;
    private double prix;
    private String image;
    private int qteStock;



    // Constructeurs

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRefPdt() {
        return refPdt;
    }

    public void setRefPdt(int refPdt) {
        this.refPdt = refPdt;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }


}

