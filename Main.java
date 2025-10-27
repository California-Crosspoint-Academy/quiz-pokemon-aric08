public class Main {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Tauros", 100, "Body Slam", "Earthquake", "Blizzard", "Hyper Beam");
        Pokemon p2 = new Pokemon("Snorlax", 99, "Fire Blast", "Surf", "Rest", "Double-Edge");
        Pokemon p3 = new Pokemon("Starmie", 98, "Thunderbolt", "Ice Beam", "Recover", "Psychic");
        Pokemon p4 = new Pokemon("Exeggutor", 97, "Sleep Powder", "Stun Spore", "Mega Drain", "Explosion");
        Pokemon p5 = new Pokemon("Alakazam", 96, "Seismic Toss", "Reflect", "Thunder Wave", "Kinesis");
        Pokemon p6 = new Pokemon("Lapras", 95, "Sing", "Confuse Ray", "Surf", "Body Slam");

        p1.printPokemon();
        p2.printPokemon();
        p3.printPokemon();
        p4.printPokemon();
        p5.printPokemon();
        p6.printPokemon();
    }
}
