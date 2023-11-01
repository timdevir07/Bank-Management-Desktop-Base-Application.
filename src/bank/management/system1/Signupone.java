package bank.management.system1;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
//import com.toedter.calendar.JDateChooser;
public class Signupone extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addTextField, ctyTextField, stateTextField, pinTextField, dobTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;

    Signupone() {

        setLayout(null);
        Random ran = new Random();
        long random = Math.abs((ran.nextLong()) % (9000L + 1000L));

        JLabel formno = new JLabel("APPLICATION FORM NO:" + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1:  Personal details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        /*JDateChooser dateChooser=new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105,105));
        add(dateChooser);*/
        dobTextField = new JTextField();
        dobTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        dobTextField.setBounds(300, 240, 400, 30);
        add(dobTextField);

        JLabel gen = new JLabel("Gender:");
        gen.setFont(new Font("Raleway", Font.BOLD, 20));
        gen.setBounds(100, 290, 200, 30);
        add(gen);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel mtrl = new JLabel("Martial Status:");
        mtrl.setFont(new Font("Raleway", Font.BOLD, 20));
        mtrl.setBounds(100, 390, 200, 30);
        add(mtrl);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.white);
        add(other);

        ButtonGroup mtrlgroup = new ButtonGroup();
        mtrlgroup.add(married);
        mtrlgroup.add(unmarried);
        mtrlgroup.add(other);

        JLabel add = new JLabel("Address:");
        add.setFont(new Font("Raleway", Font.BOLD, 20));
        add.setBounds(100, 390 + 50, 200, 30);
        add(add);

        addTextField = new JTextField();
        addTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addTextField.setBounds(300, 440, 400, 30);
        add(addTextField);

        JLabel cty = new JLabel("City:");
        cty.setFont(new Font("Raleway", Font.BOLD, 20));
        cty.setBounds(100, 390 + 50 + 50, 200, 30);
        add(cty);

        ctyTextField = new JTextField();
        ctyTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        ctyTextField.setBounds(300, 490, 400, 30);
        add(ctyTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 390 + 50 + 50 + 50, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pin = new JLabel("Pin Code:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 390 + 50 + 50 + 50 + 50, 200, 30);
        add(pin);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 590, 400, 30);
        add(pinTextField);

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
        String name = nameTextField.getText();//for setText
        String fname = fnameTextField.getText();
        String dob = dobTextField.getText();
        String email = emailTextField.getText();
        String add = addTextField.getText();
        String cty = ctyTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        String gen = null;
        if (male.isSelected()) {
            gen = "Male";
        } else if (female.isSelected()) {
            gen = "Female";
        } else if (other.isSelected()) {
            gen = "Other";
        }
        String mtrl = null;
        if (married.isSelected()) {
            mtrl = "Married";
        } else if (unmarried.isSelected()) {
            mtrl = "Unmarried";
        } else if (other.isSelected()) {
            mtrl = "Other";
        }
        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name Require**");
            }else{
                Conn c=new Conn();
                String query="insert into signup value('"+formno+"','"+name+"','"+fname+"','"+email+"','"+add+"','"+cty+"','"+state+"','"+pin+"','"+dob+"','"+mtrl+"','"+gen+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new Signuptwo(formno).setVisible(true);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String args[]) {
        new Signupone();
    }
   
}
