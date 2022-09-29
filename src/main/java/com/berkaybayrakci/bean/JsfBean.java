package com.berkaybayrakci.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdiBean")
@ApplicationScoped
@Setter
@Getter
public class JsfBean {

    private String patika;

    public JsfBean() {

        this.patika = "Welcome to Spring Boot Education";
    }
}
