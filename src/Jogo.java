public class Jogo {

    JogarStrategy jogarStrategy;

    public void setJogarStrategy(JogarStrategy jogarStrategy) {
        this.jogarStrategy = jogarStrategy;
    }

    public Jogo() {
        this.jogarStrategy = new FacilStrategy();
    }

    public void jogar() {
        jogarStrategy.jogar();
    }}
