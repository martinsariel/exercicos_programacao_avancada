package exerciseJava;
public class Question47 {
  public static void main(String[] args) {
    int a1 = 1;
    int q = 3;
    int n =20;
     pgCalculate(a1,q,n);
	}
  public static void pgCalculate(int a1, int q, int n){
    int currTerm;
    for (int i = 0; i < n; i++) {
      currTerm = a1 * (int) Math.pow(q, i);
      System.out.print(currTerm + " ");
    }
  }
}