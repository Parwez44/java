abstract class Media {
    private String title;
    private int duration;
    protected boolean isPremium;

    public Media(String title, int duration, boolean isPremium) {
        this.title = title;
        this.duration = duration;
        this.isPremium = isPremium;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void getDetails() {
        System.out.println("Title: " + title + ", Duration: " + duration + " mins");
    }

    public abstract void playContent();
}

class Movie extends Media {

    public Movie(String title, int duration, boolean isPremium) {
        super(title, duration, isPremium);
    }

    @Override
    public void playContent() {
        if (isPremium) {
            System.out.print("Verifying Subscription... ");
        }
        System.out.println("Streaming Movie: " + getTitle());
    }
}

class Podcast extends Media {

    public Podcast(String title, int duration) {
        super(title, duration, false);
    }

    @Override
    public void playContent() {
        System.out.println("Loading Advertisement... Playing Podcast: " + getTitle());
    }
}

public class qn3 {
    public static void main(String[] args) {

        Media[] mediaList = new Media[] {
            new Movie("Inception", 148, true),
            new Podcast("Tech Talk", 30),
            new Movie("Free Guy", 115, false)
        };

        for (Media m : mediaList) {
            m.playContent();
        }
    }
}