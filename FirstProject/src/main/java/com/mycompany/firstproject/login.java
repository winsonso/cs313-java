/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author winsonso
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
       // if (request.getParameter("username") != null && request.getParameter("password") != null) {
           //ServletContext context = getServletContext();
        
           File file = new File("users.txt");
           file.createNewFile();
           if (file.length() == 0){
                FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(),true);
                fileWriter.write("winson,123\n");
                fileWriter.write("sing,123\n");
                fileWriter.close();
            }
///Users/winsonso/NetBeansProjects/cs313-java/FirstProject/src/main/java/com/mycompany/firstproject/user.txt
        BufferedReader in = new BufferedReader(new FileReader("users.txt"));
        String str;
        List<String> list = new ArrayList<String>();
        while((str = in.readLine()) != null){
            list.add(str);
        }
        String[] upArr = list.toArray(new String[10]);
        
        String username = request.getParameter("txtUsername");
        String password = request.getParameter("txtPassword");

            
String [] up = upArr[0].split(",");
String [] up2 = upArr[1].split(",");

if(username.equals(up[0]) && password.equals(up[1])) {
        // correct username and password!
    request.getSession().setAttribute("username", username);
    response.sendRedirect("forum.jsp");
}
else if (username.equals(up2[0]) && password.equals(up2[1])) {
    request.getSession().setAttribute("username", username);
    response.sendRedirect("forum.jsp");
} else {
    response.sendRedirect("invalid.jsp");
}



    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
