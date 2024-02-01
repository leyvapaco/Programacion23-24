package u4.t1.actividad6;

public class Piano extends Instrumento {

    @Override
    public void interpretar() {
        System.out.print("En el piano suena: ");
        for (int i = 0; i < contadorNotas; i++) {
            System.out.print(notasMusicales[i] + " ");
        }
        System.out.println();
    }
}