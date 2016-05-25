class ITP1_1_D {
 public String Time(int num) {
   int x= num,h=x/3600,m,s;
   x%=3600;
   m=x/60;
   x%=60;
   s=x;

   return h+":"+m+":"+s;
  }

}
