package com.spreada.utils.chinese;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZHConverterTest {

    @Test
    public void testTraditionalToSimplified() throws Exception {
        String simplifiedStr = ZHConverter.convert("有背光的機械式鍵盤", ZHConverter.SIMPLIFIED);
        assertEquals("有背光的机械式键盘", simplifiedStr);
    }

    @Test
    public void testSimplifiedToTraditional() throws Exception {
        String simplifiedStr = ZHConverter.convert("有背光的机械式键盘", ZHConverter.TRADITIONAL);
        assertEquals("有背光的機械式鍵盤", simplifiedStr);
    }

}