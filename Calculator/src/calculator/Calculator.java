/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Lean Renz J. David
 */
class Calculator extends JFrame {
    
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn0;
    JFrame fram1;
    JButton btnAdd;
    JButton btnSubtract;
    JButton btnMultiply;
    JButton btnDivide;
    JButton btnSolve;
    JButton btnClear;
    private double n1;
    private double n2;
    JTextField textf;

Boolean addBool = false ;
Boolean subBool = false ;
Boolean divBool = false ;
Boolean mulBool = false ;
String total = "";

 public Calculator() {
    fram1=new JFrame("Calculator");
    textf = new JTextField();
    
     fram1.add(textf = new JTextField());
    fram1.add(btn1 = new JButton("1"));
    fram1.add(btn2 = new JButton("2"));
    fram1.add(btn3 = new JButton("3"));
    fram1.add(btn4 = new JButton("4"));
    fram1.add(btn5 = new JButton("5"));
    fram1.add(btn6 = new JButton("6"));
    fram1.add(btn7 = new JButton("7"));
    fram1.add(btn8 = new JButton("8"));
    fram1.add(btn9 = new JButton("9"));
    fram1.add(btn0 = new JButton("0"));
    fram1.add(btnClear = new JButton("C"));
    fram1.add(btnAdd = new JButton("+"));
    fram1.add(btnSubtract = new JButton("-"));
    fram1.add(btnMultiply = new JButton("*"));
    fram1.add(btnDivide = new JButton("/"));
    fram1.add(btnSolve = new JButton("="));

     
        textf.setBounds(30,40,280,30);//top
        btn1.setBounds(40,240,50,40);//left
        btn2.setBounds(110,240,50,40);//middle
        btn3.setBounds(180,240,50,40);//right
        btn4.setBounds(40,170,50,40);//left
        btn5.setBounds(110,170,50,40);//mid
        btn6.setBounds(180,170,50,40);//right
        btn7.setBounds(40,100,50,40);//left
        btn8.setBounds(110,100,50,40);//mid
        btn9.setBounds(180,100,50,40);//right
        btn0.setBounds(40,310,50,40);//left
        btnAdd.setBounds(250,310,50,40);
        btnSubtract.setBounds(250,240,50,40);
        btnMultiply.setBounds(250,170,50,40);
        btnDivide.setBounds(250,100,50,40);
        btnSolve.setBounds(180,310,50,40);
        btnClear.setBounds(110,310,50,40);
    

        fram1.setLayout(null);
        fram1.setVisible(true);
        fram1.setSize(330,395);
        fram1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram1.setResizable(false);
    

    btn1.addActionListener(new One());
    btn2.addActionListener(new Two());
    btn3.addActionListener(new Three());
    btn4.addActionListener(new Four());
    btn5.addActionListener(new Five());
    btn6.addActionListener(new Six());
    btn7.addActionListener(new Seven());
    btn8.addActionListener(new Eight());
    btn9.addActionListener(new Nine());
    btn0.addActionListener(new Zero());

    btnAdd.addActionListener(new Add());
    btnSubtract.addActionListener(new Subtract());
    btnMultiply.addActionListener(new Multiply());
    btnDivide.addActionListener(new Divide());
    btnSolve.addActionListener(new Solve());
    btnClear.addActionListener(new Clear());



} //JavaCaluclator()

class Clear implements ActionListener {
    public void actionPerformed(ActionEvent e) {
   
        n1 = 0;
        n2 =0 ;
        textf.setText("");
        addBool = false ;
        subBool = false ;
        mulBool = false ;
        divBool = false ;
       
    }
}

class One implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        total = textf.getText();
        textf.setText(total + "1");
    }
}
class Two implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        total = textf.getText();
       textf.setText(total + "2");
    }
}
class Three implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        total = textf.getText();
        textf.setText(total + "3");
    }
}
class Four implements ActionListener {
    public void actionPerformed(ActionEvent e) {
       total = textf.getText();
        textf.setText(total + "4");
    }
}
class Five implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        total = textf.getText();
        textf.setText(total + "5");
    }
}
class Six implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        total = textf.getText();
        textf.setText(total + "6");
    }
}
class Seven implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        total = textf.getText();
        textf.setText(total + "7");
    }
}
class Eight implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        total = textf.getText();
        textf.setText(total + "8");
    }
}
class Nine implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        total = textf.getText();
        textf.setText(total + "9");
    }
}
class Zero implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        total = textf.getText();
        textf.setText(total + "0");
    }
}

    class Add implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        n1 = Double.parseDouble(textf.getText());
                    textf.setText("");
                    addBool = true ;

    }
}
class Subtract implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        n1 = Double.parseDouble(textf.getText());
       textf.setText("");
        subBool =true;
    }
}
class Multiply implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        n1 = Double.parseDouble(textf.getText());
       textf.setText("");
        mulBool =true;

    }
}
class Divide implements ActionListener {
    public void actionPerformed(ActionEvent e) {
         n1 = Double.parseDouble(textf.getText());
       textf.setText("");
        divBool = true;
    }
}
class Solve implements ActionListener {
    public void actionPerformed(ActionEvent e) {
                    n2 = Double.parseDouble(  textf.getText() );
                    if ( addBool == true  )
                        n2 = n2 + n1;
                    else if ( subBool == true  )
                       n2 = n2 - n1;
                    else if ( mulBool == true  )
                        n2 = n2 * n1;
                    else if ( divBool == true  )
                        n2 = n1 / n2;
       textf.setText(  Double.toString(n2) );

        addBool = false ;
        subBool = false ;
        mulBool = false ;
        divBool = false ;
    }
}

public static void main(String[] args) {
    // TODO Auto-generated method stub
    Calculator calc = new Calculator();
       
}
} 