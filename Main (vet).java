class Main {
  public static void main(String[] args) {
   int[ ] ages;
ages = new int[5]; //ou int[] ages = new int[5];

//The code above creates an array of 5 integers.

    //Here is an example, setting the item with the index 2 to the value 25:

ages[2] = 25;
    System.out.println(ages[2]); 
  }

  String[ ] names = { "A", "B", "C", "D"};
System.out.println(names[2]);

//Exemplo
String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int choice = sc.nextInt();
	if (choice<0 || choice>4){
		System.out.print("Invalid");	
	} else {
		System.out.print(menu[choice]);
	}

//Tamanho do vetor
int[] ages = {18, 33, 24, 64, 45};
System.out.println(ages.length);

//Exemplo de For
int[] ages = {18, 33, 24, 64, 45};
int sum = 0;
for(int x=0;x<ages.length;x++) {
  sum += ages[x];
}
System.out.println(sum);

//Exemplo de For...each
int[] ages = {18, 33, 24, 64, 45};
int sum = 0;
for(int x: ages) {
  sum += x;
}
System.out.println(sum);

//Vetores Multidimensionais
int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} };
The following example accesses the first element in the second array of sample:

int x = sample[1][0];
System.out.println(x);

//Exemplo
int[][] sample = {
{1, 2, 3},
{4, 5, 6}
};
for(int x=0; x<sample.length; x++) {
  for(int y=0; y<sample[x].length; y++) {
    System.out.println(sample[x][y]);
  }
}

//Exemplo
int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int row = sc.nextInt();
	int column = sc.nextInt();
	if(seats[row][column] == 0){
		System.out.println("Free");
	} else {
		System.out.println("Sold");
	}
}