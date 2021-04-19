package commonUtilities;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

public class YamlReader {
    ConfigFileReader config = new ConfigFileReader();

    @SuppressWarnings("unchecked")
    public Map<String, Map<String, Object>> loadYaml(String userCode, String file){
        InputStream input;
        Map<String, Map<String, Map<String, Object>>> data = null;
        try{
            input = new FileInputStream(new File(config.getTestDataPath() + file));
            Yaml yaml = new Yaml();
            data = (Map<String, Map<String, Map<String, Object>>>) yaml.load(input);
            input.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(data.get(userCode) == null)
            return null;
        return data.get(userCode);
    }
}
