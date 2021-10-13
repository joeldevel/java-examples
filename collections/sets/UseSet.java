
import java.util.*;

public class UseSet {

    public static void main(String[] args) {
        
        // A set does not stores duplicates
        Set<User> users = new HashSet<User>();

        User pepino = new User("pepino", "pepino@gmail.com");
        User banana = new User("banana", "pepino@gmail.com");
        User tubetti = new User("tubetti", "pepino@gmail.com");
        User ratatuli = new User("ratatuli", "pepino@gmail.com");
        User gino = new User("gino", "pepino@gmail.com");
        User batatita = new User("batatita", "pepino@gmail.com");
        User pepinoCopia = new User("pepino", "pepino@gmail.com");
        
        // pepinoCopia is a repeted user so it is not stored twice
        users.add(pepino);
        users.add(pepinoCopia);
        users.add(pepinoCopia);
        users.add(banana);
        users.add(tubetti);
        users.add(gino);
        users.add(batatita);
        users.add(ratatuli);
        
        for (Iterator<User> it = users .iterator(); it.hasNext();) {
            User u = it.next();
            System.out.println(u.toString());
        }
    }

}

class User {

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", email: " + this.email;
    }

    // Both hashCode and equals must be implemented in order to use User in 
    // a set
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    
    private String name;
    private String email;
}
