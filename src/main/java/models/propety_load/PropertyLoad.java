package models.propety_load;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoad {
    public static String loadAPropetyFile(String propety) {
        try (InputStream input = new FileInputStream("src/main/java/models/propety_load/property")) {

            Properties prop = new Properties();

            prop.load(input);

            String getDriverFromFile = prop.getProperty(propety);
            return getDriverFromFile;

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
