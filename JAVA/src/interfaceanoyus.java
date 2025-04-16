interface e{
    void add(int a,int b);
}
public class interfaceanoyus {
    public static void main(String[] args) {
      e obj =new e(){

          @Override
          public void add(int a, int b) {
              System.out.println(a+b);
          }
      };
        obj.add(1,1);
    }
}
