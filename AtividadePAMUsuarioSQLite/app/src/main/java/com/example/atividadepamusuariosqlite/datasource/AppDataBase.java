package com.example.atividadepamusuariosqlite.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.atividadepamusuariosqlite.datamodel.ClienteDataModel;
import com.example.atividadepamusuariosqlite.model.Cliente;
import com.example.atividadepamusuariosqlite.api.AppUtil;

public abstract class AppDataBase extends SQLiteOpenHelper {

    public static final String NAME = "atividade_Caua.sqlite";
    public static int version = 2;
    SQLiteDatabase db;

    public AppDataBase(Context context){
        super(context, NAME, null, version);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(AppUtil.TAG, "Criando a tabela " + ClienteDataModel.TABELA);
        db.execSQL(ClienteDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /*
        Esse metodo insert é de um metodo da classe SQLiteOpenHelper
        Ela pega um nome da tabela e um objeto ContentValues e tenta inserir o registro na tabela. Se conseguir, retorna maior que zero e o retorno fica verdadeiro.
        Esse retorno é retornado para o controller que emite uma mensagem ao usuario se conseguiu ou nao inserir o registro
    */

    public boolean insert(String tabela, ContentValues dados){
        db = getWritableDatabase();
        boolean retorno = false;
        return db.insert(tabela, null, dados) > 0;
    }

    public abstract boolean incluir(Cliente obj);

    public abstract boolean alterar(Cliente obj);

    public abstract boolean deletar(Cliente obj);

    public abstract boolean listar(Cliente obj);
}
