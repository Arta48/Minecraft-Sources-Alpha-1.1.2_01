import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class je {
   public void a(cn var1, kh var2, double var3, double var5, double var7, float var9) {
      var1.a(var3, var5, var7, "random.explode", 4.0F, (1.0F + (var1.n.nextFloat() - var1.n.nextFloat()) * 0.2F) * 0.7F);
      HashSet var10 = new HashSet();
      byte var12 = 16;

      for(int var13 = 0; var13 < var12; ++var13) {
         for(int var14 = 0; var14 < var12; ++var14) {
            for(int var15 = 0; var15 < var12; ++var15) {
               if (var13 == 0 || var13 == var12 - 1 || var14 == 0 || var14 == var12 - 1 || var15 == 0 || var15 == var12 - 1) {
                  double var16 = (double)((float)var13 / ((float)var12 - 1.0F) * 2.0F - 1.0F);
                  double var18 = (double)((float)var14 / ((float)var12 - 1.0F) * 2.0F - 1.0F);
                  double var20 = (double)((float)var15 / ((float)var12 - 1.0F) * 2.0F - 1.0F);
                  double var22 = Math.sqrt(var16 * var16 + var18 * var18 + var20 * var20);
                  var16 /= var22;
                  var18 /= var22;
                  var20 /= var22;
                  float var24 = var9 * (0.7F + var1.n.nextFloat() * 0.6F);
                  double var25 = var3;
                  double var27 = var5;
                  double var29 = var7;

                  for(float var31 = 0.3F; var24 > 0.0F; var24 -= var31 * 0.75F) {
                     int var32 = eo.b(var25);
                     int var33 = eo.b(var27);
                     int var34 = eo.b(var29);
                     int var35 = var1.a(var32, var33, var34);
                     if (var35 > 0) {
                        var24 -= (ly.n[var35].a(var2) + 0.3F) * var31;
                     }

                     if (var24 > 0.0F) {
                        var10.add(new mt(var32, var33, var34));
                     }

                     var25 += var16 * (double)var31;
                     var27 += var18 * (double)var31;
                     var29 += var20 * (double)var31;
                  }
               }
            }
         }
      }

      var9 *= 2.0F;
      int var47 = eo.b(var3 - (double)var9 - (double)1.0F);
      int var48 = eo.b(var3 + (double)var9 + (double)1.0F);
      int var49 = eo.b(var5 - (double)var9 - (double)1.0F);
      int var51 = eo.b(var5 + (double)var9 + (double)1.0F);
      int var17 = eo.b(var7 - (double)var9 - (double)1.0F);
      int var53 = eo.b(var7 + (double)var9 + (double)1.0F);
      List var19 = var1.b(var2, cf.b((double)var47, (double)var49, (double)var17, (double)var48, (double)var51, (double)var53));
      aj var55 = aj.b(var3, var5, var7);

      for(int var21 = 0; var21 < var19.size(); ++var21) {
         kh var57 = (kh)var19.get(var21);
         double var23 = var57.e(var3, var5, var7) / (double)var9;
         if (var23 <= (double)1.0F) {
            double var61 = var57.ak - var3;
            double var64 = var57.al - var5;
            double var67 = var57.am - var7;
            double var70 = (double)eo.a(var61 * var61 + var64 * var64 + var67 * var67);
            var61 /= var70;
            var64 /= var70;
            var67 /= var70;
            double var72 = (double)var1.a(var55, var57.au);
            double var74 = ((double)1.0F - var23) * var72;
            var57.a(var2, (int)((var74 * var74 + var74) / (double)2.0F * (double)8.0F * (double)var9 + (double)1.0F));
            var57.an += var61 * var74;
            var57.ao += var64 * var74;
            var57.ap += var67 * var74;
         }
      }

      var9 = var9;
      ArrayList var56 = new ArrayList();
      var56.addAll(var10);

      for(int var58 = var56.size() - 1; var58 >= 0; --var58) {
         mt var59 = (mt)var56.get(var58);
         int var60 = var59.a;
         int var63 = var59.b;
         int var26 = var59.c;
         int var66 = var1.a(var60, var63, var26);

         for(int var28 = 0; var28 < 1; ++var28) {
            double var69 = (double)((float)var60 + var1.n.nextFloat());
            double var71 = (double)((float)var63 + var1.n.nextFloat());
            double var73 = (double)((float)var26 + var1.n.nextFloat());
            double var75 = var69 - var3;
            double var37 = var71 - var5;
            double var39 = var73 - var7;
            double var41 = (double)eo.a(var75 * var75 + var37 * var37 + var39 * var39);
            var75 /= var41;
            var37 /= var41;
            var39 /= var41;
            double var43 = (double)0.5F / (var41 / (double)var9 + 0.1);
            var43 *= (double)(var1.n.nextFloat() * var1.n.nextFloat() + 0.3F);
            var75 *= var43;
            var37 *= var43;
            var39 *= var43;
            var1.a("explode", (var69 + var3 * (double)1.0F) / (double)2.0F, (var71 + var5 * (double)1.0F) / (double)2.0F, (var73 + var7 * (double)1.0F) / (double)2.0F, var75, var37, var39);
            var1.a("smoke", var69, var71, var73, var75, var37, var39);
         }

         if (var66 > 0) {
            ly.n[var66].a(var1, var60, var63, var26, var1.e(var60, var63, var26), 0.3F);
            var1.d(var60, var63, var26, 0);
            ly.n[var66].c(var1, var60, var63, var26);
         }
      }

   }
}
