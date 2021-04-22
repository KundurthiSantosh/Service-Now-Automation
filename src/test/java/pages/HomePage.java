package pages;

import commonUtilities.ConfigFileReader;
import org.openqa.selenium.By;
import static webUtilities.Sync.*;
import static webUtilities.WebControls.*;

public class HomePage {

    ConfigFileReader configFileReader = new ConfigFileReader();

    int minWait = configFileReader.getMinWait();

    By filter = By.id("filter");
    By incidentTab = By.xpath("//span[text()='Incident']/parent::a");
    By allIncidents = By.xpath("//span[text()='Incident']/parent::a/following-sibling::ul/li[6]/div/div/a/div/div");

    public boolean isFilterAvailable(){
        return isElementPresent(filter, minWait);
    }

    public boolean clickIncidentTab(){
        pageScrollUntilElementIsVisible(incidentTab, minWait);
        return safeClickElement(incidentTab, minWait);
    }

    public boolean clickAllIncidents(){
        pageScrollUntilElementIsVisible(allIncidents, minWait);
        return safeClickElement(allIncidents, minWait);
    }

}
