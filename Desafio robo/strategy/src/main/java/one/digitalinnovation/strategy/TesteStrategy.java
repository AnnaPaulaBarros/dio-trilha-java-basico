package one.digitalinnovation.strategy;

public class TesteStrategy {
    public static void main(String[] args) {
        Robo robo = new Robo();

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
    }
}
