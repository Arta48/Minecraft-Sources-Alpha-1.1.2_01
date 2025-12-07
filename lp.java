import java.util.Random;

public class lp extends bk {
   private v[] a;
   private int b;

   public lp(Random var1, int var2) {
      this.b = var2;
      this.a = new v[var2];

      for(int var3 = 0; var3 < var2; ++var3) {
         this.a[var3] = new v(var1);
      }

   }

   public double a(double var1, double var3) {
      double var5 = (double)0.0F;
      double var7 = (double)1.0F;

      for(int var9 = 0; var9 < this.b; ++var9) {
         var5 += this.a[var9].a(var1 * var7, var3 * var7) / var7;
         var7 /= (double)2.0F;
      }

      return var5;
   }

   public double[] a(double[] var1, double var2, double var4, double var6, int var8, int var9, int var10, double var11, double var13, double var15) {
      if (var1 == null) {
         var1 = new double[var8 * var9 * var10];
      } else {
         for(int var17 = 0; var17 < var1.length; ++var17) {
            var1[var17] = (double)0.0F;
         }
      }

      double var20 = (double)1.0F;

      for(int var19 = 0; var19 < this.b; ++var19) {
         this.a[var19].a(var1, var2, var4, var6, var8, var9, var10, var11 * var20, var13 * var20, var15 * var20, var20);
         var20 /= (double)2.0F;
      }

      return var1;
   }
}
