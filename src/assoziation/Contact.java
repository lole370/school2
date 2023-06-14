package assoziation;

public class Contact {

    private String name;
    private String email;
    private String phone;
    private String twitter;
    private int id;

    public Contact() {
    }

    public Contact(String name, String email, String phone, String twitter, int id) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.twitter = twitter;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getTwitter() {
        return twitter;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", twitter='" + twitter + '\'' +
                ", id=" + id +
                '}';
    }
}
