package exercicios.exercicio01;

public class AppPlacar {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("São Paulo", "Corinthians");
        Placar p3 = new Placar("São Paulo", "Corinthians", 1, 0);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
