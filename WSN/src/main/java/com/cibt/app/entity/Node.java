/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_node")
public class Node {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nodeno")
    private int nodeno;
    @Column(name = "nodename")
    private String nodename;
    @Column(name = "portno")
    private int portno;
    @Column(name = "systemname")
    private String systemname;

    public int getNodeno() {
        return nodeno;
    }

    public void setNodeno(int nodeno) {
        this.nodeno = nodeno;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    public int getPortno() {
        return portno;
    }

    public void setPortno(int portno) {
        this.portno = portno;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
