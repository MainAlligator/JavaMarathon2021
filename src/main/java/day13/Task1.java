package day13;

public class Task1 {
    public static void main(String[] args) {

        User user = new User("Petya");
        User user1 = new User ("Vovan");
        User user2 = new User ("Mykola");

        user.sendMessage(user1,"Привет братан!");
        user1.sendMessage(user,"И тебе не болеть!");
        user.sendMessage(user1,"Может на районе стрелканемся?");
        user1.sendMessage(user,"А Мыкола будет?");
        user.sendMessage(user1, "Давай его наберу.");
        user.sendMessage(user2, "Брат как ты?");
        user.sendMessage(user2, "Давай надо перетереть!");
        user2.sendMessage(user,"О Брат не могу, сейчас еще на работе завис");
        user.sendMessage(user1,"Мыкола соскачил, давай вдвоем");
        user1.sendMessage(user,"Давай до встречи!");

        MessageDataBase.showDialog(user,user1);

    }
}
