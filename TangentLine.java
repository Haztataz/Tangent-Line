public class TangentLine {
    public static void main(String[] args) {
        Particle p1 = new Particle1();
        Particle p2 = new Particle2();
        Particle p3 = new Particle3();

        for (double t = -6; t <= 6; t++) {
            p1.positionAt(t);
            p2.positionAt(t);
            p3.positionAt(t);
            System.out.println("t = " + t + " | " + "p1 = (" + p1.x + "," + p1.y + ")" + " | " + "p2 = (" + p2.x + "," + p2.y + ")" + " | " + "p3 = (" + p3.x + "," + p3.y + ")");
        }
    }
}
