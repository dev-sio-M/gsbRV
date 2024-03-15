package fr.gsb.rv.modeles;


import fr.gsb.rv.entites.ListeRapport;
import java.util.ArrayList;
import java.util.List;


public class ModeleListeRapport {


   private static ModeleListeRapport modele = null;


   private List<ListeRapport> lesRapports = new ArrayList<>();


   private ModeleListeRapport() {
       super();
       this.peupler();
   }


   public static ModeleListeRapport getInstance() {
       if (ModeleListeRapport.modele == null) {
           modele = new ModeleListeRapport();
       }
       return ModeleListeRapport.modele;
   }


   private void peupler() {
       this.lesRapports.add(new ListeRapport("Villechalane", "Louis", 5, 2020));
       this.lesRapports.add(new ListeRapport("Bentot", "Pascal", 12, 2023));
       this.lesRapports.add(new ListeRapport("Bioret", "Luc", 8, 2022));
       this.lesRapports.add(new ListeRapport("Andre", "David", 1, 2019));
   }


   public ListeRapport voirListe(Integer mois, Integer annee) {
       for (ListeRapport unRapport : this.lesRapports) {
           if (unRapport.getMois().equals(mois) && unRapport.getAnnee().equals(annee)) {
               return unRapport;
           }
       }
       return null;
   }
}

