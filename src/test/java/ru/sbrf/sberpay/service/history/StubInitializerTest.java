package ru.sbrf.sberpay.service.history;


import java.util.Map;

public class StubInitializerTest {

    @Test
    public void initializeTest(){
        Map<String,SberPayConnect> map = initialize("...SberPayConnectStorage.xml",....);
    }
}