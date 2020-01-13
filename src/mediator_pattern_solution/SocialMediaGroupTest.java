package mediator_pattern_solution;

public class SocialMediaGroupTest {

    public static void main(String[] args) {
        SocialMediaGroup mediator = new LearnAndShareGroup();

        Subscriber subscriber1 = new SubscriberImpl(mediator, "Saurabh");
        Subscriber subscriber2 = new SubscriberImpl(mediator, "Nilesh");
        Subscriber subscriber3 = new SubscriberImpl(mediator, "Aviroop");
        Subscriber subscriber4 = new SubscriberImpl(mediator, "Justin");

        mediator.addSubscriber(subscriber1);
        mediator.addSubscriber(subscriber2);
        mediator.addSubscriber(subscriber3);
        mediator.addSubscriber(subscriber4);

        subscriber2.send("Python and Boto3");
    }
}
