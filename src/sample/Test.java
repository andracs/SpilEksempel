/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 02/12/2020
 */
package sample;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        Spildata spildata = new Spildata();
        spildata.a = "Hest";
        spildata.b = "Ost";
        spildata.c = "Pølse";
        Filehandling filehandling = new Filehandling();
        filehandling.save(spildata);
    }
}
