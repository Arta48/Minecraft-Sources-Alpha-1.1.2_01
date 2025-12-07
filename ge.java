import java.util.List;

public class ge extends kh {
   public int j = 20;
   public float k;
   public float l;
   public float m;
   public float n = 0.0F;
   public float o = 0.0F;
   protected float p;
   protected float q;
   protected float r;
   protected float s;
   protected boolean t = true;
   protected String u = "/char.png";
   protected boolean v = true;
   protected float w = 0.0F;
   protected String x = null;
   protected float y = 1.0F;
   protected int z = 0;
   protected float A = 0.0F;
   public boolean B = false;
   public float C;
   public float D;
   public int E = 10;
   public int F;
   private int a;
   public int G;
   public int H;
   public float I = 0.0F;
   public int J = 0;
   public int K = 0;
   public float L;
   public float M;
   protected boolean N = false;
   public int O = -1;
   public float P = (float)(Math.random() * (double)0.9F + (double)0.1F);
   public float Q;
   public float R;
   public float S;
   private int b;
   private double c;
   private double d;
   private double e;
   private double f;
   private double g;
   float T = 0.0F;
   protected int U = 0;
   protected float V;
   protected float W;
   protected float X;
   protected boolean Y = false;
   protected float Z = 0.0F;
   protected float aa = 0.7F;
   private kh h;
   private int i = 0;

   public ge(cn var1) {
      super(var1);
      this.ad = true;
      this.m = (float)(Math.random() + (double)1.0F) * 0.01F;
      this.a(this.ak, this.al, this.am);
      this.k = (float)Math.random() * 12398.0F;
      this.aq = (float)(Math.random() * (double)(float)Math.PI * (double)2.0F);
      this.l = 1.0F;
      this.aM = 0.5F;
   }

   protected boolean c(kh var1) {
      return this.ag.a(aj.b(this.ak, this.al + (double)this.s(), this.am), aj.b(var1.ak, var1.al + (double)var1.s(), var1.am)) == null;
   }

   public String x() {
      return this.u;
   }

   public boolean c_() {
      return !this.aA;
   }

   public boolean d_() {
      return !this.aA;
   }

   protected float s() {
      return this.aD * 0.85F;
   }

   public int b() {
      return 80;
   }

   public void y() {
      this.C = this.D;
      super.y();
      if (this.aQ.nextInt(1000) < this.a++) {
         this.a = -this.b();
         String var1 = this.c();
         if (var1 != null) {
            this.ag.a(this, var1, this.f(), (this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.2F + 1.0F);
         }
      }

      if (this.B() && this.I()) {
         this.a((kh)null, 1);
      }

      if (this.B() && this.a(gb.f)) {
         --this.aX;
         if (this.aX == -20) {
            this.aX = 0;

            for(int var8 = 0; var8 < 8; ++var8) {
               float var2 = this.aQ.nextFloat() - this.aQ.nextFloat();
               float var3 = this.aQ.nextFloat() - this.aQ.nextFloat();
               float var4 = this.aQ.nextFloat() - this.aQ.nextFloat();
               this.ag.a("bubble", this.ak + (double)var2, this.al + (double)var3, this.am + (double)var4, this.an, this.ao, this.ap);
            }

            this.a((kh)null, 2);
         }

         this.aT = 0;
      } else {
         this.aX = this.aU;
      }

      this.L = this.M;
      if (this.K > 0) {
         --this.K;
      }

      if (this.G > 0) {
         --this.G;
      }

      if (this.aW > 0) {
         --this.aW;
      }

      if (this.E <= 0) {
         ++this.J;
         if (this.J > 20) {
            this.D();
            this.F();

            for(int var9 = 0; var9 < 20; ++var9) {
               double var10 = this.aQ.nextGaussian() * 0.02;
               double var11 = this.aQ.nextGaussian() * 0.02;
               double var6 = this.aQ.nextGaussian() * 0.02;
               this.ag.a("explode", this.ak + (double)(this.aQ.nextFloat() * this.aC * 2.0F) - (double)this.aC, this.al + (double)(this.aQ.nextFloat() * this.aD), this.am + (double)(this.aQ.nextFloat() * this.aC * 2.0F) - (double)this.aC, var10, var11, var6);
            }
         }
      }

      this.s = this.r;
      this.o = this.n;
      this.as = this.aq;
      this.at = this.ar;
   }

   public void z() {
      for(int var1 = 0; var1 < 20; ++var1) {
         double var2 = this.aQ.nextGaussian() * 0.02;
         double var4 = this.aQ.nextGaussian() * 0.02;
         double var6 = this.aQ.nextGaussian() * 0.02;
         double var8 = (double)10.0F;
         this.ag.a("explode", this.ak + (double)(this.aQ.nextFloat() * this.aC * 2.0F) - (double)this.aC - var2 * var8, this.al + (double)(this.aQ.nextFloat() * this.aD) - var4 * var8, this.am + (double)(this.aQ.nextFloat() * this.aC * 2.0F) - (double)this.aC - var6 * var8, var2, var4, var6);
      }

   }

   public void p() {
      super.p();
      this.p = this.q;
      this.q = 0.0F;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.aB = 0.0F;
      this.c = var1;
      this.d = var3;
      this.e = var5;
      this.f = (double)var7;
      this.g = (double)var8;
      this.b = var9;
   }

   public void e_() {
      super.e_();
      this.j();
      double var1 = this.ak - this.ah;
      double var3 = this.am - this.aj;
      float var5 = eo.a(var1 * var1 + var3 * var3);
      float var6 = this.n;
      float var7 = 0.0F;
      this.p = this.q;
      float var8 = 0.0F;
      if (!(var5 <= 0.05F)) {
         var8 = 1.0F;
         var7 = var5 * 3.0F;
         var6 = (float)Math.atan2(var3, var1) * 180.0F / (float)Math.PI - 90.0F;
      }

      if (this.D > 0.0F) {
         var6 = this.aq;
      }

      if (!this.av) {
         var8 = 0.0F;
      }

      this.q += (var8 - this.q) * 0.3F;

      float var9;
      for(var9 = var6 - this.n; var9 < -180.0F; var9 += 360.0F) {
      }

      while(var9 >= 180.0F) {
         var9 -= 360.0F;
      }

      this.n += var9 * 0.3F;

      float var10;
      for(var10 = this.aq - this.n; var10 < -180.0F; var10 += 360.0F) {
      }

      while(var10 >= 180.0F) {
         var10 -= 360.0F;
      }

      boolean var11 = var10 < -90.0F || var10 >= 90.0F;
      if (var10 < -75.0F) {
         var10 = -75.0F;
      }

      if (var10 >= 75.0F) {
         var10 = 75.0F;
      }

      this.n = this.aq - var10;
      if (var10 * var10 > 2500.0F) {
         this.n += var10 * 0.2F;
      }

      if (var11) {
         var7 *= -1.0F;
      }

      while(this.aq - this.as < -180.0F) {
         this.as -= 360.0F;
      }

      while(this.aq - this.as >= 180.0F) {
         this.as += 360.0F;
      }

      while(this.n - this.o < -180.0F) {
         this.o -= 360.0F;
      }

      while(this.n - this.o >= 180.0F) {
         this.o += 360.0F;
      }

      while(this.ar - this.at < -180.0F) {
         this.at -= 360.0F;
      }

      while(this.ar - this.at >= 180.0F) {
         this.at += 360.0F;
      }

      this.r += var7;
   }

   protected void a(float var1, float var2) {
      super.a(var1, var2);
   }

   public void b(int var1) {
      if (this.E > 0) {
         this.E += var1;
         if (this.E > 20) {
            this.E = 20;
         }

         this.aW = this.j / 2;
      }
   }

   public boolean a(kh var1, int var2) {
      if (this.ag.y) {
         var2 = 0;
      }

      this.U = 0;
      if (this.E <= 0) {
         return false;
      } else {
         this.R = 1.5F;
         if ((float)this.aW > (float)this.j / 2.0F) {
            if (this.F - var2 >= this.E) {
               return false;
            }

            this.E = this.F - var2;
         } else {
            this.F = this.E;
            this.aW = this.j;
            this.E -= var2;
            this.G = this.H = 10;
         }

         this.I = 0.0F;
         if (var1 != null) {
            double var3 = var1.ak - this.ak;

            double var5;
            for(var5 = var1.am - this.am; var3 * var3 + var5 * var5 < 1.0E-4; var5 = (Math.random() - Math.random()) * 0.01) {
               var3 = (Math.random() - Math.random()) * 0.01;
            }

            this.I = (float)(Math.atan2(var5, var3) * (double)180.0F / (double)(float)Math.PI) - this.aq;
            this.a(var1, var2, var3, var5);
         } else {
            this.I = (float)((int)(Math.random() * (double)2.0F) * 180);
         }

         if (this.E <= 0) {
            this.ag.a(this, this.e(), this.f(), (this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.2F + 1.0F);
            this.b(var1);
         } else {
            this.ag.a(this, this.d(), this.f(), (this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.2F + 1.0F);
         }

         return true;
      }
   }

   protected float f() {
      return 1.0F;
   }

   protected String c() {
      return null;
   }

   protected String d() {
      return "random.hurt";
   }

   protected String e() {
      return "random.hurt";
   }

   public void a(kh var1, int var2, double var3, double var5) {
      float var7 = eo.a(var3 * var3 + var5 * var5);
      float var8 = 0.4F;
      this.an /= (double)2.0F;
      this.ao /= (double)2.0F;
      this.ap /= (double)2.0F;
      this.an -= var3 / (double)var7 * (double)var8;
      this.ao += (double)0.4F;
      this.ap -= var5 / (double)var7 * (double)var8;
      if (this.ao > (double)0.4F) {
         this.ao = (double)0.4F;
      }

   }

   public void b(kh var1) {
      if (this.z > 0 && var1 != null) {
         var1.b(this, this.z);
      }

      this.N = true;
      int var2 = this.g();
      if (var2 > 0) {
         int var3 = this.aQ.nextInt(3);

         for(int var4 = 0; var4 < var3; ++var4) {
            this.b(var2, 1);
         }
      }

   }

   protected int g() {
      return 0;
   }

   protected void c(float var1) {
      int var2 = (int)Math.ceil((double)(var1 - 3.0F));
      if (var2 > 0) {
         this.a((kh)null, var2);
         int var3 = this.ag.a(eo.b(this.ak), eo.b(this.al - (double)0.2F - (double)this.aB), eo.b(this.am));
         if (var3 > 0) {
            bb var4 = ly.n[var3].bl;
            this.ag.a(this, var4.d(), var4.b() * 0.5F, var4.c() * 0.75F);
         }
      }

   }

   public void b(float var1, float var2) {
      if (this.g_()) {
         double var3 = this.al;
         this.a(var1, var2, 0.02F);
         this.c(this.an, this.ao, this.ap);
         this.an *= (double)0.8F;
         this.ao *= (double)0.8F;
         this.ap *= (double)0.8F;
         this.ao -= 0.02;
         if (this.aw && this.b(this.an, this.ao + (double)0.6F - this.al + var3, this.ap)) {
            this.ao = (double)0.3F;
         }
      } else if (this.G()) {
         double var8 = this.al;
         this.a(var1, var2, 0.02F);
         this.c(this.an, this.ao, this.ap);
         this.an *= (double)0.5F;
         this.ao *= (double)0.5F;
         this.ap *= (double)0.5F;
         this.ao -= 0.02;
         if (this.aw && this.b(this.an, this.ao + (double)0.6F - this.al + var8, this.ap)) {
            this.ao = (double)0.3F;
         }
      } else {
         float var9 = 0.91F;
         if (this.av) {
            var9 = 0.54600006F;
            int var4 = this.ag.a(eo.b(this.ak), eo.b(this.au.b) - 1, eo.b(this.am));
            if (var4 > 0) {
               var9 = ly.n[var4].bo * 0.91F;
            }
         }

         float var12 = 0.16277136F / (var9 * var9 * var9);
         this.a(var1, var2, this.av ? 0.1F * var12 : 0.02F);
         var9 = 0.91F;
         if (this.av) {
            var9 = 0.54600006F;
            int var5 = this.ag.a(eo.b(this.ak), eo.b(this.au.b) - 1, eo.b(this.am));
            if (var5 > 0) {
               var9 = ly.n[var5].bo * 0.91F;
            }
         }

         if (this.A()) {
            this.aH = 0.0F;
            if (this.ao < -0.15) {
               this.ao = -0.15;
            }
         }

         this.c(this.an, this.ao, this.ap);
         if (this.aw && this.A()) {
            this.ao = 0.2;
         }

         this.ao -= 0.08;
         this.ao *= (double)0.98F;
         this.an *= (double)var9;
         this.ap *= (double)var9;
      }

      this.Q = this.R;
      double var11 = this.ak - this.ah;
      double var13 = this.am - this.aj;
      float var7 = eo.a(var11 * var11 + var13 * var13) * 4.0F;
      if (var7 > 1.0F) {
         var7 = 1.0F;
      }

      this.R += (var7 - this.R) * 0.4F;
      this.S += this.R;
   }

   public boolean A() {
      int var1 = eo.b(this.ak);
      int var2 = eo.b(this.au.b);
      int var3 = eo.b(this.am);
      return this.ag.a(var1, var2, var3) == ly.aG.bc || this.ag.a(var1, var2 + 1, var3) == ly.aG.bc;
   }

   public void a(hm var1) {
      var1.a("Health", (short)this.E);
      var1.a("HurtTime", (short)this.G);
      var1.a("DeathTime", (short)this.J);
      var1.a("AttackTime", (short)this.K);
   }

   public void b(hm var1) {
      this.E = var1.d("Health");
      if (!var1.b("Health")) {
         this.E = 10;
      }

      this.G = var1.d("HurtTime");
      this.J = var1.d("DeathTime");
      this.K = var1.d("AttackTime");
   }

   public boolean B() {
      return !this.aA && this.E > 0;
   }

   public void j() {
      if (this.b > 0) {
         double var1 = this.ak + (this.c - this.ak) / (double)this.b;
         double var3 = this.al + (this.d - this.al) / (double)this.b;
         double var5 = this.am + (this.e - this.am) / (double)this.b;

         double var7;
         for(var7 = this.f - (double)this.aq; var7 < (double)-180.0F; var7 += (double)360.0F) {
         }

         while(var7 >= (double)180.0F) {
            var7 -= (double)360.0F;
         }

         this.aq = (float)((double)this.aq + var7 / (double)this.b);
         this.ar = (float)((double)this.ar + (this.g - (double)this.ar) / (double)this.b);
         --this.b;
         this.a(var1, var3, var5);
         this.c(this.aq, this.ar);
      }

      if (this.E <= 0) {
         this.Y = false;
         this.V = 0.0F;
         this.W = 0.0F;
         this.X = 0.0F;
      } else if (!this.B) {
         this.b_();
      }

      boolean var9 = this.g_();
      boolean var2 = this.G();
      if (this.Y) {
         if (var9) {
            this.ao += (double)0.04F;
         } else if (var2) {
            this.ao += (double)0.04F;
         } else if (this.av) {
            this.C();
         }
      }

      this.V *= 0.98F;
      this.W *= 0.98F;
      this.X *= 0.9F;
      this.b(this.V, this.W);
      List var10 = this.ag.b((kh)this, (cf)this.au.b((double)0.2F, (double)0.0F, (double)0.2F));
      if (var10 != null && var10.size() > 0) {
         for(int var4 = 0; var4 < var10.size(); ++var4) {
            kh var11 = (kh)var10.get(var4);
            if (var11.d_()) {
               var11.f(this);
            }
         }
      }

   }

   protected void C() {
      this.ao = (double)0.42F;
   }

   protected void b_() {
      ++this.U;
      dm var1 = this.ag.a(this, (double)-1.0F);
      if (var1 != null) {
         double var2 = var1.ak - this.ak;
         double var4 = var1.al - this.al;
         double var6 = var1.am - this.am;
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         if (var8 > (double)16384.0F) {
            this.F();
         }

         if (this.U > 600 && this.aQ.nextInt(800) == 0) {
            if (var8 < (double)1024.0F) {
               this.U = 0;
            } else {
               this.F();
            }
         }
      }

      this.V = 0.0F;
      this.W = 0.0F;
      float var11 = 8.0F;
      if (this.aQ.nextFloat() < 0.02F) {
         var1 = this.ag.a(this, (double)var11);
         if (var1 != null) {
            this.h = var1;
            this.i = 10 + this.aQ.nextInt(20);
         } else {
            this.X = (this.aQ.nextFloat() - 0.5F) * 20.0F;
         }
      }

      if (this.h != null) {
         this.b(this.h, 10.0F);
         if (this.i-- <= 0 || this.h.aA || this.h.e((kh)this) > (double)(var11 * var11)) {
            this.h = null;
         }
      } else {
         if (this.aQ.nextFloat() < 0.05F) {
            this.X = (this.aQ.nextFloat() - 0.5F) * 20.0F;
         }

         this.aq += this.X;
         this.ar = this.Z;
      }

      boolean var3 = this.g_();
      boolean var12 = this.G();
      if (var3 || var12) {
         this.Y = this.aQ.nextFloat() < 0.8F;
      }

   }

   public void b(kh var1, float var2) {
      double var3 = var1.ak - this.ak;
      double var7 = var1.am - this.am;
      double var5;
      if (var1 instanceof ge) {
         ge var9 = (ge)var1;
         var5 = var9.al + (double)var9.s() - (this.al + (double)this.s());
      } else {
         var5 = (var1.au.b + var1.au.e) / (double)2.0F - (this.al + (double)this.s());
      }

      double var13 = (double)eo.a(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * (double)180.0F / (double)(float)Math.PI) - 90.0F;
      float var12 = (float)(Math.atan2(var5, var13) * (double)180.0F / (double)(float)Math.PI);
      this.ar = this.b(this.ar, var12, var2);
      this.aq = this.b(this.aq, var11, var2);
   }

   private float b(float var1, float var2, float var3) {
      float var4;
      for(var4 = var2 - var1; var4 < -180.0F; var4 += 360.0F) {
      }

      while(var4 >= 180.0F) {
         var4 -= 360.0F;
      }

      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 < -var3) {
         var4 = -var3;
      }

      return var1 + var4;
   }

   public void D() {
   }

   public boolean a() {
      return this.ag.a(this.au) && this.ag.a((kh)this, (cf)this.au).size() == 0 && !this.ag.b(this.au);
   }

   protected void E() {
      this.a((kh)null, 4);
   }

   public float d(float var1) {
      float var2 = this.D - this.C;
      if (var2 < 0.0F) {
         ++var2;
      }

      return this.C + var2 * var1;
   }

   public aj e(float var1) {
      if (var1 == 1.0F) {
         return aj.b(this.ak, this.al, this.am);
      } else {
         double var2 = this.ah + (this.ak - this.ah) * (double)var1;
         double var4 = this.ai + (this.al - this.ai) * (double)var1;
         double var6 = this.aj + (this.am - this.aj) * (double)var1;
         return aj.b(var2, var4, var6);
      }
   }

   public aj f(float var1) {
      if (var1 == 1.0F) {
         float var8 = eo.b(-this.aq * ((float)Math.PI / 180F) - (float)Math.PI);
         float var9 = eo.a(-this.aq * ((float)Math.PI / 180F) - (float)Math.PI);
         float var10 = -eo.b(-this.ar * ((float)Math.PI / 180F));
         float var11 = eo.a(-this.ar * ((float)Math.PI / 180F));
         return aj.b((double)(var9 * var10), (double)var11, (double)(var8 * var10));
      } else {
         float var2 = this.at + (this.ar - this.at) * var1;
         float var3 = this.as + (this.aq - this.as) * var1;
         float var4 = eo.b(-var3 * ((float)Math.PI / 180F) - (float)Math.PI);
         float var5 = eo.a(-var3 * ((float)Math.PI / 180F) - (float)Math.PI);
         float var6 = -eo.b(-var2 * ((float)Math.PI / 180F));
         float var7 = eo.a(-var2 * ((float)Math.PI / 180F));
         return aj.b((double)(var5 * var6), (double)var7, (double)(var4 * var6));
      }
   }

   public mf a(double var1, float var3) {
      aj var4 = this.e(var3);
      aj var5 = this.f(var3);
      aj var6 = var4.c(var5.a * var1, var5.b * var1, var5.c * var1);
      return this.ag.a(var4, var6);
   }
}
