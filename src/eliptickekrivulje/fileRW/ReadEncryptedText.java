package eliptickekrivulje.fileRW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadEncryptedText {

    public static String readEcnryptionTxt(File file, int option) {

        String encrypt = "";

        if (option == 0) {

            String line = null;
            try {
                FileReader fileReader = new FileReader(file);
                String ss = null;
                String r = null;
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int readCount = 2;
                while ((line = bufferedReader.readLine()) != null) {
                    switch (readCount) {
                        case 2:
                            ss = line;
                            readCount--;
                            break;
                        case 1:
                            r = line;
                            readCount--;
                            break;
                        default:
                            break;
                    }
                }

                encrypt = ss;
                bufferedReader.close();
            } catch (FileNotFoundException ex) {
                System.out.println(
                        "Unable to open file '"
                        + file + "'");
            } catch (IOException ex) {
                System.out.println(
                        "Error reading file '"
                        + file + "'");
            }

        } else {

            String line = null;
            try {

                FileReader fileReader = new FileReader(file);
                String m = null;
                String r = null;
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                int readCount = 2;
                while ((line = bufferedReader.readLine()) != null) {
                    switch (readCount) {
                        case 2:
                            m = line;
                            readCount--;
                            break;
                        case 1:
                            r = line;
                            readCount--;
                            break;
                        default:
                            break;
                    }
                }

                encrypt = m;

                bufferedReader.close();
            } catch (FileNotFoundException ex) {
                System.out.println(
                        "Unable to open file '"
                        + file + "'");
            } catch (IOException ex) {
                System.out.println(
                        "Error reading file '"
                        + file + "'");
            }
        }

        return encrypt;

    }

}