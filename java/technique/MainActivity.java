package fr.gsb.rv.technique;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


import fr.gsb.R;
import fr.gsb.rv.entites.Visiteur;
import fr.gsb.rv.modeles.ModeleGsb;


public class MainActivity extends AppCompatActivity {


   EditText matricule;
   EditText mdp;
   Button btn_valider;
   Button btn_annuler;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


       matricule = findViewById(R.id.matricule);
       mdp = findViewById(R.id.mdp);
       btn_valider = findViewById(R.id.Valider);
       btn_annuler = findViewById(R.id.Annuler);


       btn_valider.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String matriculeStr = matricule.getText().toString();
               String mdpStr = mdp.getText().toString();


               if (!matriculeStr.isEmpty() && !mdpStr.isEmpty()) {
                   Visiteur visiteur = ModeleGsb.getInstance().seConnecter(matriculeStr, mdpStr);


                   if (visiteur != null) {
                       Toast.makeText(MainActivity.this, "Connecter en tant que " + visiteur.getPrenom() + " " + visiteur.getNom(), Toast.LENGTH_SHORT).show();
                       Intent intent = new Intent(MainActivity.this, MenuRvActivity.class);
                       startActivity(intent);
                   } else {
                       Toast.makeText(MainActivity.this, "Echec à la connexion. Recommencez...", Toast.LENGTH_SHORT).show();
                   }
               }
           }
       });


       btn_annuler.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               matricule.setText("");
               mdp.setText("");
           }
       });


   }


}
