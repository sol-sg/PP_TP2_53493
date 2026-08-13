public class Main {
    public static void main(String[] args) {

        EventoUniversitario Charlas=new EventoUniversitario("1", "charlas de IA", 1500.5, true);

        System.out.println(Charlas.getTitulo());
        System.out.println(Charlas.getCostoBase());
    }
}