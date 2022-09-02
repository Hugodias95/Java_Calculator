/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projetocalc.model;

import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class CalculadoraModel {
        //Atributos
    private String num1 = "";
    private String num2 = "";
    private double numAux1 = 0;
    private double numAux2 = 0;
    private  String mostrarResultado = "";
    private int calculo = 0;
    
    //Métodos

    //Construtor
    public CalculadoraModel(String num1, String num2, double numAux1, double numAux2){
        this.num1 = num1;
        this.num2 = num2;
        this.numAux1 = numAux1;
        this.numAux2 = numAux2;
        
    }
 
    //Get+Set para num1 e num2
    //Set para numAux1, numAux2 e String vet[2]

    public void setMostrarResultado(String mostrarResultado) {
        this.mostrarResultado = mostrarResultado;
    }

    public String getMostrarResultado() {
        return mostrarResultado;
    }
    
    
    public void setCalculo(int calculo) {
        this.calculo = calculo;
    }

    public int getCalculo() {
        return calculo;
    }
    
    
    
    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }
    
    public String calcularNum1(String texto) {
        double a = 0;
        a =  Double.parseDouble(num1) + Double.parseDouble(texto);
        return Double.toString(a);
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void setNumAux1(double numAux1) {
        this.numAux1 = numAux1;
    }

    public void setNumAux2(double numAux2) {
        this.numAux2 = numAux2;
    }

    /*public void setVet(String[] vet) {
        this.vet = vet;
    }*/

    public double getNumAux1() {
        return numAux1;
    }

    public double getNumAux2() {
        return numAux2;
    }
    
    
    
    
    
    
    
    //Calculando resultados
    
    
    
     //Métodos

    
    public String calcular() {
        switch(calculo){
        case 1  :
            numAux1= Double.parseDouble(num1)+Double.parseDouble(num2);
            return String.valueOf(numAux1);
            
           
           
        case 2  :
            numAux1= Double.parseDouble(num1)-Double.parseDouble(num2);
            return String.valueOf(numAux1);
         
         
         case 3  :
            numAux1= Double.parseDouble(num1)*Double.parseDouble(num2);
            return String.valueOf(numAux1);
         
         case 4  :
             
             try {
                 if (Double.parseDouble(num2) != 0) {
                     numAux1= Double.parseDouble(num1)/Double.parseDouble(num2);
                 } else {
                     JOptionPane.showMessageDialog(null, "Oops! não é possível dividir por 0...");
                 }
 
                
         } catch (Exception e) {
                 
         }
         
         return String.valueOf(numAux1);

         
         case 5  :
            numAux1= Math.pow(Double.parseDouble(num1), Double.parseDouble(num2)) ;
            return String.valueOf(numAux1);
         
         case 6 :
             
            if(Double.valueOf(num1) < 0 ){
           
            //numAux1= Math.abs(Math.sqrt(Double.valueOf(numAux1)));
            return "Não existe raiz de número negativo, use um número real.";
            
        } else {
             numAux1= Math.sqrt(Double.parseDouble(num1));    
             return String.valueOf(numAux1);
            }
}
             
             /*try {
                 if(Double.valueOf(num1) >= 0){
                 numAux1= Math.sqrt(Double.parseDouble(num1));    
                 } else{
                     JOptionPane.showMessageDialog(null, "Não existe raiz de número negativo.");
                     
                 }
                 
             } catch (Exception e) {
             }*/
            
    return "";
}










































































































    // ================Simples================
    //Somar
    /*public double somarNum(double resultado){
        
        numAux1 = Double.valueOf(num1);    
        
        
        //numAux2 = Double.valueOf(num2);
        
        numAux1 += numAux2;
        
        return numAux1;
        
    }
    
    //Subtrair
    public double subtrairNum(double resultado){
        numAux1 = Double.valueOf(num1);    
        
        
        numAux2 = Double.valueOf(num2);
        
        
        
        resultado = numAux1 - numAux2;
        
        return  Double.valueOf(num1) - Double.valueOf(num2);
        
    }
    //Multiplicar
    public double multiplicarNum(double resultado){
        
        numAux1 = Double.valueOf(num1);    
        
        
        numAux2 = Double.valueOf(num2);
        
        
        
        resultado = numAux1 * numAux2;
        
        return Double.valueOf(num1) * Double.valueOf(num2);
    }
    
    //Dividir
    public double dividirNum(double resultado) throws Exception{
        
        
        numAux1 = Double.valueOf(num1);    
        
        
        numAux2 = Double.valueOf(num2);
        
        
        
        resultado = numAux1 / numAux2;
        
        if(Double.valueOf(num2)<=0){
            throw new IllegalArgumentException("Não se pode dividir um número por 0");
        }else{
            return Double.valueOf(num1)/ Double.valueOf(num2);
        }
    }
    
    
    // ================Complexos================
     //Raiz
    public double raizNum(double resultado) {
        
        numAux1= Double.valueOf(num1) ;
        
        if(Double.valueOf(numAux1) < 0 ){
           
        return Math.abs(Math.sqrt(Double.valueOf(numAux1)));
            
        }
        
        return Math.sqrt(Double.valueOf(numAux1));
        
    }
     //Potência
    public double potenciaNum(double resultado) {
        
         numAux1= Double.valueOf(num1) ;
         numAux2= Double.valueOf(num2) ;
        
        return Math.pow(Double.valueOf(numAux1), Double.valueOf(numAux2));
        
        
    }*/
    
    
    //================Historico================
    public String emitirHistorico(String historico) throws Exception{
        //criar arquivo e escritor
        try {
            
            FileWriter escritor = new FileWriter("C:\\Users\\%USERPROFILE%\\Desktop\\Historico de Números.txt");
            String LocalDate = null;
            escritor.write("==========Histórico de Operações==========\n" + LocalDate);
            
            //escritor.append é para adicionar Strings,variaveis ou textos no final.
            escritor.append(LocalDate+"\n"+historico+"\n");
            escritor.close();
            
        } catch (Exception e) {
          
            e.printStackTrace();
   
       
        }
        return null;
    }
}
   
    
    
  

