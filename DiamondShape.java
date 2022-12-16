public class DiamondShape {
    public static void main(String[] args) {
        for(int i=1; i<=5; ++i)
        {
            for(int k=1; k<=6-i; ++k)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; ++j)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=5; ++i)
        {
            for(int k=1; k<=i; ++k)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*(6-i)-1; ++j)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
