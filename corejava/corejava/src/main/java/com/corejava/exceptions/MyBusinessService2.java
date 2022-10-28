package com.corejava.exceptions;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintWriter;

public class MyBusinessService2 {

    public void trigger() throws FileNotFoundException, IllegalAccessException,IllegalArgumentException {
        run();
        run2("abcd");
    }

    public void run() throws FileNotFoundException {
        File file = new File("c:/abcd.txt");
        if (file.exists()) {
            PrintWriter pw = null;
            pw = new PrintWriter(file);
            pw.print("data");
            pw.close();
        }
    }

    public Boolean run2(String value) throws IllegalAccessException,IllegalArgumentException {
        if (value.equalsIgnoreCase("")) {
            throw new IllegalAccessException("In Valid Data");
        }
        
        if (value.equalsIgnoreCase("dell")) {
            throw new IllegalArgumentException("Invalid Input");
        }

        return true;
    }

    public static void main(String[] args) {
        try {
            new MyBusinessService2().trigger();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            //i might recreate thefile
            //send alert to adming
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            //just logg it
        } catch(IllegalArgumentException iarge) {
            iarge.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            
        }

    }

}
