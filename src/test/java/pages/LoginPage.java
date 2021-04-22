package pages;

import commonUtilities.ConfigFileReader;
import org.openqa.selenium.By;
import static webUtilities.WebControls.*;

public class LoginPage {

    ConfigFileReader configFileReader = new ConfigFileReader();

    int minWait = configFileReader.getMinWait();
    By userName = By.id("user_name");
    By password = By.id("user_password");
    By login = By.id("sysverb_login");
    String frameName = "gsft_main";

    public void switchToFrame(){
        switchToIframe(frameName, minWait);
    }
    public boolean enterUserName(String user){
        return safeEnterValue(userName, user, minWait);
    }

    public boolean enterPassword(String pass){
        return safeEnterValue(password, pass, minWait);
    }

    public boolean clickLogin(){
        return safeClickElement(login, minWait);
    }

    public boolean validatePageTitle(String title){
        return title.equals(getPageTitle());
    }

}
