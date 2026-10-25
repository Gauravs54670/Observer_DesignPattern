package in.gaurav;

public interface Channel {

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void uploadVideo(String title);

}
