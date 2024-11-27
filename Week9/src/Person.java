import java.util.Scanner;

public class Person extends FormatCheckers{
    private int height;
    private int age;
    private String gender;

    public Person(int height, int age, String gender) {
        this.height = height;
        this.age = age;
        this.gender = gender;
    }

    private int whichOption(Scanner scan) {
        System.out.println("Which attribute would you like to choose:\n\t- (1) height\n\t- (2) age\n\t- (3) gender");
        try {
            int option = Integer.parseInt(scan.nextLine());
            if (option >= 1 && option <= 3) {
                return option;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                return 0;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
            return 0;
        }
    }
    
    public String getGender() {
    	return this.gender;
    }


    public void optionGetter() {
        Scanner scan = new Scanner(System.in);
        int option = 0;

        while (option == 0) {
            option = this.whichOption(scan);
        }

        switch (option) {
            case 1:
                System.out.println("Height is " + this.height);
                break;
            case 2:
                System.out.println("Age is " + this.age);
                break;
            case 3:
                System.out.println("Gender is " + this.gender);
                break;
        }
    }

    public void optionSetter() {
        Scanner scan = new Scanner(System.in);
        int option = 0;

        while (option == 0) {
            option = this.whichOption(scan);
        }

        int number = -1;
        String string = "Fail";

        switch (option) {
            case 1:
                while (number == -1) {
                    System.out.println("Enter height in cm: ");
                    number = this.checkIntegerFormat(scan.nextLine());
                }
                this.height = number;
                break;

            case 2:
                while (number == -1) {
                    System.out.println("Enter age: ");
                    number = this.checkIntegerFormat(scan.nextLine());
                }
                this.age = number;
                break;

            case 3:
                while (string.equals("Fail")) {
                    System.out.println("Enter gender: ");
                    string = this.checkStringFormat(scan.nextLine());
                }
                this.gender = string;
                break;
        }
    }
    
    @Override
    public String toString() {
    	return "Height: " + this.height + ". Age: " + this.age + ". Gender: " + this.gender;
    }
}

