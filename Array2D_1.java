public class Array2D_1
{
  public static void main(String args[])
   {
      double percent[][];
      percent[0][0]=66.77;
      percent[1][2]=77.0;
      percent[2][4]=81.2;

for(int r=0;r<3;r++)
  {
    for(int c=0;c<6;c++)
     {
       System.out.print(percent[r][c]+ "\t");
     }
      System.out.println();
  }
}
}
