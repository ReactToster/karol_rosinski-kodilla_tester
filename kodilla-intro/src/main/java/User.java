public class User {
    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("Adam", 28);
        users[1] = new User("Julia", 22);
        users[2] = new User("Paweł", 69);
        users[3] = new User("Lena", 8);
        users[4] = new User("Jagoda", 34);
        double averageAge = 0;

        for (int i = 0; i< users.length; i++){
            averageAge += users[i].age;
        }

        double sumAverageAge = averageAge/users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < sumAverageAge){
                System.out.println(users[i].name);
            }
        }
    }
}
