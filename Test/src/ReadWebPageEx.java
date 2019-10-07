

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadWebPageEx {

    public static void main(String[] args) throws MalformedURLException, IOException {

        BufferedReader br = null;

        try {

            URL url = new URL("https://wawalove.wp.pl/");
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null )  {
            	
            	if (line.contains("<link rel=\"dns-prefetch\" href=")) {
            		
                String str = line.substring(41, (line.length()-4));
                sb.append(str);
                sb.append(System.lineSeparator());
            }}

            System.out.println(sb);
        } finally {

            if (br != null) {
                br.close();
            }
        }
    }

}