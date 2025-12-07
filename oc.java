import java.util.List;

public class oc extends kh implements gh {
   private ev[] h;
   public int a;
   public int b;
   public int c;
   private boolean i;
   public int d;
   public int e;
   public double f;
   public double g;
   private static final int[][][] j = new int[][][]{{{0, 0, -1}, {0, 0, 1}}, {{-1, 0, 0}, {1, 0, 0}}, {{-1, -1, 0}, {1, 0, 0}}, {{-1, 0, 0}, {1, -1, 0}}, {{0, 0, -1}, {0, -1, 1}}, {{0, -1, -1}, {0, 0, 1}}, {{0, 0, 1}, {1, 0, 0}}, {{0, 0, 1}, {-1, 0, 0}}, {{0, 0, -1}, {-1, 0, 0}}, {{0, 0, -1}, {1, 0, 0}}};
   private int k;
   private double l;
   private double m;
   private double n;
   private double o;
   private double p;

   public oc(cn var1) {
      super(var1);
      this.h = new ev[36];
      this.a = 0;
      this.b = 0;
      this.c = 1;
      this.i = false;
      this.ad = true;
      this.a(0.98F, 0.7F);
      this.aB = this.aD / 2.0F;
      this.aG = false;
   }

   public cf b_(kh var1) {
      return var1.au;
   }

   public cf f_() {
      return this.au;
   }

   public boolean d_() {
      return true;
   }

   public oc(cn var1, double var2, double var4, double var6, int var8) {
      this(var1);
      this.a(var2, var4 + (double)this.aB, var6);
      this.an = (double)0.0F;
      this.ao = (double)0.0F;
      this.ap = (double)0.0F;
      this.ah = var2;
      this.ai = var4;
      this.aj = var6;
      this.d = var8;
   }

   public double h() {
      return (double)this.aD * (double)0.0F - (double)0.3F;
   }

   public boolean a(kh var1, int var2) {
      this.c = -this.c;
      this.b = 10;
      this.a += var2 * 10;
      if (this.a > 40) {
         this.a(di.ax.aS, 1, 0.0F);
         if (this.d == 1) {
            this.a(ly.av.bc, 1, 0.0F);
         } else if (this.d == 2) {
            this.a(ly.aC.bc, 1, 0.0F);
         }

         this.F();
      }

      return true;
   }

   public boolean c_() {
      return !this.aA;
   }

   public void F() {
      for(int var1 = 0; var1 < this.c(); ++var1) {
         ev var2 = this.c(var1);
         if (var2 != null) {
            float var3 = this.aQ.nextFloat() * 0.8F + 0.1F;
            float var4 = this.aQ.nextFloat() * 0.8F + 0.1F;
            float var5 = this.aQ.nextFloat() * 0.8F + 0.1F;

            while(var2.a > 0) {
               int var6 = this.aQ.nextInt(21) + 10;
               if (var6 > var2.a) {
                  var6 = var2.a;
               }

               var2.a -= var6;
               dx var7 = new dx(this.ag, this.ak + (double)var3, this.al + (double)var4, this.am + (double)var5, new ev(var2.c, var6, var2.d));
               float var8 = 0.05F;
               var7.an = (double)((float)this.aQ.nextGaussian() * var8);
               var7.ao = (double)((float)this.aQ.nextGaussian() * var8 + 0.2F);
               var7.ap = (double)((float)this.aQ.nextGaussian() * var8);
               this.ag.a((kh)var7);
            }
         }
      }

      super.F();
   }

   public void e_() {
      if (this.ag.y) {
         if (this.k > 0) {
            double var41 = this.ak + (this.l - this.ak) / (double)this.k;
            double var42 = this.al + (this.m - this.al) / (double)this.k;
            double var5 = this.am + (this.n - this.am) / (double)this.k;

            double var43;
            for(var43 = this.o - (double)this.aq; var43 < (double)-180.0F; var43 += (double)360.0F) {
            }

            while(var43 >= (double)180.0F) {
               var43 -= (double)360.0F;
            }

            this.aq = (float)((double)this.aq + var43 / (double)this.k);
            this.ar = (float)((double)this.ar + (this.p - (double)this.ar) / (double)this.k);
            --this.k;
            this.a(var41, var42, var5);
            this.c(this.aq, this.ar);
         } else {
            this.a(this.ak, this.al, this.am);
            this.c(this.aq, this.ar);
         }

      } else {
         if (this.b > 0) {
            --this.b;
         }

         if (this.a > 0) {
            --this.a;
         }

         this.ah = this.ak;
         this.ai = this.al;
         this.aj = this.am;
         this.ao -= (double)0.04F;
         int var1 = eo.b(this.ak);
         int var2 = eo.b(this.al);
         int var3 = eo.b(this.am);
         if (this.ag.a(var1, var2 - 1, var3) == ly.aH.bc) {
            --var2;
         }

         double var4 = 0.4;
         boolean var6 = false;
         double var7 = (double)0.0078125F;
         if (this.ag.a(var1, var2, var3) == ly.aH.bc) {
            aj var9 = this.g(this.ak, this.al, this.am);
            int var10 = this.ag.e(var1, var2, var3);
            this.al = (double)var2;
            if (var10 >= 2 && var10 <= 5) {
               this.al = (double)(var2 + 1);
            }

            if (var10 == 2) {
               this.an -= var7;
            }

            if (var10 == 3) {
               this.an += var7;
            }

            if (var10 == 4) {
               this.ap += var7;
            }

            if (var10 == 5) {
               this.ap -= var7;
            }

            int[][] var11 = j[var10];
            double var12 = (double)(var11[1][0] - var11[0][0]);
            double var14 = (double)(var11[1][2] - var11[0][2]);
            double var16 = Math.sqrt(var12 * var12 + var14 * var14);
            double var18 = this.an * var12 + this.ap * var14;
            if (var18 < (double)0.0F) {
               var12 = -var12;
               var14 = -var14;
            }

            double var20 = Math.sqrt(this.an * this.an + this.ap * this.ap);
            this.an = var20 * var12 / var16;
            this.ap = var20 * var14 / var16;
            double var22 = (double)0.0F;
            double var24 = (double)var1 + (double)0.5F + (double)var11[0][0] * (double)0.5F;
            double var26 = (double)var3 + (double)0.5F + (double)var11[0][2] * (double)0.5F;
            double var28 = (double)var1 + (double)0.5F + (double)var11[1][0] * (double)0.5F;
            double var30 = (double)var3 + (double)0.5F + (double)var11[1][2] * (double)0.5F;
            var12 = var28 - var24;
            var14 = var30 - var26;
            if (var12 == (double)0.0F) {
               this.ak = (double)var1 + (double)0.5F;
               var22 = this.am - (double)var3;
            } else if (var14 == (double)0.0F) {
               this.am = (double)var3 + (double)0.5F;
               var22 = this.ak - (double)var1;
            } else {
               double var32 = this.ak - var24;
               double var34 = this.am - var26;
               double var36 = (var32 * var12 + var34 * var14) * (double)2.0F;
               var22 = var36;
            }

            this.ak = var24 + var12 * var22;
            this.am = var26 + var14 * var22;
            this.a(this.ak, this.al + (double)this.aB, this.am);
            double var52 = this.an;
            double var53 = this.ap;
            if (this.ae != null) {
               var52 *= (double)0.75F;
               var53 *= (double)0.75F;
            }

            if (var52 < -var4) {
               var52 = -var4;
            }

            if (var52 > var4) {
               var52 = var4;
            }

            if (var53 < -var4) {
               var53 = -var4;
            }

            if (var53 > var4) {
               var53 = var4;
            }

            this.c(var52, (double)0.0F, var53);
            if (var11[0][1] != 0 && eo.b(this.ak) - var1 == var11[0][0] && eo.b(this.am) - var3 == var11[0][2]) {
               this.a(this.ak, this.al + (double)var11[0][1], this.am);
            } else if (var11[1][1] != 0 && eo.b(this.ak) - var1 == var11[1][0] && eo.b(this.am) - var3 == var11[1][2]) {
               this.a(this.ak, this.al + (double)var11[1][1], this.am);
            }

            if (this.ae != null) {
               this.an *= (double)0.997F;
               this.ao *= (double)0.0F;
               this.ap *= (double)0.997F;
            } else {
               if (this.d == 2) {
                  double var54 = (double)eo.a(this.f * this.f + this.g * this.g);
                  if (var54 > 0.01) {
                     var6 = true;
                     this.f /= var54;
                     this.g /= var54;
                     double var38 = 0.04;
                     this.an *= (double)0.8F;
                     this.ao *= (double)0.0F;
                     this.ap *= (double)0.8F;
                     this.an += this.f * var38;
                     this.ap += this.g * var38;
                  } else {
                     this.an *= (double)0.9F;
                     this.ao *= (double)0.0F;
                     this.ap *= (double)0.9F;
                  }
               }

               this.an *= (double)0.96F;
               this.ao *= (double)0.0F;
               this.ap *= (double)0.96F;
            }

            aj var55 = this.g(this.ak, this.al, this.am);
            if (var55 != null && var9 != null) {
               double var37 = (var9.b - var55.b) * 0.05;
               var20 = Math.sqrt(this.an * this.an + this.ap * this.ap);
               if (var20 > (double)0.0F) {
                  this.an = this.an / var20 * (var20 + var37);
                  this.ap = this.ap / var20 * (var20 + var37);
               }

               this.a(this.ak, var55.b, this.am);
            }

            int var56 = eo.b(this.ak);
            int var57 = eo.b(this.am);
            if (var56 != var1 || var57 != var3) {
               var20 = Math.sqrt(this.an * this.an + this.ap * this.ap);
               this.an = var20 * (double)(var56 - var1);
               this.ap = var20 * (double)(var57 - var3);
            }

            if (this.d == 2) {
               double var39 = (double)eo.a(this.f * this.f + this.g * this.g);
               if (var39 > 0.01 && this.an * this.an + this.ap * this.ap > 0.001) {
                  this.f /= var39;
                  this.g /= var39;
                  if (this.f * this.an + this.g * this.ap < (double)0.0F) {
                     this.f = (double)0.0F;
                     this.g = (double)0.0F;
                  } else {
                     this.f = this.an;
                     this.g = this.ap;
                  }
               }
            }
         } else {
            if (this.an < -var4) {
               this.an = -var4;
            }

            if (this.an > var4) {
               this.an = var4;
            }

            if (this.ap < -var4) {
               this.ap = -var4;
            }

            if (this.ap > var4) {
               this.ap = var4;
            }

            if (this.av) {
               this.an *= (double)0.5F;
               this.ao *= (double)0.5F;
               this.ap *= (double)0.5F;
            }

            this.c(this.an, this.ao, this.ap);
            if (!this.av) {
               this.an *= (double)0.95F;
               this.ao *= (double)0.95F;
               this.ap *= (double)0.95F;
            }
         }

         this.ar = 0.0F;
         double var44 = this.ah - this.ak;
         double var45 = this.aj - this.am;
         if (var44 * var44 + var45 * var45 > 0.001) {
            this.aq = (float)(Math.atan2(var45, var44) * (double)180.0F / Math.PI);
            if (this.i) {
               this.aq += 180.0F;
            }
         }

         double var13;
         for(var13 = (double)(this.aq - this.as); var13 >= (double)180.0F; var13 -= (double)360.0F) {
         }

         while(var13 < (double)-180.0F) {
            var13 += (double)360.0F;
         }

         if (var13 < (double)-170.0F || var13 >= (double)170.0F) {
            this.aq += 180.0F;
            this.i = !this.i;
         }

         this.c(this.aq, this.ar);
         List var15 = this.ag.b((kh)this, (cf)this.au.b((double)0.2F, (double)0.0F, (double)0.2F));
         if (var15 != null && var15.size() > 0) {
            for(int var48 = 0; var48 < var15.size(); ++var48) {
               kh var17 = (kh)var15.get(var48);
               if (var17 != this.ae && var17.d_() && var17 instanceof oc) {
                  var17.f(this);
               }
            }
         }

         if (this.ae != null && this.ae.aA) {
            this.ae = null;
         }

         if (var6 && this.aQ.nextInt(4) == 0) {
            --this.e;
            if (this.e < 0) {
               this.f = this.g = (double)0.0F;
            }

            this.ag.a("largesmoke", this.ak, this.al + 0.8, this.am, (double)0.0F, (double)0.0F, (double)0.0F);
         }

      }
   }

   public aj a(double var1, double var3, double var5, double var7) {
      int var9 = eo.b(var1);
      int var10 = eo.b(var3);
      int var11 = eo.b(var5);
      if (this.ag.a(var9, var10 - 1, var11) == ly.aH.bc) {
         --var10;
      }

      if (this.ag.a(var9, var10, var11) == ly.aH.bc) {
         int var12 = this.ag.e(var9, var10, var11);
         var3 = (double)var10;
         if (var12 >= 2 && var12 <= 5) {
            var3 = (double)(var10 + 1);
         }

         int[][] var13 = j[var12];
         double var14 = (double)(var13[1][0] - var13[0][0]);
         double var16 = (double)(var13[1][2] - var13[0][2]);
         double var18 = Math.sqrt(var14 * var14 + var16 * var16);
         var14 /= var18;
         var16 /= var18;
         var1 += var14 * var7;
         var5 += var16 * var7;
         if (var13[0][1] != 0 && eo.b(var1) - var9 == var13[0][0] && eo.b(var5) - var11 == var13[0][2]) {
            var3 += (double)var13[0][1];
         } else if (var13[1][1] != 0 && eo.b(var1) - var9 == var13[1][0] && eo.b(var5) - var11 == var13[1][2]) {
            var3 += (double)var13[1][1];
         }

         return this.g(var1, var3, var5);
      } else {
         return null;
      }
   }

   public aj g(double var1, double var3, double var5) {
      int var7 = eo.b(var1);
      int var8 = eo.b(var3);
      int var9 = eo.b(var5);
      if (this.ag.a(var7, var8 - 1, var9) == ly.aH.bc) {
         --var8;
      }

      if (this.ag.a(var7, var8, var9) == ly.aH.bc) {
         int var10 = this.ag.e(var7, var8, var9);
         var3 = (double)var8;
         if (var10 >= 2 && var10 <= 5) {
            var3 = (double)(var8 + 1);
         }

         int[][] var11 = j[var10];
         double var12 = (double)0.0F;
         double var14 = (double)var7 + (double)0.5F + (double)var11[0][0] * (double)0.5F;
         double var16 = (double)var8 + (double)0.5F + (double)var11[0][1] * (double)0.5F;
         double var18 = (double)var9 + (double)0.5F + (double)var11[0][2] * (double)0.5F;
         double var20 = (double)var7 + (double)0.5F + (double)var11[1][0] * (double)0.5F;
         double var22 = (double)var8 + (double)0.5F + (double)var11[1][1] * (double)0.5F;
         double var24 = (double)var9 + (double)0.5F + (double)var11[1][2] * (double)0.5F;
         double var26 = var20 - var14;
         double var28 = (var22 - var16) * (double)2.0F;
         double var30 = var24 - var18;
         if (var26 == (double)0.0F) {
            var1 = (double)var7 + (double)0.5F;
            var12 = var5 - (double)var9;
         } else if (var30 == (double)0.0F) {
            var5 = (double)var9 + (double)0.5F;
            var12 = var1 - (double)var7;
         } else {
            double var32 = var1 - var14;
            double var34 = var5 - var18;
            double var36 = (var32 * var26 + var34 * var30) * (double)2.0F;
            var12 = var36;
         }

         var1 = var14 + var26 * var12;
         var3 = var16 + var28 * var12;
         var5 = var18 + var30 * var12;
         if (var28 < (double)0.0F) {
            ++var3;
         }

         if (var28 > (double)0.0F) {
            var3 += (double)0.5F;
         }

         return aj.b(var1, var3, var5);
      } else {
         return null;
      }
   }

   protected void a(hm var1) {
      var1.a("Type", this.d);
      if (this.d == 2) {
         var1.a("PushX", this.f);
         var1.a("PushZ", this.g);
         var1.a("Fuel", (short)this.e);
      } else if (this.d == 1) {
         ki var2 = new ki();

         for(int var3 = 0; var3 < this.h.length; ++var3) {
            if (this.h[var3] != null) {
               hm var4 = new hm();
               var4.a("Slot", (byte)var3);
               this.h[var3].a(var4);
               var2.a((el)var4);
            }
         }

         var1.a("Items", (el)var2);
      }

   }

   protected void b(hm var1) {
      this.d = var1.e("Type");
      if (this.d == 2) {
         this.f = var1.h("PushX");
         this.g = var1.h("PushZ");
         this.e = var1.d("Fuel");
      } else if (this.d == 1) {
         ki var2 = var1.l("Items");
         this.h = new ev[this.c()];

         for(int var3 = 0; var3 < var2.c(); ++var3) {
            hm var4 = (hm)var2.a(var3);
            int var5 = var4.c("Slot") & 255;
            if (var5 >= 0 && var5 < this.h.length) {
               this.h[var5] = new ev(var4);
            }
         }
      }

   }

   public float h_() {
      return 0.0F;
   }

   public void f(kh var1) {
      if (var1 != this.ae) {
         if (var1 instanceof ge && !(var1 instanceof dm) && this.d == 0 && this.an * this.an + this.ap * this.ap > 0.01 && this.ae == null && var1.af == null) {
            var1.g(this);
         }

         double var2 = var1.ak - this.ak;
         double var4 = var1.am - this.am;
         double var6 = var2 * var2 + var4 * var4;
         if (var6 >= (double)1.0E-4F) {
            var6 = (double)eo.a(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = (double)1.0F / var6;
            if (var8 > (double)1.0F) {
               var8 = (double)1.0F;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= (double)0.1F;
            var4 *= (double)0.1F;
            var2 *= (double)(1.0F - this.aO);
            var4 *= (double)(1.0F - this.aO);
            var2 *= (double)0.5F;
            var4 *= (double)0.5F;
            if (var1 instanceof oc) {
               double var10 = var1.an + this.an;
               double var12 = var1.ap + this.ap;
               if (((oc)var1).d == 2 && this.d != 2) {
                  this.an *= (double)0.2F;
                  this.ap *= (double)0.2F;
                  this.f(var1.an - var2, (double)0.0F, var1.ap - var4);
                  var1.an *= (double)0.7F;
                  var1.ap *= (double)0.7F;
               } else if (((oc)var1).d != 2 && this.d == 2) {
                  var1.an *= (double)0.2F;
                  var1.ap *= (double)0.2F;
                  var1.f(this.an + var2, (double)0.0F, this.ap + var4);
                  this.an *= (double)0.7F;
                  this.ap *= (double)0.7F;
               } else {
                  var10 /= (double)2.0F;
                  var12 /= (double)2.0F;
                  this.an *= (double)0.2F;
                  this.ap *= (double)0.2F;
                  this.f(var10 - var2, (double)0.0F, var12 - var4);
                  var1.an *= (double)0.2F;
                  var1.ap *= (double)0.2F;
                  var1.f(var10 + var2, (double)0.0F, var12 + var4);
               }
            } else {
               this.f(-var2, (double)0.0F, -var4);
               var1.f(var2 / (double)4.0F, (double)0.0F, var4 / (double)4.0F);
            }
         }

      }
   }

   public int c() {
      return 27;
   }

   public ev c(int var1) {
      return this.h[var1];
   }

   public ev a(int var1, int var2) {
      if (this.h[var1] != null) {
         if (this.h[var1].a <= var2) {
            ev var4 = this.h[var1];
            this.h[var1] = null;
            return var4;
         } else {
            ev var3 = this.h[var1].a(var2);
            if (this.h[var1].a == 0) {
               this.h[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, ev var2) {
      this.h[var1] = var2;
      if (var2 != null && var2.a > this.e()) {
         var2.a = this.e();
      }

   }

   public String d() {
      return "Minecart";
   }

   public int e() {
      return 64;
   }

   public void j_() {
   }

   public boolean a(dm var1) {
      if (this.d == 0) {
         var1.g(this);
      } else if (this.d == 1) {
         var1.a((gh)this);
      } else if (this.d == 2) {
         ev var2 = var1.b.a();
         if (var2 != null && var2.c == di.k.aS) {
            if (--var2.a == 0) {
               var1.b.a(var1.b.d, (ev)null);
            }

            this.e += 1200;
         }

         this.f = this.ak - var1.ak;
         this.g = this.am - var1.am;
      }

      return true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.l = var1;
      this.m = var3;
      this.n = var5;
      this.o = (double)var7;
      this.p = (double)var8;
      this.k = var9;
   }
}
