package ravi_intellij;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class RemoveBlankLines {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name");
        String srcfile = sc.nextLine();
        Path src = Paths.get(srcfile);
        BufferedReader br = Files.newBufferedReader(src);

        Path trg = Paths.get("tempfile.txt");
        BufferedWriter bw = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);
        while (true){
            String line = br.readLine();
            if(line==null)
                break;
            if(line.length()>0){
                bw.write(line + "\n");
            }
            bw.close();
            br.close();
            Files.move(trg,src, StandardCopyOption.REPLACE_EXISTING);
        }
        sc.close();
    }
}
