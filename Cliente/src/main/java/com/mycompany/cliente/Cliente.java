/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Cliente {

    public static void main(String[] args) {
        String nome[] = new String [1];
        int cpf[] = new int [1];
        int celular[] = new int [1];
        int idade[] = new int [1];
        
        for(int i = 0; i < 1; i++){
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do cliente");
            cpf[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o CPF do cliente"));
            celular[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do celular do cliente"));
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do cliente"));
            
            String result = "As informações são: \n" +
                            "Nome do cliente: " + nome[i] + "\n" +
                            "CPF do cliente: " + cpf[i] + "\n" +
                            "Celular do cliente: " + celular[i] + "\n" +
                            "Idade do cliente: " + idade[i] + "\n";
            
            JOptionPane.showMessageDialog(null, result);
            System.out.println(result);
        }
    }
}
