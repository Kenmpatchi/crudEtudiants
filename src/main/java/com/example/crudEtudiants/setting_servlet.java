package com.example.crudEtudiants;

import com.example.crudEtudiants.connction.DbConnect;
import com.example.crudEtudiants.model.Etudiant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "setting_Servlet", value = "/setting")
public class setting_servlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try{
            String nom=req.getParameter("nom");
            String prenom=req.getParameter("prenom");
            int CIN= Integer.parseInt(req.getParameter("cin1"));
            String email=req.getParameter("email");
            String password=req.getParameter("password");
            Etudiant e=new Etudiant(nom,prenom,CIN,email,password);
            DbConnect db=new DbConnect();
            db.connect();
            db.update(e);
            new affiche(req,res);
        }
        catch (ClassNotFoundException|SQLException e){
            throw new RuntimeException(e);
        }

    }
}
