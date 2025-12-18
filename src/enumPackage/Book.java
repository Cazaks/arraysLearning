package enumPackage;

public enum Book {
    JHTP("Java How to Program", "2018"),
    CHTP("C How to Program", "2016"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2017"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2017");

    private final String bookTitle;
    private final String copyrightYear;

    Book(String bookTitle, String copyrightYear) {
        this.bookTitle = bookTitle;
        this.copyrightYear = copyrightYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
