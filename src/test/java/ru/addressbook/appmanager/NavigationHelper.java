package ru.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper extends HelperBase{
    public NavigationHelper(ChromeDriver wd) {
        super(wd);
    }

    public void gotoGroupPage(By link) {
        click(link);
    }

    public void gotoHomePage() {
        click(By.linkText(""));
    }
}
