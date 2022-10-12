public class Grades {
    private int[] grades;
    private int size;
    private double averageGrade;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value){
        if (this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getRecentGrade(){
        return this.grades[this.size - 1];
    }

    public double getAverageGrade(){
        for (int i = 0; i < this.size; i++){
           this.averageGrade  += this.grades[i];
        }
        return this.averageGrade/this.size;
    }
}
