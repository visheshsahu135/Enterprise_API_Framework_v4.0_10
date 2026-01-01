package config;

public class ConfigManager {

 public static String getBaseUrl() {
  String env = System.getProperty("env", "QA");

  switch (Environment.valueOf(env)) {
   case UAT:
    return "https://dummyjson.com";
   case PROD:
    return "https://dummyjson.com";
   default:
    return "https://dummyjson.com";
  }
 }
}
