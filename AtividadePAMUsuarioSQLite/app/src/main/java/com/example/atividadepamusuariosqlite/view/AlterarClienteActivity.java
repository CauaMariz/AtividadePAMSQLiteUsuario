package com.example.atividadepamusuariosqlite.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.atividadepamusuariosqlite.R;
import com.example.atividadepamusuariosqlite.controller.ClienteController;
import com.example.atividadepamusuariosqlite.model.Cliente;

public class AlterarClienteActivity extends AppCompatActivity {
    EditText editNome, editEmail, editTelefone;
    Button btnSalvar, btnVoltar;

    Cliente cliente;

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_cliente);

        editNome = findViewById(R.id.editTextNomeUser);
        editEmail = findViewById(R.id.editTextEmailUser);
        editTelefone = findViewById(R.id.editTextTelUser);
        btnSalvar = findViewById(R.id.button);
        btnVoltar = findViewById(R.id.button2);

        clienteController =  new ClienteController(this);

        cliente = (Cliente) getIntent().getSerializableExtra("cliente");

        if(cliente != null){
            editNome.setText(cliente.getNome());
            editEmail.setText(cliente.getEmail());
            editTelefone.setText(cliente.getTelefone());
        }

        btnSalvar.setOnClickListener(v -> {
            cliente.setNome(editNome.getText().toString());
            cliente.setEmail(editEmail.getText().toString());
            cliente.setTelefone(editTelefone.getText().toString());
        });
    }
}
