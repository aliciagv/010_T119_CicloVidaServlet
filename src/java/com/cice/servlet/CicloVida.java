/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cice
 */
public class CicloVida extends HttpServlet {
    //HttpServletRequest recupera la información de la petición
    // cabecera header (navegador...) y un cuerpo body (mensaje)
    //HttpServletResponse permite generar la respuesta
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  PrintWriter out = resp.getWriter();
      //  out.println("<h1>ENTRAMOS EN SERVICE</h1>");
      resp.sendRedirect("./ok.html");
      
    }

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ENTRAMOS EN INIT");
    }

    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ENTRAMOS EN EL DESTROY");
    }

}
