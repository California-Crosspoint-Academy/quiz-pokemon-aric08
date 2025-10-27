public class Pokemon {

    String name;
    int level;
    String move1;
    String move2;
    String move3;
    String move4;

    
    public Pokemon(String name, int level, String m1, String m2, String m3, String m4) {
        this.name = name;
        this.level = level;
        this.move1 = m1;
        this.move2 = m2;
        this.move3 = m3;
        this.move4 = m4;
    }

    
    public void printPokemon() {
        System.out.println(name + " (Level " + level + ")");
        System.out.println("1) " + move1);
        System.out.println("2) " + move2);
        System.out.println("3) " + move3);
        System.out.println("4) " + move4);
        System.out.println();
    }
}
