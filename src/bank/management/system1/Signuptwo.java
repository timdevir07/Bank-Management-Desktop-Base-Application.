/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Signuptwo extends JFrame implements ActionListener {
    
    JTextField pan,adhar;
    JButton next;
    JRadioButton syes, sno,eyes,eno;
    JComboBox religion,category,income,occupation,education;
    String formno,random;

    Signuptwo(String formno) {
        setLayout(null);
        setTitle("New Account Application Form-Page 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel name= new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christion","other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname= new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        
        String valCategory[]={"GENERAL","OBC","SC","ST","other"};
        category=new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel dob= new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String valincome[]={"Null","<1.5 lakh","<2.5lakh","<5lakh","upto10 lakh"};
        income=new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gen= new JLabel("Educational");
        gen.setFont(new Font("Raleway", Font.BOLD, 20));
        gen.setBounds(100, 290, 200, 30);
        add(gen);
        
        JLabel email= new JLabel("Qualification");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        String valeducation[]={"Non-Graduation","Graduation","Post-Graduation","Other",};
        education=new JComboBox(valeducation);
        education.setBounds(300,290,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel mtrl= new JLabel("Occupation:");
        mtrl.setFont(new Font("Raleway", Font.BOLD, 20));
        mtrl.setBounds(100, 390, 200, 30);
        add(mtrl);

        String valoccupation[]={"Salaried","Self-Employed","Bussiness man","Student","Retired","Other"};
        occupation=new JComboBox(valoccupation);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
       
        JLabel add= new JLabel("Pan number:");
        add.setFont(new Font("Raleway", Font.BOLD, 20));
        add.setBounds(100, 390 + 50, 200, 30);
        add(add);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel cty = new JLabel("Adhar number:");
        cty.setFont(new Font("Raleway", Font.BOLD, 20));
        cty.setBounds(100, 390 + 50 + 50, 200, 30);
        add(cty);

        adhar = new JTextField();
        adhar.setFont(new Font("Raleway", Font.BOLD, 14));
        adhar.setBounds(300, 490, 400, 30);
        add(adhar);

        JLabel state= new JLabel("Senior citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        syes = new JRadioButton("YES");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.white);
        add(syes);

        sno = new JRadioButton("NO");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup mtrlgroup= new ButtonGroup();
        mtrlgroup.add(syes);
        mtrlgroup.add(sno);

        //ButtonGroup stategroup = new ButtonGroup();
        //stategroup.add(syes);
        //state.add(sno);
        

        JLabel pin= new JLabel("Exisiting account:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 590, 200, 30);
        add(pin);
        
        eyes = new JRadioButton("YES");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.white);
        add(eyes);

        eno = new JRadioButton("NO");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.white);
        add(eno);

        ButtonGroup emtrlgroup= new ButtonGroup();
        emtrlgroup.add(eyes);
        emtrlgroup.add(eno);
      
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.white);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String sreligion =(String) religion.getSelectedItem();
        String scategory =(String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation =(String) education.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();
        String  seniorcitizen= null;
        if (syes.isSelected()) {
            seniorcitizen = "YES";
        } else if (sno.isSelected()) {
            seniorcitizen= "NO";
        } 
        String exisitingaccount= null;
        if (eyes.isSelected()) {
            exisitingaccount= "YES";
        } else if (eno.isSelected()) {
            exisitingaccount = "NO";
        } 
        
        String span=pan.getText();
        String sadhar=adhar.getText();
        //
        try{ 
            Conn c=new Conn();
                String query="insert into signuptwo value('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
                c.s.executeUpdate(query);
            }   
        
        //for signup3 obgect
     catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String args[]) {
        new Signuptwo("");
    }
   
}

/**
 *
 * @author Raju Raj
 */
//public class Signuptwo {

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        // TODO code application logic here
   // }
//}