package lab9_collections;

import java.util.Objects;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object otherUser){
        if (this == otherUser)
            return true;
        if (otherUser == null || this.getClass() != otherUser.getClass())
            return false;
        return Objects.equals(this.getName(), ((User) otherUser).getName());
    }

    @Override
    public int hashCode(){
        return this.getName().hashCode();
    }

}
