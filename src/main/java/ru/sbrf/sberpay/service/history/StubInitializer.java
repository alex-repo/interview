package ru.sbrf.sberpay.service.history;

public interface StubInitializer {

    Map<String, SberPayConnect> initialize(String xmlPath, ...);
}
