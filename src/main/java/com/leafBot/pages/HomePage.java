package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage clickLogout() {
		click(locateElement("class","decorativeSubmit"));
		return new HomePage();
	}

}
