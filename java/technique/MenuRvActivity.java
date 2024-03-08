package fr.gsb.rv.technique;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import fr.gsb.R;


public class MenuRvActivity extends AppCompatActivity {


   Button btn_saisir;
   Button btn_consulter;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.menu_rv_activity);


       btn_saisir = findViewById(R.id.Saisir);
       btn_consulter = findViewById(R.id.Consulter);


       btn_saisir.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MenuRvActivity.this, SaisieRvActivity.class);
               startActivity(intent);
           }
       });


       btn_consulter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MenuRvActivity.this, RechercherRvActivity.class);
               startActivity(intent);
           }
       });
   }




}
