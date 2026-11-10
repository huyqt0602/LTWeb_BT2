package data;

import java.io.Serializable;
import business.User;

public class Survey implements Serializable {
    private static final long serialVersionUID = 1L;
    private User user;
    private String howToHeardAbout;
    private String contactMethod;
    private String announcements;

    public Survey() {
        this(new User(), "", "", "None");
    }

    public Survey(User user, String howToHeardAbout, String contactMethod, String announcements) {
        this.user = user;
        this.howToHeardAbout = howToHeardAbout;
        this.contactMethod = contactMethod;
        this.announcements = announcements;
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
    public String getHowToHeardAbout() { return howToHeardAbout; }
    public void setHowToHeardAbout(String howToHeardAbout) { this.howToHeardAbout = howToHeardAbout; }
    public String getContactMethod() { return contactMethod; }
    public void setContactMethod(String contactMethod) { this.contactMethod = contactMethod; }
    public String getAnnouncements() { return announcements; }
    public void setAnnouncements(String announcements) { this.announcements = announcements; }
}
