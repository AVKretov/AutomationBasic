package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(900, service.remain(100));
    }

    @Test
    public void testRemainOneRuble() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(999, service.remain(1));
    }

    @Test
    public void testRemainNineNineNine() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(1, service.remain(999));
    }
    @Test
    public void testBigDeal() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000));
    }

}