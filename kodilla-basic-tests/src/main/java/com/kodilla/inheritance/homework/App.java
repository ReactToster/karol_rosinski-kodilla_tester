package com.kodilla.inheritance.homework;

public class App {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem(0);
        os.turnOn();
        os.turnOff();

        Windows win = new Windows(1985);
        win.turnOn();
        win.turnOff();

        MacOs mac = new MacOs(2000);
        mac.turnOn();
        mac.turnOff();
    }
}
