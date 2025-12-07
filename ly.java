import java.util.ArrayList;
import java.util.Random;

public class ly {
   public static final bb e = new bb("stone", 1.0F, 1.0F);
   public static final bb f = new bb("wood", 1.0F, 1.0F);
   public static final bb g = new bb("gravel", 1.0F, 1.0F);
   public static final bb h = new bb("grass", 1.0F, 1.0F);
   public static final bb i = new bb("stone", 1.0F, 1.0F);
   public static final bb j = new bb("stone", 1.0F, 1.5F);
   public static final bb k = new u("stone", 1.0F, 1.0F);
   public static final bb l = new bb("cloth", 1.0F, 1.0F);
   public static final bb m = new t("sand", 1.0F, 1.0F);
   public static final ly[] n = new ly[256];
   public static final boolean[] o = new boolean[256];
   public static final boolean[] p = new boolean[256];
   public static final boolean[] q = new boolean[256];
   public static final int[] r = new int[256];
   public static final boolean[] s = new boolean[256];
   public static final int[] t = new int[256];
   public static final ly u;
   public static final my v;
   public static final ly w;
   public static final ly x;
   public static final ly y;
   public static final ly z;
   public static final ly A;
   public static final ly B;
   public static final ly C;
   public static final ly D;
   public static final ly E;
   public static final ly F;
   public static final ly G;
   public static final ly H;
   public static final ly I;
   public static final ly J;
   public static final ly K;
   public static final iz L;
   public static final ly M;
   public static final ly N;
   public static final ly O;
   public static final ly P;
   public static final ly Q;
   public static final ly R;
   public static final ly S;
   public static final ly T;
   public static final ly U;
   public static final ly V;
   public static final ly W;
   public static final ly X;
   public static final ly Y;
   public static final ly Z;
   public static final ly aa;
   public static final ly ab;
   public static final ly ac;
   public static final ly ad;
   public static final mq ae;
   public static final mq af;
   public static final mq ag;
   public static final mq ah;
   public static final ly ai;
   public static final ly aj;
   public static final ly ak;
   public static final ly al;
   public static final ly am;
   public static final ly an;
   public static final ly ao;
   public static final ly ap;
   public static final ly aq;
   public static final ly ar;
   public static final og as;
   public static final ly at;
   public static final ly au;
   public static final ly av;
   public static final ly aw;
   public static final ly ax;
   public static final ly ay;
   public static final ly az;
   public static final ly aA;
   public static final ly aB;
   public static final ly aC;
   public static final ly aD;
   public static final ly aE;
   public static final ly aF;
   public static final ly aG;
   public static final ly aH;
   public static final ly aI;
   public static final ly aJ;
   public static final ly aK;
   public static final ly aL;
   public static final ly aM;
   public static final ly aN;
   public static final ly aO;
   public static final ly aP;
   public static final ly aQ;
   public static final ly aR;
   public static final ly aS;
   public static final ly aT;
   public static final ly aU;
   public static final ly aV;
   public static final ly aW;
   public static final ly aX;
   public static final ly aY;
   public static final ly aZ;
   public static final ly ba;
   public int bb;
   public final int bc;
   protected float bd;
   protected float be;
   public double bf;
   public double bg;
   public double bh;
   public double bi;
   public double bj;
   public double bk;
   public bb bl;
   public float bm;
   public final gb bn;
   public float bo;

   protected ly(int var1, gb var2) {
      this.bl = e;
      this.bm = 1.0F;
      this.bo = 0.6F;
      if (n[var1] != null) {
         throw new IllegalArgumentException("Slot " + var1 + " is already occupied by " + n[var1] + " when adding " + this);
      } else {
         this.bn = var2;
         n[var1] = this;
         this.bc = var1;
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         p[var1] = this.b();
         r[var1] = this.b() ? 255 : 0;
         s[var1] = this.i();
         q[var1] = false;
      }
   }

   protected ly(int var1, int var2, gb var3) {
      this(var1, var3);
      this.bb = var2;
   }

   protected ly a(bb var1) {
      this.bl = var1;
      return this;
   }

   protected ly d(int var1) {
      r[this.bc] = var1;
      return this;
   }

   protected ly a(float var1) {
      t[this.bc] = (int)(15.0F * var1);
      return this;
   }

   protected ly b(float var1) {
      this.be = var1 * 3.0F;
      return this;
   }

   private boolean i() {
      return false;
   }

   public boolean c() {
      return true;
   }

   public int f() {
      return 0;
   }

   protected ly c(float var1) {
      this.bd = var1;
      if (this.be < var1 * 5.0F) {
         this.be = var1 * 5.0F;
      }

      return this;
   }

   protected void b(boolean var1) {
      o[this.bc] = var1;
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.bf = (double)var1;
      this.bg = (double)var2;
      this.bh = (double)var3;
      this.bi = (double)var4;
      this.bj = (double)var5;
      this.bk = (double)var6;
   }

   public float c(nm var1, int var2, int var3, int var4) {
      return var1.c(var2, var3, var4);
   }

   public boolean c(nm var1, int var2, int var3, int var4, int var5) {
      if (var5 == 0 && this.bg > (double)0.0F) {
         return true;
      } else if (var5 == 1 && this.bj < (double)1.0F) {
         return true;
      } else if (var5 == 2 && this.bh > (double)0.0F) {
         return true;
      } else if (var5 == 3 && this.bk < (double)1.0F) {
         return true;
      } else if (var5 == 4 && this.bf > (double)0.0F) {
         return true;
      } else if (var5 == 5 && this.bi < (double)1.0F) {
         return true;
      } else {
         return !var1.g(var2, var3, var4);
      }
   }

   public int a(nm var1, int var2, int var3, int var4, int var5) {
      return this.a(var5, var1.e(var2, var3, var4));
   }

   public int a(int var1, int var2) {
      return this.a(var1);
   }

   public int a(int var1) {
      return this.bb;
   }

   public cf f(cn var1, int var2, int var3, int var4) {
      return cf.b((double)var2 + this.bf, (double)var3 + this.bg, (double)var4 + this.bh, (double)var2 + this.bi, (double)var3 + this.bj, (double)var4 + this.bk);
   }

   public void a(cn var1, int var2, int var3, int var4, cf var5, ArrayList var6) {
      cf var7 = this.d(var1, var2, var3, var4);
      if (var7 != null && var5.a(var7)) {
         var6.add(var7);
      }

   }

   public cf d(cn var1, int var2, int var3, int var4) {
      return cf.b((double)var2 + this.bf, (double)var3 + this.bg, (double)var4 + this.bh, (double)var2 + this.bi, (double)var3 + this.bj, (double)var4 + this.bk);
   }

   public boolean b() {
      return true;
   }

   public boolean a(int var1, boolean var2) {
      return this.h();
   }

   public boolean h() {
      return true;
   }

   public void a(cn var1, int var2, int var3, int var4, Random var5) {
   }

   public void b(cn var1, int var2, int var3, int var4, Random var5) {
   }

   public void b(cn var1, int var2, int var3, int var4, int var5) {
   }

   public void a(cn var1, int var2, int var3, int var4, int var5) {
   }

   public int a() {
      return 10;
   }

   public void e(cn var1, int var2, int var3, int var4) {
   }

   public void b(cn var1, int var2, int var3, int var4) {
   }

   public int a(Random var1) {
      return 1;
   }

   public int a(int var1, Random var2) {
      return this.bc;
   }

   public float a(dm var1) {
      if (this.bd < 0.0F) {
         return 0.0F;
      } else {
         return !var1.b(this) ? 1.0F / this.bd / 100.0F : var1.a(this) / this.bd / 30.0F;
      }
   }

   public void b_(cn var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, 1.0F);
   }

   public void a(cn var1, int var2, int var3, int var4, int var5, float var6) {
      if (!var1.y) {
         int var7 = this.a(var1.n);

         for(int var8 = 0; var8 < var7; ++var8) {
            if (!(var1.n.nextFloat() > var6)) {
               int var9 = this.a(var5, var1.n);
               if (var9 > 0) {
                  float var10 = 0.7F;
                  double var11 = (double)(var1.n.nextFloat() * var10) + (double)(1.0F - var10) * (double)0.5F;
                  double var13 = (double)(var1.n.nextFloat() * var10) + (double)(1.0F - var10) * (double)0.5F;
                  double var15 = (double)(var1.n.nextFloat() * var10) + (double)(1.0F - var10) * (double)0.5F;
                  dx var17 = new dx(var1, (double)var2 + var11, (double)var3 + var13, (double)var4 + var15, new ev(var9));
                  var17.c = 10;
                  var1.a((kh)var17);
               }
            }
         }

      }
   }

   public float a(kh var1) {
      return this.be / 5.0F;
   }

   public mf a(cn var1, int var2, int var3, int var4, aj var5, aj var6) {
      this.a((nm)var1, var2, var3, var4);
      var5 = var5.c((double)(-var2), (double)(-var3), (double)(-var4));
      var6 = var6.c((double)(-var2), (double)(-var3), (double)(-var4));
      aj var7 = var5.a(var6, this.bf);
      aj var8 = var5.a(var6, this.bi);
      aj var9 = var5.b(var6, this.bg);
      aj var10 = var5.b(var6, this.bj);
      aj var11 = var5.c(var6, this.bh);
      aj var12 = var5.c(var6, this.bk);
      if (!this.a(var7)) {
         var7 = null;
      }

      if (!this.a(var8)) {
         var8 = null;
      }

      if (!this.b(var9)) {
         var9 = null;
      }

      if (!this.b(var10)) {
         var10 = null;
      }

      if (!this.c(var11)) {
         var11 = null;
      }

      if (!this.c(var12)) {
         var12 = null;
      }

      aj var13 = null;
      if (var7 != null && (var13 == null || var5.c(var7) < var5.c(var13))) {
         var13 = var7;
      }

      if (var8 != null && (var13 == null || var5.c(var8) < var5.c(var13))) {
         var13 = var8;
      }

      if (var9 != null && (var13 == null || var5.c(var9) < var5.c(var13))) {
         var13 = var9;
      }

      if (var10 != null && (var13 == null || var5.c(var10) < var5.c(var13))) {
         var13 = var10;
      }

      if (var11 != null && (var13 == null || var5.c(var11) < var5.c(var13))) {
         var13 = var11;
      }

      if (var12 != null && (var13 == null || var5.c(var12) < var5.c(var13))) {
         var13 = var12;
      }

      if (var13 == null) {
         return null;
      } else {
         byte var14 = -1;
         if (var13 == var7) {
            var14 = 4;
         }

         if (var13 == var8) {
            var14 = 5;
         }

         if (var13 == var9) {
            var14 = 0;
         }

         if (var13 == var10) {
            var14 = 1;
         }

         if (var13 == var11) {
            var14 = 2;
         }

         if (var13 == var12) {
            var14 = 3;
         }

         return new mf(var2, var3, var4, var14, var13.c((double)var2, (double)var3, (double)var4));
      }
   }

   private boolean a(aj var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.b >= this.bg && var1.b <= this.bj && var1.c >= this.bh && var1.c <= this.bk;
      }
   }

   private boolean b(aj var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.a >= this.bf && var1.a <= this.bi && var1.c >= this.bh && var1.c <= this.bk;
      }
   }

   private boolean c(aj var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.a >= this.bf && var1.a <= this.bi && var1.b >= this.bg && var1.b <= this.bj;
      }
   }

   public void c(cn var1, int var2, int var3, int var4) {
   }

   public int g() {
      return 0;
   }

   public boolean a(cn var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return var5 == 0 || n[var5].bn.d();
   }

   public boolean a(cn var1, int var2, int var3, int var4, dm var5) {
      return false;
   }

   public void a(cn var1, int var2, int var3, int var4, kh var5) {
   }

   public void d(cn var1, int var2, int var3, int var4, int var5) {
   }

   public void b(cn var1, int var2, int var3, int var4, dm var5) {
   }

   public void a(cn var1, int var2, int var3, int var4, kh var5, aj var6) {
   }

   public void a(nm var1, int var2, int var3, int var4) {
   }

   public int d(nm var1, int var2, int var3, int var4) {
      return 16777215;
   }

   public boolean b(nm var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public boolean d() {
      return false;
   }

   public void b(cn var1, int var2, int var3, int var4, kh var5) {
   }

   public boolean c(cn var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   public void e() {
   }

   public void a_(cn var1, int var2, int var3, int var4, int var5) {
      this.b_(var1, var2, var3, var4, var5);
   }

   public boolean g(cn var1, int var2, int var3, int var4) {
      return true;
   }

   static {
      u = (new ce(1, 1)).c(1.5F).b(10.0F).a(i);
      v = (my)(new my(2)).c(0.6F).a(h);
      w = (new hz(3, 2)).c(0.5F).a(g);
      x = (new ly(4, 16, gb.d)).c(2.0F).b(10.0F).a(i);
      y = (new ly(5, 4, gb.c)).c(2.0F).b(5.0F).a(f);
      z = (new dt(6, 15)).c(0.0F).a(h);
      A = (new ly(7, 17, gb.d)).c(-1.0F).b(6000000.0F).a(i);
      B = (new hv(8, gb.f)).c(100.0F).d(3);
      C = (new hn(9, gb.f)).c(100.0F).d(3);
      D = (new hv(10, gb.g)).c(0.0F).a(1.0F).d(255);
      E = (new hn(11, gb.g)).c(100.0F).a(1.0F).d(255);
      F = (new dh(12, 18)).c(0.5F).a(m);
      G = (new gz(13, 19)).c(0.6F).a(g);
      H = (new gw(14, 32)).c(3.0F).b(5.0F).a(i);
      I = (new gw(15, 33)).c(3.0F).b(5.0F).a(i);
      J = (new gw(16, 34)).c(3.0F).b(5.0F).a(i);
      K = (new mg(17)).c(2.0F).a(f);
      L = (iz)(new iz(18, 52)).c(0.2F).d(1).a(h);
      M = (new ng(19)).c(0.6F).a(h);
      N = (new ct(20, 49, gb.o, false)).c(0.3F).a(k);
      O = null;
      P = null;
      Q = null;
      R = null;
      S = null;
      T = null;
      U = null;
      V = null;
      W = null;
      X = null;
      Y = null;
      Z = null;
      aa = null;
      ab = null;
      ac = (new ly(35, 64, gb.k)).c(0.8F).a(l);
      ad = null;
      ae = (mq)(new mq(37, 13)).c(0.0F).a(h);
      af = (mq)(new mq(38, 12)).c(0.0F).a(h);
      ag = (mq)(new ky(39, 29)).c(0.0F).a(h).a(0.125F);
      ah = (mq)(new ky(40, 28)).c(0.0F).a(h);
      ai = (new c(41, 39)).c(3.0F).b(10.0F).a(j);
      aj = (new c(42, 38)).c(5.0F).b(10.0F).a(j);
      ak = (new oi(43, true)).c(2.0F).b(10.0F).a(i);
      al = (new oi(44, false)).c(2.0F).b(10.0F).a(i);
      am = (new ly(45, 7, gb.d)).c(2.0F).b(10.0F).a(i);
      an = (new q(46, 8)).c(0.0F).a(h);
      ao = (new ds(47, 35)).c(1.5F).a(f);
      ap = (new ly(48, 36, gb.d)).c(2.0F).b(10.0F).a(i);
      aq = (new cm(49, 37)).c(10.0F).b(2000.0F).a(i);
      ar = (new mj(50, 80)).c(0.0F).a(0.9375F).a(f);
      as = (og)(new og(51, 31)).c(0.0F).a(1.0F).a(f);
      at = (new bj(52, 65)).c(5.0F).a(j);
      au = new km(53, y);
      av = (new b(54)).c(2.5F).a(f);
      aw = (new kf(55, 84)).c(0.0F).a(e);
      ax = (new gw(56, 50)).c(3.0F).b(5.0F).a(i);
      ay = (new c(57, 40)).c(5.0F).b(10.0F).a(j);
      az = (new cs(58)).c(2.5F).a(f);
      aA = (new hd(59, 88)).c(0.0F).a(h);
      aB = (new mi(60)).c(0.6F).a(g);
      aC = (new ku(61, false)).c(3.5F).a(i);
      aD = (new ku(62, true)).c(3.5F).a(i).a(0.875F);
      aE = (new lr(63, ob.class, true)).c(1.0F).a(f);
      aF = (new fw(64, gb.c)).c(3.0F).a(f);
      aG = (new br(65, 83)).c(0.4F).a(f);
      aH = (new if(66, 128)).c(0.7F).a(j);
      aI = new km(67, x);
      aJ = (new lr(68, ob.class, false)).c(1.0F).a(f);
      aK = (new no(69, 96)).c(0.5F).a(f);
      aL = (new al(70, u.bb, js.b)).c(0.5F).a(i);
      aM = (new fw(71, gb.e)).c(5.0F).a(j);
      aN = (new al(72, y.bb, js.a)).c(0.5F).a(f);
      aO = (new ai(73, 51, false)).c(3.0F).b(5.0F).a(i);
      aP = (new ai(74, 51, true)).a(0.625F).c(3.0F).b(5.0F).a(i);
      aQ = (new bg(75, 115, false)).c(0.0F).a(f);
      aR = (new bg(76, 99, true)).c(0.0F).a(0.5F).a(f);
      aS = (new hu(77, u.bb)).c(0.5F).a(i);
      aT = (new fd(78, 66)).c(0.1F).a(l);
      aU = (new he(79, 67)).c(0.5F).d(3).a(k);
      aV = (new p(80, 66)).c(0.2F).a(l);
      aW = (new hy(81, 70)).c(0.4F).a(l);
      aX = (new jv(82, 72)).c(0.6F).a(g);
      aY = (new jm(83, 73)).c(0.0F).a(h);
      aZ = (new cv(84, 74)).c(2.0F).b(10.0F).a(i);
      ba = (new fh(85, 4)).c(2.0F).b(5.0F).a(f);

      for(int var0 = 0; var0 < 256; ++var0) {
         if (n[var0] != null) {
            di.c[var0] = new av(var0 - 256);
         }
      }

   }
}
