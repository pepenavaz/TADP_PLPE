import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculadora extends JFrame{

   JTextField num1, num2;
  //JTextField num2;
   JButton sum, div, res, mul;
   /*JButton res;
   JButton mul;
   JButton div;*/
   JLabel txtNo1, txtNo2, resp, gg;
   
   public Calculadora(){
   
      setSize(365,250);
      setLocationRelativeTo(null);     
      
      setTitle("Calculadora Numerica De Peregrino");
      num1 = new JTextField(4);
      num2 = new JTextField(4);
      txtNo1 = new JLabel("Ingrese un numero:");
      txtNo2 = new JLabel("Ingrese otro numero:");
      resp = new JLabel();
      
      sum = new JButton("Sumar");
      sum.addMouseListener(new MyClickSuma());
      res = new JButton("Restar");
      res.addMouseListener(new MyClickResta());
      mul = new JButton("Multiplicar");
      mul.addMouseListener(new MyClickMultiplicar());
      div = new JButton("Dividir");
      div.addMouseListener(new MyClickDivision());
      
      gg = new JLabel("Esto es una calculadora Numerica \nNO Algebraica :u");
      
      componentes();
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }
   private void componentes(){
      
      JPanel pan = new JPanel();
      pan.setLayout(null);
      pan.setBackground(Color.CYAN);
      this.getContentPane().add(pan);
      
      pan.add(txtNo1);
      txtNo1.setBounds(25, 10, 155, 25); 
      pan.add(num1);
      num1.setBounds(25, 35, 110, 25); 
      

      pan.add(txtNo2);
      txtNo2.setBounds(203, 10, 155, 25);
      pan.add(num2);
      num2.setBounds(203, 35, 120, 25);
      
         
      pan.add(sum);
      sum.setBounds(10, 98, 75, 25);         
      pan.add(res);
      res.setBounds(95, 98, 75, 25);
      pan.add(mul);
      mul.setBounds(180, 98, 75, 25);
      pan.add(div);
      div.setBounds(265, 98, 75, 25);
          
      pan.add(resp);
      resp.setBounds(138, 155, 150, 25);
      
      
   }
   private class MyClickSuma extends MouseAdapter{
      double numero1 = 0;
      double numero2 = 0;
      double resul; 
      
      public void mouseClicked(MouseEvent event){
         
         numero1 = Double.parseDouble(num1.getText());
         numero2 = Double.parseDouble(num2.getText());
         resul= numero1+numero2; 
         
         resp.setText("Resultado " + String.valueOf(resul));
         
            
            
      }
   }
   private class MyClickResta extends MouseAdapter{
      double numero1 = 0;
      double numero2 = 0;
      double resul; 
      
      public void mouseClicked(MouseEvent event){
         
         numero1 = Double.parseDouble(num1.getText()); 
         numero2 = Double.parseDouble(num2.getText());
         resul= numero1-numero2; 
         resp.setText("Resultado " + String.valueOf(resul));
         
            
            
      }
   }

   private class MyClickMultiplicar extends MouseAdapter{
      double numero1 = 0;
      double numero2 = 0;
      double resul; 
      
      public void mouseClicked(MouseEvent event){
         
         numero1 = Double.parseDouble(num1.getText()); 
         numero2 = Double.parseDouble(num2.getText());
         resul= numero1*numero2; 
         resp.setText("Resultado " + String.valueOf(resul));
              
            
      }
   }

   private class MyClickDivision extends MouseAdapter{
      double numero1 = 0;
      double numero2 = 0;
      double resul; 
      
      public void mouseClicked(MouseEvent event){
         
         numero1 = Double.parseDouble(num1.getText());
         numero2 = Double.parseDouble(num2.getText());
         resul= numero1/numero2; 
         resp.setText("Resultado " + String.valueOf(resul));     
      }
   }
   
}