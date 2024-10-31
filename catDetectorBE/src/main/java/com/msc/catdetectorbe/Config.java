package com.msc.catdetectorbe;


import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Michael
 */
public class Config {

    private int port;
    private String bddName;
    
    private static Config config;

    public static Config getInstance() {
        if (config == null) {
            init();
        }
        return config;
    }

    public static void init() {
        init(new File("conf.conf"));
    }
    
    public static void init(File confFile) {
        Gson gson = new Gson();
        String conf = "";
        try {
            conf = FileUtils.readFileToString(confFile, Charset.forName("UTF-8"));
        } catch (IOException ex) {
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE, null, ex);
        }
        config = gson.fromJson(conf, Config.class);
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getBddName() {
        return bddName;
    }

    public void setBddName(String bddName) {
        this.bddName = bddName;
    }

  

}
    