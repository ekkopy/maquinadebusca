/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maquinadebusca.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author vinicius
 */
@AllArgsConstructor
@Data
public class Mensagem {

    private String tipo;
    private String texto;

}
