package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest extends TestCase {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(100), 900);
    }
    @Test
    public void testRemainOneRuble() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1), 999);
    }
    @Test
    public void testRemainOneThousand() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1000), 0);
    }
    @Test
    public void testNineNineNine() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(999), 1);

    }
}