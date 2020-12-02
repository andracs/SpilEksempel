/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/12/2020
 */
package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Filehandling {

    public void save(Spildata spildata) throws IOException {
        File file = new File("spildata.txt");
        PrintWriter output = new PrintWriter(file);
        // Nu skal vi bare skrive data
        output.println(spildata.a);
        output.println(spildata.b);
        output.println(spildata.c);
        // Når du lukker filen, så gemmes det
        output.close();
    }

    public Spildata load() throws FileNotFoundException {
        File file = new File("spildata.txt");
        Scanner input = new Scanner(file);
        Spildata spildata = new Spildata();
        spildata.a = input.next();
        spildata.b = input.next();
        spildata.c = input.next();
        return spildata;
    }

}
