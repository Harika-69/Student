import java.io.InputStream;

class PrimeNum 
{
 public static void main(String[]args)
 {
   int temp;
   boolean isPrime=true;
     scanner scan;
     scan = new scanner(System.in);
     System.out.println("Enter any number:");
   int num=scan.nextInt();
   scan.close();
   for(int i=2;i<=num/2;i++)
   {
     temp=num%i;
     if(temp==0)
     {
      isPrime=false;
      break;
      }
     }
      if(isPrime)
         System.out.println(num+"is a Prime Number");
      else
         System.out.println(num+"is not a Prime Number");
    }

    private static class scanner {
        public scanner(InputStream in) {
        }

        public int nextInt() {
            return 0;
        }

        public void close() {
        }
    }
}