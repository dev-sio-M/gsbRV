package fr.gsb.rv.technique;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import fr.gsb.R;
import fr.gsb.rv.entites.ListeRapport;
import fr.gsb.rv.modeles.ModeleListeRapport;


public class RechercherRvActivity extends AppCompatActivity {


   Button btn_afficher;


   Button btn_retour;
   private static final String[] lesMois = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
   Spinner mois;


   private static final String[] lesAnnees = {"2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024"};
   Spinner annee;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.rechercher_rv_activity);


       btn_afficher = findViewById(R.id.Afficher);
       btn_retour = findViewById(R.id.Retour);


       mois = findViewById(R.id.mois);
       ArrayAdapter<String> aaMois = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lesMois);
       aaMois.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       mois.setAdapter(aaMois);


       annee = findViewById(R.id.annee);
       ArrayAdapter<String> aaAnnee = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lesAnnees);
       aaAnnee.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       annee.setAdapter(aaAnnee);


       btn_afficher.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String moisStr = mois.getSelectedItem().toString();
               String anneeStr = annee.getSelectedItem().toString();


               if (!moisStr.isEmpty() && !anneeStr.isEmpty()) {
                   Integer mois = Integer.parseInt(moisStr);
                   Integer annee = Integer.parseInt(anneeStr);


                   ListeRapport rapport = ModeleListeRapport.getInstance().voirListe(mois, annee);


                   if (rapport != null) {
                       Intent intent = new Intent(RechercherRvActivity.this, ListeActivity.class);
                       startActivity(intent);
                   } else {
                       Toast.makeText(RechercherRvActivity.this, "Rapport de visite inexistant", Toast.LENGTH_SHORT).show();
                   }
               } else {
                   Toast.makeText(RechercherRvActivity.this, "Veuillez sélectionner un mois et une année", Toast.LENGTH_SHORT).show();
               }
           }
       });




       btn_retour.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               finish();
           }
       });
   }
}
