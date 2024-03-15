package fr.gsb.rv.technique;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


import androidx.appcompat.app.AppCompatActivity;
import fr.gsb.R;




public class SaisieRvActivity extends AppCompatActivity {


  // Button btn_validerForm;


   Button btn_AnnulerForm;


   Button btn_retour;
   private static final String[] lesPraticiens = {"Téo", "Bastien", "Ali", "Adam", "Elias"};
   Spinner praticien;


   private static final String[] lesMotifs = {"Présentation", "Vente", "Renouvellement", "Arrêt"};
   Spinner motif;


   private static final String[] lesCoefConf = {"1", "2", "3", "4", "5"};
   Spinner coefConf;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.saisie_rv_activity);


       btn_retour = findViewById(R.id.Retour);


       praticien = findViewById(R.id.praticien);
       ArrayAdapter<String> aaPraticien = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lesPraticiens);
       aaPraticien.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       praticien.setAdapter(aaPraticien);


       motif = findViewById(R.id.motif);
       ArrayAdapter<String> aaMotif = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lesMotifs);
       aaMotif.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       motif.setAdapter(aaMotif);


       coefConf = findViewById(R.id.coefConf);
       ArrayAdapter<String> aaCoefConf = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lesCoefConf);
       aaCoefConf.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       coefConf.setAdapter(aaCoefConf);


       btn_retour.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               finish();
           }
       });


      // btn_AnnulerForm.setOnClickListener(new View.OnClickListener() {
         //  @Override
          // public void onClick(View view) {
              // praticien.getSelectedItem();
              // motif.getSelectedItem();
              // coefConf.getSelectedItem();
          // }
      // });


   }
}


