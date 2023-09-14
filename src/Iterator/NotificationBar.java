package Iterator;

public class NotificationBar {
    NotificationCollection notifications;

    public NotificationBar (){
        this.notifications= new NotificationCollection();
    }
    public void printNotification(){
        Iterator iterator= notifications.createIterator();
        System.out.println("------------------NOTIFICATION BAR---------------");
        while (iterator.hasNext()){
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
