/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intro_interface;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ❣🚀❣ Vitor de Jesus ❣🚀❣
 */
public class Intro_Interface {

    public static void main(String[] args) {
        //Instância o Frame
        JFrame frame = new JFrame("Frame Vazio !");

        // Definir o tamanho do frame
        frame.setBounds(0, 0, 500, 300);
        frame.setLayout(null);

        // Criar um JLabel com o texto desejado
        JLabel label = new JLabel("Olá, Mundo!");

        // Criar um JButton com o texto "OK"
        JButton button = new JButton("OK");

        // Definindo o Tamanho do label
        label.setBounds(200, 30, 230, 50);

        // Definindo o Tamanho do botão
        button.setBounds(185, 100, 100, 30);

        // Adicionar o JLabel e uma margem abaixo
        button.add(label);
        button.add(Box.createVerticalStrut(10)); // Adiciona uma margem de 10 pixels

        // Adicionar o Itens ao frame
        frame.add(label);
        frame.add(button);

        // Definir o comportamento padrão ao fechar o frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Exibir o frame
        frame.setVisible(true);

    }

}
