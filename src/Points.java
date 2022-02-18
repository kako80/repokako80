import java.util.Arrays;

/* Klasa Point2D
 Zaimplementuj klasę Point2D . Klasa powinna zawierać:
* dwa pola typu float: x, y.
* konstruktor bezparametrowy ustawiający wartości pól x i y na 0.
* konstruktor z dwoma parametrami: float x, float y.
* metody typu getter odpowiedzialne za zwracanie wartości zmiennej: x, y.
* metodę getXY zwracającą współrzędne x i y w postaci tablicy dwuelementowej.
* metody typu setter odpowiedzialne za ustawianie wartości pól x, y.
* metodę setXY ustawiającą współrzędne x i y.
* metoda toString powinna zwracać łańcuch tekstowy o następującym formacie: (x, y).
 */
class Point2D {
    float x;
    float y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
        return "Point2D " + Arrays.toString(getXY()) ; }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() { return x; }
    public void setX(float x) { this.x = x; }
    public float getY() { return y; }
    public void setY(float y) { this.y = y; }
    public float[] getXY() { return new float[]{getX(), getY()}; }
    public void  setXY(float x, float y) { this.x = x; this.y = y; }
}

/* Klasa Point3D
 Na podstawie klasy Point2D zaimplementuj klasę Point3D. Klasa ta powinna rozszerzać klasę Point2D oraz
 dodawać następującą implementację:
 * pole prywatne typu float: z.
 * konstruktor przyjmujący wartości dla pól: x, y, z.
 * metodę typu getter odpowiedzialną za zwracanie wartości zmiennej: z.
 * metodę getXYZ zwracającą współrzędne x, y, z w postaci tablicy trzyelementowej.
 * metodę typu setter odpowiedzialną za ustawianie zmiennej z.
 * metodę setXYZ ustawiającą wartości dla zmiennych x, y, z.
* metoda toString powinna zwracać łańcuch tekstowy o następującym formacie: (x, y, z).
 Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.
 */

class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() { return z; }
    public void setZ(float z) { this.z = z; }
    public float[] getXYZ() { return new float[]{ getX(), getY(), getZ()};}
    public void  setXYZ(float x, float y, float z) { this.setXY(x, y); this.z = z;}


    @Override
    public String toString() { return "Point3D " + Arrays.toString(getXYZ()) ; }
}

public class Points {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(){};
        Point2D point2D1 = new Point2D(12, 25);
        System.out.println(point2D);
        System.out.println(point2D1);
        point2D1.setX(10); System.out.println(point2D1);
        point2D1.setY(20); System.out.println(point2D1);
        point2D1.setXY(5, 5); System.out.println(point2D1);
        Point3D point3D = new Point3D(5, 10, 15);
        System.out.println(point3D);
        point3D.setZ(10); System.out.println(point3D);
        point3D.setXYZ(6, 6, 6); System.out.println(point3D);
    }
}
