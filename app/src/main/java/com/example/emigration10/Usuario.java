package com.example.emigration10;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.emigration10.Objetos.Equipo;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class Usuario extends AppCompatActivity {

    private DatabaseReference migrationDB;
    private List<String> usuarios, equipos;
    private EditText eNombre, eId, eAntiguo, eNuevo;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        eNombre = findViewById(R.id.editTextUsuarioNombre);
        eId = findViewById(R.id.editTextUsuarioId);
        eAntiguo = findViewById(R.id.editTextEquipoAntiguo);
        eNuevo = findViewById(R.id.editTextEquipoNuevo);
        boton = findViewById(R.id.buttonEnviarDatos);

        FirebaseApp.initializeApp(this);
        migrationDB = FirebaseDatabase.getInstance().getReference("emigration-e5f01");

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = eNombre.getText().toString();
                String id = eId.getText().toString();
                String eAnt = eAntiguo.getText().toString();
                String eNue = eNuevo.getText().toString();
                añadirValores(name,id, eAnt, eNue);
            }
        });

    }

    public void añadirValores(String nombre, String id,String ant, String nue){
        //Enviamos a la DB
        String newid = migrationDB.push().getKey();
        com.example.emigration10.Objetos.Usuario usuario = new com.example.emigration10.Objetos.Usuario(nombre, id);
        Equipo equipo = new Equipo(ant,nue);
        if(newid!=null) {
            migrationDB.child(newid).setValue(usuario);
            migrationDB.child(newid).setValue(equipo);
            Toast.makeText(getApplicationContext(),"Datos enviados",Toast.LENGTH_LONG);
        }
    }
}
