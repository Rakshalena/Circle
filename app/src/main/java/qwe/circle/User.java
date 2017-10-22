package qwe.circle;


import android.content.Intent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.ArrayList;
import android.view.View.OnClickListener;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * Created by Лёка^_^ on 20.10.2017.
 */

public class User extends AppCompatActivity  {

    public ArrayList <Circle> firstStage;
    public ArrayList <Circle> fourthStage;
    public ArrayList <Circle> secondStage;
    public ArrayList <Circle> thirdStage;
    public Enum sex;
    public Enum arm;
    public int age;
    public String patronymic;
    public String name;
    public String surname;

    String[] optionSex = {"Мужской", "Женский"};
    String[] optionArm = {"Правая", "Левая"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        // адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, optionSex);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner3);
        spinner.setAdapter(adapter);
        // выделяем элемент
        spinner.setSelection(0);

        // адаптер
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, optionArm);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner4);
        spinner1.setAdapter(adapter1);
        // выделяем элемент
        spinner1.setSelection(0);

        Button newTest = (Button) findViewById(R.id.button4);
        newTest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //**************ВВОД ДАННЫХ*******************************
                EditText surnameActivity = (EditText) findViewById(R.id.editText7);
                EditText nameActivity = (EditText) findViewById(R.id.editText8);
                EditText patronymicActivity = (EditText) findViewById(R.id.editText9);
                EditText birthdayActivity = (EditText) findViewById(R.id.editText10);
                //   SharedPreferences sPref;

                surname = new String(surnameActivity.getText().toString());
                name = new String(nameActivity.getText().toString());
                patronymic = new String(patronymicActivity.getText().toString());
                age = Integer.parseInt(new String (birthdayActivity.getText().toString()));


                Intent intent = new Intent(User.this, UserTest.class);
                startActivity(intent);

            }
        });

        //НАЙТИ как сохранать значение из спинера
        // устанавливаем обработчик нажатия
      /*  spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              /* // показываем позиция нажатого элемента
                Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();*/
        //      sex = spinner.getPositionForView(View view);
      /*      }
        });*/


    }



}
