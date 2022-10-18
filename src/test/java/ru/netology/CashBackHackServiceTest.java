package ru.netology;


import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain900() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void testRemain1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain1100() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}