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

public class DiseaseActivity extends Activity {

    private Spinner spinner1;
    private Button btnSubmit;
    TextView dynamicText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
        dynamicText = (TextView) findViewById(R.id.text);
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
    }
    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                if (String.valueOf(spinner1.getSelectedItem()).equals("Malaria")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nshaking chills that can range from moderate to severe,high fever,profuse sweating.\n" +
                            "\nPrecautions : \n" +
                            "\nStay in well-screened areas at night,Always use a bed-net impregnated with insecticides,Use mosquito repellent");
                } else if (String.valueOf(spinner1.getSelectedItem()).equals("Fever")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nHigh body temperature;Feeling cold;Lethargy;Anorexia;sleepiness;hypergesia; muscle tone ; shivering\n" +
                            "\nPrecautions : \n" +
                            "\nWash your hands before eating; Avoid eating outside in open areas; Drink plenty of water; Cover your mouth while sneezing and coughing");
                } else if (String.valueOf(spinner1.getSelectedItem()).equals("Heart Diseases")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nChest pain, chest tightness, chest pressure and chest discomfort (angina)\n" +
                            "\nPrecautions : \n" +
                            "\nControl your blood pressure,Keep your cholesterol and triglyceride levels under control,Stay at a healthy weight");
                } else if (String.valueOf(spinner1.getSelectedItem()).equals("Diabetes")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nIncreased thirst, Frequent urination, Extreme hunger and Unexplained weight loss\n" +
                            "\nPrecautions : \n" +
                            "\nCut Sugar and Refined Carbs From Your Diet,Work Out Regularly and Drink Water as Your Primary Beverage");
                } else if (String.valueOf(spinner1.getSelectedItem()).equals("Cough")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nRunning nose; throat clearing; sore throat\n" +
                            "\nPrecautions : \n" +
                            "\nAnibiotics should never be used routinely in the treatment of cough");
                } else if (String.valueOf(spinner1.getSelectedItem()).equals("Dental caries")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nFever; chills; Throbbing pain of the offending tooth;pain; Swelling of the gingiva; sounding tissues; Inability to open the mouth\n" +
                            "\nPrecautions : \n" +
                            "\nProper instruction to avoid frequent use of sugary foods and drinks; Use fluoridated toothpaste to brush teeth at least once a day");
                } else if (String.valueOf(spinner1.getSelectedItem()).equals("Typhoid and paratyphoid")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nfever; headache; drowsiness ; muscle pains ; pain\n" +
                            "\nPrecautions : \n" +
                            "\nInfants; children and adults with typhoid or paratyphoid infection should not swim until there has been no diarrhoea for 24 hours.");
                } else if (String.valueOf(spinner1.getSelectedItem()).equals("Gastritis")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nnausea, vomiting, appetite loss; belching; bloating;abdominal pain\n" +
                            "\nPrecautions : \n" +
                            "\nDiscontinue the use of drugs known to cause gastritis (e.g.; NSAIDs; alcohol)");
                } else if (String.valueOf(spinner1.getSelectedItem()).equals("Thyroid carcinoma")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nthyroid mass; scar; laryngeal nerve palsy; hoarseness; dyspnoea; dysphagia\n" +
                            "\nPrecautions : \n" +
                            "\ntake food having sufficient iodine;Stop T3 or T4 three wks before ablative treatment");
                } else if (String.valueOf(spinner1.getSelectedItem()).equals("Stomach Cancer")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nEpigastric pain worsened by food intake; early satiety; anorexia; weight loss; weakness;  distal tumours\n" +
                            "\nPrecautions : \n" +
                            "\nA diet high in fresh fruits and vegetables;Citrus fruits; grapefruit and grapefruit juice");
                }
                else if (String.valueOf(spinner1.getSelectedItem()).equals("Coronavirus")) {
                    dynamicText.setText("Symptoms:\n" +
                            "\nrunny nose, sore throat, cough, fever, difficulty breathing\n" +
                            "\nPrecautions : \n" +
                            "\nwash your hands frequently, maintain social distancing, avoid touching eyes,nose and mouth.");
                }else {
                    dynamicText.setText("");
                }
                Toast.makeText(DiseaseActivity.this,
                        "Disease Selected: " + String.valueOf(spinner1.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

        });
    }
}