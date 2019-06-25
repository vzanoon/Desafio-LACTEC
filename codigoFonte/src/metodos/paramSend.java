package metodos;

import java.sql.Connection;

public class paramSend {
    
    private static int idUser;
    private static String nomeUser;
    private static int idadeUser;
    private static String telefoneUser;
    
    public static Connection con = null;
    
    public static int getIdUser(){
        return idUser;
    }
    
    public static String getNomeUser(){
        return nomeUser;
    }
    
    public static int getIdadeUser(){
        return idadeUser;
    }
    
    public static String getTelefoneUser(){
        return telefoneUser;
    }
    
    public static void setIdUser(int id){
        idUser = id;
    }
    
    public static void setNomeUser(String nome){
        nomeUser = nome;
    }
    
    public static void setIdadeUser(int idade){
        idadeUser = idade;
    }
    
    public static void setTelefoneUser(String telefone){
        telefoneUser = telefone;
    }
    
    public static void reset(){
        idUser = 0;
        nomeUser = "";
        idadeUser = 0;
        telefoneUser = "";
    }
    
}
