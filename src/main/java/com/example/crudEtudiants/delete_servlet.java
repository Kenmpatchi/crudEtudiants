package com.example.crudEtudiants;

import com.example.crudEtudiants.connction.DbConnect;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet(name = "delete_Servlet", value = "/delete")
public class delete_servlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try{
            int CIN= Integer.parseInt(req.getParameter("cin2"));
            DbConnect db=new DbConnect();
            db.connect();
            db.delete(CIN);
            new affiche(req,res);

        }
        catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }

    }
}
