package com.Jenkins.program.jenkins.controller;

import com.Jenkins.program.jenkins.service.JenkinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {
    @Autowired
    private JenkinsService jenkinsService;
    @GetMapping
    public String get(){
        return "Abhi";
    }
}
