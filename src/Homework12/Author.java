package Homework12;

import java.util.Objects;

public class Author {
    private final String authorFullName;

    public Author(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public String getAuthorFullName() {
        return this.authorFullName;
    }
    public int hashCode(){
        return Objects.hash(authorFullName);
    }
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return authorFullName.equals(author.authorFullName);
    }
    public String toString(){
        return authorFullName;
    }
}
