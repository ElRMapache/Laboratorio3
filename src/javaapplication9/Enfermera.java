
public class Enfermera {

    String nombre = " ";
    String nit = " ";
    String dpi = " ";
    boolean intensivo = false;
    int aniosXP = 0;
    int salario = 0;

    public Enfermera() {

    }

    public int getEnfermera(int button) {
        return button;
    }

    public void getChar(int button) {

        if (button == 5) {
            nombre = "Juana Lopez";
            nit = "563269-K";
            dpi = "5643213450101";
            intensivo = false;
            aniosXP = 2;
            salario = 6000;
        }

        if (button == 6) {
            nombre = "Lidia Mendez";
            nit = "7654376-6";
            dpi = "1246547850101";
            intensivo = true;
            aniosXP = 2;
            salario = 9000;
        }

        if (button == 7) {
            nombre = "Miriam Garcia";
            nit = "9876456-8";
            dpi = "6547854370101";
            intensivo = false;
            aniosXP = 14;
            salario = 8000;
        }

        if (button == 8) {
            nombre = "Lorna Suarez";
            nit = "4567865-8";
            dpi = "569374160101";
            intensivo = true;
            aniosXP = 12;
            salario = 10000;
        }

        if (button == 9) {
            nombre = "Mariela Rodriguez";
            nit = "6789654-8";
            dpi = "3254786540101";
            intensivo = false;
            aniosXP = 2;
            salario = 8000;
        }
    }

    public String getName() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getDPI() {
        return dpi;
    }

    public String getInt() {
        String stat = " ";

        if (intensivo = true) {
            stat = "si";
        }
        if (intensivo = false) {
            stat = "no";
        }

        return stat;
    }

    public int getSAL() {
        return salario;
    }

    public int getAge() {
        return aniosXP;
    }

}
