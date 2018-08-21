package generic;

import org.testng.Assert;

public class Helper {


    public static String getOS() {
        String osName = System.getProperty("os.name");
        String osNameMatch = osName.toLowerCase();
        String osType;
        if (osNameMatch.contains("linux")) {
            osType = "linux";
        } else if (osNameMatch.contains("windows")) {
            osType = "windows";
        } else if (osNameMatch.contains("mac os") || osNameMatch.contains("macos")) {
            osType = "macos";
        } else {
            osType = "NAN";
        }
        return osType;
    }

    public static void setChromeBrowserAsPerEnvironment() {
        if (getOS().equalsIgnoreCase("windows")) {
            System.setProperty("webdriver.chrome.driver", BaseSetup.class.getClassLoader().getResource("chromedriver.exe").getFile());
        } else if (getOS().equalsIgnoreCase("linux")) {
            System.setProperty("webdriver.chrome.driver", BaseSetup.class.getClassLoader().getResource("chromedriver_linux64").getFile());
        } else if (getOS().equalsIgnoreCase("macos")) {
            System.setProperty("webdriver.chrome.driver", BaseSetup.class.getClassLoader().getResource("chromedriver_macos").getFile());
        } else {
            Assert.fail("Couldn't configure appropriate driver for environment");
        }
    }

}
