package backend;

public abstract class AbstractUser {
    public String username;

    public AbstractUser(String username) {
        this.username = username;
    }

    public abstract boolean canVote();
}