package com.example.demo.connction;

import com.example.demo.model.Etudiant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbConnect{
    private final String url="jdbc:mysql://localhost:3306/db_test";
    private final String username="root";
    private final String password=null;
    private Connection conn=null;
    private Statement st=null;
    private ResultSet rs=null;
    public DbConnect()throws ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
    public void connect()throws SQLException {
        conn= DriverManager.getConnection(url,username,password);
    }
    public void insert(Etudiant e)throws SQLException{
        st=conn.createStatement();
        st.executeUpdate("insert into etudiant(nom,prenom,email,CIN,password)values('"+e.getNom()+"','"+e.getPrenom()+ "','"+e.getEmail()+"','"+e.getCIN()+"','"+e.getPassword()+"')");
    }
    public List<Etudiant>selectAll()throws SQLException{
        st=conn.createStatement();
        rs=st.executeQuery("select * from etudiant");
        List<Etudiant> etudiants=new ArrayList<>();
        while (rs.next()){
            etudiants.add(new Etudiant( rs.getString(1), rs.getString(2), rs.getInt(4),rs.getString(3), rs.getString(5)));
        }
        return etudiants;
    }
    public void delete(int cin)throws SQLException{
        st=conn.createStatement();
        st.executeUpdate("delete from etudiant where cin='"+cin+"'");
    }
    public void update(Etudiant e)throws SQLException{
        st=conn.createStatement();
        st.executeUpdate("UPDATE etudiant SET nom='"+e.getNom()+"', prenom='"+e.getPrenom()+"', password='"+e.getPassword()+"', email='"+e.getEmail()+"' WHERE cin='"+e.getCIN()+"';");
    }
}
