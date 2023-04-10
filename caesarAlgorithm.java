import java.util.*;

public class CaesarAlgorithm {
  Scanner scanner = new Scanner(System.in);
  char[] str;
  int num;
  int letterAlphabet = 26;
  int digitNum = 10;

  public void uppercaseR(int i) {
    num %= letterAlphabet;
    if ((str[i] + num) > 'Z') {
      str[i] = (char) (str[i] - letterAlphabet + num);
    } else {
      str[i] += num;
    }
  }

  public void lowercaseR(int i) {
    num %= letterAlphabet;
    if ((str[i] + num) > 'z') {
      str[i] = (char) (str[i] - letterAlphabet + num);
    } else {
      str[i] = (char) (str[i] + num);
    }
  }

  public void numberR(int i) {
    num %= digitNum;
    if ((str[i] + num) > '9') {
      str[i] = (char) (str[i] - digitNum + num);
    } else {
      str[i] = (char) (str[i] + num);
    }
  }

  public void uppercaseL(int i) {
    num %= letterAlphabet;
    if ((str[i] - num) < 'A') {
      str[i] = (char) (str[i] + letterAlphabet - num);
    } else {
      str[i] = (char) (str[i] - num);
    }
  }

  public void lowercaseL(int i) {
    num %= letterAlphabet;
    if ((str[i] - num) < 'a') {
      str[i] = (char) (str[i] + letterAlphabet - num);
    } else {
      str[i] = (char) (str[i] - num);
    }
  }

  public void numberL(int i) {
    num %= digitNum;
    if ((str[i] - num) < '0') {
      str[i] = (char) (str[i] + digitNum - num);
    } else {
      str[i] = (char) (str[i] - num);
    }
  }

  public void showRight() {
    for (int i = 0; i < str.length; ++i) {
      if (str[i] >= 'A' && str[i] <= 'Z') {
        uppercaseR(i);
      } else if (str[i] >= 'a' && str[i] <= 'z') {
        lowercaseR(i);
      } else if (str[i] >= '0' && str[i] <= '9')
        numberR(i);
    }
    System.out.println(str);
  }

  public void showLeft() {
    for (int i = 0; i < str.length; ++i) {
      // num *= -1;
      if (str[i] >= 'A' && str[i] <= 'Z')
        uppercaseL(i);
      else if (str[i] >= 'a' && str[i] <= 'z')
        lowercaseL(i);
      else if (str[i] >= '0' && str[i] <= '9')
        numberL(i);
    }
    System.out.print(str);
  }

}
