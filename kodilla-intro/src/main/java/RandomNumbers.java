import java.util.Random;

public class RandomNumbers {
    private int[] array;
    private int actualNumber;
    private int min;
    private int max;
    private int sum;

    public void randomNumbers(){
        this.sum = 0;
        this.min = 30;
        this.max = 0;
        this.actualNumber = 0;
        while (this.sum < 5000) {
            this.actualNumber = new Random().nextInt(0,31);
            this.sum += this.actualNumber;
            if( this.min > this.actualNumber ){
                this.min = this.actualNumber;
            }
            if (this.max < this.actualNumber) {
                this.max = this.actualNumber;
            }
        }
    }

    public int getMin(){
        return this.min;
    }

    public int getMax(){
        return this.max;
    }

    public static void main(String[] args) {
        RandomNumbers r = new RandomNumbers();
        r.randomNumbers();
        System.out.println("Min: " + r.getMin());
        System.out.println("Max: " + r.getMax());
    }
}
