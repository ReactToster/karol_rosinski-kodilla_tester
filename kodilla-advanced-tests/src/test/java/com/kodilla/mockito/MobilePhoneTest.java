package com.kodilla.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MobilePhoneTest {
    private MobilePhone mobilePhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(mobilePhone.needsCharging());
        Assertions.assertEquals(0.0, mobilePhone.getFreeStorage());
    }

    @Test
    public void testExpectation() {
        Assertions.assertFalse(mobilePhone.needsCharging());
        Mockito.when(mobilePhone.needsCharging()).thenReturn(true);
        Assertions.assertTrue(mobilePhone.needsCharging());
    }

    @Test
    public void shouldCallLaunchApplication() {
        mobilePhone.launchApplication("myApp");
        Mockito.verify(mobilePhone).launchApplication("myApp");
    }
}