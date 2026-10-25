package in.gaurav;

import java.util.ArrayList;
import java.util.List;

public class ChannelImplementation implements Channel{

    private final List<Subscriber> subscribers = new ArrayList<>();
    private String latestVideo;
    private final String channelName;
    public ChannelImplementation(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        if(!subscribers.contains(subscriber))
            subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void uploadVideo(String title) {
        latestVideo = title;
        notifySubscribers();
    }
    private void notifySubscribers(){
        for(Subscriber s : subscribers)
            s.update(latestVideo, channelName);
    }
}
