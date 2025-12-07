import java.util.HashSet;
import java.util.Set;

public class az {
   private int a;
   private Class b;
   private Class[] c;
   private Set d = new HashSet();

   public az(int var1, Class var2, Class[] var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(cn var1) {
      int var2 = var1.b(this.b);
      if (var2 < this.a) {
         for(int var3 = 0; var3 < 3; ++var3) {
            this.a(var1, 1, (nu)null);
         }
      }

   }

   protected mt a(cn var1, int var2, int var3) {
      int var4 = var2 + var1.n.nextInt(16);
      int var5 = var1.n.nextInt(128);
      int var6 = var3 + var1.n.nextInt(16);
      return new mt(var4, var5, var6);
   }

   private int a(cn var1, int var2, nu var3) {
      this.d.clear();

      for(int var4 = 0; var4 < var1.k.size(); ++var4) {
         dm var5 = (dm)var1.k.get(var4);
         int var6 = eo.b(var5.ak / (double)16.0F);
         int var7 = eo.b(var5.am / (double)16.0F);
         byte var8 = 4;

         for(int var9 = -var8; var9 <= var8; ++var9) {
            for(int var10 = -var8; var10 <= var8; ++var10) {
               this.d.add(new ol(var9 + var6, var10 + var7));
            }
         }
      }

      int var26 = 0;

      for(ol var28 : this.d) {
         if (var1.n.nextInt(10) == 0) {
            int var29 = var1.n.nextInt(this.c.length);
            mt var30 = this.a(var1, var28.a * 16, var28.b * 16);
            int var31 = var30.a;
            int var32 = var30.b;
            int var11 = var30.c;
            if (var1.g(var31, var32, var11)) {
               return 0;
            }

            if (var1.f(var31, var32, var11) != gb.a) {
               return 0;
            }

            for(int var12 = 0; var12 < 3; ++var12) {
               int var13 = var31;
               int var14 = var32;
               int var15 = var11;
               byte var16 = 6;

               for(int var17 = 0; var17 < 2; ++var17) {
                  var13 += var1.n.nextInt(var16) - var1.n.nextInt(var16);
                  var14 += var1.n.nextInt(1) - var1.n.nextInt(1);
                  var15 += var1.n.nextInt(var16) - var1.n.nextInt(var16);
                  if (var1.g(var13, var14 - 1, var15) && !var1.g(var13, var14, var15) && !var1.f(var13, var14, var15).d() && !var1.g(var13, var14 + 1, var15)) {
                     float var18 = (float)var13 + 0.5F;
                     float var19 = (float)var14;
                     float var20 = (float)var15 + 0.5F;
                     if (var1.a((double)var18, (double)var19, (double)var20, (double)24.0F) == null) {
                        float var21 = var18 - (float)var1.o;
                        float var22 = var19 - (float)var1.p;
                        float var23 = var20 - (float)var1.q;
                        float var24 = var21 * var21 + var22 * var22 + var23 * var23;
                        if (!(var24 < 576.0F)) {
                           try {
                              var33 = (ge)this.c[var29].getConstructor(cn.class).newInstance(var1);
                           } catch (Exception var25) {
                              var25.printStackTrace();
                              return var26;
                           }

                           var33.c((double)var18, (double)var19, (double)var20, var1.n.nextFloat() * 360.0F, 0.0F);
                           if (var33.a()) {
                              ++var26;
                              var1.a((kh)var33);
                              if (var33 instanceof ax && var1.n.nextInt(100) == 0) {
                                 cw var34 = new cw(var1);
                                 var34.c((double)var18, (double)var19, (double)var20, var33.aq, 0.0F);
                                 var1.a((kh)var34);
                                 var34.g(var33);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var26;
   }
}
