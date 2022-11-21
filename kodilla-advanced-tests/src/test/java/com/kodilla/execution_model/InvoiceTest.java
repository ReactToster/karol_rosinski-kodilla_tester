package com.kodilla.execution_model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTest {
    private Invoice invoice;

    @BeforeEach
    public void setUpInvoice() {
       invoice = new Invoice();
       invoice.addItem(new Item("Bike", 800.99));
       invoice.addItem(new Item("Mountain Bike", 1200.99));
       invoice.addItem(new Item("Super Bike", 2000.99));
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @Test
    public void shouldChangeItsSizeAfterAddingOneItem() {
        // given
        // when
        // then
        assertEquals(3, invoice.getSize());
    }

    @Test
    public void shouldReturnCorrectItemByIndex() {
        // given
        // when
        // then
        assertEquals("Super Bike", invoice.getItem(2).getName());
        assertEquals(2000.99, invoice.getItem(2).getPrice());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 99999})
    public void shouldReturnNullWithIndexOutOfBounds(int index) {
        assertNull(invoice.getItem(index));
    }

    @Test
    public void shouldHaveSizeOf0AfterRemovingAllElements() {
        // given
        // when
        invoice.clear();
        // then
        assertEquals(0, invoice.getSize());
    }
}