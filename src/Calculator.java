import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[12];
    JButton[] functionButtons = new JButton[27];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton, equButton, delButton, clrButton, negButton, squButton;
    JButton sqrButton, piiButton, eeeButton, absButton, expButton, logButton,lnlButton;
    JButton facButton, sinButton, cosButton, tanButton, sndButton, isiButton, icoButton,itaButton;
    JButton nndButton, cbrButton;
    JPanel panel;

    Font myFont = new Font("Times New Roman",Font.BOLD,30);

    double num1=0,num2=0,result=0;
    char operator;


    Calculator() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 750);
        frame.setLayout(null);
        frame.setResizable(false);
        
        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("del");
        clrButton = new JButton("clr");
        negButton = new JButton("+/-");
        squButton = new JButton("x²");
        sqrButton = new JButton("√");
        piiButton = new JButton ("π");
        eeeButton = new JButton("e");
        absButton = new JButton("|x|");
        expButton = new JButton("xʸ");
        logButton = new JButton("log");
        lnlButton = new JButton("ln");
        facButton = new JButton("x!");
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        sndButton = new JButton("2nd");
        isiButton = new JButton("sin⁻¹");
        icoButton = new JButton("cos⁻¹");
        itaButton = new JButton("tan⁻¹");
        nndButton = new JButton("2nd");
        cbrButton = new JButton("3√");
        //cbrButton = new JButton("∛");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;
        functionButtons[9] = squButton;
        functionButtons[10] = sqrButton;
        functionButtons[11] = piiButton;
        functionButtons[12] = eeeButton;
        functionButtons[13] = absButton;
        functionButtons[14] = expButton;
        functionButtons[15] = logButton;
        functionButtons[16] = lnlButton;
        functionButtons[17] = facButton;
        functionButtons[18] = sinButton;
        functionButtons[19] = cosButton;
        functionButtons[20] = tanButton;
        functionButtons[21] = sndButton;
        functionButtons[22] = isiButton;
        functionButtons[23] = icoButton;
        functionButtons[24] = itaButton;
        functionButtons[25] = nndButton;
        functionButtons[26] = cbrButton;

        for(int i =0;i<27;i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        for(int i =0;i<11;i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        negButton.setBounds(250,100,100,50);
        squButton.setBounds(50,500,100,50);
        expButton.setBounds(50,500,100,50);
        sqrButton.setBounds(150,500,100,50);
        delButton.setBounds(50,100,100,50);
        clrButton.setBounds(150,100,100,50);
        piiButton.setBounds(50,550,100,50);
        eeeButton.setBounds(50,550,100,50);
        absButton.setBounds(250,550,100,50);
        logButton.setBounds(250,500,100,50);
        lnlButton.setBounds(250,500,100,50);
        facButton.setBounds(150,550,100,50);
        sinButton.setBounds(50,600,100,50);
        cosButton.setBounds(150,600,100,50);
        tanButton.setBounds(250,600,100,50);
        sndButton.setBounds(50,650,300,50);
        isiButton.setBounds(50,600,100,50);
        icoButton.setBounds(150,600,100,50);
        itaButton.setBounds(250,600,100,50);
        nndButton.setBounds(50,650,300,50);
        cbrButton.setBounds(150,500,100,50);
        // Log location = ln location
        // pi location = e location
        // squ location = exp button

        panel = new JPanel();
        panel.setBounds(50,175,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        //panel.setBackground(Color.green);

       panel.add(numberButtons[1]);
       panel.add(numberButtons[2]);
       panel.add(numberButtons[3]);
       panel.add(divButton);
       panel.add(numberButtons[4]);
       panel.add(numberButtons[5]);
       panel.add(numberButtons[6]);
       panel.add(mulButton);
       panel.add(numberButtons[7]);
       panel.add(numberButtons[8]);
       panel.add(numberButtons[9]);
       panel.add(subButton);
       panel.add(decButton);
       panel.add(numberButtons[0]);
       panel.add(equButton);
       panel.add(addButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(squButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(sqrButton);
        frame.add(piiButton);
        //frame.add(eeeButton);
        frame.add(absButton);
        //frame.add(expButton);
        frame.add(logButton);
        //frame.add(lnlButton);
        frame.add(facButton);
        frame.add(sinButton);
        frame.add(cosButton);
        frame.add(sndButton);
        frame.add(tanButton);
        //frame.add(isiButton);
        //frame.add(icoButton);
        //frame.add(itaButton);
        frame.add(textfield);
        frame.setVisible(true);

    }
    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();
        }

        public void actionPerformed(ActionEvent e) {

            for(int i=0;i<10;i++) {
                if(e.getSource() == numberButtons[i]) {
                    textfield.setText(textfield.getText().concat(String.valueOf(i)));
                }
            }
            if(e.getSource()==decButton) { 
                textfield.setText(textfield.getText().concat("."));
            }
            if(e.getSource()==addButton) { 
                num1 = Double.parseDouble(textfield.getText());
                operator = '+';
                textfield.setText("");
        }
        if(e.getSource()==subButton) { 
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
    }
    if(e.getSource()==mulButton) { 
        num1 = Double.parseDouble(textfield.getText());
        operator = 'x';
        textfield.setText("");

}
    if(e.getSource()==divButton) { 
    num1 = Double.parseDouble(textfield.getText());
    operator = '/';
    textfield.setText("");
        }
        if(e.getSource()==equButton) {
            num2=Double.parseDouble(textfield.getText());

            switch(operator) {
                case'+':
                    result=num1+num2;
                    break;
                case'-':
                    result=num1-num2;
                    break;
                case'x':
                    result=num1*num2;
                    break;
                case'/':
                    result=num1/num2;
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==clrButton) { 
            textfield.setText("");
        }
        if(e.getSource()==delButton) { 
            String string = textfield.getText();
            textfield.setText("");
            for(int i=0;i<string.length()-1;i++) {
                textfield.setText(textfield.getText()+string.charAt(i));
            }
        }
        if(e.getSource()==negButton) { 
           double temp = Double.parseDouble(textfield.getText());
           temp*=-1;
           textfield.setText(String.valueOf(temp));
    }

if(e.getSource()==squButton) { 
    double temp = Double.parseDouble(textfield.getText());
    temp*= temp;
    textfield.setText(String.valueOf(temp));
}
if(e.getSource()==sqrButton) { 
    double temp = Double.parseDouble(textfield.getText());
    temp/= Math.sqrt(temp);
    textfield.setText(String.valueOf(temp));
        }
        if (e.getSource() == piiButton) {
            double pi = Math.PI;
            textfield.setText(String.valueOf(pi));
        }        
 if (e.getSource() == eeeButton) {
            double eulersNumber = Math.E;
            textfield.setText(String.valueOf(eulersNumber));
        }
if (e.getSource()==absButton) {
    double temp = Double.parseDouble(textfield.getText());
    temp = Math.abs(temp);
    textfield.setText(String.valueOf(temp));
}
if (e.getSource() == facButton) {
    int factorialNumber = Integer.parseInt(textfield.getText());
    int factorialResult = factorial(factorialNumber);
    textfield.setText(String.valueOf(factorialResult));
}
if (e.getSource() == logButton) {
    double number = Double.parseDouble(textfield.getText());
    double logResult = Math.log10(number);
    textfield.setText(String.valueOf(logResult));
}
if (e.getSource() == lnlButton) {
    double number = Double.parseDouble(textfield.getText());
    double lnResult = Math.log(number);
    textfield.setText(String.valueOf(lnResult));
}
//TODO: Add fuction to exponent button
if (e.getSource() == expButton) {
    double base = num1;
    double exponent = Double.parseDouble(textfield.getText());
    double result = Math.pow(base, exponent);
    textfield.setText(String.valueOf(result));
}
if (e.getSource() == sinButton) {
    double angle = Double.parseDouble(textfield.getText());
    double sinResult = Math.sin(Math.toRadians(angle));
    textfield.setText(String.valueOf(sinResult));
}
if (e.getSource() == cosButton) {
    double angle = Double.parseDouble(textfield.getText());
    double cosResult = Math.cos(Math.toRadians(angle));
    textfield.setText(String.valueOf(cosResult));
}
if (e.getSource() == tanButton) {
    double angle = Double.parseDouble(textfield.getText());
    double tanResult = Math.tan(Math.toRadians(angle));
    textfield.setText(String.valueOf(tanResult));
}
if (e.getSource() == sndButton) {
    frame.remove(sinButton);
    frame.remove(cosButton);
    frame.remove(tanButton);
    frame.remove(piiButton);
    frame.remove(logButton);
    frame.remove(squButton);
    frame.remove(sndButton);
    frame.remove(sqrButton);
    frame.add(isiButton);
    frame.add(icoButton);
    frame.add(itaButton);
    frame.add(eeeButton);
    frame.add(lnlButton);
    frame.add(expButton);
    frame.add(nndButton);
    frame.add(cbrButton);
    frame.revalidate();
    frame.repaint();
}
if (e.getSource() == nndButton) {
    frame.add(sinButton);
    frame.add(cosButton);
    frame.add(tanButton);
    frame.add(piiButton);
    frame.add(logButton);
    frame.add(squButton);
    frame.add(sndButton);
    frame.add(sqrButton);
    frame.remove(isiButton);
    frame.remove(icoButton);
    frame.remove(itaButton);
    frame.remove(eeeButton);
    frame.remove(lnlButton);
    frame.remove(expButton);
    frame.remove(nndButton);
    frame.remove(cbrButton);
    frame.revalidate();
    frame.repaint();
}
if(e.getSource()==cbrButton) { 
    double temp = Double.parseDouble(textfield.getText());
    Math.cbrt(temp);
    textfield.setText(String.valueOf(temp));
    //TODO: fix cuberoot function
        }
if (e.getSource() == isiButton) {
    double temp = Double.parseDouble(textfield.getText());
    Math.sinh(temp);
}

}
public int factorial(int n) {
    if (n == 0)
        return 1;
    else
        return n * factorial(n - 1);
}
//TODO: add funtions to isi,ico,ita buttons
    }

    

