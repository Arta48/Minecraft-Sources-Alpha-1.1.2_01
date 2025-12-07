import java.util.List;

public class dc extends kh {
   public int a;
   public int b;
   public int c;

   public dc(cn var1) {
      super(var1);
      this.a = 0;
      this.b = 0;
      this.c = 1;
      this.ad = true;
      this.a(1.5F, 0.6F);
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

   public dc(cn var1, double var2, double var4, double var6) {
      this(var1);
      this.a(var2, var4 + (double)this.aB, var6);
      this.an = (double)0.0F;
      this.ao = (double)0.0F;
      this.ap = (double)0.0F;
      this.ah = var2;
      this.ai = var4;
      this.aj = var6;
   }

   public double h() {
      return (double)this.aD * (double)0.0F - (double)0.3F;
   }

   public boolean a(kh var1, int var2) {
      this.c = -this.c;
      this.b = 10;
      this.a += var2 * 10;
      if (this.a > 40) {
         for(int var3 = 0; var3 < 3; ++var3) {
            this.a(ly.y.bc, 1, 0.0F);
         }

         for(int var4 = 0; var4 < 2; ++var4) {
            this.a(di.B.aS, 1, 0.0F);
         }

         this.F();
      }

      return true;
   }

   public boolean c_() {
      return !this.aA;
   }

   public void e_() {
      super.e_();
      if (this.b > 0) {
         --this.b;
      }

      if (this.a > 0) {
         --this.a;
      }

      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      byte var1 = 5;
      double var2 = (double)0.0F;

      for(int var4 = 0; var4 < var1; ++var4) {
         double var5 = this.au.b + (this.au.e - this.au.b) * (double)(var4 + 0) / (double)var1 - (double)0.125F;
         double var7 = this.au.b + (this.au.e - this.au.b) * (double)(var4 + 1) / (double)var1 - (double)0.125F;
         cf var9 = cf.b(this.au.a, var5, this.au.c, this.au.d, var7, this.au.f);
         if (this.ag.b(var9, gb.f)) {
            var2 += (double)1.0F / (double)var1;
         }
      }

      double var23 = var2 * (double)2.0F - (double)1.0F;
      this.ao += (double)0.04F * var23;
      if (this.ae != null) {
         this.an += this.ae.an * 0.2;
         this.ap += this.ae.ap * 0.2;
      }

      double var6 = 0.4;
      if (this.an < -var6) {
         this.an = -var6;
      }

      if (this.an > var6) {
         this.an = var6;
      }

      if (this.ap < -var6) {
         this.ap = -var6;
      }

      if (this.ap > var6) {
         this.ap = var6;
      }

      if (this.av) {
         this.an *= (double)0.5F;
         this.ao *= (double)0.5F;
         this.ap *= (double)0.5F;
      }

      this.c(this.an, this.ao, this.ap);
      double var8 = Math.sqrt(this.an * this.an + this.ap * this.ap);
      if (var8 > 0.15) {
         double var10 = Math.cos((double)this.aq * Math.PI / (double)180.0F);
         double var12 = Math.sin((double)this.aq * Math.PI / (double)180.0F);

         for(int var14 = 0; (double)var14 < (double)1.0F + var8 * (double)60.0F; ++var14) {
            double var15 = (double)(this.aQ.nextFloat() * 2.0F - 1.0F);
            double var17 = (double)(this.aQ.nextInt(2) * 2 - 1) * 0.7;
            if (this.aQ.nextBoolean()) {
               double var19 = this.ak - var10 * var15 * 0.8 + var12 * var17;
               double var21 = this.am - var12 * var15 * 0.8 - var10 * var17;
               this.ag.a("splash", var19, this.al - (double)0.125F, var21, this.an, this.ao, this.ap);
            } else {
               double var29 = this.ak + var10 + var12 * var15 * 0.7;
               double var31 = this.am + var12 - var10 * var15 * 0.7;
               this.ag.a("splash", var29, this.al - (double)0.125F, var31, this.an, this.ao, this.ap);
            }
         }
      }

      if (this.aw && var8 > 0.15) {
         this.F();

         for(int var24 = 0; var24 < 3; ++var24) {
            this.a(ly.y.bc, 1, 0.0F);
         }

         for(int var25 = 0; var25 < 2; ++var25) {
            this.a(di.B.aS, 1, 0.0F);
         }
      } else {
         this.an *= (double)0.99F;
         this.ao *= (double)0.95F;
         this.ap *= (double)0.99F;
      }

      this.ar = 0.0F;
      double var26 = (double)this.aq;
      double var27 = this.ah - this.ak;
      double var28 = this.aj - this.am;
      if (var27 * var27 + var28 * var28 > 0.001) {
         var26 = (double)((float)(Math.atan2(var28, var27) * (double)180.0F / Math.PI));
      }

      double var16;
      for(var16 = var26 - (double)this.aq; var16 >= (double)180.0F; var16 -= (double)360.0F) {
      }

      while(var16 < (double)-180.0F) {
         var16 += (double)360.0F;
      }

      if (var16 > (double)20.0F) {
         var16 = (double)20.0F;
      }

      if (var16 < (double)-20.0F) {
         var16 = (double)-20.0F;
      }

      this.aq = (float)((double)this.aq + var16);
      this.c(this.aq, this.ar);
      List var18 = this.ag.b((kh)this, (cf)this.au.b((double)0.2F, (double)0.0F, (double)0.2F));
      if (var18 != null && var18.size() > 0) {
         for(int var30 = 0; var30 < var18.size(); ++var30) {
            kh var20 = (kh)var18.get(var30);
            if (var20 != this.ae && var20.d_() && var20 instanceof dc) {
               var20.f(this);
            }
         }
      }

      if (this.ae != null && this.ae.aA) {
         this.ae = null;
      }

   }

   protected void i_() {
      double var1 = Math.cos((double)this.aq * Math.PI / (double)180.0F) * 0.4;
      double var3 = Math.sin((double)this.aq * Math.PI / (double)180.0F) * 0.4;
      this.ae.a(this.ak + var1, this.al + this.h() + this.ae.v(), this.am + var3);
   }

   protected void a(hm var1) {
   }

   protected void b(hm var1) {
   }

   public float h_() {
      return 0.0F;
   }

   public boolean a(dm var1) {
      var1.g(this);
      return true;
   }
}
