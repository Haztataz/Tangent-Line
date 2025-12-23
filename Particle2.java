class Particle2 extends Particle {
    @Override
    void positionAt(double t) {
        x = -t;
        y = t * t;
    }
}