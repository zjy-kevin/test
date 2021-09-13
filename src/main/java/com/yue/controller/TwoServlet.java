package com.yue.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TwoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path=req.getServletPath();
        if ("/select.do".equals(path)){
            select(req,resp);
        }else if ("/add.do".equals(path)){
            add(req,resp);
        }else if (("/delete.do").equals(path)){
            delete(req,resp);
        }else if (("/update.do").equals(path)){
            update(req,resp);
        }
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("update");
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("delete");
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("add");
    }

    private void select(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("select");
    }
}
