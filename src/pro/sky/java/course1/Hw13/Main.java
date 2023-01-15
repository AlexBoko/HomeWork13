package pro.sky.java.course1.Hw13;

public class Main {
    public static void main(String[] args) {

        Author frankNoris = new Author("Frank", "Noris");
        Book firstBook = new Book("Sprut", frankNoris, 1901);
        System.out.println(firstBook);
        Book secondBook = new Book("Martin Iden", new Author("Jack", "London"), 1909);
        System.out.println(secondBook);
        firstBook.setPublishYear(1910);
        System.out.println(firstBook.setPublishYear());


        System.out.println("Authors:");
        Author frankhNoris = new Author("Frank", "Noris");
        Author frankhNoris2 = new Author("Frank", "Noris");
        Author martinIden = new Author("Martin", "Iden");
        System.out.println("Author copies equal: " + frankhNoris.equals(frankhNoris2));
        System.out.println("Author copies equal by hashCode: " + (frankhNoris.hashCode() == frankhNoris2.hashCode()));
        System.out.println("Author equal: " + frankhNoris.equals(martinIden));
        System.out.println("Author equal by hashCode: " + (frankhNoris.hashCode() == martinIden.hashCode()));

        System.out.println(frankhNoris);
        System.out.println(martinIden);


    }
}

