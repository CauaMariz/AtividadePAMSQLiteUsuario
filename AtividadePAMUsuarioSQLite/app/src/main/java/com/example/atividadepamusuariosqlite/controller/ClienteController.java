package com.example.atividadepamusuariosqlite.controller;

import android.content.ContentValues;
import android.content.Context;

import androidx.annotation.NonNull;

import com.example.atividadepamusuariosqlite.datamodel.ClienteDataModel;
import com.example.atividadepamusuariosqlite.datasource.AppDataBase;
import com.example.atividadepamusuariosqlite.model.Cliente;


public class ClienteController extends AppDataBase {
    public ClienteController(Context context){
        super(context);
    }

    public boolean inserir(@NonNull Cliente obj){
        ContentValues dados = new ContentValues();
        dados.put(ClienteDataModel.NOME, obj.getNome());
        dados.put(ClienteDataModel.EMAIL, obj.getEmail());

        String tabela = ClienteDataModel.TABELA;
        return insert(tabela, dados);
    }

    @Override
    public boolean incluir(Cliente obj) {
        return false;
    }

    @Override
    public boolean alterar(Cliente obj) {
        return false;
    }

    @Override
    public boolean deletar(Cliente obj) {
        return false;
    }

    @Override
    public boolean listar(Cliente obj) {
        return false;
    }
}
