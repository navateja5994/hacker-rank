class Library {
    String name;
    int borrowedBooks;

    Library(String name) {
        this.name = name;
        this.borrowedBooks = 0;
    }

    public void returnBook() {
        if (borrowedBooks > 0) {
            borrowedBooks--;
            System.out.println(name + " returned a book. Now you have " + borrowedBooks + " book(s).");
        } else {
            System.out.println(name + " No books to return.");
        }
    }
}

class Students extends Library {
    Students(String name) {
        super(name);
    }
}

class Teachers extends Library {
    Teachers(String name) {
        super(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Library student1 = new Students("Amar");
        student1.borrowedBooks = 1;
        Library student2 = new Students("Lalitha");
        Library teacher = new Teachers("Dr. Prem Kumar");

        student1.returnBook();
        student2.returnBook();
        teacher.returnBook();
    }
}