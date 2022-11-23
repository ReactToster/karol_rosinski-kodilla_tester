package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServiceTest {
    private WeatherNotificationService weatherNotificationService;
    private User user;
    private Notification notification;
    private Localization localization;

    @BeforeEach
    public void setUp() {
        weatherNotificationService = new WeatherNotificationService();
        user = Mockito.mock(User.class);
        notification = Mockito.mock(Notification.class);
        localization = Mockito.mock(Localization.class);
        weatherNotificationService.addLocalization(localization);
    }

    @Test
    public void userShouldAbleToSubscribeToLocalization() {
        weatherNotificationService.subscribeToLocalization(localization, user);
    }

    @Test
    public void SubscribedToLocalizationShouldBeNotified() {
        weatherNotificationService.subscribeToLocalization(localization, user);
        weatherNotificationService.sendToUsersSubscribedToLocalization(localization, notification);
        Mockito.verify(user, Mockito.times(1)).receive(notification);
    }
}