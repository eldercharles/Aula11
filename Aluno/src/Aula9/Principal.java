/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula9;

/**
 *
 * @author aluno
 */
public class Principal {
    
public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Vitor");
        aluno.setRA(12345);
        
        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Vinicius");
        aluno2.setRA(12345);
        
        System.out.println("Qual o seu RA??");
        
        System.out.println(aluno2.getRA());
        
    }
    
}