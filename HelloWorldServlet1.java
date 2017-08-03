package com.apress.apachetomcat7.chapter2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
/*
public class HelloWorldServlet extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws IOException, ServletException
   {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Hello World!</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hello World this has changed to Umaru</h1>");
    out.println("</body>");
    out.println("</html>");

  }
}
*/

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
   This servlet prints out the current date and time.
*/
public class HelloWorldServlet1 extends HttpServlet
{
   public void doGet(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException
   {
      // get information
      String now = new Date().toString();

      // set content type to HTML
      response.setContentType("text/html");

      // print formatted information
      PrintWriter out = response.getWriter();

      String title = "Date Servlet";
      out.println("<html><head><title>");
      out.println(title);
      out.println("</title></head><body><h1>");
      out.print(title);
      out.println("</h1><p>The current time is: ");
      out.println(now);
      out.println("</p></body></html>");

      out.close();
   }
}
