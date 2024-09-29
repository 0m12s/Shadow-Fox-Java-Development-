package Task1;
	import java.util.Scanner;
	class A {
	    Scanner s;
	    double x;
	    double y;

	    public A(Scanner s) {
	        this.s = s;
	    }

	    public void add() {
	        try {
	            System.out.println("Enter 1st no. :");
	            x = s.nextDouble();
	            System.out.println("Enter 2nd no. :");
	            y = s.nextDouble();
	            System.out.println(x + y);
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please try again.");
	            s.next(); 
	        }
	    }

	    public void subtract() {
	        try {
	            System.out.println("Enter 1st no. :");
	            x = s.nextDouble();
	            System.out.println("Enter 2nd no. :");
	            y = s.nextDouble();
	            System.out.println(x - y);
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please try again.");
	            s.next(); 
	        }
	    }

	    public void multiply() {
	        try {
	            System.out.println("Enter 1st no. :");
	            x = s.nextDouble();
	            System.out.println("Enter 2nd no. :");
	            y = s.nextDouble();
	            System.out.println(x * y);
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please try again.");
	            s.next(); 
	        }
	    }

	    public void divide() {
	        try {
	            System.out.println("Enter 1st no. :");
	            x = s.nextDouble();
	            System.out.println("Enter 2nd no. :");
	            y = s.nextDouble();
	            System.out.println("Answer is : " + x / y);
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please try again.");
	            s.next(); 
	        }
	    }

	    public void sqroot() {
	        try {
	            System.out.println("Enter your no. :");
	            x = s.nextDouble();
	            System.out.println("Square root is :" + Math.sqrt(x));
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please try again.");
	            s.next(); 
	        }
	    }

	    public void expo() {
	        try {
	            System.out.println("Enter a no. :");
	            x = s.nextDouble();
	            System.out.println("Enter the power :");
	            y = s.nextDouble();
	            System.out.println("Result :" + Math.pow(x, y));
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please try again.");
	            s.next(); 
	        }
	    }
	}

	class B {
	    public void temp(Scanner s) {
	        try {
	            System.out.println("Enter 1 for Celsius to Fahrenheit :");
	            System.out.println("Enter 2 for Fahrenheit to Celsius :");
	            int c = s.nextInt();
	            double x, y;

	            switch (c) {
	                case 1:
	                    System.out.println("Enter Celsius temperature :");
	                    x = s.nextDouble();
	                    double z = (x * 9 / 5) + 32;
	                    System.out.println("So Fahrenheit equal to :" + z);
	                    break;
	                case 2:
	                    System.out.println("Enter Fahrenheit temperature :");
	                    y = s.nextDouble();
	                    double j = (y - 32) * 5 / 9;
	                    System.out.println("So Celsius temperature :" + j);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please try again.");
	            s.next(); 
	        }
	    }
	}

	class C {
	    public void currency(Scanner sc) {
	        try {
	            System.out.println("Enter your choice :-");
	            System.out.println("Press 1 - Convert Rupee to Dollar -");
	            System.out.println("Press 2 - Convert Dollar to Rupee -");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter rupee amount : ");
	                    int R = sc.nextInt();
	                    double x = R / 83.72;
	                    System.out.println("Dollar is :" + x);
	                    break;
	                case 2:
	                    System.out.println("Enter dollar amount : ");
	                    int D = sc.nextInt();
	                    double y = D * 83.72;
	                    System.out.println("Rupee is :" + y);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please try again.");
	            sc.next(); 
	        }
	    }
	}

	public class Calculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("Enter 1 for Addition :");
	            System.out.println("Enter 2 for Subtraction :");
	            System.out.println("Enter 3 for Multiplication :");
	            System.out.println("Enter 4 for Division :");
	            System.out.println("Enter 5 for SquareRoot :");
	            System.out.println("Enter 6 for Exponentiation :");
	            System.out.println("Enter 7 for Temperature Conversion :");
	            System.out.println("Enter 8 for Currency Exchange :");
	            System.out.println("Enter 9 to Exit :");
	            System.out.println("Enter no : ");

	            A x = new A(sc);
	            B y = new B();
	            C z = new C();
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    x.add();
	                    break;
	                case 2:
	                    x.subtract();
	                    break;
	                case 3:
	                    x.multiply();
	                    break;
	                case 4:
	                    x.divide();
	                    break;
	                case 5:
	                    x.sqroot();
	                    break;
	                case 6:
	                    x.expo();
	                    break;
	                case 7:
	                    y.temp(sc);
	                    break;
	                case 8:
	                    z.currency(sc);
	                    break;
	                case 9:
	                    sc.close();
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please choose a correct number.");
	                    break;
	            }
	        }
	    }
	}

