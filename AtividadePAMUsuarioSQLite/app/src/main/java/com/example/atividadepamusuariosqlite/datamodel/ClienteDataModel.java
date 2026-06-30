package com.example.atividadepamusuariosqlite.datamodel;

public class ClienteDataModel {

    public static final String TABELA = "usuario";
    public static final String ID = "id";
    public static final String SENHA = "senha";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";

    public static String criarTabela() {
        return "CREATE TABLE IF NOT EXISTS " + TABELA + " (" +
                ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                SENHA + " TEXT, " +
                NOME + " TEXT, " +
                EMAIL + " TEXT" +
                ")";
    }
}