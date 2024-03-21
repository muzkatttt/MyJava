package controllers;

import lombok.Data;

@Data
public class IssueRequest { // ожидаемый постзапрос data transfer object
    private long readerId;
    private long bookId;

    public IssueRequest() {
    }

    public long getReaderId() {
        return this.readerId;
    }

    public long getBookId() {
        return this.bookId;
    }

    public void setReaderId(final long readerId) {
        this.readerId = readerId;
    }

    public void setBookId(final long bookId) {
        this.bookId = bookId;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof IssueRequest)) {
            return false;
        } else {
            IssueRequest other = (IssueRequest)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getReaderId() != other.getReaderId()) {
                return false;
            } else {
                return this.getBookId() == other.getBookId();
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof IssueRequest;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        long $readerId = this.getReaderId();
        result = result * 59 + (int)($readerId >>> 32 ^ $readerId);
        long $bookId = this.getBookId();
        result = result * 59 + (int)($bookId >>> 32 ^ $bookId);
        return result;
    }

    public String toString() {
        long var10000 = this.getReaderId();
        return "IssueRequest(readerId=" + var10000 + ", bookId=" + this.getBookId() + ")";
    }
}
