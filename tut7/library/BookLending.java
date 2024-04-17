package PR2.tut7.library;

/* _________________________________________________
|                    BookLending                    |
 ---------------------------------------------------
| - creationDate: Date                              |
| - account: Account                                |
| - bookItems: List<BookItem>                       |
| - dueDate: Date                                   |
| - returnDate: Date                                |
| - status: BookLendingStatus                       |
 ---------------------------------------------------
| + BookLending(creationDate: Date,                 |
|               account: Account,                   |
|               bookItems: List<BookItem>,          |
|               dueDate: Date, returnDate: Date,    |
|               status: BookLendingStatus)          |
| + getCreationDate(): Date                         |
| + setCreationDate(creationDate: Date): void       |
| + getAccount(): Account                           |
| + setAccount(account: Account): void              |
| + getBookItems(): List<BookItem>                  |
| + setBookItems(bookItems: List<BookItem>): void   |
| + getDueDate(): Date                              |
| + setDueDate(dueDate: Date): void                 |
| + getReturnDate(): Date                           |
| + setReturnDate(returnDate: Date): void           |
| + getStatus(): BookLendingStatus                  |
| + setStatus(status: BookLendingStatus): void      |
 ---------------------------------------------------
*/

import java.util.List;

public class BookLending {
    private Date creationDate;
    private Account account;
    private List<BookItem> bookItems;
    private Date dueDate;
    private Date returnDate;
    private BookLendingStatus status;

    public BookLending(Date creationDate, Account account, List<BookItem> bookItems, Date dueDate, Date returnDate, BookLendingStatus status) {
        this.creationDate = creationDate;
        this.account = account;
        this.bookItems = bookItems;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<BookItem> getBookItems() {
        return bookItems;
    }

    public void setBookItems(List<BookItem> bookItems) {
        this.bookItems = bookItems;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        if (dueDate.after(creationDate)) {
            this.dueDate = dueDate;
        }
        else{
            throw new IllegalArgumentException("Due date must be in the future");
        }
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        if (returnDate.after(creationDate)) {
            this.returnDate = returnDate;
        }
        else{
            throw new IllegalArgumentException("Return date must be in the future");
        }
    }

    public BookLendingStatus getStatus() {
        return status;
    }

    public void setStatus(BookLendingStatus status) {
        this.status = status;
    }



}
