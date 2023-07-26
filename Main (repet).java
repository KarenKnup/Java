class Main {
  public static void main(String[] args) {
    int x = 3;

    //While
while(x > 0) {
  System.out.println(x);
  x = x-1; //x--;
}
    
int sum = 0;
int num = 0;

while(num <= 100) {
  sum += num;
  num++;
}
System.out.println(sum);

    //Do ...while
    int x = 1;
do {
  System.out.println(x);
  x++;
} while(x < 5);

    int num = s.nextInt();
	int sum=0;
	while(num > 0){
		sum += num--;
	}
	System.out.println(sum);

    //For
    for(int x=0; x<=10; x+=2) {
  System.out.println(x);
}

    //Break
    for(int x=1; x<10; x++) {
  System.out.println(x);
  if(x == 4) {
    break;
  }
}

    //Continue
    for(int x=10; x<=40; x+=10) {
  if(x == 30) {
    continue;
  }
  System.out.println(x);
}
  }
}