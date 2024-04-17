package PR2.tut7.library;


/* _________________________________________________
|                      BookItem                     |
 ---------------------------------------------------
| - book: Book                                      |
| - barcode: String                                 |
| - price: double                                   |
| - format: Format                                  |
| - status: BookItemStatus                          |
| - dateOfPurchase: Date                            |
| - publicationDate: Date                           |
 ---------------------------------------------------
| + BookItem(book: Book, barcode: String,           |
|            price: double, format: Format,         |
|            status: BookItemStatus,                |
|            dateOfPurchase: Date,                  |
|            publicationDate: Date)                 |
| + getBook(): Book                                 |
| + getBarcode(): String                            |
| + getPrice(): double                              |
| + getFormat(): Format                             |
| + getStatus(): BookItemStatus                     |
| + getDateOfPurchase(): Date                       |
| + getPublicationDate(): Date                      |
| + setBarcode(barcode: String): void               |
| + setPrice(price: double): void                   |
| + setFormat(format: Format): void                 |
| + setStatus(status: BookItemStatus): void         |
| + setDateOfPurchase(dateOfPurchase: Date): void   |
| + setPublicationDate(publicationDate: Date): void |
| - isValidPrice(price: double): boolean            |
| + toString(): String                              |
 ---------------------------------------------------
*/


public class BookItem {

    private Book book;
    private String barcode;
    private double price;
    private Format format;
    private BookItemStatus status;
    private Date dateOfPurchase;
    private Date publicationDate;


    public BookItem(Book book, String barcode, double price, Format format, BookItemStatus status, Date dateOfPurchase, Date publicationDate) {
        this.book = book;
        this.barcode = barcode;
        this.price = price;
        this.format = format;
        this.status = status;
        this.dateOfPurchase = dateOfPurchase;
        this.publicationDate = publicationDate;
    }

    public Book getBook() {
        return book;
    }

    public String getBarcode() {
        return barcode;
    }

    public double getPrice() {
        return price;
    }

    public Format getFormat() {
        return format;
    }

    public BookItemStatus getStatus() {
        return status;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setBarcode(String barcode) {
        if (barcode != null && !barcode.isEmpty()) {
            this.barcode = barcode;
        } else {
            System.out.println("Barcode cannot be null or empty.");
        }
    }

    public void setPrice(double price) {
        if (isValidPrice(price)) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setFormat(Format format) {
        if (format != null) {
            this.format = format;
        } else {
            System.out.println("Format cannot be null.");
        }
    }

    public void setStatus(BookItemStatus status) {
        if (status != null) {
            this.status = status;
        } else {
            System.out.println("Status cannot be null.");
        }
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
            this.dateOfPurchase = dateOfPurchase;
    }

    public void setPublicationDate(Date publicationDate) {
            this.publicationDate = publicationDate;
    }


    private boolean isValidPrice(double price) {
        return price > 0;
    }


    @Override
    public String toString() {
        return "BookItem{" +
                "book=" + book +
                ", barcode='" + barcode + '\'' +
                ", price=" + price +
                ", format=" + format +
                ", status=" + status +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
