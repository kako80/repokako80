/* Napisz program, składający się z kilku klas:
a. Klasy Author, reprezentującą autora – pisarza wierszów, składającej się z pól surname oraz nationality
   (oba typu String)
b. Klasy Poem, reprezentującą wiersz, składającą się z pól creator (typu Author) oraz stropheNumbers
   (typu int – reprezentującej ilość zwrotek wiersza)
c. Klasy Main, w której znajdzie się metoda main, a w niej kod w którym:
i. Stworzysz trzy obiekty klasy Poem, uzupełniając go wszystkimi danymi (używając konstruktora lub setter’ów)
i   zapiszesz je w tablicy
ii. Wypiszesz nazwisko tego autora, który napisał wiersz o największej liczbie zwrotek
   (niech odpowiedź obliczy Twój program!)
 */

import java.util.Arrays;

class Author {
    String surname;
    String nationality;

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }
}
    class Poem {
        Author creator;
        int stropheNumbers;

        @Override
        public String toString() {
            return "Poem{" +
                    " creator=" + creator +
                    ", stropheNumbers=" + stropheNumbers +
                    '}';

        }
        public Poem(Author creator, int stropheNumbers) {
            this.creator = creator;
            this.stropheNumbers = stropheNumbers;
        }
    }

public class authorOfPoems {


    public static void main(String[] args) {

        Poem[] poems = new Poem[3];
        poems[0] = new Poem(new Author("Szymborska", "Polska"),78);
        poems[1] = new Poem(new Author("Herbert", "Polska"),96);
        poems[2] = new Poem(new Author("Baudelaire", "Francja"),62);
        System.out.println(Arrays.toString(poems));
        Poem max = poems[0];
        for (Poem poem : poems) {
            if (poem.stropheNumbers > max.stropheNumbers) {
                max = poem;
            }
        }
        System.out.println(max);
    }

}