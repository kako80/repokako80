/* klasa Person
 Zaimplementuj klasę abstrakcyjną Person. Klasa powinna zawierać:
 * dwa pola typu String: name, address.
 * konstruktor bezparametrowy ustawiający wartość pól name i address na pusty String.
 * konstruktor z dwoma parametrami: String name, String address.
 * metody typu getter odpowiedzialne za zwracanie wartości zmiennej: name, address.
 * metody typu setter odpowiedzialne za ustawianie wartości pól: name, address.
 * metoda toString powinna zwracać łańcuch tekstowy o następującym formacie: ?->?,
  gdzie ? to odpowiednio  imię i adres;
 */
 abstract class Person {
    protected String name;
    protected String address;

    public Person() {
        this.name = "";
        this.address = "";
    }

    @Override
    public String toString() {
        return "Person " + getName() + " -> " + getAddress(); }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
/* Klasa Student
 Zaimplementuj klasę Student. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
 * trzy pola: typ studiów, rok studiów, koszt studiów.
 * konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów.
 * metody typu getter dla zdeklarowanych pól.
 * metody typu setter dla zdeklarowanych pól.
 * metoda toString  wyświetlająca szczegółowe informacje o studencie
 */
class Student extends Person{
    String typeOfStudy;
    int yearOfStudy;
    int costOfStudy;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, int costOfStudy) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.costOfStudy = costOfStudy;
    }

    @Override
    public String toString() {
        return "Student " + getName() + " -> " + getAddress() + " -> "
                + getTypeOfStudy() + " -> " + getYearOfStudy() + " -> " + getCostOfStudy() ; }

    public String getTypeOfStudy() { return typeOfStudy; }
    public void setTypeOfStudy(String typeOfStudy) { this.typeOfStudy = typeOfStudy; }
    public int getYearOfStudy() { return yearOfStudy; }
    public void setYearOfStudy(int yearOfStudy) { this.yearOfStudy = yearOfStudy; }
    public int getCostOfStudy() { return costOfStudy; }
    public void setCostOfStudy(int costOfStudy) { this.costOfStudy = costOfStudy; }
}
/* Klasa Staff
 Zaimplementuj klasę Lecturer. Klasa ta powinna rozszerzać klasę Person. Dodatkowo powinna zawierać:
 * dwa pola: specjalizacja oraz wynagrodzenie.
 * konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie.
 * metody typu getter dla zdeklarowanych pól.
 * metody typu setter dla zdeklarowanych pól'
 * metoda toString  wyświetlająca szczegółowe informacje o wykładowcy
 Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
 */
class Lecturer extends Person{
    String specialization;
    int remuneration;

    public Lecturer(String name, String address, String specialization, int remuneration) {
        super(name, address);
        this.specialization = specialization;
        this.remuneration = remuneration;
    }

    @Override
    public String toString() {
        return  "Lecturer " + getName() + " -> " + getAddress() +
                " -> " + getSpecialization() + " -> " + getRemuneration() ;}

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public int getRemuneration() { return remuneration; }
    public void setRemuneration(int remuneration) { this.remuneration = remuneration; }
}

public class college {
    public static void main(String[] args) {
        Person person = new Person() {}; System.out.println(person);
        Person person1 = new Person("Franek Dolas","Głogów ul.Piastowska 45/6"){};
        System.out.println(person1);
        person1.setName("Marek Marecki"); System.out.println(person1);
        person1.setAddress("Głogów ul. Żmigrodzka 12/2"); System.out.println(person1);
        Student student = new Student("Monika Lila","Opole ul.Bardzka 12/4", "dziennikarstwo"
                ,2020,25000);
        System.out.println(student);
        student.setYearOfStudy(2019); System.out.println(student);
        student.setTypeOfStudy("politologia"); System.out.println(student);
        student.setCostOfStudy(27500); System.out.println(student);
        Lecturer lecturer = new Lecturer("Jerzy Glanx", "Gdańsk ul.Kręta 45/9",
                "Historia",7600);
        System.out.println(lecturer);
        lecturer.setSpecialization("Filologia"); System.out.println(lecturer);
        lecturer.setRemuneration(7800); System.out.println(lecturer);
    }
}
