package com.example.crudEtudiants;

import com.example.crudEtudiants.connction.DbConnect;
import com.example.crudEtudiants.model.Etudiant;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

public class affiche extends HttpServlet {
    public affiche(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try{
            DbConnect db=new DbConnect();
            db.connect();
            String listetudiant="<table border=1>";
            for(Etudiant etd:db.selectAll()){
                listetudiant+="<tr><td>"+etd.toString()+"</td></tr>";
            }
            listetudiant+="</table>";
            req.setAttribute("etudiants",listetudiant);
            req.getRequestDispatcher("affiche.jsp").forward(req,res);

        }
        catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }
    }
}
