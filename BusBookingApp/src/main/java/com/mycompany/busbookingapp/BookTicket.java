/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.busbookingapp;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SEC
 */
public class BookTicket extends javax.swing.JFrame {

    /**
     * Creates new form BookTicket
     */
    public BookTicket() {
        initComponents();
        menu.add(panel);
        menu2.add(panel2);

        Func f = new Func();
        int x = f.getX(this.getSize().width);
        int y = f.getY(this.getSize().height);
        this.setLocation(x, y);

        Connect();
        disabled();
    }

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String url = "jdbc:mysql://busbooking.caoftlqt4pws.ap-south-1.rds.amazonaws.com:3306/Bus", user = "rohindc", pwd = "virusact1";

    private void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pwd);
        } catch (Exception ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        menu = new javax.swing.JPopupMenu();
        panel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtticket = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        menu2 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtmno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtseat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtbusno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtroute = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );

        menu.setFocusable(false);

        txtticket.setColumns(20);
        txtticket.setRows(5);
        jScrollPane4.setViewportView(txtticket);

        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jButton4)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 12))); // NOI18N

        jLabel1.setText("Name");

        jLabel3.setText("E-mail");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnameKeyTyped(evt);
            }
        });

        jLabel2.setText("Mobile no.");

        txtmno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmnoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmnoKeyReleased(evt);
            }
        });

        jLabel7.setText("Seat no.");

        jLabel4.setText("Bus no.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtname)
                    .addComponent(txtemail)
                    .addComponent(txtmno)
                    .addComponent(txtseat)
                    .addComponent(txtbusno, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtbusno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seat", "Status", "Name", "Mobile no."
            }
        ));
        jTable1.setFocusable(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("Route");

        txtroute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item1", "Item2", "Item3", "Item4" }));

        jLabel6.setText("Date");

        txtdate.setDateFormatString("dd-MM-yyyy");

        jButton1.setText("Show Bus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Book Ticket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(4, 135, 156));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jButton2)
                .addGap(41, 41, 41)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtroute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtroute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disabled() {
        txtname.setEditable(false);
        txtname.setBackground(Color.lightGray);

        txtmno.setEditable(false);
        txtmno.setBackground(Color.lightGray);

        txtemail.setEditable(false);
        txtemail.setBackground(Color.lightGray);

        txtbusno.setEditable(false);
        txtbusno.setBackground(Color.lightGray);

        txtseat.setEditable(false);
        txtseat.setBackground(Color.lightGray);

    }

    private void enabled() {
        txtname.setEditable(true);
        txtname.setBackground(Color.white);

        txtmno.setEditable(true);
        txtmno.setBackground(Color.white);

        txtemail.setEditable(true);
        txtemail.setBackground(Color.white);

        txtbusno.setEditable(true);
        txtbusno.setBackground(Color.white);

        txtseat.setEditable(true);
        txtseat.setBackground(Color.white);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            if (txtdate.getDate() != null) {
                enabled();
                SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
                String date = ft.format(txtdate.getDate());
                String route = txtroute.getSelectedItem().toString();
                System.out.println(route);
                ps = con.prepareStatement("Select bus_num from bus_details where date_of_jur = ? and bus_r = ?");
                ps.setString(1, date);
                ps.setString(2, route);
                rs = ps.executeQuery();
                String bus_num = "";
                while (rs.next() == true) {
                    bus_num = String.valueOf(rs.getInt("bus_num"));
                    System.out.println("Hello " + bus_num);
                }
                String sql = "select `" + bus_num + "`.seat, `" + bus_num + "`.`status`,cus_details.name , booked.c_num as number from `" + bus_num + "` left join booked on `" + bus_num + "`.bus_num = booked.b_no and `" + bus_num + "`.seat = booked.seat left join cus_details on booked.c_num = cus_details.m_no";
                ps = con.prepareStatement(sql);
//            ps.setString(1, bus_num);
                rs = ps.executeQuery();

                ResultSetMetaData rsd = rs.getMetaData();
                int c = rsd.getColumnCount();

                DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
                d.setRowCount(0);
                while (rs.next() == true) {
                    Vector v2 = new Vector();
                    for (int i = 0; i < c; i++) {
                        v2.add(rs.getInt("seat"));
                        v2.add(rs.getString("status"));
                        v2.add(rs.getString("name"));
                        v2.add(rs.getString("number"));
                    }
                    d.addRow(v2);
                }
                txtbusno.setText(bus_num);
                txtbusno.setEditable(false);
//            jTable1.setEnabled(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new BusBookingApp().setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyTyped
        // TODO add your handling code here:
        String s = txtname.getText().trim();
        if (s.equals("")) {
            menu.show(txtname, 0, txtname.getHeight());

        }
//        System.out.println(evt.getKeyChar());
//        switch(evt.getKeyChar()){
//            case KeyEvent.VK_BACK_SPACE:
//                break;
//            case KeyEvent.VK_ENTER:
//                txtname.setText(txtname.getText());
//                break;
//            default:
//                EventQueue.invokeLater(new Runnable(){
//                @Override
//                public void run(){
//                String txt = txtname.getText();
//                autoComplete(txt);
//                }
//                });
//        }

    }//GEN-LAST:event_txtnameKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Boolean old_cus = false;
        String name = txtname.getText();
        String num = txtmno.getText();
        String email = txtemail.getText();
        String bus_num = txtbusno.getText();
        String seat = txtseat.getText();
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String date = ft.format(txtdate.getDate());

        if (name.isBlank() || num.isBlank() || email.isBlank() || seat.isBlank()) {
            JOptionPane.showMessageDialog(this, "Fill in all the details!!!!");
        } else {

            try {
                ps = con.prepareStatement("select m_no from cus_details");
                rs = ps.executeQuery();
                while (rs.next() == true) {
                    if (num.equals(String.valueOf(rs.getInt("m_no")))) {
                        old_cus = true;
                    }
                }
                if (old_cus == false) {
                    ps = con.prepareStatement("insert into cus_details values(?, ?, ?)");
                    ps.setString(1, name);
                    ps.setString(2, num);
                    ps.setString(3, email);
                    ps.executeUpdate();
                }

                ps = con.prepareStatement("update `" + bus_num + "` set status = ? where seat = ?");
                ps.setString(1, "Booked");
                ps.setString(2, seat);
                ps.executeUpdate();

                ps = con.prepareStatement("Insert into booked values(?, ?, ?, ?)");
                ps.setString(1, num);
                ps.setString(2, bus_num);
                ps.setString(3, seat);
                ps.setString(4, date);
                ps.executeUpdate();

                txtname.setText("");
                txtmno.setText("");
                txtemail.setText("");
                txtbusno.setText("");
                txtseat.setText("");

                ps = con.prepareStatement("select booked.c_num as `Mobile no.`, booked.b_no as `Bus no.`, booked.seat, booked.date, cus_details.name, bus_details.driver_num, bus_details.bus_r as route, bus_details.board_time from booked inner join cus_details on booked.c_num = cus_details.m_no inner join bus_details on booked.b_no = bus_details.bus_num where booked.c_num = ?");
                ps.setString(1, num);
                rs = ps.executeQuery();
                int dnum = 0;
                String route = "";
                String time = "";
                while (rs.next() == true) {
                    dnum = rs.getInt("driver_num");
                    route = rs.getString("route");
                    time = rs.getString("board_time");
                }

                txtticket.setText("");
                txtticket.setText(txtticket.getText() + "    **********************************************************************\n\n");
                txtticket.setText(txtticket.getText() + "                                                BLUU BUS                               \n\n");
                txtticket.setText(txtticket.getText() + "    **********************************************************************\n");
                txtticket.setText(txtticket.getText() + "          Route : " + route + "                                 Driver no. " + dnum + "\n");
                txtticket.setText(txtticket.getText() + "          Time  : " + time + "\n");
                txtticket.setText(txtticket.getText() + "    **********************************************************************\n");
                txtticket.setText(txtticket.getText() + "         Bus no.    Seat no.             Name            Date of journey\n");
                txtticket.setText(txtticket.getText() + "           " + bus_num + "              " + seat + "              " + name + "                   " + date + "\n");
                txtticket.setText(txtticket.getText() + "    **********************************************************************");
                txtticket.setEditable(false);
                menu2.show(this, 100, 100);

            } catch (SQLException ex) {
                Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
            }
//            pdf();
//            sendEmail(email);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void sendEmail(String to) {
        String email = "";
        String pass = "";
        String msg = "hello";//txtticket.getText();
        String sub = "Your Ticket";

        Properties prop = new Properties();
        prop.put("mail,smtp.auth", true);
        prop.put("mail,smtp.starttls.enabled", true);
        prop.put("mail,smtp.host", "smtp.gmail.com");
        prop.put("mail,smtp.port", "25");
        prop.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, pass);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            message.setSubject(sub);
            message.setText(msg);
            Transport.send(message);

        } catch (Exception ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void pdf() {
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();
        }
//        Document doc = new Document();

    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
        int selected = jTable1.getSelectedRow();
        System.out.println("1");
        String status = d1.getValueAt(selected, 1).toString();

        if (status.equals("Available")) {
            System.out.println("2");
            String seat = d1.getValueAt(selected, 0).toString();
            txtseat.setText(seat);
        } else {
            JOptionPane.showMessageDialog(this, "Select a different Seat!!!");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            txtticket.print();
        } catch (PrinterException ex) {
            Logger.getLogger(BookTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtmnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmnoKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c)) {
            txtmno.setEditable(false);
        } else {
            txtmno.setEditable(true);
        }

    }//GEN-LAST:event_txtmnoKeyPressed

    private void txtmnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmnoKeyReleased
        // TODO add your handling code here:
//        String no = txtmno.get;
//    for(int i = 0; i < no.length(); i++){
//        if(Integer.parseInt(no.charAt(i)) >=0 && Integer.valueOf(no.charAt(i)) <=9){
//            txtmno.setBackground(Color.white);
//        }
//        else{
//            txtmno.setBackground(Color.red);
//        }
//    }
    }//GEN-LAST:event_txtmnoKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String email = "rohindwrk@gmail.com";
        sendEmail(email);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void autoComplete(String txt) {
        String complete = "";
        int s = txt.length();
        int l = txt.length();
//        for(int a = 0; a < name.size(); a++){
        if ("abcd".startsWith(txt)) {
            complete = "abcd";
            l = complete.length();
//                break;
        }
//        }
        if (l > s) {
            txtname.setText(complete);
            txtname.setCaretPosition(l);
            txtname.moveCaretPosition(s);

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JPopupMenu menu2;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField txtbusno;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmno;
    private javax.swing.JTextField txtname;
    private javax.swing.JComboBox<String> txtroute;
    private javax.swing.JTextField txtseat;
    private javax.swing.JTextArea txtticket;
    // End of variables declaration//GEN-END:variables
}
