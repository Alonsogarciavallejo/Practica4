
public class principal {
    public static void main(String[] args) {
        String s1 = "casa";
        String s2 = "calle";
        System.out.println("La distancia de edición entre \"" + s1 + "\" y \"" + s2 + "\" es: " +
                CalculadorDistancias.CalcularDistancias(s1, s2));
    }
}