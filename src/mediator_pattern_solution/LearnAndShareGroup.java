package mediator_pattern_solution;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LearnAndShareGroup implements SocialMediaGroup {

    private List<Subscriber> subscribers;

    public LearnAndShareGroup() {
        this.subscribers = new ArrayList<>();
    }

    BiPredicate<Subscriber, Subscriber> isNotSenderHimself = (subscriber1, subscriber2 )-> subscriber1 != subscriber2;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void sendMessage(String msg, Subscriber subscriber) {
        this.subscribers.stream().forEach(subscriber1 -> {
            if (isNotSenderHimself.test(subscriber1,subscriber)) {
                subscriber1.receive(msg);
            }
        });
    }
}
