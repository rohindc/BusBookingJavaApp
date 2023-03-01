/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bluubus.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author SEC
 */
public class Connect {
    Connection con;
    PreparedStatement ps;
    String url = "jdbc:mysql://busbooking.caoftlqt4pws.ap-south-1.rds.amazonaws.com:3306/Bus", user = "rohindc", pwd = "virusact1";
    
    private void Connect() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pwd);
    }
}
