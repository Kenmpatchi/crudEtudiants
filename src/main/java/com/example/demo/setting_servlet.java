package com.example.demo;

import com.example.demo.connction.DbConnect;
import com.example.demo.model.Etudiant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Etudiant_Servlet", value = "/setting")
public class setting_servlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try{

            DbConnect db=new DbConnect();
            db.connect();

        }
        catch (ClassNotFoundException|SQLException e){
            throw new RuntimeException(e);
        }
    }
}
