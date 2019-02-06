/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlstatictodynamicconventer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kuba
 */

public class Site{
    private File source;
    private String text;
    private String name; //po chuj ta zmienna?
    public  Scanner reader = new Scanner(System.in);
    
    
    //                                  i jeszcze String name;
    public Site(File source, String text)
    {
        this.source = source;
        this.text = text;
        //this.name = name;
    }
    
    //pusty konstruktor obiektu
    public Site()
    {
    }
    
    
    
    /*
    Metody utworzone pod przyszle modyfikacje
    I ulepszenia
    !Teraz na to nie zwracac uwagi!
    */
    public File getSource()
    {
        return source;
    }
    public String getText()
    {
        return text;
    }
    public String getName()
    {
        return name;
    }
    
    
    //Tworzy nowy plik, nadaje mu nazwe, nazwa to String name w naglowoku, zawrzec to jako parametr obieku?
    //W sumie dobre ale metode setName wypierdolic
    public void setFile() throws IOException
    {

        System.out.println("Podaj nazwe dla pliku\n");
        name = reader.nextLine();
        this.source = new File(name+".html");
        
        //nFile.createNewFile();
        //source = nFile;
    }
    public void setText() throws FileNotFoundException
    {
        String nText;
        PrintWriter save = new PrintWriter(source);
        System.out.println("Podaj tekst dla witryny");
        nText = reader.nextLine();
        save.println(nText);
        this.text = nText;
        save.close();
    }
    
    
    
    //Po chuj to? Nazwe pliku zawierasz w metodzie setFile kretynie! Chyba ze naglowek tekstu
    //to zmien ta funkcje na cos godnego i dodaj jakas zmienna private hm
    public void setName(String nName)
    {
        this.name = nName;
    }
}
