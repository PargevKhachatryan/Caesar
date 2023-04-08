import java.util.Scanner;
public class caesar{
  public void K(){
    Scanner sc = new Scanner(System.in);
    Scanner scNum = new Scanner(System.in);
    String str;
    int rotDir = -1;
    caesarAlgorithm caesar = new caesarAlgorithm();

    System.out.print("Please enter the text to cipher (in english alphabet) - ");
    str = sc.nextLine();
    caesar.str = str.toCharArray();
    do{
      System.out.print("\nNow enter the count of rotations - ");
      caesar.num = scNum.nextInt();
    } while(caesar.num <= 0);
    do{
      System.out.print("\nEnter the direction of rotation (enter 0 for LEFT || 1 for RIGTH) - ");
      rotDir = scNum.nextInt();
    } while(rotDir < 0 || rotDir > 1);
    if(rotDir == 0){
      caesar.showLeft();
    } else if(rotDir == 1){
      caesar.showRight();
    }
    sc.close();
  }  
}
