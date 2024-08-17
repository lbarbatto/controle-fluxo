
public class Counter {

    private int numberOne;
    private int numberTwo;

    public Counter() {
        this.numberOne = 0;
        this.numberTwo = 0;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }
    
    public void count (int numberOne, int numberTwo) throws ParametrosInvalidosException {

        if (numberTwo < numberOne) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int valueToCount = numberTwo - numberOne;

        for (int i = 0; i <= valueToCount; i++){
            System.out.println("Número: " + i);
        }

    }
}