import org.lwjgl.opengl.GL11;

public class bc {
   private nm a;
   private int b = -1;
   private boolean c = false;
   private boolean d = false;

   public bc(nm var1) {
      this.a = var1;
   }

   public bc() {
   }

   public void a(ly var1, int var2, int var3, int var4, int var5) {
      this.b = var5;
      this.a(var1, var2, var3, var4);
      this.b = -1;
   }

   public boolean a(ly var1, int var2, int var3, int var4) {
      int var5 = var1.f();
      var1.a(this.a, var2, var3, var4);
      if (var5 == 0) {
         return this.k(var1, var2, var3, var4);
      } else if (var5 == 4) {
         return this.j(var1, var2, var3, var4);
      } else if (var5 == 13) {
         return this.l(var1, var2, var3, var4);
      } else if (var5 == 1) {
         return this.h(var1, var2, var3, var4);
      } else if (var5 == 6) {
         return this.i(var1, var2, var3, var4);
      } else if (var5 == 2) {
         return this.b(var1, var2, var3, var4);
      } else if (var5 == 3) {
         return this.d(var1, var2, var3, var4);
      } else if (var5 == 5) {
         return this.e(var1, var2, var3, var4);
      } else if (var5 == 8) {
         return this.g(var1, var2, var3, var4);
      } else if (var5 == 7) {
         return this.o(var1, var2, var3, var4);
      } else if (var5 == 9) {
         return this.f(var1, var2, var3, var4);
      } else if (var5 == 10) {
         return this.n(var1, var2, var3, var4);
      } else if (var5 == 11) {
         return this.m(var1, var2, var3, var4);
      } else {
         return var5 == 12 ? this.c(var1, var2, var3, var4) : false;
      }
   }

   public boolean b(ly var1, int var2, int var3, int var4) {
      int var5 = this.a.e(var2, var3, var4);
      ho var6 = ho.a;
      float var7 = var1.c(this.a, var2, var3, var4);
      if (ly.t[var1.bc] > 0) {
         var7 = 1.0F;
      }

      var6.a(var7, var7, var7);
      double var8 = (double)0.4F;
      double var10 = (double)0.5F - var8;
      double var12 = (double)0.2F;
      if (var5 == 1) {
         this.a(var1, (double)var2 - var10, (double)var3 + var12, (double)var4, -var8, (double)0.0F);
      } else if (var5 == 2) {
         this.a(var1, (double)var2 + var10, (double)var3 + var12, (double)var4, var8, (double)0.0F);
      } else if (var5 == 3) {
         this.a(var1, (double)var2, (double)var3 + var12, (double)var4 - var10, (double)0.0F, -var8);
      } else if (var5 == 4) {
         this.a(var1, (double)var2, (double)var3 + var12, (double)var4 + var10, (double)0.0F, var8);
      } else {
         this.a(var1, (double)var2, (double)var3, (double)var4, (double)0.0F, (double)0.0F);
      }

      return true;
   }

   public boolean c(ly var1, int var2, int var3, int var4) {
      int var5 = this.a.e(var2, var3, var4);
      int var6 = var5 & 7;
      boolean var7 = (var5 & 8) > 0;
      ho var8 = ho.a;
      boolean var9 = this.b >= 0;
      if (!var9) {
         this.b = ly.x.bb;
      }

      float var10 = 0.25F;
      float var11 = 0.1875F;
      float var12 = 0.1875F;
      if (var6 == 5) {
         var1.a(0.5F - var11, 0.0F, 0.5F - var10, 0.5F + var11, var12, 0.5F + var10);
      } else if (var6 == 6) {
         var1.a(0.5F - var10, 0.0F, 0.5F - var11, 0.5F + var10, var12, 0.5F + var11);
      } else if (var6 == 4) {
         var1.a(0.5F - var11, 0.5F - var10, 1.0F - var12, 0.5F + var11, 0.5F + var10, 1.0F);
      } else if (var6 == 3) {
         var1.a(0.5F - var11, 0.5F - var10, 0.0F, 0.5F + var11, 0.5F + var10, var12);
      } else if (var6 == 2) {
         var1.a(1.0F - var12, 0.5F - var10, 0.5F - var11, 1.0F, 0.5F + var10, 0.5F + var11);
      } else if (var6 == 1) {
         var1.a(0.0F, 0.5F - var10, 0.5F - var11, var12, 0.5F + var10, 0.5F + var11);
      }

      this.k(var1, var2, var3, var4);
      if (!var9) {
         this.b = -1;
      }

      float var13 = var1.c(this.a, var2, var3, var4);
      if (ly.t[var1.bc] > 0) {
         var13 = 1.0F;
      }

      var8.a(var13, var13, var13);
      int var14 = var1.a(0);
      if (this.b >= 0) {
         var14 = this.b;
      }

      int var15 = (var14 & 15) << 4;
      int var16 = var14 & 240;
      float var17 = (float)var15 / 256.0F;
      float var18 = ((float)var15 + 15.99F) / 256.0F;
      float var19 = (float)var16 / 256.0F;
      float var20 = ((float)var16 + 15.99F) / 256.0F;
      aj[] var21 = new aj[8];
      float var22 = 0.0625F;
      float var23 = 0.0625F;
      float var24 = 0.625F;
      var21[0] = aj.b((double)(-var22), (double)0.0F, (double)(-var23));
      var21[1] = aj.b((double)var22, (double)0.0F, (double)(-var23));
      var21[2] = aj.b((double)var22, (double)0.0F, (double)var23);
      var21[3] = aj.b((double)(-var22), (double)0.0F, (double)var23);
      var21[4] = aj.b((double)(-var22), (double)var24, (double)(-var23));
      var21[5] = aj.b((double)var22, (double)var24, (double)(-var23));
      var21[6] = aj.b((double)var22, (double)var24, (double)var23);
      var21[7] = aj.b((double)(-var22), (double)var24, (double)var23);

      for(int var25 = 0; var25 < 8; ++var25) {
         if (var7) {
            var21[var25].c -= (double)0.0625F;
            var21[var25].a(0.69813174F);
         } else {
            var21[var25].c += (double)0.0625F;
            var21[var25].a(-0.69813174F);
         }

         if (var6 == 6) {
            var21[var25].b(((float)Math.PI / 2F));
         }

         if (var6 < 5) {
            var21[var25].b -= (double)0.375F;
            var21[var25].a(((float)Math.PI / 2F));
            if (var6 == 4) {
               var21[var25].b(0.0F);
            }

            if (var6 == 3) {
               var21[var25].b((float)Math.PI);
            }

            if (var6 == 2) {
               var21[var25].b(((float)Math.PI / 2F));
            }

            if (var6 == 1) {
               var21[var25].b((-(float)Math.PI / 2F));
            }

            var21[var25].a += (double)var2 + (double)0.5F;
            var21[var25].b += (double)((float)var3 + 0.5F);
            var21[var25].c += (double)var4 + (double)0.5F;
         } else {
            var21[var25].a += (double)var2 + (double)0.5F;
            var21[var25].b += (double)((float)var3 + 0.125F);
            var21[var25].c += (double)var4 + (double)0.5F;
         }
      }

      aj var30 = null;
      aj var26 = null;
      aj var27 = null;
      aj var28 = null;

      for(int var29 = 0; var29 < 6; ++var29) {
         if (var29 == 0) {
            var17 = (float)(var15 + 7) / 256.0F;
            var18 = ((float)(var15 + 9) - 0.01F) / 256.0F;
            var19 = (float)(var16 + 6) / 256.0F;
            var20 = ((float)(var16 + 8) - 0.01F) / 256.0F;
         } else if (var29 == 2) {
            var17 = (float)(var15 + 7) / 256.0F;
            var18 = ((float)(var15 + 9) - 0.01F) / 256.0F;
            var19 = (float)(var16 + 6) / 256.0F;
            var20 = ((float)(var16 + 16) - 0.01F) / 256.0F;
         }

         if (var29 == 0) {
            var30 = var21[0];
            var26 = var21[1];
            var27 = var21[2];
            var28 = var21[3];
         } else if (var29 == 1) {
            var30 = var21[7];
            var26 = var21[6];
            var27 = var21[5];
            var28 = var21[4];
         } else if (var29 == 2) {
            var30 = var21[1];
            var26 = var21[0];
            var27 = var21[4];
            var28 = var21[5];
         } else if (var29 == 3) {
            var30 = var21[2];
            var26 = var21[1];
            var27 = var21[5];
            var28 = var21[6];
         } else if (var29 == 4) {
            var30 = var21[3];
            var26 = var21[2];
            var27 = var21[6];
            var28 = var21[7];
         } else if (var29 == 5) {
            var30 = var21[0];
            var26 = var21[3];
            var27 = var21[7];
            var28 = var21[4];
         }

         var8.a(var30.a, var30.b, var30.c, (double)var17, (double)var20);
         var8.a(var26.a, var26.b, var26.c, (double)var18, (double)var20);
         var8.a(var27.a, var27.b, var27.c, (double)var18, (double)var19);
         var8.a(var28.a, var28.b, var28.c, (double)var17, (double)var19);
      }

      return true;
   }

   public boolean d(ly var1, int var2, int var3, int var4) {
      ho var5 = ho.a;
      int var6 = var1.a(0);
      if (this.b >= 0) {
         var6 = this.b;
      }

      float var7 = var1.c(this.a, var2, var3, var4);
      var5.a(var7, var7, var7);
      int var8 = (var6 & 15) << 4;
      int var9 = var6 & 240;
      double var10 = (double)((float)var8 / 256.0F);
      double var12 = (double)(((float)var8 + 15.99F) / 256.0F);
      double var14 = (double)((float)var9 / 256.0F);
      double var16 = (double)(((float)var9 + 15.99F) / 256.0F);
      float var18 = 1.4F;
      if (!this.a.g(var2, var3 - 1, var4) && !ly.as.b(this.a, var2, var3 - 1, var4)) {
         float var60 = 0.2F;
         float var20 = 0.0625F;
         if ((var2 + var3 + var4 & 1) == 1) {
            var10 = (double)((float)var8 / 256.0F);
            var12 = (double)(((float)var8 + 15.99F) / 256.0F);
            var14 = (double)((float)(var9 + 16) / 256.0F);
            var16 = (double)(((float)var9 + 15.99F + 16.0F) / 256.0F);
         }

         if ((var2 / 2 + var3 / 2 + var4 / 2 & 1) == 1) {
            double var62 = var12;
            var12 = var10;
            var10 = var62;
         }

         if (ly.as.b(this.a, var2 - 1, var3, var4)) {
            var5.a((double)((float)var2 + var60), (double)((float)var3 + var18 + var20), (double)(var4 + 1), var12, var14);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 1), var12, var16);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 0), var10, var16);
            var5.a((double)((float)var2 + var60), (double)((float)var3 + var18 + var20), (double)(var4 + 0), var10, var14);
            var5.a((double)((float)var2 + var60), (double)((float)var3 + var18 + var20), (double)(var4 + 0), var10, var14);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 0), var10, var16);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 1), var12, var16);
            var5.a((double)((float)var2 + var60), (double)((float)var3 + var18 + var20), (double)(var4 + 1), var12, var14);
         }

         if (ly.as.b(this.a, var2 + 1, var3, var4)) {
            var5.a((double)((float)(var2 + 1) - var60), (double)((float)var3 + var18 + var20), (double)(var4 + 0), var10, var14);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 0), var10, var16);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 1), var12, var16);
            var5.a((double)((float)(var2 + 1) - var60), (double)((float)var3 + var18 + var20), (double)(var4 + 1), var12, var14);
            var5.a((double)((float)(var2 + 1) - var60), (double)((float)var3 + var18 + var20), (double)(var4 + 1), var12, var14);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 1), var12, var16);
            var5.a((double)(var2 + 1 - 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 0), var10, var16);
            var5.a((double)((float)(var2 + 1) - var60), (double)((float)var3 + var18 + var20), (double)(var4 + 0), var10, var14);
         }

         if (ly.as.b(this.a, var2, var3, var4 - 1)) {
            var5.a((double)(var2 + 0), (double)((float)var3 + var18 + var20), (double)((float)var4 + var60), var12, var14);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 0), var12, var16);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var20), (double)(var4 + 0), var10, var16);
            var5.a((double)(var2 + 1), (double)((float)var3 + var18 + var20), (double)((float)var4 + var60), var10, var14);
            var5.a((double)(var2 + 1), (double)((float)var3 + var18 + var20), (double)((float)var4 + var60), var10, var14);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var20), (double)(var4 + 0), var10, var16);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 0), var12, var16);
            var5.a((double)(var2 + 0), (double)((float)var3 + var18 + var20), (double)((float)var4 + var60), var12, var14);
         }

         if (ly.as.b(this.a, var2, var3, var4 + 1)) {
            var5.a((double)(var2 + 1), (double)((float)var3 + var18 + var20), (double)((float)(var4 + 1) - var60), var10, var14);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var20), (double)(var4 + 1 - 0), var10, var16);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 1 - 0), var12, var16);
            var5.a((double)(var2 + 0), (double)((float)var3 + var18 + var20), (double)((float)(var4 + 1) - var60), var12, var14);
            var5.a((double)(var2 + 0), (double)((float)var3 + var18 + var20), (double)((float)(var4 + 1) - var60), var12, var14);
            var5.a((double)(var2 + 0), (double)((float)(var3 + 0) + var20), (double)(var4 + 1 - 0), var12, var16);
            var5.a((double)(var2 + 1), (double)((float)(var3 + 0) + var20), (double)(var4 + 1 - 0), var10, var16);
            var5.a((double)(var2 + 1), (double)((float)var3 + var18 + var20), (double)((float)(var4 + 1) - var60), var10, var14);
         }

         if (ly.as.b(this.a, var2, var3 + 1, var4)) {
            double var63 = (double)var2 + (double)0.5F + (double)0.5F;
            double var65 = (double)var2 + (double)0.5F - (double)0.5F;
            double var67 = (double)var4 + (double)0.5F + (double)0.5F;
            double var69 = (double)var4 + (double)0.5F - (double)0.5F;
            double var71 = (double)var2 + (double)0.5F - (double)0.5F;
            double var73 = (double)var2 + (double)0.5F + (double)0.5F;
            double var75 = (double)var4 + (double)0.5F - (double)0.5F;
            double var35 = (double)var4 + (double)0.5F + (double)0.5F;
            var10 = (double)((float)var8 / 256.0F);
            var12 = (double)(((float)var8 + 15.99F) / 256.0F);
            var14 = (double)((float)var9 / 256.0F);
            var16 = (double)(((float)var9 + 15.99F) / 256.0F);
            ++var3;
            var18 = -0.2F;
            if ((var2 + var3 + var4 & 1) == 0) {
               var5.a(var71, (double)((float)var3 + var18), (double)(var4 + 0), var12, var14);
               var5.a(var63, (double)(var3 + 0), (double)(var4 + 0), var12, var16);
               var5.a(var63, (double)(var3 + 0), (double)(var4 + 1), var10, var16);
               var5.a(var71, (double)((float)var3 + var18), (double)(var4 + 1), var10, var14);
               var10 = (double)((float)var8 / 256.0F);
               var12 = (double)(((float)var8 + 15.99F) / 256.0F);
               var14 = (double)((float)(var9 + 16) / 256.0F);
               var16 = (double)(((float)var9 + 15.99F + 16.0F) / 256.0F);
               var5.a(var73, (double)((float)var3 + var18), (double)(var4 + 1), var12, var14);
               var5.a(var65, (double)(var3 + 0), (double)(var4 + 1), var12, var16);
               var5.a(var65, (double)(var3 + 0), (double)(var4 + 0), var10, var16);
               var5.a(var73, (double)((float)var3 + var18), (double)(var4 + 0), var10, var14);
            } else {
               var5.a((double)(var2 + 0), (double)((float)var3 + var18), var35, var12, var14);
               var5.a((double)(var2 + 0), (double)(var3 + 0), var69, var12, var16);
               var5.a((double)(var2 + 1), (double)(var3 + 0), var69, var10, var16);
               var5.a((double)(var2 + 1), (double)((float)var3 + var18), var35, var10, var14);
               var10 = (double)((float)var8 / 256.0F);
               var12 = (double)(((float)var8 + 15.99F) / 256.0F);
               var14 = (double)((float)(var9 + 16) / 256.0F);
               var16 = (double)(((float)var9 + 15.99F + 16.0F) / 256.0F);
               var5.a((double)(var2 + 1), (double)((float)var3 + var18), var75, var12, var14);
               var5.a((double)(var2 + 1), (double)(var3 + 0), var67, var12, var16);
               var5.a((double)(var2 + 0), (double)(var3 + 0), var67, var10, var16);
               var5.a((double)(var2 + 0), (double)((float)var3 + var18), var75, var10, var14);
            }
         }
      } else {
         double var19 = (double)var2 + (double)0.5F + 0.2;
         double var21 = (double)var2 + (double)0.5F - 0.2;
         double var23 = (double)var4 + (double)0.5F + 0.2;
         double var25 = (double)var4 + (double)0.5F - 0.2;
         double var27 = (double)var2 + (double)0.5F - 0.3;
         double var29 = (double)var2 + (double)0.5F + 0.3;
         double var31 = (double)var4 + (double)0.5F - 0.3;
         double var33 = (double)var4 + (double)0.5F + 0.3;
         var5.a(var27, (double)((float)var3 + var18), (double)(var4 + 1), var12, var14);
         var5.a(var19, (double)(var3 + 0), (double)(var4 + 1), var12, var16);
         var5.a(var19, (double)(var3 + 0), (double)(var4 + 0), var10, var16);
         var5.a(var27, (double)((float)var3 + var18), (double)(var4 + 0), var10, var14);
         var5.a(var29, (double)((float)var3 + var18), (double)(var4 + 0), var12, var14);
         var5.a(var21, (double)(var3 + 0), (double)(var4 + 0), var12, var16);
         var5.a(var21, (double)(var3 + 0), (double)(var4 + 1), var10, var16);
         var5.a(var29, (double)((float)var3 + var18), (double)(var4 + 1), var10, var14);
         var10 = (double)((float)var8 / 256.0F);
         var12 = (double)(((float)var8 + 15.99F) / 256.0F);
         var14 = (double)((float)(var9 + 16) / 256.0F);
         var16 = (double)(((float)var9 + 15.99F + 16.0F) / 256.0F);
         var5.a((double)(var2 + 1), (double)((float)var3 + var18), var33, var12, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var25, var12, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var25, var10, var16);
         var5.a((double)(var2 + 0), (double)((float)var3 + var18), var33, var10, var14);
         var5.a((double)(var2 + 0), (double)((float)var3 + var18), var31, var12, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var23, var12, var16);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var23, var10, var16);
         var5.a((double)(var2 + 1), (double)((float)var3 + var18), var31, var10, var14);
         var19 = (double)var2 + (double)0.5F - (double)0.5F;
         var21 = (double)var2 + (double)0.5F + (double)0.5F;
         var23 = (double)var4 + (double)0.5F - (double)0.5F;
         var25 = (double)var4 + (double)0.5F + (double)0.5F;
         var27 = (double)var2 + (double)0.5F - 0.4;
         var29 = (double)var2 + (double)0.5F + 0.4;
         var31 = (double)var4 + (double)0.5F - 0.4;
         var33 = (double)var4 + (double)0.5F + 0.4;
         var5.a(var27, (double)((float)var3 + var18), (double)(var4 + 0), var10, var14);
         var5.a(var19, (double)(var3 + 0), (double)(var4 + 0), var10, var16);
         var5.a(var19, (double)(var3 + 0), (double)(var4 + 1), var12, var16);
         var5.a(var27, (double)((float)var3 + var18), (double)(var4 + 1), var12, var14);
         var5.a(var29, (double)((float)var3 + var18), (double)(var4 + 1), var10, var14);
         var5.a(var21, (double)(var3 + 0), (double)(var4 + 1), var10, var16);
         var5.a(var21, (double)(var3 + 0), (double)(var4 + 0), var12, var16);
         var5.a(var29, (double)((float)var3 + var18), (double)(var4 + 0), var12, var14);
         var10 = (double)((float)var8 / 256.0F);
         var12 = (double)(((float)var8 + 15.99F) / 256.0F);
         var14 = (double)((float)var9 / 256.0F);
         var16 = (double)(((float)var9 + 15.99F) / 256.0F);
         var5.a((double)(var2 + 0), (double)((float)var3 + var18), var33, var10, var14);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var25, var10, var16);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var25, var12, var16);
         var5.a((double)(var2 + 1), (double)((float)var3 + var18), var33, var12, var14);
         var5.a((double)(var2 + 1), (double)((float)var3 + var18), var31, var10, var14);
         var5.a((double)(var2 + 1), (double)(var3 + 0), var23, var10, var16);
         var5.a((double)(var2 + 0), (double)(var3 + 0), var23, var12, var16);
         var5.a((double)(var2 + 0), (double)((float)var3 + var18), var31, var12, var14);
      }

      return true;
   }

   public boolean e(ly var1, int var2, int var3, int var4) {
      ho var5 = ho.a;
      int var6 = var1.a(1, this.a.e(var2, var3, var4));
      if (this.b >= 0) {
         var6 = this.b;
      }

      float var7 = var1.c(this.a, var2, var3, var4);
      var5.a(var7, var7, var7);
      int var8 = (var6 & 15) << 4;
      int var9 = var6 & 240;
      double var10 = (double)((float)var8 / 256.0F);
      double var12 = (double)(((float)var8 + 15.99F) / 256.0F);
      double var14 = (double)((float)var9 / 256.0F);
      double var16 = (double)(((float)var9 + 15.99F) / 256.0F);
      float var18 = 0.0F;
      float var19 = 0.03125F;
      boolean var20 = kf.b(this.a, var2 - 1, var3, var4) || !this.a.g(var2 - 1, var3, var4) && kf.b(this.a, var2 - 1, var3 - 1, var4);
      boolean var21 = kf.b(this.a, var2 + 1, var3, var4) || !this.a.g(var2 + 1, var3, var4) && kf.b(this.a, var2 + 1, var3 - 1, var4);
      boolean var22 = kf.b(this.a, var2, var3, var4 - 1) || !this.a.g(var2, var3, var4 - 1) && kf.b(this.a, var2, var3 - 1, var4 - 1);
      boolean var23 = kf.b(this.a, var2, var3, var4 + 1) || !this.a.g(var2, var3, var4 + 1) && kf.b(this.a, var2, var3 - 1, var4 + 1);
      if (!this.a.g(var2, var3 + 1, var4)) {
         if (this.a.g(var2 - 1, var3, var4) && kf.b(this.a, var2 - 1, var3 + 1, var4)) {
            var20 = true;
         }

         if (this.a.g(var2 + 1, var3, var4) && kf.b(this.a, var2 + 1, var3 + 1, var4)) {
            var21 = true;
         }

         if (this.a.g(var2, var3, var4 - 1) && kf.b(this.a, var2, var3 + 1, var4 - 1)) {
            var22 = true;
         }

         if (this.a.g(var2, var3, var4 + 1) && kf.b(this.a, var2, var3 + 1, var4 + 1)) {
            var23 = true;
         }
      }

      float var24 = 0.3125F;
      float var25 = (float)(var2 + 0);
      float var26 = (float)(var2 + 1);
      float var27 = (float)(var4 + 0);
      float var28 = (float)(var4 + 1);
      byte var29 = 0;
      if ((var20 || var21) && !var22 && !var23) {
         var29 = 1;
      }

      if ((var22 || var23) && !var21 && !var20) {
         var29 = 2;
      }

      if (var29 != 0) {
         var10 = (double)((float)(var8 + 16) / 256.0F);
         var12 = (double)(((float)(var8 + 16) + 15.99F) / 256.0F);
         var14 = (double)((float)var9 / 256.0F);
         var16 = (double)(((float)var9 + 15.99F) / 256.0F);
      }

      if (var29 == 0) {
         if (var21 || var22 || var23 || var20) {
            if (!var20) {
               var25 += var24;
            }

            if (!var20) {
               var10 += (double)(var24 / 16.0F);
            }

            if (!var21) {
               var26 -= var24;
            }

            if (!var21) {
               var12 -= (double)(var24 / 16.0F);
            }

            if (!var22) {
               var27 += var24;
            }

            if (!var22) {
               var14 += (double)(var24 / 16.0F);
            }

            if (!var23) {
               var28 -= var24;
            }

            if (!var23) {
               var16 -= (double)(var24 / 16.0F);
            }
         }

         var5.a((double)(var26 + var18), (double)((float)var3 + var19), (double)(var28 + var18), var12, var16);
         var5.a((double)(var26 + var18), (double)((float)var3 + var19), (double)(var27 - var18), var12, var14);
         var5.a((double)(var25 - var18), (double)((float)var3 + var19), (double)(var27 - var18), var10, var14);
         var5.a((double)(var25 - var18), (double)((float)var3 + var19), (double)(var28 + var18), var10, var16);
      }

      if (var29 == 1) {
         var5.a((double)(var26 + var18), (double)((float)var3 + var19), (double)(var28 + var18), var12, var16);
         var5.a((double)(var26 + var18), (double)((float)var3 + var19), (double)(var27 - var18), var12, var14);
         var5.a((double)(var25 - var18), (double)((float)var3 + var19), (double)(var27 - var18), var10, var14);
         var5.a((double)(var25 - var18), (double)((float)var3 + var19), (double)(var28 + var18), var10, var16);
      }

      if (var29 == 2) {
         var5.a((double)(var26 + var18), (double)((float)var3 + var19), (double)(var28 + var18), var12, var16);
         var5.a((double)(var26 + var18), (double)((float)var3 + var19), (double)(var27 - var18), var10, var16);
         var5.a((double)(var25 - var18), (double)((float)var3 + var19), (double)(var27 - var18), var10, var14);
         var5.a((double)(var25 - var18), (double)((float)var3 + var19), (double)(var28 + var18), var12, var14);
      }

      var10 = (double)((float)(var8 + 16) / 256.0F);
      var12 = (double)(((float)(var8 + 16) + 15.99F) / 256.0F);
      var14 = (double)((float)var9 / 256.0F);
      var16 = (double)(((float)var9 + 15.99F) / 256.0F);
      if (!this.a.g(var2, var3 + 1, var4)) {
         if (this.a.g(var2 - 1, var3, var4) && this.a.a(var2 - 1, var3 + 1, var4) == ly.aw.bc) {
            var5.a((double)((float)var2 + var19), (double)((float)(var3 + 1) + var18), (double)((float)(var4 + 1) + var18), var12, var14);
            var5.a((double)((float)var2 + var19), (double)((float)(var3 + 0) - var18), (double)((float)(var4 + 1) + var18), var10, var14);
            var5.a((double)((float)var2 + var19), (double)((float)(var3 + 0) - var18), (double)((float)(var4 + 0) - var18), var10, var16);
            var5.a((double)((float)var2 + var19), (double)((float)(var3 + 1) + var18), (double)((float)(var4 + 0) - var18), var12, var16);
         }

         if (this.a.g(var2 + 1, var3, var4) && this.a.a(var2 + 1, var3 + 1, var4) == ly.aw.bc) {
            var5.a((double)((float)(var2 + 1) - var19), (double)((float)(var3 + 0) - var18), (double)((float)(var4 + 1) + var18), var10, var16);
            var5.a((double)((float)(var2 + 1) - var19), (double)((float)(var3 + 1) + var18), (double)((float)(var4 + 1) + var18), var12, var16);
            var5.a((double)((float)(var2 + 1) - var19), (double)((float)(var3 + 1) + var18), (double)((float)(var4 + 0) - var18), var12, var14);
            var5.a((double)((float)(var2 + 1) - var19), (double)((float)(var3 + 0) - var18), (double)((float)(var4 + 0) - var18), var10, var14);
         }

         if (this.a.g(var2, var3, var4 - 1) && this.a.a(var2, var3 + 1, var4 - 1) == ly.aw.bc) {
            var5.a((double)((float)(var2 + 1) + var18), (double)((float)(var3 + 0) - var18), (double)((float)var4 + var19), var10, var16);
            var5.a((double)((float)(var2 + 1) + var18), (double)((float)(var3 + 1) + var18), (double)((float)var4 + var19), var12, var16);
            var5.a((double)((float)(var2 + 0) - var18), (double)((float)(var3 + 1) + var18), (double)((float)var4 + var19), var12, var14);
            var5.a((double)((float)(var2 + 0) - var18), (double)((float)(var3 + 0) - var18), (double)((float)var4 + var19), var10, var14);
         }

         if (this.a.g(var2, var3, var4 + 1) && this.a.a(var2, var3 + 1, var4 + 1) == ly.aw.bc) {
            var5.a((double)((float)(var2 + 1) + var18), (double)((float)(var3 + 1) + var18), (double)((float)(var4 + 1) - var19), var12, var14);
            var5.a((double)((float)(var2 + 1) + var18), (double)((float)(var3 + 0) - var18), (double)((float)(var4 + 1) - var19), var10, var14);
            var5.a((double)((float)(var2 + 0) - var18), (double)((float)(var3 + 0) - var18), (double)((float)(var4 + 1) - var19), var10, var16);
            var5.a((double)((float)(var2 + 0) - var18), (double)((float)(var3 + 1) + var18), (double)((float)(var4 + 1) - var19), var12, var16);
         }
      }

      return true;
   }

   public boolean f(ly var1, int var2, int var3, int var4) {
      ho var5 = ho.a;
      int var6 = this.a.e(var2, var3, var4);
      int var7 = var1.a(0, var6);
      if (this.b >= 0) {
         var7 = this.b;
      }

      float var8 = var1.c(this.a, var2, var3, var4);
      var5.a(var8, var8, var8);
      int var9 = (var7 & 15) << 4;
      int var10 = var7 & 240;
      double var11 = (double)((float)var9 / 256.0F);
      double var13 = (double)(((float)var9 + 15.99F) / 256.0F);
      double var15 = (double)((float)var10 / 256.0F);
      double var17 = (double)(((float)var10 + 15.99F) / 256.0F);
      float var19 = 0.0625F;
      float var20 = (float)(var2 + 1);
      float var21 = (float)(var2 + 1);
      float var22 = (float)(var2 + 0);
      float var23 = (float)(var2 + 0);
      float var24 = (float)(var4 + 0);
      float var25 = (float)(var4 + 1);
      float var26 = (float)(var4 + 1);
      float var27 = (float)(var4 + 0);
      float var28 = (float)var3 + var19;
      float var29 = (float)var3 + var19;
      float var30 = (float)var3 + var19;
      float var31 = (float)var3 + var19;
      if (var6 != 1 && var6 != 2 && var6 != 3 && var6 != 7) {
         if (var6 == 8) {
            var20 = var21 = (float)(var2 + 0);
            var22 = var23 = (float)(var2 + 1);
            var24 = var27 = (float)(var4 + 1);
            var25 = var26 = (float)(var4 + 0);
         } else if (var6 == 9) {
            var20 = var23 = (float)(var2 + 0);
            var21 = var22 = (float)(var2 + 1);
            var24 = var25 = (float)(var4 + 0);
            var26 = var27 = (float)(var4 + 1);
         }
      } else {
         var20 = var23 = (float)(var2 + 1);
         var21 = var22 = (float)(var2 + 0);
         var24 = var25 = (float)(var4 + 1);
         var26 = var27 = (float)(var4 + 0);
      }

      if (var6 != 2 && var6 != 4) {
         if (var6 == 3 || var6 == 5) {
            ++var29;
            ++var30;
         }
      } else {
         ++var28;
         ++var31;
      }

      var5.a((double)var20, (double)var28, (double)var24, var13, var15);
      var5.a((double)var21, (double)var29, (double)var25, var13, var17);
      var5.a((double)var22, (double)var30, (double)var26, var11, var17);
      var5.a((double)var23, (double)var31, (double)var27, var11, var15);
      var5.a((double)var23, (double)var31, (double)var27, var11, var15);
      var5.a((double)var22, (double)var30, (double)var26, var11, var17);
      var5.a((double)var21, (double)var29, (double)var25, var13, var17);
      var5.a((double)var20, (double)var28, (double)var24, var13, var15);
      return true;
   }

   public boolean g(ly var1, int var2, int var3, int var4) {
      ho var5 = ho.a;
      int var6 = var1.a(0);
      if (this.b >= 0) {
         var6 = this.b;
      }

      float var7 = var1.c(this.a, var2, var3, var4);
      var5.a(var7, var7, var7);
      int var8 = (var6 & 15) << 4;
      int var9 = var6 & 240;
      double var10 = (double)((float)var8 / 256.0F);
      double var12 = (double)(((float)var8 + 15.99F) / 256.0F);
      double var14 = (double)((float)var9 / 256.0F);
      double var16 = (double)(((float)var9 + 15.99F) / 256.0F);
      int var18 = this.a.e(var2, var3, var4);
      float var19 = 0.0F;
      float var20 = 0.05F;
      if (var18 == 5) {
         var5.a((double)((float)var2 + var20), (double)((float)(var3 + 1) + var19), (double)((float)(var4 + 1) + var19), var10, var14);
         var5.a((double)((float)var2 + var20), (double)((float)(var3 + 0) - var19), (double)((float)(var4 + 1) + var19), var10, var16);
         var5.a((double)((float)var2 + var20), (double)((float)(var3 + 0) - var19), (double)((float)(var4 + 0) - var19), var12, var16);
         var5.a((double)((float)var2 + var20), (double)((float)(var3 + 1) + var19), (double)((float)(var4 + 0) - var19), var12, var14);
      }

      if (var18 == 4) {
         var5.a((double)((float)(var2 + 1) - var20), (double)((float)(var3 + 0) - var19), (double)((float)(var4 + 1) + var19), var12, var16);
         var5.a((double)((float)(var2 + 1) - var20), (double)((float)(var3 + 1) + var19), (double)((float)(var4 + 1) + var19), var12, var14);
         var5.a((double)((float)(var2 + 1) - var20), (double)((float)(var3 + 1) + var19), (double)((float)(var4 + 0) - var19), var10, var14);
         var5.a((double)((float)(var2 + 1) - var20), (double)((float)(var3 + 0) - var19), (double)((float)(var4 + 0) - var19), var10, var16);
      }

      if (var18 == 3) {
         var5.a((double)((float)(var2 + 1) + var19), (double)((float)(var3 + 0) - var19), (double)((float)var4 + var20), var12, var16);
         var5.a((double)((float)(var2 + 1) + var19), (double)((float)(var3 + 1) + var19), (double)((float)var4 + var20), var12, var14);
         var5.a((double)((float)(var2 + 0) - var19), (double)((float)(var3 + 1) + var19), (double)((float)var4 + var20), var10, var14);
         var5.a((double)((float)(var2 + 0) - var19), (double)((float)(var3 + 0) - var19), (double)((float)var4 + var20), var10, var16);
      }

      if (var18 == 2) {
         var5.a((double)((float)(var2 + 1) + var19), (double)((float)(var3 + 1) + var19), (double)((float)(var4 + 1) - var20), var10, var14);
         var5.a((double)((float)(var2 + 1) + var19), (double)((float)(var3 + 0) - var19), (double)((float)(var4 + 1) - var20), var10, var16);
         var5.a((double)((float)(var2 + 0) - var19), (double)((float)(var3 + 0) - var19), (double)((float)(var4 + 1) - var20), var12, var16);
         var5.a((double)((float)(var2 + 0) - var19), (double)((float)(var3 + 1) + var19), (double)((float)(var4 + 1) - var20), var12, var14);
      }

      return true;
   }

   public boolean h(ly var1, int var2, int var3, int var4) {
      ho var5 = ho.a;
      float var6 = var1.c(this.a, var2, var3, var4);
      var5.a(var6, var6, var6);
      this.a(var1, this.a.e(var2, var3, var4), (double)var2, (double)var3, (double)var4);
      return true;
   }

   public boolean i(ly var1, int var2, int var3, int var4) {
      ho var5 = ho.a;
      float var6 = var1.c(this.a, var2, var3, var4);
      var5.a(var6, var6, var6);
      this.b(var1, this.a.e(var2, var3, var4), (double)var2, (double)((float)var3 - 0.0625F), (double)var4);
      return true;
   }

   public void a(ly var1, double var2, double var4, double var6, double var8, double var10) {
      ho var12 = ho.a;
      int var13 = var1.a(0);
      if (this.b >= 0) {
         var13 = this.b;
      }

      int var14 = (var13 & 15) << 4;
      int var15 = var13 & 240;
      float var16 = (float)var14 / 256.0F;
      float var17 = ((float)var14 + 15.99F) / 256.0F;
      float var18 = (float)var15 / 256.0F;
      float var19 = ((float)var15 + 15.99F) / 256.0F;
      double var20 = (double)var16 + (double)0.02734375F;
      double var22 = (double)var18 + (double)0.0234375F;
      double var24 = (double)var16 + (double)0.03515625F;
      double var26 = (double)var18 + (double)0.03125F;
      var2 += (double)0.5F;
      var6 += (double)0.5F;
      double var28 = var2 - (double)0.5F;
      double var30 = var2 + (double)0.5F;
      double var32 = var6 - (double)0.5F;
      double var34 = var6 + (double)0.5F;
      double var36 = (double)0.0625F;
      double var38 = (double)0.625F;
      var12.a(var2 + var8 * ((double)1.0F - var38) - var36, var4 + var38, var6 + var10 * ((double)1.0F - var38) - var36, var20, var22);
      var12.a(var2 + var8 * ((double)1.0F - var38) - var36, var4 + var38, var6 + var10 * ((double)1.0F - var38) + var36, var20, var26);
      var12.a(var2 + var8 * ((double)1.0F - var38) + var36, var4 + var38, var6 + var10 * ((double)1.0F - var38) + var36, var24, var26);
      var12.a(var2 + var8 * ((double)1.0F - var38) + var36, var4 + var38, var6 + var10 * ((double)1.0F - var38) - var36, var24, var22);
      var12.a(var2 - var36, var4 + (double)1.0F, var32, (double)var16, (double)var18);
      var12.a(var2 - var36 + var8, var4 + (double)0.0F, var32 + var10, (double)var16, (double)var19);
      var12.a(var2 - var36 + var8, var4 + (double)0.0F, var34 + var10, (double)var17, (double)var19);
      var12.a(var2 - var36, var4 + (double)1.0F, var34, (double)var17, (double)var18);
      var12.a(var2 + var36, var4 + (double)1.0F, var34, (double)var16, (double)var18);
      var12.a(var2 + var8 + var36, var4 + (double)0.0F, var34 + var10, (double)var16, (double)var19);
      var12.a(var2 + var8 + var36, var4 + (double)0.0F, var32 + var10, (double)var17, (double)var19);
      var12.a(var2 + var36, var4 + (double)1.0F, var32, (double)var17, (double)var18);
      var12.a(var28, var4 + (double)1.0F, var6 + var36, (double)var16, (double)var18);
      var12.a(var28 + var8, var4 + (double)0.0F, var6 + var36 + var10, (double)var16, (double)var19);
      var12.a(var30 + var8, var4 + (double)0.0F, var6 + var36 + var10, (double)var17, (double)var19);
      var12.a(var30, var4 + (double)1.0F, var6 + var36, (double)var17, (double)var18);
      var12.a(var30, var4 + (double)1.0F, var6 - var36, (double)var16, (double)var18);
      var12.a(var30 + var8, var4 + (double)0.0F, var6 - var36 + var10, (double)var16, (double)var19);
      var12.a(var28 + var8, var4 + (double)0.0F, var6 - var36 + var10, (double)var17, (double)var19);
      var12.a(var28, var4 + (double)1.0F, var6 - var36, (double)var17, (double)var18);
   }

   public void a(ly var1, int var2, double var3, double var5, double var7) {
      ho var9 = ho.a;
      int var10 = var1.a(0, var2);
      if (this.b >= 0) {
         var10 = this.b;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 240;
      double var13 = (double)((float)var11 / 256.0F);
      double var15 = (double)(((float)var11 + 15.99F) / 256.0F);
      double var17 = (double)((float)var12 / 256.0F);
      double var19 = (double)(((float)var12 + 15.99F) / 256.0F);
      double var21 = var3 + (double)0.5F - (double)0.45F;
      double var23 = var3 + (double)0.5F + (double)0.45F;
      double var25 = var7 + (double)0.5F - (double)0.45F;
      double var27 = var7 + (double)0.5F + (double)0.45F;
      var9.a(var21, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var27, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var21, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var27, var15, var17);
   }

   public void b(ly var1, int var2, double var3, double var5, double var7) {
      ho var9 = ho.a;
      int var10 = var1.a(0, var2);
      if (this.b >= 0) {
         var10 = this.b;
      }

      int var11 = (var10 & 15) << 4;
      int var12 = var10 & 240;
      double var13 = (double)((float)var11 / 256.0F);
      double var15 = (double)(((float)var11 + 15.99F) / 256.0F);
      double var17 = (double)((float)var12 / 256.0F);
      double var19 = (double)(((float)var12 + 15.99F) / 256.0F);
      double var21 = var3 + (double)0.5F - (double)0.25F;
      double var23 = var3 + (double)0.5F + (double)0.25F;
      double var25 = var7 + (double)0.5F - (double)0.5F;
      double var27 = var7 + (double)0.5F + (double)0.5F;
      var9.a(var21, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var27, var15, var17);
      var9.a(var21, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var27, var15, var17);
      var21 = var3 + (double)0.5F - (double)0.5F;
      var23 = var3 + (double)0.5F + (double)0.5F;
      var25 = var7 + (double)0.5F - (double)0.25F;
      var27 = var7 + (double)0.5F + (double)0.25F;
      var9.a(var21, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var25, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var25, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var25, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var25, var15, var17);
      var9.a(var23, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var23, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var21, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var21, var5 + (double)1.0F, var27, var15, var17);
      var9.a(var21, var5 + (double)1.0F, var27, var13, var17);
      var9.a(var21, var5 + (double)0.0F, var27, var13, var19);
      var9.a(var23, var5 + (double)0.0F, var27, var15, var19);
      var9.a(var23, var5 + (double)1.0F, var27, var15, var17);
   }

   public boolean j(ly var1, int var2, int var3, int var4) {
      ho var5 = ho.a;
      boolean var6 = var1.c((nm)this.a, var2, var3 + 1, var4, 1);
      boolean var7 = var1.c((nm)this.a, var2, var3 - 1, var4, 0);
      boolean[] var8 = new boolean[]{var1.c((nm)this.a, var2, var3, var4 - 1, 2), var1.c((nm)this.a, var2, var3, var4 + 1, 3), var1.c((nm)this.a, var2 - 1, var3, var4, 4), var1.c((nm)this.a, var2 + 1, var3, var4, 5)};
      if (!var6 && !var7 && !var8[0] && !var8[1] && !var8[2] && !var8[3]) {
         return false;
      } else {
         boolean var9 = false;
         float var10 = 0.5F;
         float var11 = 1.0F;
         float var12 = 0.8F;
         float var13 = 0.6F;
         double var14 = (double)0.0F;
         double var16 = (double)1.0F;
         gb var18 = var1.bn;
         int var19 = this.a.e(var2, var3, var4);
         float var20 = this.a(var2, var3, var4, var18);
         float var21 = this.a(var2, var3, var4 + 1, var18);
         float var22 = this.a(var2 + 1, var3, var4 + 1, var18);
         float var23 = this.a(var2 + 1, var3, var4, var18);
         if (this.d || var6) {
            var9 = true;
            int var24 = var1.a(1, var19);
            float var25 = (float)jp.a(this.a, var2, var3, var4, var18);
            if (var25 > -999.0F) {
               var24 = var1.a(2, var19);
            }

            int var26 = (var24 & 15) << 4;
            int var27 = var24 & 240;
            double var28 = ((double)var26 + (double)8.0F) / (double)256.0F;
            double var30 = ((double)var27 + (double)8.0F) / (double)256.0F;
            if (var25 < -999.0F) {
               var25 = 0.0F;
            } else {
               var28 = (double)((float)(var26 + 16) / 256.0F);
               var30 = (double)((float)(var27 + 16) / 256.0F);
            }

            float var32 = eo.a(var25) * 8.0F / 256.0F;
            float var33 = eo.b(var25) * 8.0F / 256.0F;
            float var34 = var1.c(this.a, var2, var3, var4);
            var5.a(var11 * var34, var11 * var34, var11 * var34);
            var5.a((double)(var2 + 0), (double)((float)var3 + var20), (double)(var4 + 0), var28 - (double)var33 - (double)var32, var30 - (double)var33 + (double)var32);
            var5.a((double)(var2 + 0), (double)((float)var3 + var21), (double)(var4 + 1), var28 - (double)var33 + (double)var32, var30 + (double)var33 + (double)var32);
            var5.a((double)(var2 + 1), (double)((float)var3 + var22), (double)(var4 + 1), var28 + (double)var33 + (double)var32, var30 + (double)var33 - (double)var32);
            var5.a((double)(var2 + 1), (double)((float)var3 + var23), (double)(var4 + 0), var28 + (double)var33 - (double)var32, var30 - (double)var33 - (double)var32);
         }

         if (this.d || var7) {
            float var48 = var1.c(this.a, var2, var3 - 1, var4);
            var5.a(var10 * var48, var10 * var48, var10 * var48);
            this.a(var1, (double)var2, (double)var3, (double)var4, var1.a(0));
            var9 = true;
         }

         for(int var49 = 0; var49 < 4; ++var49) {
            int var50 = var2;
            int var51 = var4;
            if (var49 == 0) {
               var51 = var4 - 1;
            }

            if (var49 == 1) {
               ++var51;
            }

            if (var49 == 2) {
               var50 = var2 - 1;
            }

            if (var49 == 3) {
               ++var50;
            }

            int var52 = var1.a(var49 + 2, var19);
            int var29 = (var52 & 15) << 4;
            int var53 = var52 & 240;
            if (this.d || var8[var49]) {
               float var31;
               float var35;
               float var36;
               float var54;
               float var55;
               float var56;
               if (var49 == 0) {
                  var31 = var20;
                  var54 = var23;
                  var55 = (float)var2;
                  var35 = (float)(var2 + 1);
                  var56 = (float)var4;
                  var36 = (float)var4;
               } else if (var49 == 1) {
                  var31 = var22;
                  var54 = var21;
                  var55 = (float)(var2 + 1);
                  var35 = (float)var2;
                  var56 = (float)(var4 + 1);
                  var36 = (float)(var4 + 1);
               } else if (var49 == 2) {
                  var31 = var21;
                  var54 = var20;
                  var55 = (float)var2;
                  var35 = (float)var2;
                  var56 = (float)(var4 + 1);
                  var36 = (float)var4;
               } else {
                  var31 = var23;
                  var54 = var22;
                  var55 = (float)(var2 + 1);
                  var35 = (float)(var2 + 1);
                  var56 = (float)var4;
                  var36 = (float)(var4 + 1);
               }

               var9 = true;
               double var37 = (double)((float)(var29 + 0) / 256.0F);
               double var39 = ((double)(var29 + 16) - 0.01) / (double)256.0F;
               double var41 = (double)(((float)var53 + (1.0F - var31) * 16.0F) / 256.0F);
               double var43 = (double)(((float)var53 + (1.0F - var54) * 16.0F) / 256.0F);
               double var45 = ((double)(var53 + 16) - 0.01) / (double)256.0F;
               float var47 = var1.c(this.a, var50, var3, var51);
               if (var49 < 2) {
                  var47 *= var12;
               } else {
                  var47 *= var13;
               }

               var5.a(var11 * var47, var11 * var47, var11 * var47);
               var5.a((double)var55, (double)((float)var3 + var31), (double)var56, var37, var41);
               var5.a((double)var35, (double)((float)var3 + var54), (double)var36, var39, var43);
               var5.a((double)var35, (double)(var3 + 0), (double)var36, var39, var45);
               var5.a((double)var55, (double)(var3 + 0), (double)var56, var37, var45);
            }
         }

         var1.bg = var14;
         var1.bj = var16;
         return var9;
      }
   }

   private float a(int var1, int var2, int var3, gb var4) {
      int var5 = 0;
      float var6 = 0.0F;

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var1 - (var7 & 1);
         int var10 = var3 - (var7 >> 1 & 1);
         if (this.a.f(var8, var2 + 1, var10) == var4) {
            return 1.0F;
         }

         gb var11 = this.a.f(var8, var2, var10);
         if (var11 == var4) {
            int var12 = this.a.e(var8, var2, var10);
            if (var12 >= 8 || var12 == 0) {
               var6 += jp.b(var12) * 10.0F;
               var5 += 10;
            }

            var6 += jp.b(var12);
            ++var5;
         } else if (!var11.a()) {
            ++var6;
            ++var5;
         }
      }

      return 1.0F - var6 / (float)var5;
   }

   public void a(ly var1, cn var2, int var3, int var4, int var5) {
      float var6 = 0.5F;
      float var7 = 1.0F;
      float var8 = 0.8F;
      float var9 = 0.6F;
      ho var10 = ho.a;
      var10.b();
      float var11 = var1.c((nm)var2, var3, var4, var5);
      float var12 = var1.c((nm)var2, var3, var4 - 1, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var6 * var12, var6 * var12, var6 * var12);
      this.a(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.a(0));
      var12 = var1.c((nm)var2, var3, var4 + 1, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var7 * var12, var7 * var12, var7 * var12);
      this.b(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.a(1));
      var12 = var1.c((nm)var2, var3, var4, var5 - 1);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var8 * var12, var8 * var12, var8 * var12);
      this.c(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.a(2));
      var12 = var1.c((nm)var2, var3, var4, var5 + 1);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var8 * var12, var8 * var12, var8 * var12);
      this.d(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.a(3));
      var12 = var1.c((nm)var2, var3 - 1, var4, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var9 * var12, var9 * var12, var9 * var12);
      this.e(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.a(4));
      var12 = var1.c((nm)var2, var3 + 1, var4, var5);
      if (var12 < var11) {
         var12 = var11;
      }

      var10.a(var9 * var12, var9 * var12, var9 * var12);
      this.f(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, var1.a(5));
      var10.a();
   }

   public boolean k(ly var1, int var2, int var3, int var4) {
      int var5 = var1.d(this.a, var2, var3, var4);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      return this.a(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean a(ly var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      ho var8 = ho.a;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var10 * var5;
      float var15 = var11 * var5;
      float var16 = var12 * var5;
      float var17 = var13 * var5;
      float var18 = var10 * var6;
      float var19 = var11 * var6;
      float var20 = var12 * var6;
      float var21 = var13 * var6;
      float var22 = var10 * var7;
      float var23 = var11 * var7;
      float var24 = var12 * var7;
      float var25 = var13 * var7;
      float var26 = var1.c(this.a, var2, var3, var4);
      if (this.d || var1.c((nm)this.a, var2, var3 - 1, var4, 0)) {
         float var27 = var1.c(this.a, var2, var3 - 1, var4);
         var8.a(var14 * var27, var18 * var27, var22 * var27);
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 0));
         var9 = true;
      }

      if (this.d || var1.c((nm)this.a, var2, var3 + 1, var4, 1)) {
         float var28 = var1.c(this.a, var2, var3 + 1, var4);
         if (var1.bj != (double)1.0F && !var1.bn.d()) {
            var28 = var26;
         }

         var8.a(var15 * var28, var19 * var28, var23 * var28);
         this.b(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 1));
         var9 = true;
      }

      if (this.d || var1.c((nm)this.a, var2, var3, var4 - 1, 2)) {
         float var29 = var1.c(this.a, var2, var3, var4 - 1);
         if (var1.bh > (double)0.0F) {
            var29 = var26;
         }

         var8.a(var16 * var29, var20 * var29, var24 * var29);
         this.c(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 2));
         var9 = true;
      }

      if (this.d || var1.c((nm)this.a, var2, var3, var4 + 1, 3)) {
         float var30 = var1.c(this.a, var2, var3, var4 + 1);
         if (var1.bk < (double)1.0F) {
            var30 = var26;
         }

         var8.a(var16 * var30, var20 * var30, var24 * var30);
         this.d(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 3));
         var9 = true;
      }

      if (this.d || var1.c((nm)this.a, var2 - 1, var3, var4, 4)) {
         float var31 = var1.c(this.a, var2 - 1, var3, var4);
         if (var1.bf > (double)0.0F) {
            var31 = var26;
         }

         var8.a(var17 * var31, var21 * var31, var25 * var31);
         this.e(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 4));
         var9 = true;
      }

      if (this.d || var1.c((nm)this.a, var2 + 1, var3, var4, 5)) {
         float var32 = var1.c(this.a, var2 + 1, var3, var4);
         if (var1.bi < (double)1.0F) {
            var32 = var26;
         }

         var8.a(var17 * var32, var21 * var32, var25 * var32);
         this.f(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 5));
         var9 = true;
      }

      return var9;
   }

   public boolean l(ly var1, int var2, int var3, int var4) {
      int var5 = var1.d(this.a, var2, var3, var4);
      float var6 = (float)(var5 >> 16 & 255) / 255.0F;
      float var7 = (float)(var5 >> 8 & 255) / 255.0F;
      float var8 = (float)(var5 & 255) / 255.0F;
      return this.b(var1, var2, var3, var4, var6, var7, var8);
   }

   public boolean b(ly var1, int var2, int var3, int var4, float var5, float var6, float var7) {
      ho var8 = ho.a;
      boolean var9 = false;
      float var10 = 0.5F;
      float var11 = 1.0F;
      float var12 = 0.8F;
      float var13 = 0.6F;
      float var14 = var10 * var5;
      float var15 = var11 * var5;
      float var16 = var12 * var5;
      float var17 = var13 * var5;
      float var18 = var10 * var6;
      float var19 = var11 * var6;
      float var20 = var12 * var6;
      float var21 = var13 * var6;
      float var22 = var10 * var7;
      float var23 = var11 * var7;
      float var24 = var12 * var7;
      float var25 = var13 * var7;
      float var26 = 0.0625F;
      float var27 = var1.c(this.a, var2, var3, var4);
      if (this.d || var1.c((nm)this.a, var2, var3 - 1, var4, 0)) {
         float var28 = var1.c(this.a, var2, var3 - 1, var4);
         var8.a(var14 * var28, var18 * var28, var22 * var28);
         this.a(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 0));
         var9 = true;
      }

      if (this.d || var1.c((nm)this.a, var2, var3 + 1, var4, 1)) {
         float var29 = var1.c(this.a, var2, var3 + 1, var4);
         if (var1.bj != (double)1.0F && !var1.bn.d()) {
            var29 = var27;
         }

         var8.a(var15 * var29, var19 * var29, var23 * var29);
         this.b(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 1));
         var9 = true;
      }

      if (this.d || var1.c((nm)this.a, var2, var3, var4 - 1, 2)) {
         float var30 = var1.c(this.a, var2, var3, var4 - 1);
         if (var1.bh > (double)0.0F) {
            var30 = var27;
         }

         var8.a(var16 * var30, var20 * var30, var24 * var30);
         var8.c(0.0F, 0.0F, var26);
         this.c(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 2));
         var8.c(0.0F, 0.0F, -var26);
         var9 = true;
      }

      if (this.d || var1.c((nm)this.a, var2, var3, var4 + 1, 3)) {
         float var31 = var1.c(this.a, var2, var3, var4 + 1);
         if (var1.bk < (double)1.0F) {
            var31 = var27;
         }

         var8.a(var16 * var31, var20 * var31, var24 * var31);
         var8.c(0.0F, 0.0F, -var26);
         this.d(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 3));
         var8.c(0.0F, 0.0F, var26);
         var9 = true;
      }

      if (this.d || var1.c((nm)this.a, var2 - 1, var3, var4, 4)) {
         float var32 = var1.c(this.a, var2 - 1, var3, var4);
         if (var1.bf > (double)0.0F) {
            var32 = var27;
         }

         var8.a(var17 * var32, var21 * var32, var25 * var32);
         var8.c(var26, 0.0F, 0.0F);
         this.e(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 4));
         var8.c(-var26, 0.0F, 0.0F);
         var9 = true;
      }

      if (this.d || var1.c((nm)this.a, var2 + 1, var3, var4, 5)) {
         float var33 = var1.c(this.a, var2 + 1, var3, var4);
         if (var1.bi < (double)1.0F) {
            var33 = var27;
         }

         var8.a(var17 * var33, var21 * var33, var25 * var33);
         var8.c(-var26, 0.0F, 0.0F);
         this.f(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 5));
         var8.c(var26, 0.0F, 0.0F);
         var9 = true;
      }

      return var9;
   }

   public boolean m(ly var1, int var2, int var3, int var4) {
      boolean var5 = false;
      float var6 = 0.375F;
      float var7 = 0.625F;
      var1.a(var6, 0.0F, var6, var7, 1.0F, var7);
      this.k(var1, var2, var3, var4);
      boolean var8 = false;
      boolean var9 = false;
      if (this.a.a(var2 - 1, var3, var4) == var1.bc || this.a.a(var2 + 1, var3, var4) == var1.bc) {
         var8 = true;
      }

      if (this.a.a(var2, var3, var4 - 1) == var1.bc || this.a.a(var2, var3, var4 + 1) == var1.bc) {
         var9 = true;
      }

      boolean var10 = this.a.a(var2 - 1, var3, var4) == var1.bc;
      boolean var11 = this.a.a(var2 + 1, var3, var4) == var1.bc;
      boolean var12 = this.a.a(var2, var3, var4 - 1) == var1.bc;
      boolean var13 = this.a.a(var2, var3, var4 + 1) == var1.bc;
      if (!var8 && !var9) {
         var8 = true;
      }

      var6 = 0.4375F;
      var7 = 0.5625F;
      float var14 = 0.75F;
      float var15 = 0.9375F;
      float var16 = var10 ? 0.0F : var6;
      float var17 = var11 ? 1.0F : var7;
      float var18 = var12 ? 0.0F : var6;
      float var19 = var13 ? 1.0F : var7;
      if (var8) {
         var1.a(var16, var14, var6, var17, var15, var7);
         this.k(var1, var2, var3, var4);
      }

      if (var9) {
         var1.a(var6, var14, var18, var7, var15, var19);
         this.k(var1, var2, var3, var4);
      }

      var14 = 0.375F;
      var15 = 0.5625F;
      if (var8) {
         var1.a(var16, var14, var6, var17, var15, var7);
         this.k(var1, var2, var3, var4);
      }

      if (var9) {
         var1.a(var6, var14, var18, var7, var15, var19);
         this.k(var1, var2, var3, var4);
      }

      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean n(ly var1, int var2, int var3, int var4) {
      boolean var5 = false;
      int var6 = this.a.e(var2, var3, var4);
      if (var6 == 0) {
         var1.a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         this.k(var1, var2, var3, var4);
         var1.a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         this.k(var1, var2, var3, var4);
      } else if (var6 == 1) {
         var1.a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         this.k(var1, var2, var3, var4);
         var1.a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         this.k(var1, var2, var3, var4);
      } else if (var6 == 2) {
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         this.k(var1, var2, var3, var4);
         var1.a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         this.k(var1, var2, var3, var4);
      } else if (var6 == 3) {
         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         this.k(var1, var2, var3, var4);
         var1.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         this.k(var1, var2, var3, var4);
      }

      var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return var5;
   }

   public boolean o(ly var1, int var2, int var3, int var4) {
      ho var5 = ho.a;
      fw var6 = (fw)var1;
      boolean var7 = false;
      float var8 = 0.5F;
      float var9 = 1.0F;
      float var10 = 0.8F;
      float var11 = 0.6F;
      float var12 = var1.c(this.a, var2, var3, var4);
      float var13 = var1.c(this.a, var2, var3 - 1, var4);
      if (var6.bg > (double)0.0F) {
         var13 = var12;
      }

      if (ly.t[var1.bc] > 0) {
         var13 = 1.0F;
      }

      var5.a(var8 * var13, var8 * var13, var8 * var13);
      this.a(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 0));
      var7 = true;
      var13 = var1.c(this.a, var2, var3 + 1, var4);
      if (var6.bj < (double)1.0F) {
         var13 = var12;
      }

      if (ly.t[var1.bc] > 0) {
         var13 = 1.0F;
      }

      var5.a(var9 * var13, var9 * var13, var9 * var13);
      this.b(var1, (double)var2, (double)var3, (double)var4, var1.a((nm)this.a, var2, var3, var4, 1));
      var7 = true;
      var13 = var1.c(this.a, var2, var3, var4 - 1);
      if (var6.bh > (double)0.0F) {
         var13 = var12;
      }

      if (ly.t[var1.bc] > 0) {
         var13 = 1.0F;
      }

      var5.a(var10 * var13, var10 * var13, var10 * var13);
      int var14 = var1.a((nm)this.a, var2, var3, var4, 2);
      if (var14 < 0) {
         this.c = true;
         var14 = -var14;
      }

      this.c(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.c = false;
      var13 = var1.c(this.a, var2, var3, var4 + 1);
      if (var6.bk < (double)1.0F) {
         var13 = var12;
      }

      if (ly.t[var1.bc] > 0) {
         var13 = 1.0F;
      }

      var5.a(var10 * var13, var10 * var13, var10 * var13);
      var14 = var1.a((nm)this.a, var2, var3, var4, 3);
      if (var14 < 0) {
         this.c = true;
         var14 = -var14;
      }

      this.d(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.c = false;
      var13 = var1.c(this.a, var2 - 1, var3, var4);
      if (var6.bf > (double)0.0F) {
         var13 = var12;
      }

      if (ly.t[var1.bc] > 0) {
         var13 = 1.0F;
      }

      var5.a(var11 * var13, var11 * var13, var11 * var13);
      var14 = var1.a((nm)this.a, var2, var3, var4, 4);
      if (var14 < 0) {
         this.c = true;
         var14 = -var14;
      }

      this.e(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.c = false;
      var13 = var1.c(this.a, var2 + 1, var3, var4);
      if (var6.bi < (double)1.0F) {
         var13 = var12;
      }

      if (ly.t[var1.bc] > 0) {
         var13 = 1.0F;
      }

      var5.a(var11 * var13, var11 * var13, var11 * var13);
      var14 = var1.a((nm)this.a, var2, var3, var4, 5);
      if (var14 < 0) {
         this.c = true;
         var14 = -var14;
      }

      this.f(var1, (double)var2, (double)var3, (double)var4, var14);
      var7 = true;
      this.c = false;
      return var7;
   }

   public void a(ly var1, double var2, double var4, double var6, int var8) {
      ho var9 = ho.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bf * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bi * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)var11 + var1.bh * (double)16.0F) / (double)256.0F;
      double var18 = ((double)var11 + var1.bk * (double)16.0F - 0.01) / (double)256.0F;
      if (var1.bf < (double)0.0F || var1.bi > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bh < (double)0.0F || var1.bk > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var20 = var2 + var1.bf;
      double var22 = var2 + var1.bi;
      double var24 = var4 + var1.bg;
      double var26 = var6 + var1.bh;
      double var28 = var6 + var1.bk;
      var9.a(var20, var24, var28, var12, var18);
      var9.a(var20, var24, var26, var12, var16);
      var9.a(var22, var24, var26, var14, var16);
      var9.a(var22, var24, var28, var14, var18);
   }

   public void b(ly var1, double var2, double var4, double var6, int var8) {
      ho var9 = ho.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bf * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bi * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)var11 + var1.bh * (double)16.0F) / (double)256.0F;
      double var18 = ((double)var11 + var1.bk * (double)16.0F - 0.01) / (double)256.0F;
      if (var1.bf < (double)0.0F || var1.bi > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bh < (double)0.0F || var1.bk > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var20 = var2 + var1.bf;
      double var22 = var2 + var1.bi;
      double var24 = var4 + var1.bj;
      double var26 = var6 + var1.bh;
      double var28 = var6 + var1.bk;
      var9.a(var22, var24, var28, var14, var18);
      var9.a(var22, var24, var26, var14, var16);
      var9.a(var20, var24, var26, var12, var16);
      var9.a(var20, var24, var28, var12, var18);
   }

   public void c(ly var1, double var2, double var4, double var6, int var8) {
      ho var9 = ho.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bf * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bi * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)var11 + var1.bg * (double)16.0F) / (double)256.0F;
      double var18 = ((double)var11 + var1.bj * (double)16.0F - 0.01) / (double)256.0F;
      if (this.c) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bf < (double)0.0F || var1.bi > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bg < (double)0.0F || var1.bj > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var30 = var2 + var1.bf;
      double var22 = var2 + var1.bi;
      double var24 = var4 + var1.bg;
      double var26 = var4 + var1.bj;
      double var28 = var6 + var1.bh;
      var9.a(var30, var26, var28, var14, var16);
      var9.a(var22, var26, var28, var12, var16);
      var9.a(var22, var24, var28, var12, var18);
      var9.a(var30, var24, var28, var14, var18);
   }

   public void d(ly var1, double var2, double var4, double var6, int var8) {
      ho var9 = ho.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bf * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bi * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)var11 + var1.bg * (double)16.0F) / (double)256.0F;
      double var18 = ((double)var11 + var1.bj * (double)16.0F - 0.01) / (double)256.0F;
      if (this.c) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bf < (double)0.0F || var1.bi > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bg < (double)0.0F || var1.bj > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var30 = var2 + var1.bf;
      double var22 = var2 + var1.bi;
      double var24 = var4 + var1.bg;
      double var26 = var4 + var1.bj;
      double var28 = var6 + var1.bk;
      var9.a(var30, var26, var28, var12, var16);
      var9.a(var30, var24, var28, var12, var18);
      var9.a(var22, var24, var28, var14, var18);
      var9.a(var22, var26, var28, var14, var16);
   }

   public void e(ly var1, double var2, double var4, double var6, int var8) {
      ho var9 = ho.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bh * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bk * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)var11 + var1.bg * (double)16.0F) / (double)256.0F;
      double var18 = ((double)var11 + var1.bj * (double)16.0F - 0.01) / (double)256.0F;
      if (this.c) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bh < (double)0.0F || var1.bk > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bg < (double)0.0F || var1.bj > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var30 = var2 + var1.bf;
      double var22 = var4 + var1.bg;
      double var24 = var4 + var1.bj;
      double var26 = var6 + var1.bh;
      double var28 = var6 + var1.bk;
      var9.a(var30, var24, var28, var14, var16);
      var9.a(var30, var24, var26, var12, var16);
      var9.a(var30, var22, var26, var12, var18);
      var9.a(var30, var22, var28, var14, var18);
   }

   public void f(ly var1, double var2, double var4, double var6, int var8) {
      ho var9 = ho.a;
      if (this.b >= 0) {
         var8 = this.b;
      }

      int var10 = (var8 & 15) << 4;
      int var11 = var8 & 240;
      double var12 = ((double)var10 + var1.bh * (double)16.0F) / (double)256.0F;
      double var14 = ((double)var10 + var1.bk * (double)16.0F - 0.01) / (double)256.0F;
      double var16 = ((double)var11 + var1.bg * (double)16.0F) / (double)256.0F;
      double var18 = ((double)var11 + var1.bj * (double)16.0F - 0.01) / (double)256.0F;
      if (this.c) {
         double var20 = var12;
         var12 = var14;
         var14 = var20;
      }

      if (var1.bh < (double)0.0F || var1.bk > (double)1.0F) {
         var12 = (double)(((float)var10 + 0.0F) / 256.0F);
         var14 = (double)(((float)var10 + 15.99F) / 256.0F);
      }

      if (var1.bg < (double)0.0F || var1.bj > (double)1.0F) {
         var16 = (double)(((float)var11 + 0.0F) / 256.0F);
         var18 = (double)(((float)var11 + 15.99F) / 256.0F);
      }

      double var30 = var2 + var1.bi;
      double var22 = var4 + var1.bg;
      double var24 = var4 + var1.bj;
      double var26 = var6 + var1.bh;
      double var28 = var6 + var1.bk;
      var9.a(var30, var22, var28, var12, var18);
      var9.a(var30, var22, var26, var14, var18);
      var9.a(var30, var24, var26, var14, var16);
      var9.a(var30, var24, var28, var12, var16);
   }

   public void a(ly var1, float var2) {
      int var3 = var1.f();
      ho var4 = ho.a;
      if (var3 == 0) {
         var1.e();
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float var5 = 0.5F;
         float var6 = 1.0F;
         float var7 = 0.8F;
         float var8 = 0.6F;
         var4.b();
         var4.a(var6, var6, var6, var2);
         this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(0));
         var4.a(var5, var5, var5, var2);
         this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(1));
         var4.a(var7, var7, var7, var2);
         this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(2));
         this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(3));
         var4.a(var8, var8, var8, var2);
         this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(4));
         this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(5));
         var4.a();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      }

   }

   public void a(ly var1) {
      byte var2 = -1;
      ho var3 = ho.a;
      int var4 = var1.f();
      if (var4 == 0) {
         var1.e();
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         var3.b();
         var3.b(0.0F, -1.0F, 0.0F);
         this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(0));
         var3.a();
         var3.b();
         var3.b(0.0F, 1.0F, 0.0F);
         this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(1));
         var3.a();
         var3.b();
         var3.b(0.0F, 0.0F, -1.0F);
         this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(2));
         var3.a();
         var3.b();
         var3.b(0.0F, 0.0F, 1.0F);
         this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(3));
         var3.a();
         var3.b();
         var3.b(-1.0F, 0.0F, 0.0F);
         this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(4));
         var3.a();
         var3.b();
         var3.b(1.0F, 0.0F, 0.0F);
         this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(5));
         var3.a();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      } else if (var4 == 1) {
         var3.b();
         var3.b(0.0F, -1.0F, 0.0F);
         this.a(var1, var2, (double)-0.5F, (double)-0.5F, (double)-0.5F);
         var3.a();
      } else if (var4 == 13) {
         var1.e();
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float var5 = 0.0625F;
         var3.b();
         var3.b(0.0F, -1.0F, 0.0F);
         this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(0));
         var3.a();
         var3.b();
         var3.b(0.0F, 1.0F, 0.0F);
         this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(1));
         var3.a();
         var3.b();
         var3.b(0.0F, 0.0F, -1.0F);
         var3.c(0.0F, 0.0F, var5);
         this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(2));
         var3.c(0.0F, 0.0F, -var5);
         var3.a();
         var3.b();
         var3.b(0.0F, 0.0F, 1.0F);
         var3.c(0.0F, 0.0F, -var5);
         this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(3));
         var3.c(0.0F, 0.0F, var5);
         var3.a();
         var3.b();
         var3.b(-1.0F, 0.0F, 0.0F);
         var3.c(var5, 0.0F, 0.0F);
         this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(4));
         var3.c(-var5, 0.0F, 0.0F);
         var3.a();
         var3.b();
         var3.b(1.0F, 0.0F, 0.0F);
         var3.c(-var5, 0.0F, 0.0F);
         this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(5));
         var3.c(var5, 0.0F, 0.0F);
         var3.a();
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      } else if (var4 == 6) {
         var3.b();
         var3.b(0.0F, -1.0F, 0.0F);
         this.b(var1, var2, (double)-0.5F, (double)-0.5F, (double)-0.5F);
         var3.a();
      } else if (var4 == 2) {
         var3.b();
         var3.b(0.0F, -1.0F, 0.0F);
         this.a(var1, (double)-0.5F, (double)-0.5F, (double)-0.5F, (double)0.0F, (double)0.0F);
         var3.a();
      } else if (var4 == 10) {
         for(int var7 = 0; var7 < 2; ++var7) {
            if (var7 == 0) {
               var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            }

            if (var7 == 1) {
               var1.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            }

            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var3.b();
            var3.b(0.0F, -1.0F, 0.0F);
            this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(0));
            var3.a();
            var3.b();
            var3.b(0.0F, 1.0F, 0.0F);
            this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(1));
            var3.a();
            var3.b();
            var3.b(0.0F, 0.0F, -1.0F);
            this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(2));
            var3.a();
            var3.b();
            var3.b(0.0F, 0.0F, 1.0F);
            this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(3));
            var3.a();
            var3.b();
            var3.b(-1.0F, 0.0F, 0.0F);
            this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(4));
            var3.a();
            var3.b();
            var3.b(1.0F, 0.0F, 0.0F);
            this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(5));
            var3.a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         }
      } else if (var4 == 11) {
         for(int var8 = 0; var8 < 4; ++var8) {
            float var6 = 0.125F;
            if (var8 == 0) {
               var1.a(0.5F - var6, 0.0F, 0.0F, 0.5F + var6, 1.0F, var6 * 2.0F);
            }

            if (var8 == 1) {
               var1.a(0.5F - var6, 0.0F, 1.0F - var6 * 2.0F, 0.5F + var6, 1.0F, 1.0F);
            }

            var6 = 0.0625F;
            if (var8 == 2) {
               var1.a(0.5F - var6, 1.0F - var6 * 3.0F, -var6 * 2.0F, 0.5F + var6, 1.0F - var6, 1.0F + var6 * 2.0F);
            }

            if (var8 == 3) {
               var1.a(0.5F - var6, 0.5F - var6 * 3.0F, -var6 * 2.0F, 0.5F + var6, 0.5F - var6, 1.0F + var6 * 2.0F);
            }

            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var3.b();
            var3.b(0.0F, -1.0F, 0.0F);
            this.a(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(0));
            var3.a();
            var3.b();
            var3.b(0.0F, 1.0F, 0.0F);
            this.b(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(1));
            var3.a();
            var3.b();
            var3.b(0.0F, 0.0F, -1.0F);
            this.c(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(2));
            var3.a();
            var3.b();
            var3.b(0.0F, 0.0F, 1.0F);
            this.d(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(3));
            var3.a();
            var3.b();
            var3.b(-1.0F, 0.0F, 0.0F);
            this.e(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(4));
            var3.a();
            var3.b();
            var3.b(1.0F, 0.0F, 0.0F);
            this.f(var1, (double)0.0F, (double)0.0F, (double)0.0F, var1.a(5));
            var3.a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         }

         var1.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public static boolean a(int var0) {
      if (var0 == 0) {
         return true;
      } else if (var0 == 13) {
         return true;
      } else if (var0 == 10) {
         return true;
      } else {
         return var0 == 11;
      }
   }
}
