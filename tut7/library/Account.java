package PR2.tut7.library;
/*
         ___________________________________________________
        |                      Account                      |
         ---------------------------------------------------
        | - ID: String                                      |
        | - password: String                                |
        | - status: AccountStatus                           |
        | - person: Person                                  |
        | - accountType: AccountType                        |
        ----------------------------------------------------
        | + Account(ID: String, password: String,           |
        |           status: AccountStatus, person:          |
        |           Person, accountType:                    |
        |           AccountType)                            |
        | + getID(): String                                 |
        | + getPassword(): String                           |
        | + getStatus(): AccountStatus                      |
        | + getPerson(): Person                             |
        | + getAccountType(): AccountType                   |
        | + setID(ID: String): void                         |
        | + setPassword(password: String): void             |
        | + setStatus(status: AccountStatus): void          |
        | + setPerson(person: Person): void                 |
        | + setAccountType(accountType: AccountType): void  |
        | + toString(): String                              |
         ---------------------------------------------------
*/

public class Account {
    private String ID;
    private String password;
    private AccountStatus status;
    private Person person;
    private AccountType accountType;

    public Account(String ID, String password, AccountStatus status, Person person, AccountType accountType) {
        this.ID = ID;
        this.password = password;
        this.status = status;
        this.person = person;
        this.accountType = accountType;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setID(String ID) {
        if (ID != null && !ID.isEmpty()) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("ID cannot be null or empty.");
        }
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Password cannot be null or empty.");
        }
    }

    public void setStatus(AccountStatus status) {
        if (status != null) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Status cannot be null.");
        }
    }

    public void setPerson(Person person) {
        if (person != null) {
            this.person = person;
        } else {
            throw new IllegalArgumentException("Person cannot be null.");
        }
    }

    public void setAccountType(AccountType accountType){
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID='" + ID + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", person=" + person +
                ", accountType=" + accountType +
                '}';
    }
}
