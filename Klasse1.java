
package com.gtsoffenbach.erklaerungen;

/**
 * 
 * @author LukaP
 */
public class Klasse1 {
    
    //Hier werden jetzt die Attribute, also das was unten im UML-Klassendiagramm sind programmiert
    private int att1, att3; //private "-"
    public String att2; //public "+"
    
    //Es reicht, alle aufzulisten (keine reinfolge nötig)
    
    //Hier werden jetzt die Operationen, also das was unten im UML-Klassendiagramm sind programmiert
    //Wir starten mit dem Default-Konstruktor, er wird genauso wie die Klasse benannt
    public void Klasse1(){
    System.out.println("DefaultKonstruktor der Klasse 1");
    }
    //Jetzt folgen die operationen des Klassendiagramms (keine reinfolge nötig)
    public int getAtt1(int att1){
      System.out.println(att1);
      return att1;
    }
    public void setAtt1(int att3){
       att1 = att3;
    } 
}
