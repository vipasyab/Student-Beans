package com.studentbeans.config;

import java.io.FileInputStream;
import java.util.Properties;

public class PropLoader {

  public static Properties loadProps(String filename) {
    try {
      FileInputStream fs = new FileInputStream(filename);
      Properties prop = new Properties();
      prop.load(fs);
      return prop;
    } catch (Exception e) {
      throw new RuntimeException("Failed to load props from path " + filename);
    }
  }
}
