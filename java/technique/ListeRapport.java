package fr.gsb.rv.entites;


public class ListeRapport {
   private String nom;
   private String prenom;
   private Integer mois;
   private Integer annee;


   public ListeRapport(String nom, String prenom, Integer mois, Integer annee) {
       super();
       this.nom = nom;
       this.prenom = prenom;
       this.mois = mois;
       this.annee = annee;
   }


   public String getNom() {


       return nom;
   }


   public void setNom(String nom) {


       this.nom = nom;
   }


   public String getPrenom() {


       return prenom;
   }


   public void setPrenom(String prenom) {


       this.prenom = prenom;
   }


   public Integer getMois() {


       return mois;
   }


   public void setMois(Integer mois) {


       this.mois = mois;
   }


   public Integer getAnnee() {


       return annee;
   }


   public void setAnnee(Integer annee) {


       this.annee = annee;
   }


}
