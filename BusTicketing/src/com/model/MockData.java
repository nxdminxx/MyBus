package com.model;

import java.util.ArrayList;
import java.util.List;
import com.model.User;
import com.model.Bus;

public class MockData {
	private static List<User> userList = generateMockUsers();
    private static List<Bus> busList = generateMockBuses();
    // Add other data as needed

    // Generate mock user data
    public static List<User> generateMockUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("user1", "pwd", null));
        userList.add(new User("user2", "pwd", null));
        // Add more users as needed
        return userList;
    }

    // Generate mock bus data
    public static List<Bus> generateMockBuses() {
        List<Bus> busList = new ArrayList<>();
        busList.add(new Bus(1, "Johor", "Perak", 50.0, "09:00 AM"));
        busList.add(new Bus(2, "Johor", "Terengganu", 80.0, "10:30 AM"));
        busList.add(new Bus(3, "Tun Aminah", "TBS", 30.0, "1:30 PM"));
        // Add more buses as needed
        return busList;
    }

    public static List<Bus> getBusList(String origin, String destination) {
        List<Bus> filteredBuses = new ArrayList<>();

        for (Bus bus : busList) {
            if (bus.getOrigin().equalsIgnoreCase(origin) && bus.getDestination().equalsIgnoreCase(destination)) {
                filteredBuses.add(bus);
            }
        }

        return filteredBuses;
    }

    public static void addBus(Bus newBus) {
        // Add the new bus to the list
        busList.add(newBus);
    }

    public static int getNextBusId() {
        // Find the maximum bus ID and return the next available ID
        int maxId = 0;
        for (Bus bus : busList) {
            if (bus.getId() > maxId) {
                maxId = bus.getId();
            }
        }
        return maxId + 1;
    }

}