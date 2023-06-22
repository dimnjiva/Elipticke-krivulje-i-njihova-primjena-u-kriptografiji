package eliptickekrivulje.fileRW;

import eliptickekrivulje.domene.ECIESPoruka;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadECIESPoruka {

    public static ECIESPoruka readECIESMessage(File file) {

        ECIESPoruka eciesMessage = new ECIESPoruka();

        String line = null;
        String m = null;
        String r = null;
        try {

            FileReader fileReader = new FileReader(file);

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

            eciesMessage.setMessage(m);
            eciesMessage.setR(r);

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

        return eciesMessage;
    }
}