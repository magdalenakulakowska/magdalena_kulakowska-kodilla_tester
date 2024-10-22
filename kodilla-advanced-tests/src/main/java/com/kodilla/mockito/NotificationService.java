package com.kodilla.mockito;

import java.util.Set;
import java.util.HashSet;


public class NotificationService {

    private Set<Client> clients = new HashSet<>();

    public void addSubscriber(Client client) {
        this.clients.add(client);
    }

    public void sendNotification(Notification notification) {
        this.clients.forEach(client -> client.receive(notification));
    }

    public void removeSubscriber(Client client) {
        this.clients.remove(client);
    }
}
