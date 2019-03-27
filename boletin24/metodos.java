package boletin24;

import java.awt.*;
import javax.swing.*;

public class metodos {

    JFrame marco;
    JPanel panel1, panel2, panel3;
    JButton premer, limpar, boton;
    JLabel nome, password;
    JTextField cuadroTexto, litexto1, litexto2;
    JList lista;

    public void iniciarCom() {
        marco = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        premer = new JButton("PREMER");
        limpar = new JButton("LIMPAR");
        boton = new JButton("BOTON");

        boton.setBounds(450, 300, 90, 30);

        nome = new JLabel();
        nome.setText("NOME");
        password = new JLabel();
        password.setText("PASSWORD");

        cuadroTexto = new JTextField(30);
        litexto1 = new JTextField(30);
        litexto2 = new JTextField(30);
        cuadroTexto.setSize(100, 300);
        marco.setSize(500, 700);
        panel1.setBounds(10, 10, 480, 320);
        panel2.setBounds(10, 340, 480, 320);
        panel3.setSize(500, 800);

        lista = new JList();

        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setLayout(null);
        panel1.add(nome);
        nome.setBounds(100, 50, 50, 20);
        panel1.add(password);
        password.setBounds(100, 100, 100, 20);
        panel1.add(premer);
        panel1.add(limpar);
        premer.setBounds(100, 250, 90, 30);
        limpar.setBounds(280, 250, 90, 30);
        panel1.add(litexto1);
        litexto1.setBounds(250, 40, 150, 40);
        litexto1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(litexto2);
        litexto2.setBounds(250, 90, 150, 50);
        litexto2.setBorder(BorderFactory.createLineBorder(Color.black));
        
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.setLayout(null);
        panel2.add(boton);
        boton.setBounds(200, 150, 90, 30);
        panel2.add(cuadroTexto);
        cuadroTexto.setBounds(350, 80, 100, 140);
        cuadroTexto.setText("AREA DE TEXTO");
        cuadroTexto.setBorder(BorderFactory.createLineBorder(Color.black));
        String[] datoslista = {"ElementoLista1", "\n", "ElementoLista2", "\n", "ElementoLista3"};
        lista.setListData(datoslista);
        lista.setBounds(25,50, 130, 170);
        lista.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.add(lista);

        marco.add(panel1);
        marco.add(panel2);
        marco.add(panel3);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
    }
}
