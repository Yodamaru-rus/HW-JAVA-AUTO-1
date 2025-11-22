package ru.netology.service;


import org.junit.Test;
import org.junit.Assert;

import org.junit.jupiter.api.Assertions;


public class CashbackHackServiceTest {
    @Test
    public void testPositiveUnderThousand() {

        int amount = 550;
        CashbackHackService service = new CashbackHackService();
        int expected = 450;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPositiveMoreThousand() {

        int amount = 2345;
        CashbackHackService service = new CashbackHackService();
        int expected = 655;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPositiveThousand() {

        int amount = 2000;
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNegative() {

        int amount = -2345;
        CashbackHackService service = new CashbackHackService();
        int expected = 1345;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    //junit 5

    @org.junit.jupiter.api.Test
    public void testPositiveUnderThousand1(){

        int amount = 550;
        CashbackHackService service = new CashbackHackService();
        int expected = 450;
        int actual =  service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testPositiveMoreThousand1(){

        int amount = 2345;
        CashbackHackService service = new CashbackHackService();
        int expected = 655;
        int actual =  service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testPositiveThousand1(){

        int amount = 2000;
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual =  service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testNegative1(){

        int amount = -2345;
        CashbackHackService service = new CashbackHackService();
        int expected = 1345;
        int actual =  service.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

}