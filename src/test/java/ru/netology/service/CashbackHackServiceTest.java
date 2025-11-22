package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testFirst(){

        int amount = 550;
        CashbackHackService service = new CashbackHackService();
        int expected = 450;
        int actual =  service.remain(amount);
        assertEquals(actual, expected);
    }
}
