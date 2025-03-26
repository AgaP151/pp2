public class zadanieTwo {
    public static void main(String[] args) {
        int size = args.length;

        // Sprawdzamy, czy są argumenty
        if (size == 0) {
            System.out.println("Żegnaj bezimienny!");
            return;
        }

        // Sprawdzamy, czy pierwszy argument to +w
        if (args[0].equals("+w")) {
            if (size == 1) {
                // Jeśli +w jest bez żadnych imion
                System.out.println("Cześć bezimienny!");
            } else {
                // Jeżeli +w, to witamy każdego z imienia
                for (int i = 1; i < size; i++) {
                    System.out.println("Cześć " + args[i] + "!");
                }
            }
        } else if (args[0].equals("+z")) {
            // Jeżeli +z, to żegnamy każdego z imienia
            for (int i = 1; i < size; i++) {
                System.out.println("Żegnaj " + args[i] + "!");
            }
        } else {
            // Jeżeli brak +w i +z, to domyślnie żegnamy
            for (int i = 0; i < size; i++) {
                System.out.println("Żegnaj " + args[i] + "!");
            }
        }
    }
}