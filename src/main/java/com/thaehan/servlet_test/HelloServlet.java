package com.thaehan.servlet_test;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
  private String message;

  @Override
  public void init() {
    System.out.println("Server started!");
  }

  @Override
  public void destroy() {
    System.out.println("Server ended");
  }

  public void service(HttpServletRequest args0, HttpServletResponse args1) throws ServletException, IOException {
    super.service(args0, args1);

    System.out.println("Request accepted");
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html");

    response.setContentType("text/html");

    PrintWriter writer = response.getWriter();

    writer.println("DO");
  }
}