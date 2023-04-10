import java.util.Scanner;
public class Caesar{
  public void input(){
    Scanner sc = new Scanner(System.in);
    Scanner scNum = new Scanner(System.in);
    String str;
    int rotDir = -1;
    CaesarAlgorithm Caesar = new CaesarAlgorithm();

    System.out.print("Please enter the text to cipher (in english alphabet) - ");
    str = sc.nextLine();
    Caesar.str = str.toCharArray();
    do{
      System.out.print("\nNow enter the count of rotations - ");
      Caesar.num = scNum.nextInt();
    } while(Caesar.num <= 0);
    do{
      System.out.print("\nEnter the direction of rotation (enter 0 for LEFT || 1 for RIGTH) - ");
      rotDir = scNum.nextInt();
    } while(rotDir < 0 || rotDir > 1);
    if(rotDir == 0){
      Caesar.showLeft();
    } else if(rotDir == 1){
      Caesar.showRight();
    }
    sc.close();
  }  
}
