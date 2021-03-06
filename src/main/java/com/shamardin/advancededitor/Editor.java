package com.shamardin.advancededitor;

import com.shamardin.advancededitor.view.MainMenu;
import com.shamardin.advancededitor.view.MainPanel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

@Slf4j
public class Editor extends JFrame {

    @Autowired
    private MainPanel mainPanel;

    @Autowired
    private MainMenu menu;

    public void start() {
        setLayout(new BorderLayout());

        setJMenuBar(menu);
        add(mainPanel);

        setTitle("Advanced editor");
        setLocationRelativeTo(null);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        URL a = getClass().getClassLoader().getResource("image/icon.png");
        if(a != null) {
            Image im = Toolkit.getDefaultToolkit().getImage(a);
            setIconImage(im);
        }

        setVisible(true);
    }
}
