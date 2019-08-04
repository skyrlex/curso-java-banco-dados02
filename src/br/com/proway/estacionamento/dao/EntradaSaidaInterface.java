/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proway.estacionamento.dao;

import br.com.proway.estacionamento.modelo.EntradaSaida;


public interface EntradaSaidaInterface {
    
    int inserir(EntradaSaida entradaSaida);
    
    boolean alterar(EntradaSaida entradaSaida);
    
    boolean apagar(int id);
    
    EntradaSaida obterPeloId(int id);
    
    
}
