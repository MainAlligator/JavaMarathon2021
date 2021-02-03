package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDataBase {
    private static List<Message> messages = new ArrayList<>();


    public static void addNewMessage(User u1, User u2, String text) {

        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {

        return messages;
    }

    public static void showDialog(User u1, User u2) {

        for (Message message : messages) {
            if ((message.getSender().getUsername().equals(u1.getUsername()) && message.getReceiver().getUsername().equals(u2.getUsername())) ||
                    message.getSender().getUsername().equals(u2.getUsername()) && message.getReceiver().getUsername().equals(u1.getUsername()))
                System.out.println(message.getText());
        }
    }
}
