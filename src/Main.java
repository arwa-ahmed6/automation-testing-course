import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

 String product_name="bike";
 double price =1000;
 int quantity=3;
 boolean stock=true;
 System.out.println("Product Name: " + product_name );
 System.out.println("Price: " + price);
 System.out.println("quantity: " + quantity);
 System.out.println("in Stock: " + stock);

 double total_price= price*quantity;
    System.out.println("total price ="+ total_price);

Scanner inp = new Scanner(System.in);
System.out.println("enter your grade");
int score =inp.nextInt();

if (score>=90) {
   System.out.println("excllent");
}
else if(score>=75){
 System.out.println("good");
}
else if(score>=60){
 System.out.println("pass");
}
else {
 System.out.println("fail");

}
 switch (score / 10) {
  case 10, 9 -> System.out.println("excellent");
  case 8 -> System.out.println("good");
  case 7 -> {
   if (score >= 75) {
    System.out.println("good");
   } else {
    System.out.println("pass");
   }
  }
  case 6 -> System.out.println("pass");
  default -> System.out.println("fail");
 }
for (int i=1;i<=30;i++){
 if (i % 3 == 0 && i % 5 == 0 ){
  System.out.println("BothTools");
 }
 else if(i%3==0){
  System.out.println("selenium");
 }
 else if (i%5==0){
  System.out.println("playwright");
 }
 else{
  System.out.println(i);
 }
}



}




