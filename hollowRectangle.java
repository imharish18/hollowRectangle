public class hollowRectangle {
    public static void hollowRecta(int n){
        for(int i=1; i<=n; i++){ // Rows
            for(int j=1; j<=n+1; j++){ // Columns

                if(i==1 || j==1 || i==n || j==n+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println(""); //for next line
        }
    }
    public static void main(String[] args) {
        int n=4;

    }
}
