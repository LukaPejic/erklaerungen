
package com.gtsoffenbach.erklaerungen;

/**
 * @version 1.0-Snapshot
 * @author LukaP
 */

//Hier wird es relevant
//Das wird die UI Klasse
public class UserInterface {
    //Die UI macht nichts anderes außer Klassen aufzurufen und aus deren ein Objekt zu erstellen
    //In Unserem Beispiel werden attribute "att" genannt und operationen "ops"
    
   //Die UI besitzt auch die EINZIGE Main-Methode
   public static  void main (String [] args){
    /**
     * Normalerweise wird die UI als letztes geschrieben, also wenn man alle Klassen hat. Komm später wieder zurück
     * Wir werden insgeasmt 2 Klassen (abgesehen der UI haben, es ist egal welche davon du dir zu erst anschaust und welche am Ende  
     * Empfohlen Reinfolge: Klassen 1, 2, UI
     */
        Klasse1 objektAusK1 = new Klasse1();
        objektAusK1.getAtt1(3851); //Hier kannst du dann deine Zahl ein geben
        objektAusK1.setAtt1(0);
        
        Klasse2 objektAusK2 = new Klasse2();
        objektAusK2.datentypIntAbFrage();
        objektAusK2.intScanner();
    }
}
//Klasse1 = Getter und Setter
//Klasse2 = Scanner und try-catch
