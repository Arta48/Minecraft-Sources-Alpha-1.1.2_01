import java.util.Random;

public class hv extends jp {
   int a = 0;
   boolean[] b = new boolean[4];
   int[] c = new int[4];

   protected hv(int var1, gb var2) {
      super(var1, var2);
   }

   private void j(cn var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      var1.a(var2, var3, var4, this.bc + 1, var5);
      var1.b(var2, var3, var4, var2, var3, var4);
      var1.h(var2, var3, var4);
   }

   public void a(cn var1, int var2, int var3, int var4, Random var5) {
      int var6 = this.h(var1, var2, var3, var4);
      boolean var7 = true;
      if (var6 > 0) {
         int var8 = -100;
         this.a = 0;
         var8 = this.f(var1, var2 - 1, var3, var4, var8);
         var8 = this.f(var1, var2 + 1, var3, var4, var8);
         var8 = this.f(var1, var2, var3, var4 - 1, var8);
         var8 = this.f(var1, var2, var3, var4 + 1, var8);
         int var9 = var8 + this.d;
         if (var9 >= 8 || var8 < 0) {
            var9 = -1;
         }

         if (this.h(var1, var2, var3 + 1, var4) >= 0) {
            int var10 = this.h(var1, var2, var3 + 1, var4);
            if (var10 >= 8) {
               var9 = var10;
            } else {
               var9 = var10 + 8;
            }
         }

         if (this.a >= 2 && this.bn == gb.f) {
            if (var1.g(var2, var3 - 1, var4)) {
               var9 = 0;
            } else if (var1.f(var2, var3 - 1, var4) == this.bn && var1.e(var2, var3, var4) == 0) {
               var9 = 0;
            }
         }

         if (this.bn == gb.g && var6 < 8 && var9 < 8 && var9 > var6 && var5.nextInt(4) != 0) {
            var9 = var6;
            var7 = false;
         }

         if (var9 != var6) {
            var6 = var9;
            if (var9 < 0) {
               var1.d(var2, var3, var4, 0);
            } else {
               var1.b(var2, var3, var4, var9);
               var1.h(var2, var3, var4, this.bc);
               var1.g(var2, var3, var4, this.bc);
            }
         } else if (var7) {
            this.j(var1, var2, var3, var4);
         }
      } else {
         this.j(var1, var2, var3, var4);
      }

      if (this.m(var1, var2, var3 - 1, var4)) {
         if (var6 >= 8) {
            var1.b(var2, var3 - 1, var4, this.bc, var6);
         } else {
            var1.b(var2, var3 - 1, var4, this.bc, var6 + 8);
         }
      } else if (var6 >= 0 && (var6 == 0 || this.l(var1, var2, var3 - 1, var4))) {
         boolean[] var15 = this.k(var1, var2, var3, var4);
         int var16 = var6 + this.d;
         if (var6 >= 8) {
            var16 = 1;
         }

         if (var16 >= 8) {
            return;
         }

         if (var15[0]) {
            this.g(var1, var2 - 1, var3, var4, var16);
         }

         if (var15[1]) {
            this.g(var1, var2 + 1, var3, var4, var16);
         }

         if (var15[2]) {
            this.g(var1, var2, var3, var4 - 1, var16);
         }

         if (var15[3]) {
            this.g(var1, var2, var3, var4 + 1, var16);
         }
      }

   }

   private void g(cn var1, int var2, int var3, int var4, int var5) {
      if (this.m(var1, var2, var3, var4)) {
         int var6 = var1.a(var2, var3, var4);
         if (var6 > 0) {
            if (this.bn == gb.g) {
               this.i(var1, var2, var3, var4);
            } else {
               ly.n[var6].b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
            }
         }

         var1.b(var2, var3, var4, this.bc, var5);
      }

   }

   private int a(cn var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 1000;

      for(int var8 = 0; var8 < 4; ++var8) {
         if ((var8 != 0 || var6 != 1) && (var8 != 1 || var6 != 0) && (var8 != 2 || var6 != 3) && (var8 != 3 || var6 != 2)) {
            int var9 = var2;
            int var11 = var4;
            if (var8 == 0) {
               var9 = var2 - 1;
            }

            if (var8 == 1) {
               ++var9;
            }

            if (var8 == 2) {
               var11 = var4 - 1;
            }

            if (var8 == 3) {
               ++var11;
            }

            if (!this.l(var1, var9, var3, var11) && (var1.f(var9, var3, var11) != this.bn || var1.e(var9, var3, var11) != 0)) {
               if (!this.l(var1, var9, var3 - 1, var11)) {
                  return var5;
               }

               if (var5 < 4) {
                  int var12 = this.a(var1, var9, var3, var11, var5 + 1, var8);
                  if (var12 < var7) {
                     var7 = var12;
                  }
               }
            }
         }
      }

      return var7;
   }

   private boolean[] k(cn var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < 4; ++var5) {
         this.c[var5] = 1000;
         int var6 = var2;
         int var8 = var4;
         if (var5 == 0) {
            var6 = var2 - 1;
         }

         if (var5 == 1) {
            ++var6;
         }

         if (var5 == 2) {
            var8 = var4 - 1;
         }

         if (var5 == 3) {
            ++var8;
         }

         if (!this.l(var1, var6, var3, var8) && (var1.f(var6, var3, var8) != this.bn || var1.e(var6, var3, var8) != 0)) {
            if (!this.l(var1, var6, var3 - 1, var8)) {
               this.c[var5] = 0;
            } else {
               this.c[var5] = this.a(var1, var6, var3, var8, 1, var5);
            }
         }
      }

      int var9 = this.c[0];

      for(int var10 = 1; var10 < 4; ++var10) {
         if (this.c[var10] < var9) {
            var9 = this.c[var10];
         }
      }

      for(int var11 = 0; var11 < 4; ++var11) {
         this.b[var11] = this.c[var11] == var9;
      }

      return this.b;
   }

   private boolean l(cn var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      if (var5 != ly.aF.bc && var5 != ly.aM.bc && var5 != ly.aE.bc && var5 != ly.aG.bc && var5 != ly.aY.bc) {
         if (var5 == 0) {
            return false;
         } else {
            gb var6 = ly.n[var5].bn;
            return var6.a();
         }
      } else {
         return true;
      }
   }

   protected int f(cn var1, int var2, int var3, int var4, int var5) {
      int var6 = this.h(var1, var2, var3, var4);
      if (var6 < 0) {
         return var5;
      } else {
         if (var6 == 0) {
            ++this.a;
         }

         if (var6 >= 8) {
            var6 = 0;
         }

         return var5 >= 0 && var6 >= var5 ? var5 : var6;
      }
   }

   private boolean m(cn var1, int var2, int var3, int var4) {
      gb var5 = var1.f(var2, var3, var4);
      if (var5 == this.bn) {
         return false;
      } else if (var5 == gb.g) {
         return false;
      } else {
         return !this.l(var1, var2, var3, var4);
      }
   }

   public void e(cn var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      if (var1.a(var2, var3, var4) == this.bc) {
         var1.h(var2, var3, var4, this.bc);
      }

   }
}
