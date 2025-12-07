import java.util.Random;

public class cg extends ik {
   public boolean a(cn var1, Random var2, int var3, int var4, int var5) {
      byte var6 = 3;
      int var7 = var2.nextInt(2) + 2;
      int var8 = var2.nextInt(2) + 2;
      int var9 = 0;

      for(int var10 = var3 - var7 - 1; var10 <= var3 + var7 + 1; ++var10) {
         for(int var11 = var4 - 1; var11 <= var4 + var6 + 1; ++var11) {
            for(int var12 = var5 - var8 - 1; var12 <= var5 + var8 + 1; ++var12) {
               gb var13 = var1.f(var10, var11, var12);
               if (var11 == var4 - 1 && !var13.a()) {
                  return false;
               }

               if (var11 == var4 + var6 + 1 && !var13.a()) {
                  return false;
               }

               if ((var10 == var3 - var7 - 1 || var10 == var3 + var7 + 1 || var12 == var5 - var8 - 1 || var12 == var5 + var8 + 1) && var11 == var4 && var1.a(var10, var11, var12) == 0 && var1.a(var10, var11 + 1, var12) == 0) {
                  ++var9;
               }
            }
         }
      }

      if (var9 >= 1 && var9 <= 5) {
         for(int var19 = var3 - var7 - 1; var19 <= var3 + var7 + 1; ++var19) {
            for(int var22 = var4 + var6; var22 >= var4 - 1; --var22) {
               for(int var24 = var5 - var8 - 1; var24 <= var5 + var8 + 1; ++var24) {
                  if (var19 != var3 - var7 - 1 && var22 != var4 - 1 && var24 != var5 - var8 - 1 && var19 != var3 + var7 + 1 && var22 != var4 + var6 + 1 && var24 != var5 + var8 + 1) {
                     var1.d(var19, var22, var24, 0);
                  } else if (var22 >= 0 && !var1.f(var19, var22 - 1, var24).a()) {
                     var1.d(var19, var22, var24, 0);
                  } else if (var1.f(var19, var22, var24).a()) {
                     if (var22 == var4 - 1 && var2.nextInt(4) != 0) {
                        var1.d(var19, var22, var24, ly.ap.bc);
                     } else {
                        var1.d(var19, var22, var24, ly.x.bc);
                     }
                  }
               }
            }
         }

         for(int var20 = 0; var20 < 2; ++var20) {
            for(int var23 = 0; var23 < 3; ++var23) {
               int var25 = var3 + var2.nextInt(var7 * 2 + 1) - var7;
               int var14 = var5 + var2.nextInt(var8 * 2 + 1) - var8;
               if (var1.a(var25, var4, var14) == 0) {
                  int var15 = 0;
                  if (var1.f(var25 - 1, var4, var14).a()) {
                     ++var15;
                  }

                  if (var1.f(var25 + 1, var4, var14).a()) {
                     ++var15;
                  }

                  if (var1.f(var25, var4, var14 - 1).a()) {
                     ++var15;
                  }

                  if (var1.f(var25, var4, var14 + 1).a()) {
                     ++var15;
                  }

                  if (var15 == 1) {
                     var1.d(var25, var4, var14, ly.av.bc);
                     fe var16 = (fe)var1.b(var25, var4, var14);

                     for(int var17 = 0; var17 < 8; ++var17) {
                        ev var18 = this.a(var2);
                        if (var18 != null) {
                           var16.a(var2.nextInt(var16.c()), var18);
                        }
                     }
                     break;
                  }
               }
            }
         }

         var1.d(var3, var4, var5, ly.at.bc);
         bd var21 = (bd)var1.b(var3, var4, var5);
         var21.b = this.b(var2);
         return true;
      } else {
         return false;
      }
   }

   private ev a(Random var1) {
      int var2 = var1.nextInt(11);
      if (var2 == 0) {
         return new ev(di.ay);
      } else if (var2 == 1) {
         return new ev(di.m, var1.nextInt(4) + 1);
      } else if (var2 == 2) {
         return new ev(di.S);
      } else if (var2 == 3) {
         return new ev(di.R, var1.nextInt(4) + 1);
      } else if (var2 == 4) {
         return new ev(di.K, var1.nextInt(4) + 1);
      } else if (var2 == 5) {
         return new ev(di.I, var1.nextInt(4) + 1);
      } else if (var2 == 6) {
         return new ev(di.au);
      } else if (var2 == 7 && var1.nextInt(100) == 0) {
         return new ev(di.ar);
      } else if (var2 == 8 && var1.nextInt(2) == 0) {
         return new ev(di.aA, var1.nextInt(4) + 1);
      } else {
         return var2 == 9 && var1.nextInt(10) == 0 ? new ev(di.c[di.aQ.aS + var1.nextInt(2)]) : null;
      }
   }

   private String b(Random var1) {
      int var2 = var1.nextInt(4);
      if (var2 == 0) {
         return "Skeleton";
      } else if (var2 == 1) {
         return "Zombie";
      } else if (var2 == 2) {
         return "Zombie";
      } else {
         return var2 == 3 ? "Spider" : "";
      }
   }
}
