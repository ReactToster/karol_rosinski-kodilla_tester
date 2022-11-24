package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {
    Map<Localization, Set<User>> localizationUserMap = new HashMap<>();

    public void sendToAll(Notification notification) {
        localizationUserMap.forEach(
                (localization, users) -> users.forEach(user -> user.receive(notification))
        );
    }

    public void sendToUsersSubscribedToLocalization(Localization localization, Notification notification) {
        localizationUserMap.get(localization).forEach(user -> user.receive(notification));
    }

    public void addLocalization(Localization localization) {
        localizationUserMap.put(localization, new HashSet<>());
    }

    public void removeLocalization(Localization localization) { localizationUserMap.remove(localization); }

    public void subscribeToLocalization(Localization localization, User user) { localizationUserMap.get(localization).add(user); }

    public void unsubscribeFromLocalization(Localization localization, User user) { localizationUserMap.get(localization).remove(user); }

    public void unsubscribeFromAll(User user) {
        localizationUserMap.forEach((localization, users) -> users.remove(user));
    }
}
