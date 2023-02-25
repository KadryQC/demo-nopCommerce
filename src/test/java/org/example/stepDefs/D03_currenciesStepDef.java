package org.example.stepDefs;

import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();
    public void userClickOnDropDownList(){
        homePage.dropDownList();

    }
    public void assertSymbol(){
     homePage.assertChanged();
    }

}
