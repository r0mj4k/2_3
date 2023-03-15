class Main {
  public static void main(String[] args) {
    int n=0;
    for(int i=0;i<=100;i++){
      if(i%2==0){
        System.out.println(i);
        n+=i;
      }
    }
    System.out.println(n);
  }
}