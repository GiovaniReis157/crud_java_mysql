package br.com.hypelab.dal;
import java.sql.*;

public class ModuloConect {
    
    public static Connection conector(){
    java.sql.Connection conexao = null; 
    //Configuração do Driver de Conexão
    String driver = "com.mysql.jdbc.Driver";
    //Passar infos do banco de dados
    String url = "jdbc:mysql://localhost:3306/bdlojaetec";
    String user = "root";
    String password = "";
    
    //Estabelecer conexão
    try{
        Class.forName(driver);
        conexao = DriverManager.getConnection(url,user,password);
        return conexao;
    }catch(Exception e){

        return null;
    }
    }
}
