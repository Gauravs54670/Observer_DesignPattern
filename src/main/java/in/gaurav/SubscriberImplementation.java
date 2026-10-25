package in.gaurav;

public class SubscriberImplementation implements Subscriber{

    private final String subscriberName;

    public SubscriberImplementation(String name) {
        this.subscriberName = name;
    }
    @Override
    public void update(String latestVideo, String channelName) {
        System.out.println(
                "Hey " + subscriberName +"\n" + channelName + " uploaded " + latestVideo
        );
    }
}
