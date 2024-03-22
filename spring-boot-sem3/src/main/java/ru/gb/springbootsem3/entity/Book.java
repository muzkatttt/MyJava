package entity;


public class Book {

    public Book(String name) {
        this.id = (long)(genId++);
        this.name = name;
    }

    private static long genId;
    private final long id;
    private final String name;

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Book)) {
            return false;
        } else {
            Book other = (Book)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getId() != other.getId()) {
                return false;
            } else {
                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Book;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        long $id = this.getId();
        result = result * 59 + (int)($id >>> 32 ^ $id);
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        long var10000 = this.getId();
        return "Book(id=" + var10000 + ", name=" + this.getName() + ")";
    }
}
