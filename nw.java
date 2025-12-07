import java.util.Random;

public class nw implements aw {
   private Random j;
   private lp k;
   private lp l;
   private lp m;
   private lp n;
   private lp o;
   public lp a;
   public lp b;
   public lp c;
   private cn p;
   private double[] q;
   private double[] r = new double[256];
   private double[] s = new double[256];
   private double[] t = new double[256];
   private cy u = new kk();
   double[] d;
   double[] e;
   double[] f;
   double[] g;
   double[] h;
   int[][] i = new int[32][32];

   public nw(cn var1, long var2) {
      this.p = var1;
      this.j = new Random(var2);
      this.k = new lp(this.j, 16);
      this.l = new lp(this.j, 16);
      this.m = new lp(this.j, 8);
      this.n = new lp(this.j, 4);
      this.o = new lp(this.j, 4);
      this.a = new lp(this.j, 10);
      this.b = new lp(this.j, 16);
      this.c = new lp(this.j, 8);
   }

   public void a(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 64;
      int var6 = var4 + 1;
      byte var7 = 17;
      int var8 = var4 + 1;
      this.q = this.a(this.q, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for(int var9 = 0; var9 < var4; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            for(int var11 = 0; var11 < 16; ++var11) {
               double var12 = (double)0.125F;
               double var14 = this.q[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.q[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.q[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.q[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.q[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.q[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.q[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.q[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 8; ++var30) {
                  double var31 = (double)0.25F;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 4; ++var41) {
                     int var42 = var41 + var9 * 4 << 11 | 0 + var10 * 4 << 7 | var11 * 8 + var30;
                     short var43 = 128;
                     double var44 = (double)0.25F;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 4; ++var50) {
                        int var51 = 0;
                        if (var11 * 8 + var30 < var5) {
                           if (this.p.d && var11 * 8 + var30 >= var5 - 1) {
                              var51 = ly.aU.bc;
                           } else {
                              var51 = ly.C.bc;
                           }
                        }

                        if (var46 > (double)0.0F) {
                           var51 = ly.u.bc;
                        }

                        var3[var42] = (byte)var51;
                        var42 += var43;
                        var46 += var48;
                     }

                     var33 += var37;
                     var35 += var39;
                  }

                  var14 += var22;
                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
               }
            }
         }
      }

   }

   public void b(int var1, int var2, byte[] var3) {
      byte var4 = 64;
      double var5 = (double)0.03125F;
      this.r = this.n.a(this.r, (double)(var1 * 16), (double)(var2 * 16), (double)0.0F, 16, 16, 1, var5, var5, (double)1.0F);
      this.s = this.n.a(this.s, (double)(var2 * 16), 109.0134, (double)(var1 * 16), 16, 1, 16, var5, (double)1.0F, var5);
      this.t = this.o.a(this.t, (double)(var1 * 16), (double)(var2 * 16), (double)0.0F, 16, 16, 1, var5 * (double)2.0F, var5 * (double)2.0F, var5 * (double)2.0F);

      for(int var7 = 0; var7 < 16; ++var7) {
         for(int var8 = 0; var8 < 16; ++var8) {
            boolean var9 = this.r[var7 + var8 * 16] + this.j.nextDouble() * 0.2 > (double)0.0F;
            boolean var10 = this.s[var7 + var8 * 16] + this.j.nextDouble() * 0.2 > (double)3.0F;
            int var11 = (int)(this.t[var7 + var8 * 16] / (double)3.0F + (double)3.0F + this.j.nextDouble() * (double)0.25F);
            int var12 = -1;
            byte var13 = (byte)ly.v.bc;
            byte var14 = (byte)ly.w.bc;

            for(int var15 = 127; var15 >= 0; --var15) {
               int var16 = (var7 * 16 + var8) * 128 + var15;
               if (var15 <= 0 + this.j.nextInt(6) - 1) {
                  var3[var16] = (byte)ly.A.bc;
               } else {
                  byte var17 = var3[var16];
                  if (var17 == 0) {
                     var12 = -1;
                  } else if (var17 == ly.u.bc) {
                     if (var12 == -1) {
                        if (var11 <= 0) {
                           var13 = 0;
                           var14 = (byte)ly.u.bc;
                        } else if (var15 >= var4 - 4 && var15 <= var4 + 1) {
                           var13 = (byte)ly.v.bc;
                           var14 = (byte)ly.w.bc;
                           if (var10) {
                              var13 = 0;
                           }

                           if (var10) {
                              var14 = (byte)ly.G.bc;
                           }

                           if (var9) {
                              var13 = (byte)ly.F.bc;
                           }

                           if (var9) {
                              var14 = (byte)ly.F.bc;
                           }
                        }

                        if (var15 < var4 && var13 == 0) {
                           var13 = (byte)ly.C.bc;
                        }

                        var12 = var11;
                        if (var15 >= var4 - 1) {
                           var3[var16] = var13;
                        } else {
                           var3[var16] = var14;
                        }
                     } else if (var12 > 0) {
                        --var12;
                        var3[var16] = var14;
                     }
                  }
               }
            }
         }
      }

   }

   public ga b(int var1, int var2) {
      this.j.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['耀'];
      ga var4 = new ga(this.p, var3, var1, var2);
      this.a(var1, var2, var3);
      this.b(var1, var2, var3);
      this.u.a(this, this.p, var1, var2, var3);
      var4.c();
      return var4;
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412;
      double var10 = 684.412;
      this.g = this.a.a(this.g, (double)var2, (double)var3, (double)var4, var5, 1, var7, (double)1.0F, (double)0.0F, (double)1.0F);
      this.h = this.b.a(this.h, (double)var2, (double)var3, (double)var4, var5, 1, var7, (double)100.0F, (double)0.0F, (double)100.0F);
      this.d = this.m.a(this.d, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8 / (double)80.0F, var10 / (double)160.0F, var8 / (double)80.0F);
      this.e = this.k.a(this.e, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8, var10, var8);
      this.f = this.l.a(this.f, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;

      for(int var14 = 0; var14 < var5; ++var14) {
         for(int var15 = 0; var15 < var7; ++var15) {
            double var16 = (this.g[var13] + (double)256.0F) / (double)512.0F;
            if (var16 > (double)1.0F) {
               var16 = (double)1.0F;
            }

            double var18 = (double)0.0F;
            double var20 = this.h[var13] / (double)8000.0F;
            if (var20 < (double)0.0F) {
               var20 = -var20;
            }

            var20 = var20 * (double)3.0F - (double)3.0F;
            if (var20 < (double)0.0F) {
               var20 /= (double)2.0F;
               if (var20 < (double)-1.0F) {
                  var20 = (double)-1.0F;
               }

               var20 /= 1.4;
               var20 /= (double)2.0F;
               var16 = (double)0.0F;
            } else {
               if (var20 > (double)1.0F) {
                  var20 = (double)1.0F;
               }

               var20 /= (double)6.0F;
            }

            var16 += (double)0.5F;
            var20 = var20 * (double)var6 / (double)16.0F;
            double var22 = (double)var6 / (double)2.0F + var20 * (double)4.0F;
            ++var13;

            for(int var24 = 0; var24 < var6; ++var24) {
               double var25 = (double)0.0F;
               double var27 = ((double)var24 - var22) * (double)12.0F / var16;
               if (var27 < (double)0.0F) {
                  var27 *= (double)4.0F;
               }

               double var29 = this.e[var12] / (double)512.0F;
               double var31 = this.f[var12] / (double)512.0F;
               double var33 = (this.d[var12] / (double)10.0F + (double)1.0F) / (double)2.0F;
               if (var33 < (double)0.0F) {
                  var25 = var29;
               } else if (var33 > (double)1.0F) {
                  var25 = var31;
               } else {
                  var25 = var29 + (var31 - var29) * var33;
               }

               var25 -= var27;
               if (var24 > var6 - 4) {
                  double var35 = (double)((float)(var24 - (var6 - 4)) / 3.0F);
                  var25 = var25 * ((double)1.0F - var35) + (double)-10.0F * var35;
               }

               if ((double)var24 < var18) {
                  double var45 = (var18 - (double)var24) / (double)4.0F;
                  if (var45 < (double)0.0F) {
                     var45 = (double)0.0F;
                  }

                  if (var45 > (double)1.0F) {
                     var45 = (double)1.0F;
                  }

                  var25 = var25 * ((double)1.0F - var45) + (double)-10.0F * var45;
               }

               var1[var12] = var25;
               ++var12;
            }
         }
      }

      return var1;
   }

   public boolean a(int var1, int var2) {
      return true;
   }

   public void a(aw var1, int var2, int var3) {
      dh.a = true;
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      this.j.setSeed(this.p.u);
      long var6 = this.j.nextLong() / 2L * 2L + 1L;
      long var8 = this.j.nextLong() / 2L * 2L + 1L;
      this.j.setSeed((long)var2 * var6 + (long)var3 * var8 ^ this.p.u);
      double var10 = (double)0.25F;

      for(int var12 = 0; var12 < 8; ++var12) {
         int var13 = var4 + this.j.nextInt(16) + 8;
         int var14 = this.j.nextInt(128);
         int var15 = var5 + this.j.nextInt(16) + 8;
         (new cg()).a(this.p, this.j, var13, var14, var15);
      }

      for(int var19 = 0; var19 < 10; ++var19) {
         int var28 = var4 + this.j.nextInt(16);
         int var37 = this.j.nextInt(128);
         int var55 = var5 + this.j.nextInt(16);
         (new gv(32)).a(this.p, this.j, var28, var37, var55);
      }

      for(int var20 = 0; var20 < 20; ++var20) {
         int var29 = var4 + this.j.nextInt(16);
         int var38 = this.j.nextInt(128);
         int var56 = var5 + this.j.nextInt(16);
         (new cu(ly.w.bc, 32)).a(this.p, this.j, var29, var38, var56);
      }

      for(int var21 = 0; var21 < 10; ++var21) {
         int var30 = var4 + this.j.nextInt(16);
         int var39 = this.j.nextInt(128);
         int var57 = var5 + this.j.nextInt(16);
         (new cu(ly.G.bc, 32)).a(this.p, this.j, var30, var39, var57);
      }

      for(int var22 = 0; var22 < 20; ++var22) {
         int var31 = var4 + this.j.nextInt(16);
         int var40 = this.j.nextInt(128);
         int var58 = var5 + this.j.nextInt(16);
         (new cu(ly.J.bc, 16)).a(this.p, this.j, var31, var40, var58);
      }

      for(int var23 = 0; var23 < 20; ++var23) {
         int var32 = var4 + this.j.nextInt(16);
         int var41 = this.j.nextInt(64);
         int var59 = var5 + this.j.nextInt(16);
         (new cu(ly.I.bc, 8)).a(this.p, this.j, var32, var41, var59);
      }

      for(int var24 = 0; var24 < 2; ++var24) {
         int var33 = var4 + this.j.nextInt(16);
         int var42 = this.j.nextInt(32);
         int var60 = var5 + this.j.nextInt(16);
         (new cu(ly.H.bc, 8)).a(this.p, this.j, var33, var42, var60);
      }

      for(int var25 = 0; var25 < 8; ++var25) {
         int var34 = var4 + this.j.nextInt(16);
         int var43 = this.j.nextInt(16);
         int var61 = var5 + this.j.nextInt(16);
         (new cu(ly.aO.bc, 7)).a(this.p, this.j, var34, var43, var61);
      }

      for(int var26 = 0; var26 < 1; ++var26) {
         int var35 = var4 + this.j.nextInt(16);
         int var44 = this.j.nextInt(16);
         int var62 = var5 + this.j.nextInt(16);
         (new cu(ly.ax.bc, 7)).a(this.p, this.j, var35, var44, var62);
      }

      var10 = (double)0.5F;
      int var27 = (int)((this.c.a((double)var4 * var10, (double)var5 * var10) / (double)8.0F + this.j.nextDouble() * (double)4.0F + (double)4.0F) / (double)3.0F);
      if (var27 < 0) {
         var27 = 0;
      }

      if (this.j.nextInt(10) == 0) {
         ++var27;
      }

      Object var36 = new oa();
      if (this.j.nextInt(10) == 0) {
         var36 = new ej();
      }

      for(int var45 = 0; var45 < var27; ++var45) {
         int var63 = var4 + this.j.nextInt(16) + 8;
         int var16 = var5 + this.j.nextInt(16) + 8;
         ((ik)var36).a((double)1.0F, (double)1.0F, (double)1.0F);
         ((ik)var36).a(this.p, this.j, var63, this.p.c(var63, var16), var16);
      }

      for(int var46 = 0; var46 < 2; ++var46) {
         int var64 = var4 + this.j.nextInt(16) + 8;
         int var73 = this.j.nextInt(128);
         int var17 = var5 + this.j.nextInt(16) + 8;
         (new ae(ly.ae.bc)).a(this.p, this.j, var64, var73, var17);
      }

      if (this.j.nextInt(2) == 0) {
         int var47 = var4 + this.j.nextInt(16) + 8;
         int var65 = this.j.nextInt(128);
         int var74 = var5 + this.j.nextInt(16) + 8;
         (new ae(ly.af.bc)).a(this.p, this.j, var47, var65, var74);
      }

      if (this.j.nextInt(4) == 0) {
         int var48 = var4 + this.j.nextInt(16) + 8;
         int var66 = this.j.nextInt(128);
         int var75 = var5 + this.j.nextInt(16) + 8;
         (new ae(ly.ag.bc)).a(this.p, this.j, var48, var66, var75);
      }

      if (this.j.nextInt(8) == 0) {
         int var49 = var4 + this.j.nextInt(16) + 8;
         int var67 = this.j.nextInt(128);
         int var76 = var5 + this.j.nextInt(16) + 8;
         (new ae(ly.ah.bc)).a(this.p, this.j, var49, var67, var76);
      }

      for(int var50 = 0; var50 < 10; ++var50) {
         int var68 = var4 + this.j.nextInt(16) + 8;
         int var77 = this.j.nextInt(128);
         int var82 = var5 + this.j.nextInt(16) + 8;
         (new es()).a(this.p, this.j, var68, var77, var82);
      }

      for(int var51 = 0; var51 < 1; ++var51) {
         int var69 = var4 + this.j.nextInt(16) + 8;
         int var78 = this.j.nextInt(128);
         int var83 = var5 + this.j.nextInt(16) + 8;
         (new da()).a(this.p, this.j, var69, var78, var83);
      }

      for(int var52 = 0; var52 < 50; ++var52) {
         int var70 = var4 + this.j.nextInt(16) + 8;
         int var79 = this.j.nextInt(this.j.nextInt(120) + 8);
         int var84 = var5 + this.j.nextInt(16) + 8;
         (new nn(ly.B.bc)).a(this.p, this.j, var70, var79, var84);
      }

      for(int var53 = 0; var53 < 20; ++var53) {
         int var71 = var4 + this.j.nextInt(16) + 8;
         int var80 = this.j.nextInt(this.j.nextInt(this.j.nextInt(112) + 8) + 8);
         int var85 = var5 + this.j.nextInt(16) + 8;
         (new nn(ly.D.bc)).a(this.p, this.j, var71, var80, var85);
      }

      for(int var54 = var4 + 8 + 0; var54 < var4 + 8 + 16; ++var54) {
         for(int var72 = var5 + 8 + 0; var72 < var5 + 8 + 16; ++var72) {
            int var81 = this.p.d(var54, var72);
            if (this.p.d && var81 > 0 && var81 < 128 && this.p.a(var54, var81, var72) == 0 && this.p.f(var54, var81 - 1, var72).c() && this.p.f(var54, var81 - 1, var72) != gb.r) {
               this.p.d(var54, var81, var72, ly.aT.bc);
            }
         }
      }

      dh.a = false;
   }

   public boolean a(boolean var1, nu var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return true;
   }
}
