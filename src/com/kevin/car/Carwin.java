package com.kevin.car;

import javax.swing.*;

public class Carwin {
    static final int WIDTH = 600 ;
    static final int HEIGHT=400 ;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
