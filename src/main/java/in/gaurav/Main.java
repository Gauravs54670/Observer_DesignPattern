package in.gaurav;

public class Main {
    public static void main(String[] args) {

        Channel channel = new ChannelImplementation("CoderArmy-Yt");
        Subscriber s1 = new SubscriberImplementation("Gaurav Soni");
        Subscriber s2 = new SubscriberImplementation("Garima Soni");

        channel.addSubscriber(s1);
        channel.addSubscriber(s2);

        channel.uploadVideo("Spring-Boot video-4");

        channel.removeSubscriber(s1);

        channel.uploadVideo("Spring-Boot video-5");

    }
}
