/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesis.reponses;

/**
 *
 * @author PC
 */
public class Response {

    private String message;

    private Object body;

    public Response(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setBody(Object body) {
        this.body = body;
    }

}
