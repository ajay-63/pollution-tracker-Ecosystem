/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AJAY KUMAR
 */
public class sptaildist extends javax.swing.JFrame {

    /**
     * Creates new form sptaildist
     */
    public sptaildist() {
        initComponents();
        setVisible(false);
    }
    public static String st="";
    String message = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setText("Nearest emission source");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton2.setText("emission sources (within 30 miles)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton3.setText("3 nearest areas of emission source");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton4.setText("3 emssion sources near area");
        jButton4.setActionCommand("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Area Id");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("City Id");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jButton5.setText("<-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Emission source Id");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(337, 337, 337)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(93, 93, 93)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        validate_();
        if(message.length()==0)
        {
            try{  
        	//step1 load the driver class  
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
        	  
        	//step2 create  the connection object  
        	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@218.248.0.7:1521:RDBMS","it20737122","vasavi");  
                 String areastr = this.jTextField1.getText();
                 String citystr = this.jTextField2.getText();
        	////step3 create the statement object  
        	//step4 execute query  
        	 String query = " SELECT /*+ordered (e esources_spidx) */ e.eid,e.esname,e.source_type FROM place p,esources e WHERE p.area_id=? AND p.city_id=?" +
                "AND sdo_nn(e.source_geo_location, p.place_geo_location,'sdo_num_res=1') = 'TRUE'";

        		      // create the mysql insert preparedstatement
        		PreparedStatement preparedStmt = con.prepareStatement(query);
                        preparedStmt.setInt(1,Integer.parseInt(areastr));
                        preparedStmt.setInt(2,Integer.parseInt(citystr));
            System.out.println(query);
            ResultSet rs=preparedStmt.executeQuery(); 
            int c=0;
            while(rs.next()){ 
                 st+="Emission Source :"+String.valueOf(++c);
                 st+="\nEmission source Id: "+String.valueOf(rs.getInt(1));
                 st+="\nEmission Source Name: "+rs.getString(2)+"\nEmission source Type: "+rs.getString(3)+"\n";
            }
            jTextArea1.setText(st);
            st="";
        	//stmt.executeQuery(query);  
        	System.out.println("Done");
		//esid+=1; 
        	  
        	//store the connection object  
        	con.close();  
        	  
        	}catch(Exception e){ 
        		System.out.println(e);
        		}
        }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         validate_();
         String esstr1=this.jTextField3.getText();
         if (esstr1.length() < 4) {
			message = message + "emission source id cannot be less than 4 charcaters!\n";
		}
                else {
			for(char c : esstr1.replaceAll(" ", "").toCharArray()) {
				if (!(Character.isDigit(c))) {
					message = message + "emission source id can have only numbers!\n";
					break;
				}
			}
		}
         if (message.length() != 0) {
			JOptionPane.showMessageDialog(new JFrame(), message, "error", JOptionPane.ERROR_MESSAGE);
                
	}
        if(message.length()==0)
        {
            try{  
        	//step1 load the driver class  
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
        	  
        	//step2 create  the connection object  
        	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@218.248.0.7:1521:RDBMS","it20737122","vasavi");  
                 String areastr = this.jTextField1.getText();
                 String citystr = this.jTextField2.getText();
                 String esstr=this.jTextField3.getText();
        	////step3 create the statement object  
        	//step4 execute query  
        	 String query = "SELECT /*+ordered index(ps place_spidx) */  p.area_id, p.city_id,  p.place_name,  sdo_nn_distance (1) distance FROM esources e,place p WHERE e.eid=? "+
                         "AND sdo_nn( p.place_geo_location,e.source_geo_location, 'sdo_num_res=3', 1) = 'TRUE' ORDER BY distance";

        		      // create the mysql insert preparedstatement
        		PreparedStatement preparedStmt = con.prepareStatement(query);
                        preparedStmt.setInt(1,Integer.parseInt(esstr));
            System.out.println(query);
            ResultSet rs=preparedStmt.executeQuery(); 
            int c=0;
            while(rs.next()){ 
                 st+="Place :"+String.valueOf(++c);
                 st+="\nArea Id: "+String.valueOf(rs.getInt(1));
                 st+="\nCity Id: "+String.valueOf(rs.getInt(1));
                 st+="\nplace Name: "+rs.getString(3)+"\ndistance: "+rs.getFloat(4)+"\n\n";
            }
            if(st.length()!=0) {
                jTextArea1.setText(st);
                }
                else
                	jTextArea1.setText("No places Found");
                st="";
        	//stmt.executeQuery(query);  
        	System.out.println("Done");
		//esid+=1; 
        	  
        	//store the connection object  
        	con.close();  
        	  
        	}catch(Exception e){ 
        		System.out.println(e);
        		}
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         validate_();
        if(message.length()==0)
        {
            try{  
        	//step1 load the driver class  
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
        	  
        	//step2 create  the connection object  
        	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@218.248.0.7:1521:RDBMS","it20737122","vasavi");  
                 String areastr = this.jTextField1.getText();
                 String citystr = this.jTextField2.getText();
        	////step3 create the statement object  
        	//step4 execute query  
        	 String query = "SELECT /*+ordered*/ e.eid,e.esname, e.source_type FROM place p, esources e  WHERE p.area_id=? AND p.city_id=? "+
                         "AND sdo_within_distance (p.place_geo_location, e.source_geo_location,'distance = 50 unit=MILE')=  'TRUE'";

        		      // create the mysql insert preparedstatement
        		PreparedStatement preparedStmt = con.prepareStatement(query);
                        preparedStmt.setInt(1,Integer.parseInt(areastr));
                        preparedStmt.setInt(2,Integer.parseInt(citystr));
            System.out.println(query);
            ResultSet rs=preparedStmt.executeQuery(); 
            int c=0;
            while(rs.next()){ 
                 st+="Emission Source :"+String.valueOf(++c);
                 st+="\nEmission source Id: "+String.valueOf(rs.getInt(1));
                 st+="\nEmission Source Name: "+rs.getString(2)+"\nEmission source Type: "+rs.getString(3)+"\n";
            }
            if(st.length()!=0) {
            jTextArea1.setText(st);
            }
            else
            	jTextArea1.setText("No Emission Sources Found");
            st="";
        	//stmt.executeQuery(query);  
        	System.out.println("Done");
		//esid+=1; 
        	  
        	//store the connection object  
        	con.close();  
        	  
        	}catch(Exception e){ 
        		System.out.println(e);
        		}
        }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        validate_();
        if(message.length()==0)
        {
            try{  
        	//step1 load the driver class  
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
        	  
        	//step2 create  the connection object  
        	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@218.248.0.7:1521:RDBMS","it20737122","vasavi");  
                 String areastr = this.jTextField1.getText();
                 String citystr = this.jTextField2.getText();
        	////step3 create the statement object  
        	//step4 execute query  
        	 String query = "SELECT /*+ordered*/ e.eid, e.esname, e.source_type FROM place p, esources e WHERE p.area_id= ? AND p.city_id=?" +
"AND sdo_nn (e.source_geo_location, p.place_geo_location, 'sdo_num_res=3') = 'TRUE'";

        		      // create the mysql insert preparedstatement
        		PreparedStatement preparedStmt = con.prepareStatement(query);
                        preparedStmt.setInt(1,Integer.parseInt(areastr));
                        preparedStmt.setInt(2,Integer.parseInt(citystr));
            System.out.println(query);
            ResultSet rs=preparedStmt.executeQuery(); 
            int c=0;
            while(rs.next()){ 
                 st+="Emission Source :"+String.valueOf(++c);
                 st+="\nEmission source Id: "+String.valueOf(rs.getInt(1));
                 st+="\nEmission Source Name: "+rs.getString(2)+"\nEmission source Type: "+rs.getString(3)+"\n\n";
            }
            if(st.length()!=0) {
            jTextArea1.setText(st);
            }
            else
            	jTextArea1.setText("No Emission Sources Found");
            st="";
        	//stmt.executeQuery(query);  
        	System.out.println("Done");
		//esid+=1; 
        	  
        	//store the connection object  
        	con.close();  
        	  
        	}catch(Exception e){ 
        		System.out.println(e);
        		}
        }
    }                                        
    public void validate_() 
    {
                message="";
                String areastr,citystr;
		areastr = this.jTextField1.getText();
                int areaid,cityid;
                citystr=this.jTextField2.getText();
		if (areastr.length() < 4) {
			message = message + "area-id cannot be less than 4 charcaters!\n";
		}
                else {
			for(char c : areastr.replaceAll(" ", "").toCharArray()) {
				if (!(Character.isDigit(c))) {
					message = message + "Area id can have only numbers!\n";
					break;
				}
			}
		}
                if (citystr.length() < 4) {
			message = message + "city-id cannot be less than 4 charcaters!\n";
		}
                else {
			for(char c : citystr.replaceAll(" ", "").toCharArray()) {
				if (!(Character.isDigit(c))) {
					message = message + "city id can have only numbers!\n";
					break;
				}
			}
		}
                if (message.length() != 0) {
			JOptionPane.showMessageDialog(new JFrame(), message, "error", JOptionPane.ERROR_MESSAGE);
                
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
            java.util.logging.Logger.getLogger(sptaildist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sptaildist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sptaildist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sptaildist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sptaildist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
}
