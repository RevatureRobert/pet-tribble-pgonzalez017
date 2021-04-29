package com.controllers;

import com.google.gson.Gson;
import com.models.Lab;
import com.service.LabService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LabController {
    LabService ls;

    public LabController(LabService ls){
        this.ls = ls;
    }
    public void getLabById(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("application/json");
        int id = Integer.parseInt(req.getParameter("id"));
        Lab lab = ls.findById(id);
        Gson gson = new Gson();
        res.getWriter().println(gson.toJson(lab));
    }

    public void post(HttpServletRequest req, HttpServletResponse res) throws IOException {

    }

}
