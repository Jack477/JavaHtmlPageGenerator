/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlstatictodynamicconventer;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author Kuba
 */
public class HTMLStaticToDynamicConventer {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws FileNotFoundException, IOException{
        // TODO code application logic here
        int num;
        Scanner reader = new Scanner(System.in);
        //String aName, aText;
        //File aFile;
        //Site strona;
        
        //Utworzenie nowego pliku
        /*System.out.println("Podaj nazwe dla pliku\n");
        aName = reader.nextLine();
        aFile = new File(aName+".html", "UTF-8");
        */
        
        //Sprawdzenie czy plik juz istnieje
       /* if(aFile.exists() == true)
        {
            System.out.println("Taki plik juz istnieje!");
        }
        
        
        
        else {
            
        PrintWriter save = new PrintWriter(aFile);
        System.out.println("Podaj tekst dla witryny");
        aText = reader.nextLine();
        
        save.println("Test " + aText);
        
        strona = new Site(aFile, aText, aName);
        }
    */
    //Przejscie na metode obiektowa tj utworzenie tablicy x obiektow Site o rozmiarze okreslonym przez uzytkownika :D zobacz zmiany w Site.java
   
    
    Site tabs[];
    System.out.println("Ile obiektow chcesz utworzyc?");
    num = reader.nextInt();
    tabs = new Site[num];
    for(int i = 0; i<tabs.length; i++)
    {
        Site page = new Site();
        page.setFile();
        page.setText();
        tabs[i] = page;
        
    }
    
    }
}
