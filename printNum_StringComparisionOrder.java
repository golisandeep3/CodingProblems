/*
Output top N positive integer in string comparison order. For example, let's say N=1000, then you need to output in string comparison order as below: 
1, 10, 100, 1000, 101, 102, ... 109, 11, 110, ..

*/

class DFS
{
   public void printLex(String num)
   {

      if(Integer.parseInt(num) >1000)
      {
      return;
      }
      
      System.out.println(num);
      for(int i=0;i<10;i++)
      {
      dfs(num+i);
      }
   }
   
}
class Main
{
   public static void main (String[] args) throws java.lang.Exception
   {
      // your code goes here
      DFS w =new DFS();
      for(int i=1;i<10;i++)
        w.printLex(""+i);
   }
}
