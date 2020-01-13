package mediator_pattern_solution;

public abstract class Subscriber {

    protected SocialMediaGroup socialMediaGroup;
    protected String subscriberName;

    public Subscriber(SocialMediaGroup socialMediaGroup, String subscriberName) {
        this.socialMediaGroup = socialMediaGroup;
        this.subscriberName = subscriberName;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
