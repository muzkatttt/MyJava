package entity;

public class Issue {
    private static long genId;
    private final long id;
    private final long idReader;
    private final long idBook;

    public Issue(long idReader, long idBook) {
        this.id = (long)(genId++);
        this.idBook = idBook;
        this.idReader = idReader;
    }

    public long getId() {
        return this.id;
    }

    public long getIdReader() {
        return this.idReader;
    }

    public long getIdBook() {
        return this.idBook;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Issue)) {
            return false;
        } else {
            Issue other = (Issue)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getId() != other.getId()) {
                return false;
            } else if (this.getIdReader() != other.getIdReader()) {
                return false;
            } else {
                return this.getIdBook() == other.getIdBook();
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Issue;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        long $id = this.getId();
        result = result * 59 + (int)($id >>> 32 ^ $id);
        long $idReader = this.getIdReader();
        result = result * 59 + (int)($idReader >>> 32 ^ $idReader);
        long $idBook = this.getIdBook();
        result = result * 59 + (int)($idBook >>> 32 ^ $idBook);
        return result;
    }

    public String toString() {
        long var10000 = this.getId();
        return "Issue(id=" + var10000 + ", idReader=" + this.getIdReader() + ", idBook=" + this.getIdBook() + ")";
    }
}
