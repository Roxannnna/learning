package com.roxannnna.learning.frame;

import java.io.*;

public class FileSaver {

    public static final String FIlE_SAVER_PATH = "C:\\Users\\roxys\\FileSaver.txt";

    public void save(Person person) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new FileOutputStream(
                new File(FIlE_SAVER_PATH),
                true /* append = true */));
        out.append(person.toString());
        out.append("\r\n");
        out.close();
    }
}
