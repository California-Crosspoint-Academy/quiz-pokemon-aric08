public class Main {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Tauros", 100, "Body Slam", "Earthquake", "Blizzard", "Hyper Beam");
        Pokemon p2 = new Pokemon("Snorlax", 99, "Fire Blast", "Surf", "Rest", "Double-Edge");
        Pokemon p3 = new Pokemon("Starmie", 98, "Thunderbolt", "Ice Beam", "Recover", "Psychic");
        Pokemon p4 = new Pokemon("Exeggutor", 97, "Sleep Powder", "Stun Spore", "Mega Drain", "Explosion");
        Pokemon p5 = new Pokemon("Alakazam", 96, "Seismic Toss", "Reflect", "Thunder Wave", "Kinesis");
        Pokemon p6 = new Pokemon("Lapras", 95, "Sing", "Confuse Ray", "Surf", "Body Slam");

        p1.attack1();
        p2.attack1();
        p3.attack1();
        p4.attack1();
        p5.attack1();
        p6.attack1();
    }
}
