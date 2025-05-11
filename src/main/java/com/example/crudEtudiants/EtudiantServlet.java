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

@WebServlet(name = "Etudiant_Servlet", value = "/DS21")
public class EtudiantServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String nom=request.getParameter("nom");
            String prenom=request.getParameter("prenom");
            int CIN= Integer.parseInt(request.getParameter("CIN"));
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            Etudiant e=new Etudiant(nom,prenom,CIN,email,password);
            DbConnect db=new DbConnect();
            db.connect();
            db.insert(e);
            new affiche(request,response);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        catch(SQLException exc){
            throw new RuntimeException(exc);
        }

    }

}
