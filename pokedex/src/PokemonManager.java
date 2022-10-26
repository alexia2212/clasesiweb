import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class PokemonManager {
    private Pokemon[] pokedex  = new Pokemon[150];
    private ArrayList<Pokemon> bolsa = new ArrayList<>();
    private int contadorBolsa  ;
    private int contadorPokedex ;

    public Pokemon[] getPokedex() {
        return pokedex;
    }

    public void setPokedex(Pokemon[] pokedex) {
        this.pokedex = pokedex;
    }

    public ArrayList<Pokemon> getBolsa() {
        return bolsa;
    }

    public void setBolsa(ArrayList<Pokemon> bolsa) {
        this.bolsa = bolsa;
    }

    public int getContadorBolsa() {
        return contadorBolsa;
    }

    public void setContadorBolsa(int contadorBolsa) {
        this.contadorBolsa = contadorBolsa;
    }

    public int getContadorPokedex() {
        return contadorPokedex;
    }

    public void setContadorPokedex(int contadorPokedex) {
        this.contadorPokedex = contadorPokedex;
    }
     //Métodos:
    Scanner sc = new Scanner(System.in);
    public void capturarPokemon(){
        Pokemon pokemon;
        pokemon = new Pokemon();

        System.out.println("Ingrese la información del Pokemon");
        System.out.print("Número: ");
        pokemon.setNumero(Integer.parseInt(sc.nextLine()));
        System.out.print("Nombre:");
        pokemon.setNombre(sc.nextLine());
        System.out.println("Seleccione Tipo: ");
        System.out.println("1. Agua");
        System.out.println("2. Bicho");
        System.out.println("3. Dragon");
        System.out.println("4. Planta");
        System.out.println("5. Fuego");
        System.out.println("6. Otro");
        System.out.print("Opción: ");

        switch (sc.nextLine()) {
            case "1" -> pokemon.setTipo(("Agua"));
            case "2" -> pokemon.setTipo(("Bicho"));
            case "3" -> pokemon.setTipo(("Dragon"));
            case "4" -> pokemon.setTipo(("Planta"));
            case "5" -> pokemon.setTipo(("Fuego"));

            case "6" -> {
                System.out.print("Ingrese nuevo tipo: ");
                pokemon.setTipo(sc.nextLine());

            }
        }
            System.out.print("Peso: ");
            pokemon.setPeso(Double.parseDouble(sc.nextLine()));
            System.out.print("Altura: ");
            pokemon.setAltura(Double.parseDouble(sc.nextLine()));
            System.out.print("PS: ");
            pokemon.setPs(Integer.parseInt(sc.nextLine()));
            System.out.println("==== Se registró nuevo Pokemon ===");
        }


    public void registrarPokedex(Pokemon pokemon){
        boolean existe = false;
        for(int j = 0; j < contadorPokedex; j++){
            if(pokedex[j].getNumero()==pokemon.getNumero()){
                if (pokedex[j].getPs() < pokemon.getPs()){
                    pokedex[j] = pokemon;
                }
                existe = true;
                break;
            }
        }
        if (!existe){
            pokedex[contadorPokedex] = pokemon;
            contadorPokedex++;
        }
    }

    public void listarPokemon(){
        Pokemon pokemon;
        pokemon = new Pokemon();
        ArrayList<Pokemon> bolsa;
        bolsa = new ArrayList<>();
        System.out.println("Seleccione Lista: ");
        System.out.println("1. Bolsa");
        System.out.println("2. Pokedex");
        System.out.println("Opción: ");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextLine()){
            //CASO DE LISTAS: (For - each loop)
            case "1" ->{
                for (Pokemon p: bolsa){
                    p.imprimir();
                }
                System.out.println("Pokemon en Bolsa: "+ bolsa.size());

            }
            //HACER LO MISMO PERO EN ARREGLO: (For loop)
            case "2" ->{
                for(int i = 0; i< contadorPokedex; i++){
                    pokedex[i].imprimir();
                }
                System.out.println("Pokemon en Pokedex: "+ pokedex.length);
            }
        }
        System.out.println("=================================");
        System.out.println("Número: "+ pokemon.getNumero());
        System.out.println("Nombre: "+ pokemon.getNombre());
        System.out.println("Tipo: "+pokemon.getTipo());
        System.out.println("Peso: "+pokemon.getPeso());
        System.out.println("Altura: "+pokemon.getAltura());
        System.out.println("PS: "+pokemon.getPs());
        System.out.println("=================================");
    }

    public void buscarPokemon(){
        System.out.println("Seleccione Lista: \n1.Bolsa \n2.Pokedex");
        System.out.println("Opción: ");
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();
        System.out.println("Ingrese el nombre del pokemon a buscar: ");
        String pokemonBuscar = sc.nextLine();

        boolean exitePkm = false;
        switch (opcion) {
            case "1" -> {
                for (Pokemon pokemon : bolsa) {
                    if (pokemon.getNombre().equalsIgnoreCase(pokemonBuscar)) {
                        pokemon.imprimir();
                        exitePkm = true;
                    }
                }
            }
            case "2" -> {
                for (int i = 0; i < contadorPokedex; i++) {
                    if (pokedex[i].getNombre().equalsIgnoreCase(pokemonBuscar)) {
                        pokedex[i].imprimir();
                        exitePkm = true;
                        break;
                    }
                }
            }
        }
        if(!exitePkm){
               System.out.println("No hay pokemon");
        }

    }

    public void imprimirPokemon(){
        System.out.println("Tiene "+ bolsa.size() + " Pokemon en Bolsa");
        System.out.println("Tiene "+ contadorPokedex + " Pokemon en Pokedex");
    }





}
