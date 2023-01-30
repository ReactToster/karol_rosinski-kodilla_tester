package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class MacOsTest {

    private MacOs mockMacOs;

    @BeforeEach
    void setUp() {
        mockMacOs = mock(MacOs.class);
    }

    @Test
    void turnOn() {
        mockMacOs.turnOn();
        verify(mockMacOs, times(1)).turnOn();
    }

    @Test
    void turnOff() {
        mockMacOs.turnOff();
        verify(mockMacOs, times(1)).turnOff();
    }
}