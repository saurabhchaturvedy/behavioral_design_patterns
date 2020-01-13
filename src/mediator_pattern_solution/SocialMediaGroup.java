package mediator_pattern_solution;

public interface SocialMediaGroup {

    void addSubscriber(Subscriber subscriber);

    void sendMessage(String message, Subscriber subscriber);
}
