import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pokemon pokemon;
        pokemon = new Pokemon();
        PokemonManager pokemonManager;
        pokemonManager = new PokemonManager();

        loop: do {

            System.out.println("Bienvenido al sistema de registro Pokemon");
            System.out.println("Indique la acción que desea realizar");
            System.out.println("1. Capturar Pokemon");
            System.out.println("2. Listar Pokemon");
            System.out.println("3. Buscar Pokemon");
            System.out.println("4. Imprimir Resumen");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opción: ");

            switch (sc.nextLine()){
                case "1" -> {
                    pokemonManager.capturarPokemon();
                }
                case "2" ->{
                    pokemonManager.listarPokemon();
                }
                case "3"->{
                    pokemonManager.buscarPokemon();
                }
                case "4"->{
                    pokemonManager.imprimirPokemon();
                }
                case "5" ->{
                    break loop;
                }
                default -> System.out.println("Opción Inválida");
            }
        }while(true);
    }
}