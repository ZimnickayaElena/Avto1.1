package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testBeforeLimitRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testLimitRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testAboveLimitRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;

        int expected = 800;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }
}