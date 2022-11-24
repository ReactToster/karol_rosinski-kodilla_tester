package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServiceTest {
    private WeatherNotificationService weatherNotificationService;
    private User user;
    private User user2;
    private User user3;
    private Notification notification;
    private Localization localization;
    private Localization localization2;

    @BeforeEach
    public void setUp() {
        weatherNotificationService = Mockito.spy(new WeatherNotificationService());
        user = Mockito.mock(User.class);
        user2 = Mockito.mock(User.class);
        user3 = Mockito.mock(User.class);
        notification = Mockito.mock(Notification.class);
        localization = Mockito.mock(Localization.class);
        localization2 = Mockito.mock(Localization.class);

        weatherNotificationService.addLocalization(localization);
        weatherNotificationService.addLocalization(localization2);
    }

    @Test
    public void userShouldAbleToSubscribeToLocalization() {
        weatherNotificationService.subscribeToLocalization(localization, user);

        Mockito.verify(weatherNotificationService).subscribeToLocalization(localization, user);
    }

    @Test
    public void subscribedToLocalizationShouldBeNotified() {
        weatherNotificationService.subscribeToLocalization(localization, user);
        weatherNotificationService.subscribeToLocalization(localization2, user2);
        weatherNotificationService.sendToUsersSubscribedToLocalization(localization, notification);
        weatherNotificationService.sendToUsersSubscribedToLocalization(localization2, notification);

        Mockito.verify(user, Mockito.times(1)).receive(notification);
        Mockito.verify(user2, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedToLocalizationShouldNotBeNotified() {
        weatherNotificationService.subscribeToLocalization(localization2, user);
        weatherNotificationService.sendToUsersSubscribedToLocalization(localization, notification);
        Mockito.verify(user, Mockito.never()).receive(notification);
    }

    @Test
    public void subscribedToAnyLocalizationShouldReceiveNotificationForAll() {
        weatherNotificationService.subscribeToLocalization(localization, user);
        weatherNotificationService.subscribeToLocalization(localization, user2);
        weatherNotificationService.subscribeToLocalization(localization2, user3);

        weatherNotificationService.sendToAll(notification);

        Mockito.verify(user, Mockito.times(1)).receive(notification);
        Mockito.verify(user2, Mockito.times(1)).receive(notification);
        Mockito.verify(user3, Mockito.times(1)).receive(notification);
    }

    @Test
    public void afterUnsubscribingUserShouldNotGetNotificationForLocalization() {
        weatherNotificationService.subscribeToLocalization(localization, user);
        weatherNotificationService.unsubscribeFromLocalization(localization, user);
        weatherNotificationService.sendToUsersSubscribedToLocalization(localization, notification);

        Mockito.verify(user, Mockito.never()).receive(notification);
    }

    @Test
    public void userWhichUnsubscribedToEveryLocalizationShouldNotGetNotificationForAll() {
        weatherNotificationService.subscribeToLocalization(localization, user);
        weatherNotificationService.subscribeToLocalization(localization2, user);

        weatherNotificationService.unsubscribeFromAll(user);

        weatherNotificationService.sendToAll(notification);

        Mockito.verify(user, Mockito.never()).receive(notification);
    }

    @Test
    public void testRemoveLocalization() {
        weatherNotificationService.removeLocalization(localization);

        Mockito.verify(weatherNotificationService, Mockito.times(1)).removeLocalization(localization);
    }

    @Test
    public void testAddLocalization() {
        Mockito.verify(weatherNotificationService, Mockito.times(1)).addLocalization(localization);
    }
}