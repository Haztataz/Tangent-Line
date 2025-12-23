class Particle3 extends Particle {
    @Override
    void positionAt(double t) {
        x = -(t / 2);
        y = (t * t) / 4;
    }
}