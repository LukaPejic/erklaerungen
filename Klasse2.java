package com.gtsoffenbach.erklaerungen;

/**
 *
 * @author LukaP
 */
import java.util.Scanner;
public class Klasse2 {
    //Att
    public int att4, att5, att7;
    public String att6;
  
    //Ops
    public void intScanner(){
    Scanner nameDScanners = new Scanner(System.in);
    System.out.print("Eingabe des int: ");
    att4 = nameDScanners.nextInt();
    System.out.println(att4);
}

     public void datentypIntAbFrage(){
     
    Scanner stringEingabe = new Scanner(System.in);
    System.out.print("Eingabe: ");
    try{
       att6 = stringEingabe.nextLine();
       int att5 = Integer. parseInt(att6);
       System.out.println("Ja, " + att6 + " ist ein int");
    }catch(NumberFormatException er){
       System.out.println("NEIN, " + att6 + " ist KEIN int");
    }
    }
}

    
    

