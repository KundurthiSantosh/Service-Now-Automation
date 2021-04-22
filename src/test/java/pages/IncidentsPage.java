package pages;

import commonUtilities.ConfigFileReader;
import org.openqa.selenium.By;
import static webUtilities.Sync.*;
import static webUtilities.WebControls.*;

public class IncidentsPage {

    ConfigFileReader configFileReader = new ConfigFileReader();

    int minWait = configFileReader.getMinWait();
    By searchBox = By.xpath("//span[@id='incident_hide_search']//input[@placeholder='Search']");
    By searchResults = By.xpath("//table[@id='incident_table']//tbody/tr");
    By incidentNumber = By.xpath("//table[@id='incident_table']//tbody/tr/td[3]/a");
    String frameName = "gsft_main";

    public void switchToFrame(){
        switchToIframe(frameName, minWait);
    }

    public boolean searchIncident(String incidentId){
        return safeEnterValue(searchBox, incidentId, minWait);
    }

    public void clickEnterKey(){
        sendEnterKey(searchBox);
    }

    public int getResultsCount(){
        return getListofElements(searchResults, minWait).size();
    }

    public boolean incidentNumberMatch(String incNum){
        return incNum.equals(safeGetText(incidentNumber, minWait));
    }
}
