import java.util.Random;

public class gv extends ik {
   private int a;
   private int b;

   public gv(int var1) {
      this.a = ly.aX.bc;
      this.b = var1;
   }

   public boolean a(cn var1, Random var2, int var3, int var4, int var5) {
      if (var1.f(var3, var4, var5) != gb.f) {
         return false;
      } else {
         float var6 = var2.nextFloat() * (float)Math.PI;
         double var7 = (double)((float)(var3 + 8) + eo.a(var6) * (float)this.b / 8.0F);
         double var9 = (double)((float)(var3 + 8) - eo.a(var6) * (float)this.b / 8.0F);
         double var11 = (double)((float)(var5 + 8) + eo.b(var6) * (float)this.b / 8.0F);
         double var13 = (double)((float)(var5 + 8) - eo.b(var6) * (float)this.b / 8.0F);
         double var15 = (double)(var4 + var2.nextInt(3) + 2);
         double var17 = (double)(var4 + var2.nextInt(3) + 2);

         for(int var19 = 0; var19 <= this.b; ++var19) {
            double var20 = var7 + (var9 - var7) * (double)var19 / (double)this.b;
            double var22 = var15 + (var17 - var15) * (double)var19 / (double)this.b;
            double var24 = var11 + (var13 - var11) * (double)var19 / (double)this.b;
            double var26 = var2.nextDouble() * (double)this.b / (double)16.0F;
            double var28 = (double)(eo.a((float)var19 * (float)Math.PI / (float)this.b) + 1.0F) * var26 + (double)1.0F;
            double var30 = (double)(eo.a((float)var19 * (float)Math.PI / (float)this.b) + 1.0F) * var26 + (double)1.0F;

            for(int var32 = (int)(var20 - var28 / (double)2.0F); var32 <= (int)(var20 + var28 / (double)2.0F); ++var32) {
               for(int var33 = (int)(var22 - var30 / (double)2.0F); var33 <= (int)(var22 + var30 / (double)2.0F); ++var33) {
                  for(int var34 = (int)(var24 - var28 / (double)2.0F); var34 <= (int)(var24 + var28 / (double)2.0F); ++var34) {
                     double var35 = ((double)var32 + (double)0.5F - var20) / (var28 / (double)2.0F);
                     double var37 = ((double)var33 + (double)0.5F - var22) / (var30 / (double)2.0F);
                     double var39 = ((double)var34 + (double)0.5F - var24) / (var28 / (double)2.0F);
                     if (var35 * var35 + var37 * var37 + var39 * var39 < (double)1.0F) {
                        int var41 = var1.a(var32, var33, var34);
                        if (var41 == ly.F.bc) {
                           var1.a(var32, var33, var34, this.a);
                        }
                     }
                  }
               }
            }
         }

         return true;
      }
   }
}
