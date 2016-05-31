package br.com.IngressosJa.persistencia;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author thiago
 */
public class Conexao {
    private com.mysql.jdbc.Connection con;
    private Statement st;
    private String url = "jdbc:mysql://localhost:3306/db_evento";
    private String user = "root";
    private String pass = "123456";
    
    public Conexao(){
        try {
            // conexão com o DB
            Class.forName("com.mysql.jdbc.Driver");
            this.con = (com.mysql.jdbc.Connection) DriverManager.getConnection(this.url, this.user, this.pass);
            this.st = (Statement) this.con.createStatement();
              JOptionPane.showMessageDialog(null," Dados Gravado com Sucesso!");
        } catch (Exception e) {
            // Mostrando mensagem ao usuario caso a listagem apresente algum erro ...
            JOptionPane.showMessageDialog(null, e.getMessage());
             JOptionPane.showMessageDialog(null," Erro na Conexao");
        }
    }
    
    public com.mysql.jdbc.Connection getCon() {
        return this.con;
    }

    public void setCon(com.mysql.jdbc.Connection con) {
        this.con = con;
    }

    public Statement getSt() {
        return this.st;
    }

    public void setSt(Statement st) {
        this.st = st;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
   
