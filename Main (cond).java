class Main {
  public static void main(String[] args) {
    if (age > 18 && age < 50) {
  System.out.println("Welcome!");
}

    int age = 25;
int height = 100;

if (age > 18 || height > 150) {
  System.out.println("Welcome!");
}

    int age = 25;
if(!(age > 18)) {
  System.out.println("Too Young");
} else {
  System.out.println("Welcome");
}

    String country = "US";
int age = 42;

if((country == "US" || country == "GB") && (age > 0 && age < 100)) {
  System.out.println("Allowed");
}

    int age = sc.nextInt();
        //your code goes here
        if(age>=0 && age<=11){
		System.out.println("Child");
	} else if (age>=12 && age<=17){
		System.out.println("Teen");
	} else if (age>=18 && age<=64){
		System.out.println("Adult");
	}

  }
}