package ereditarieta;

public class CalcolaStipendi {
    public static void main(String[] args) {
        Dipendente dip1 = new Dipendente("00309", 1000.0, 7.50);
        System.out.println("Stipendio di dip1 dopo 10 ore di straordinario: " + dip1.paga(10));

        DipendenteA dip2 = new DipendenteA("00201", 1500.0, 8.50);
        dip2.prendiMalattia(5);
        System.out.println("Stipendio di dip2 dopo 3 ore di straordinario: " + dip2.paga(3));
        dip2.stampaMalattia();
    }
}
