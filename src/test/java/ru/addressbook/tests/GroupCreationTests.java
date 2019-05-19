package ru.addressbook.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation(){
        app.getNavigationHelper().gotoGroupPage(By.linkText("groups"));
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test1", "test1"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }


}
