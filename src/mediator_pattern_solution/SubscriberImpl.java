package mediator_pattern_solution;

public class SubscriberImpl extends Subscriber {


    public SubscriberImpl(SocialMediaGroup socialMediaGroup, String subscriberName) {
        super(socialMediaGroup, subscriberName);
    }

    @Override
    public void send(String message) {
        System.out.println(this.subscriberName + " Shared new article on " + message);
        socialMediaGroup.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.subscriberName + " There is a new article available on " + message);
    }
}
