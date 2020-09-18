package com.example.health;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SymptomActivity extends Activity {

    private Spinner spinner2;
    private Button btnSubmit1;
    TextView dynamicText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom);
        dynamicText = (TextView) findViewById(R.id.text1);
        addItemsOnSpinner2();
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
    }

    // add items into spinner dynamically
    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        List<String> list = new ArrayList<String>();
        list.add("Select a symptom");
        list.add("Fever,cough,difficulty breathing");
        list.add("High body temperature,Feeling cold");
        list.add("Running nose, throat clearing, sore throat");
        list.add("Thirst, dryness of mucous membrane");
        list.add("Swollen gums, puffy gums");
        list.add("Canker Sores , Cold Sores");
        list.add("High temperature;Discomfort in swallowing");
        list.add("diarrhea, Abdominal pain");
        list.add("vomiting, dehydration");
        list.add("high blood pressure");
        list.add("redness, itching , tearing of the eyes");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }

    public void addListenerOnSpinnerItemSelection() {
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {


        spinner2 = (Spinner) findViewById(R.id.spinner2);

        btnSubmit1 = (Button) findViewById(R.id.btnSubmit1);


        btnSubmit1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if(String.valueOf(spinner2.getSelectedItem()).equals("High body temperature,Feeling cold")){
                    dynamicText.setText("Disease may be:\n"+
                            "\nFever\n"+
                            "\nPrecautions : \n"+
                            "\nWash your hands before eating, Avoid eating outside in open areas, Drink plenty of water, Cover your mouth while sneezing and coughing");
                }
                else if(String.valueOf(spinner2.getSelectedItem()).equals("Running nose, throat clearing, sore throat")){
                    dynamicText.setText("Disease may be:\n"+
                            "\nCough\n"+
                            "\nPrecautions : \n"+
                            "\nAntibiotics should never be used routinely in the treatment of cough");
                }
                else if(String.valueOf(spinner2.getSelectedItem()).equals("Thirst, dryness of mucous membrane")){
                    dynamicText.setText("Disease may be:\n"+
                            "\nDehydration\n"+
                            "\nPrecautions : \n"+
                            "\nDrink plenty of water before; during; and after exercise");
                }
                else if(String.valueOf(spinner2.getSelectedItem()).equals("Swollen gums, puffy gums")){
                    dynamicText.setText("Disease may be:\n"+
                            "\nGingivitis\n"+
                            "\nPrecautions : \n"+
                            "\nbrushing your teeth for two minutes at least twice daily  in the morning and before going to bed");
                }
                else if(String.valueOf(spinner2.getSelectedItem()).equals("Canker Sores , Cold Sores")){
                    dynamicText.setText("Disease may be:\n"+
                            "\nStomatitis\n"+
                            "\nPrecautions : \n"+
                            "\nMouth washes should not be used at the same time with the gel");
                }
                else if(String.valueOf(spinner2.getSelectedItem()).equals("High temperature;Discomfort in swallowing")){
                    dynamicText.setText("Disease may be:\n"+
                            "\nPericoronitis\n"+
                            "\nPrecautions : \n"+
                            "\nAvoid any hot; spicy; or very salty foods; as it will just irritate the affected area;Try to avoid chewing on the affected side of the mouth if you can.");
                }
                else  if(String.valueOf(spinner2.getSelectedItem()).equals("diarrhea, Abdominal pain")){
                    dynamicText.setText("Disease may be:\n"+
                            "\nAmebiasis\n"+
                            "\nPrecautions : \n"+
                            "\nDrink bottled water; not tap. Sterilize your tap water.Say no to fountain drinks and street vendors.no ice in your drinks.");
                }
                else if(String.valueOf(spinner2.getSelectedItem()).equals("vomiting, dehydration")){
                    dynamicText.setText("Disease may be:\n"+
                            "\nCholera\n"+
                            "\nPrecautions : \n"+
                            "\nRehydration; electrolytes and base correction is the most important step");
                }
                else if(String.valueOf(spinner2.getSelectedItem()).equals("high blood pressure")){
                    dynamicText.setText("Disease may be:\n"+
                            "\nHypertension\n"+
                            "\nPrecautions : \n"+
                            "\nstop tabacco;weight reduction; physical activity");
                }
                else  if(String.valueOf(spinner2.getSelectedItem()).equals("redness, itching , tearing of the eyes")){
                    dynamicText.setText("Disease may be:\n"+
                            "\nConjunctivitis(pink eye)\n"+
                            "\nPrecautions : \n"+
                            "\nWash your hands and eye multiple times daily");
                }
                else if (String.valueOf(spinner2.getSelectedItem()).equals("Fever,cough,difficulty breathing")) {
                    dynamicText.setText("Disease may be:\n" +
                            "\nCoronavirus\n" +
                            "\nPrecautions : \n" +
                            "\nwash your hands frequently, maintain social distancing, avoid touching eyes,nose and mouth.");
                }
                else{
                    dynamicText.setText("");
                }
                Toast.makeText(SymptomActivity.this,
                        "Symptom selected : " +String.valueOf(spinner2.getSelectedItem()),Toast.LENGTH_SHORT).show();
            }

        });
    }
}