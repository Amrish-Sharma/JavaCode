
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtractData {
    public static void main(String args[]) throws Exception {

        // Date date = new Date();
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println(timeStamp);
        FileReader fr = new FileReader("avlfiles.txt");
        FileWriter fw = new FileWriter("newfile3.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String line;
        boolean start = false;

        while ((line = br.readLine()) != null) {
            if (start) {

                if (line.contains("</cXML>")) {
                    String footer = line;
                    bw.write(footer);
                    break;
                }

                bw.write(line + "\n");
            } else {
                start = line.contains("<?xml");

                if (line.contains("<?xml")) {
                    String header = line;
                    bw.write(header);
                    bw.write("\n");

                }
            }

        }
        br.close();
        bw.close();

    }
}
