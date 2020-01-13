package mediator_pattern_solution;

import java.util.ArrayList;
import java.util.List;

public class LearnAndShareGroup implements SocialMediaGroup {

    private List<Subscriber> subscribers;

    public LearnAndShareGroup() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void sendMessage(String msg, Subscriber subscriber) {
        this.subscribers.stream().forEach(subscriber1 -> {
            if (subscriber1 != subscriber) {
                subscriber1.receive(msg);
            }
        });
    }
}
