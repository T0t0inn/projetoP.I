/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.novaterra;

 import conexao.Conexao;
 
 /**
  *
  * @author uept42-user
  */
 public class NovaTerra {
 
     public static void main(String[] args) {
         Conexao c = new Conexao();
         c.getConexao();
         TLlogin tela = new TLlogin();
         tela.setVisible(true);
     }
 }