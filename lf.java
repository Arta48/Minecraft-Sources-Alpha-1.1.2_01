public class lf {
   private Object[][] a;

   public lf() {
      this.a = new Object[][]{{ly.ai, di.n}, {ly.aj, di.m}, {ly.ay, di.l}};
   }

   public void a(dw var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         ly var3 = (ly)this.a[var2][0];
         di var4 = (di)this.a[var2][1];
         var1.a(new ev(var3), "###", "###", "###", '#', var4);
         var1.a(new ev(var4, 9), "#", '#', var3);
      }

   }
}
