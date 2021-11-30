package cat.dam.biel.radiogroups;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rr_principal;

    private RadioGroup rg_opcionsLletraColor;  //Grup dels botons de "opcions de lletra"/"opcions de color"
    private TextView configuracio;
    private RadioButton rb_color, rb_lletra;

    private TextView id_tamany; //text separador mostrem text="Tamany de la lletra"
    private RadioGroup rg_opcions;   //Grup dels tamanys de lletra
    private RadioButton rb_moltPetit, rb_petit, rb_mitja, rb_gran, rb_moltGran;

    private TextView id_colorLLetra;    //text separador mostrem text="Color de la lletra"
    private RadioGroup rg_colorLLetra;    //Grup dels color de la lletra
    private RadioButton rb_varmell, rb_verd, rb_blau, rb_blanc, rb_negre;

    private TextView id_colorFons;
    private RadioGroup rg_colorFons;
    private RadioButton rb_varmellFons, rb_verdFons, rb_blauFons, rb_blancFons, rb_negreFons;

    private TextView id_colorFonsLletra;
    private RadioGroup rg_colorFonsLletra;
    private RadioButton rb_varmellFonsLletra, rb_verdFonsLletra, rb_blauFonsLletra, rb_blancFonsLletra, rb_negreFonsLletra;

    private Button btn_aplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rr_principal = (RelativeLayout) findViewById(R.id.rr_principal);

        //opcions principals
        rg_opcionsLletraColor = (RadioGroup) findViewById(R.id.rg_opcionsLletraColor);
        configuracio = (TextView) findViewById(R.id.configuracio);
        rb_color = (RadioButton) findViewById(R.id.rb_lletra);
        rb_lletra = (RadioButton) findViewById(R.id.rb_color);


        //tamany
        id_tamany = (TextView) findViewById(R.id.id_tamany);
        rg_opcions = (RadioGroup) findViewById(R.id.rg_opcions);
        rb_moltPetit = (RadioButton) findViewById(R.id.rb_moltPetit);
        rb_petit = (RadioButton) findViewById(R.id.rb_petit);
        rb_mitja = (RadioButton) findViewById(R.id.rb_mitja);
        rb_gran = (RadioButton) findViewById(R.id.rb_gran);
        rb_moltGran = (RadioButton) findViewById(R.id.rb_moltGran);


        //color lletra
        id_colorLLetra = (TextView) findViewById(R.id.id_colorLLetra);
        rg_colorLLetra = (RadioGroup) findViewById(R.id.rg_colorLLetra);
        rb_varmell = (RadioButton) findViewById(R.id.rb_varmell);
        rb_verd = (RadioButton) findViewById(R.id.rb_verd);
        rb_blau = (RadioButton) findViewById(R.id.rb_blau);
        rb_blanc = (RadioButton) findViewById(R.id.rb_blanc);
        rb_negre = (RadioButton) findViewById(R.id.rb_negre);

        //color fons
        id_colorFons = (TextView) findViewById(R.id.id_colorFons);
        rg_colorFons = (RadioGroup) findViewById(R.id.rg_colorFons);
        rb_varmellFons = (RadioButton) findViewById(R.id.rb_varmellFons);
        rb_verdFons = (RadioButton) findViewById(R.id.rb_verdFons);
        rb_blauFons = (RadioButton) findViewById(R.id.rb_blauFons);
        rb_blancFons = (RadioButton) findViewById(R.id.rb_blancFons);
        rb_negreFons = (RadioButton) findViewById(R.id.rb_negreFons);

        //color fons lletra
        id_colorFonsLletra = (TextView) findViewById(R.id.id_colorFonsLletra);
        rg_colorFonsLletra = (RadioGroup) findViewById(R.id.rg_colorFonsLletra);
        rb_varmellFonsLletra = (RadioButton) findViewById(R.id.rb_varmellFonsLletra);
        rb_verdFonsLletra = (RadioButton) findViewById(R.id.rb_verdFonsLletra);
        rb_blauFonsLletra = (RadioButton) findViewById(R.id.rb_blauFonsLletra);
        rb_blancFonsLletra = (RadioButton) findViewById(R.id.rb_blancFonsLletra);
        rb_negreFonsLletra = (RadioButton) findViewById(R.id.rb_negreFonsLletra);

        //boto
        btn_aplicar = (Button) findViewById(R.id.btn_aplicar);

        rg_opcionsLletraColor.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // troba quin radio button s'ha seleccionat
                if (checkedId == R.id.rb_lletra) {
                    id_colorLLetra.setVisibility(View.VISIBLE);
                    rg_opcions.setVisibility(View.VISIBLE);

                    id_colorLLetra.setVisibility(View.INVISIBLE);
                    rg_colorLLetra.setVisibility(View.INVISIBLE);
                    id_colorFons.setVisibility(View.INVISIBLE);
                    rg_colorFons.setVisibility(View.INVISIBLE);
                    id_colorFonsLletra.setVisibility(View.INVISIBLE);
                    rg_colorFonsLletra.setVisibility(View.INVISIBLE);
                } else {
                    id_colorLLetra.setVisibility(View.VISIBLE);
                    rg_colorLLetra.setVisibility(View.VISIBLE);
                    id_colorFons.setVisibility(View.VISIBLE);
                    rg_colorFons.setVisibility(View.VISIBLE);
                    id_colorFonsLletra.setVisibility(View.VISIBLE);
                    rg_colorFonsLletra.setVisibility(View.VISIBLE);

                    id_tamany.setVisibility(View.INVISIBLE);
                    rg_opcions.setVisibility(View.INVISIBLE);
                }
            }
        });

        //MIDA LLETRA
        rg_opcions.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.rb_moltPetit) {
                    configuracio.setTextSize(10);
                } else if (checkedId == R.id.rb_petit) {
                    configuracio.setTextSize(15);
                } else if (checkedId == R.id.rb_mitja) {
                    configuracio.setTextSize(20);
                } else if (checkedId == R.id.rb_gran) {
                    configuracio.setTextSize(25);
                } else {    //sino molt gran
                    configuracio.setTextSize(35);
                }
            }
        });

        //COLOR LLETRA
        rg_colorLLetra.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.rb_varmell) {
                    configuracio.setTextColor(Color.RED);
                } else if (checkedId == R.id.rb_verd) {
                    configuracio.setTextColor(Color.GREEN);
                } else if (checkedId == R.id.rb_blau) {
                    configuracio.setTextColor(Color.BLUE);
                } else if (checkedId == R.id.rb_blanc) {
                    configuracio.setTextColor(Color.WHITE);
                } else {
                    configuracio.setTextColor(Color.BLACK);
                }
            }
        });
        //COLOR FONS
        rg_colorFons.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.rb_varmellFons) {
                    configuracio.setBackgroundColor(Color.RED);
                } else if (checkedId == R.id.rb_verdFons) {
                    configuracio.setBackgroundColor(Color.GREEN);
                } else if (checkedId == R.id.rb_blauFons) {
                    configuracio.setBackgroundColor(Color.BLUE);
                } else if (checkedId == R.id.rb_blancFons) {
                    configuracio.setBackgroundColor(Color.WHITE);
                } else {
                    configuracio.setBackgroundColor(Color.BLACK);
                }
            }
        });
        rg_colorFonsLletra.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.rb_varmellFonsLletra) {           //VEARMELL
                    rr_principal.setBackgroundColor(Color.RED);

                    rb_color.setTextColor(Color.BLACK);
                    rb_lletra.setTextColor(Color.BLACK);

                    id_tamany.setTextColor(Color.BLACK);
                    id_colorLLetra.setTextColor(Color.BLACK);
                    id_colorFons.setTextColor(Color.BLACK);
                    id_colorFonsLletra.setTextColor(Color.BLACK);

                    rb_moltPetit.setTextColor(Color.BLACK);
                    rb_petit.setTextColor(Color.BLACK);
                    rb_mitja.setTextColor(Color.BLACK);
                    rb_gran.setTextColor(Color.BLACK);
                    rb_moltGran.setTextColor(Color.BLACK);

                    rb_varmell.setTextColor(Color.BLACK);
                    rb_verd.setTextColor(Color.BLACK);
                    rb_blau.setTextColor(Color.BLACK);
                    rb_blanc.setTextColor(Color.BLACK);
                    rb_negre.setTextColor(Color.BLACK);

                    rb_varmellFons.setTextColor(Color.BLACK);
                    rb_verdFons.setTextColor(Color.BLACK);
                    rb_blauFons.setTextColor(Color.BLACK);
                    rb_blancFons.setTextColor(Color.BLACK);
                    rb_negreFons.setTextColor(Color.BLACK);

                    rb_varmellFonsLletra.setTextColor(Color.BLACK);
                    rb_verdFonsLletra.setTextColor(Color.BLACK);
                    rb_blauFonsLletra.setTextColor(Color.BLACK);
                    rb_blancFonsLletra.setTextColor(Color.BLACK);
                    rb_negreFonsLletra.setTextColor(Color.BLACK);
                } else if (checkedId == R.id.rb_verdFonsLletra) {       //VERD
                    rr_principal.setBackgroundColor(Color.GREEN);

                    rb_color.setTextColor(Color.BLACK);
                    rb_lletra.setTextColor(Color.BLACK);

                    id_tamany.setTextColor(Color.BLACK);
                    id_colorLLetra.setTextColor(Color.BLACK);
                    id_colorFons.setTextColor(Color.BLACK);
                    id_colorFonsLletra.setTextColor(Color.BLACK);

                    rb_moltPetit.setTextColor(Color.BLACK);
                    rb_petit.setTextColor(Color.BLACK);
                    rb_mitja.setTextColor(Color.BLACK);
                    rb_gran.setTextColor(Color.BLACK);
                    rb_moltGran.setTextColor(Color.BLACK);

                    rb_varmell.setTextColor(Color.BLACK);
                    rb_verd.setTextColor(Color.BLACK);
                    rb_blau.setTextColor(Color.BLACK);
                    rb_blanc.setTextColor(Color.BLACK);
                    rb_negre.setTextColor(Color.BLACK);

                    rb_varmellFons.setTextColor(Color.BLACK);
                    rb_verdFons.setTextColor(Color.BLACK);
                    rb_blauFons.setTextColor(Color.BLACK);
                    rb_blancFons.setTextColor(Color.BLACK);
                    rb_negreFons.setTextColor(Color.BLACK);

                    rb_varmellFonsLletra.setTextColor(Color.BLACK);
                    rb_verdFonsLletra.setTextColor(Color.BLACK);
                    rb_blauFonsLletra.setTextColor(Color.BLACK);
                    rb_blancFonsLletra.setTextColor(Color.BLACK);
                    rb_negreFonsLletra.setTextColor(Color.BLACK);
                } else if (checkedId == R.id.rb_blauFonsLletra) {       //BLAU
                    rr_principal.setBackgroundColor(Color.BLUE);

                    rb_color.setTextColor(Color.BLACK);
                    rb_lletra.setTextColor(Color.BLACK);

                    id_tamany.setTextColor(Color.BLACK);
                    id_colorLLetra.setTextColor(Color.BLACK);
                    id_colorFons.setTextColor(Color.BLACK);
                    id_colorFonsLletra.setTextColor(Color.BLACK);

                    rb_moltPetit.setTextColor(Color.BLACK);
                    rb_petit.setTextColor(Color.BLACK);
                    rb_mitja.setTextColor(Color.BLACK);
                    rb_gran.setTextColor(Color.BLACK);
                    rb_moltGran.setTextColor(Color.BLACK);

                    rb_varmell.setTextColor(Color.BLACK);
                    rb_verd.setTextColor(Color.BLACK);
                    rb_blau.setTextColor(Color.BLACK);
                    rb_blanc.setTextColor(Color.BLACK);
                    rb_negre.setTextColor(Color.BLACK);

                    rb_varmellFons.setTextColor(Color.BLACK);
                    rb_verdFons.setTextColor(Color.BLACK);
                    rb_blauFons.setTextColor(Color.BLACK);
                    rb_blancFons.setTextColor(Color.BLACK);
                    rb_negreFons.setTextColor(Color.BLACK);

                    rb_varmellFonsLletra.setTextColor(Color.BLACK);
                    rb_verdFonsLletra.setTextColor(Color.BLACK);
                    rb_blauFonsLletra.setTextColor(Color.BLACK);
                    rb_blancFonsLletra.setTextColor(Color.BLACK);
                    rb_negreFonsLletra.setTextColor(Color.BLACK);
                } else if (checkedId == R.id.rb_blancFonsLletra) {      //BLANC
                    rr_principal.setBackgroundColor(Color.WHITE);

                    rb_color.setTextColor(Color.BLACK);
                    rb_lletra.setTextColor(Color.BLACK);

                    id_tamany.setTextColor(Color.BLACK);
                    id_colorLLetra.setTextColor(Color.BLACK);
                    id_colorFons.setTextColor(Color.BLACK);
                    id_colorFonsLletra.setTextColor(Color.BLACK);

                    rb_moltPetit.setTextColor(Color.BLACK);
                    rb_petit.setTextColor(Color.BLACK);
                    rb_mitja.setTextColor(Color.BLACK);
                    rb_gran.setTextColor(Color.BLACK);
                    rb_moltGran.setTextColor(Color.BLACK);

                    rb_varmell.setTextColor(Color.BLACK);
                    rb_verd.setTextColor(Color.BLACK);
                    rb_blau.setTextColor(Color.BLACK);
                    rb_blanc.setTextColor(Color.BLACK);
                    rb_negre.setTextColor(Color.BLACK);

                    rb_varmellFons.setTextColor(Color.BLACK);
                    rb_verdFons.setTextColor(Color.BLACK);
                    rb_blauFons.setTextColor(Color.BLACK);
                    rb_blancFons.setTextColor(Color.BLACK);
                    rb_negreFons.setTextColor(Color.BLACK);

                    rb_varmellFonsLletra.setTextColor(Color.BLACK);
                    rb_verdFonsLletra.setTextColor(Color.BLACK);
                    rb_blauFonsLletra.setTextColor(Color.BLACK);
                    rb_blancFonsLletra.setTextColor(Color.BLACK);
                    rb_negreFonsLletra.setTextColor(Color.BLACK);
                } else if (checkedId == R.id.rb_negreFonsLletra) {  //NEGRE
                    rr_principal.setBackgroundColor(Color.BLACK);

                    rb_color.setTextColor(Color.BLACK);
                    rb_lletra.setTextColor(Color.BLACK);

                    id_tamany.setTextColor(Color.BLACK);
                    id_colorLLetra.setTextColor(Color.BLACK);
                    id_colorFons.setTextColor(Color.BLACK);
                    id_colorFonsLletra.setTextColor(Color.BLACK);

                    rb_moltPetit.setTextColor(Color.BLACK);
                    rb_petit.setTextColor(Color.BLACK);
                    rb_mitja.setTextColor(Color.BLACK);
                    rb_gran.setTextColor(Color.BLACK);
                    rb_moltGran.setTextColor(Color.BLACK);

                    rb_varmell.setTextColor(Color.BLACK);
                    rb_verd.setTextColor(Color.BLACK);
                    rb_blau.setTextColor(Color.BLACK);
                    rb_blanc.setTextColor(Color.BLACK);
                    rb_negre.setTextColor(Color.BLACK);

                    rb_varmellFons.setTextColor(Color.BLACK);
                    rb_verdFons.setTextColor(Color.BLACK);
                    rb_blauFons.setTextColor(Color.BLACK);
                    rb_blancFons.setTextColor(Color.BLACK);
                    rb_negreFons.setTextColor(Color.BLACK);

                    rb_varmellFonsLletra.setTextColor(Color.BLACK);
                    rb_verdFonsLletra.setTextColor(Color.BLACK);
                    rb_blauFonsLletra.setTextColor(Color.BLACK);
                    rb_blancFonsLletra.setTextColor(Color.BLACK);
                    rb_negreFonsLletra.setTextColor(Color.BLACK);
                }
            }
        });
        btn_aplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectId = rg_opcions.getCheckedRadioButtonId();
                //comprova quin radioButton ha estat marcat per el seu id
                if (selectId == rb_moltPetit.getId()) {
                    Toast.makeText(getApplicationContext(), "Tamany de la lletra: Molt petita", Toast.LENGTH_SHORT).show();
                } else if (selectId == rb_petit.getId()) {
                    Toast.makeText(getApplicationContext(), "Tamany de la lletra: Petita", Toast.LENGTH_SHORT).show();
                } else if (selectId == rb_mitja.getId()) {
                    Toast.makeText(getApplicationContext(), "Tamany de la lletra: Mitjana", Toast.LENGTH_SHORT).show();
                } else if (selectId == rb_gran.getId()) {
                    Toast.makeText(getApplicationContext(), "Tamany de la lletra: Gran", Toast.LENGTH_SHORT).show();
                } else if (selectId == rb_moltGran.getId()) {
                    Toast.makeText(getApplicationContext(), "Tamany de la lletra: Molt gran", Toast.LENGTH_SHORT).show();
                }

                int selectColorLletra = rg_colorLLetra.getCheckedRadioButtonId();
                //comprova quin radioButton ha estat marcat per el seu id
                if (selectColorLletra == rb_varmell.getId()) {
                    Toast.makeText(getApplicationContext(), "Color de la lletra: Vermell", Toast.LENGTH_SHORT).show();
                } else if (selectColorLletra == rb_verd.getId()) {
                    Toast.makeText(getApplicationContext(), "Color de la lletra: Verd", Toast.LENGTH_SHORT).show();
                } else if (selectColorLletra == rb_blau.getId()) {
                    Toast.makeText(getApplicationContext(), "Color de la lletra: Blau", Toast.LENGTH_SHORT).show();
                } else if (selectColorLletra == rb_blanc.getId()) {
                    Toast.makeText(getApplicationContext(), "Color de la lletra: Blanc", Toast.LENGTH_SHORT).show();
                } else if (selectColorLletra == rb_negre.getId()) {
                    Toast.makeText(getApplicationContext(), "Color de la lletra: Negre", Toast.LENGTH_SHORT).show();
                }

                int selectFonsLletra = rg_colorFons.getCheckedRadioButtonId();
                //comprova quin radioButton ha estat marcat per el seu id
                if (selectFonsLletra == rb_varmellFons.getId()) {
                    Toast.makeText(getApplicationContext(), "Color del fons de la lletra: Vermell", Toast.LENGTH_SHORT).show();
                } else if (selectFonsLletra == rb_verdFons.getId()) {
                    Toast.makeText(getApplicationContext(), "Color del fons de la lletra: Verd", Toast.LENGTH_SHORT).show();
                } else if (selectFonsLletra == rb_blauFons.getId()) {
                    Toast.makeText(getApplicationContext(), "Color del fons de la lletra: Blau", Toast.LENGTH_SHORT).show();
                } else if (selectFonsLletra == rb_blancFons.getId()) {
                    Toast.makeText(getApplicationContext(), "Color del fons de la lletra: Blanc", Toast.LENGTH_SHORT).show();
                } else if (selectFonsLletra == rb_negreFons.getId()) {
                    Toast.makeText(getApplicationContext(), "Color del fons de la lletra: Negre", Toast.LENGTH_SHORT).show();
                }

                int selectFons = rg_colorFonsLletra.getCheckedRadioButtonId();
                //comprova quin radioButton ha estat marcat per el seu id
                if (selectFons == rb_varmellFonsLletra.getId()) {
                    Toast.makeText(getApplicationContext(), "Color del fons: Vermell", Toast.LENGTH_SHORT).show();
                } else if (selectFons == rb_verdFonsLletra.getId()) {
                    Toast.makeText(getApplicationContext(), "Color del fons: Verd", Toast.LENGTH_SHORT).show();
                } else if (selectFons == rb_blauFonsLletra.getId()) {
                    Toast.makeText(getApplicationContext(), "Color del fons: Blau", Toast.LENGTH_SHORT).show();
                } else if (selectFons == rb_blancFonsLletra.getId()) {
                    Toast.makeText(getApplicationContext(), "Color del fons: Blanc", Toast.LENGTH_SHORT).show();
                } else if (selectFonsLletra == rb_negreFonsLletra.getId()) {
                    Toast.makeText(getApplicationContext(), "Color del fons: Negre", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}