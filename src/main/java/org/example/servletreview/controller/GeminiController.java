package org.example.servletreview.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

@WebServlet("/gemini")
public class GeminiController extends Controller {
    @Override
    void initLogger() {
        logger = Logger.getLogger(GeminiController.class.getName());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; application/json");
        PrintWriter out = resp.getWriter();
        out.println("I'm chill gemini!");
    }
}
