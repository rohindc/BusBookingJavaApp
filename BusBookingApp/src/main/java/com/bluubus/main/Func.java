/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluubus.main;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author SEC
 */
public class Func {

    Connection con;

    void connect() {
        try {
            String url = "jdbc:mysql://busbooking.caoftlqt4pws.ap-south-1.rds.amazonaws.com:3306/Bus", user = "rohindc", pwd = "12345678";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pwd);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Func.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    Connection getCon() {
        return con;
    }

    void seticon(JFrame f) {
        try {
            f.setIconImage(ImageIO.read(new File("src/main/java/com/bluubus/icon/bus.png")));
        } catch (IOException ex) {
            Logger.getLogger(Func.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
