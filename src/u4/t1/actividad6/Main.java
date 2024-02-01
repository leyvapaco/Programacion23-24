package u4.t1.actividad6;

public class Main {
    public static void main(String[] args) {
        Piano piano = new Piano();
        Campana campana = new Campana();
        Instrumento.add(Instrumento.notaMusical.DO);
        Instrumento.add(Instrumento.notaMusical.MI);
        Instrumento.add(Instrumento.notaMusical.LA);
        Instrumento.add(Instrumento.notaMusical.SOL);
        piano.interpretar();
        campana.interpretar();
    }
}
