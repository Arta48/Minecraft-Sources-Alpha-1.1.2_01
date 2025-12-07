import java.util.Random;

public class di {
   protected static Random b = new Random();
   public static di[] c = new di[32000];
   public static di d = (new ms(0, 2)).a(82);
   public static di e = (new y(1, 2)).a(98);
   public static di f = (new ks(2, 2)).a(114);
   public static di g = (new nx(3)).a(5);
   public static di h = (new oj(4, 4)).a(10);
   public static di i = (new jg(5)).a(21);
   public static di j = (new di(6)).a(37);
   public static di k = (new di(7)).a(7);
   public static di l = (new di(8)).a(55);
   public static di m = (new di(9)).a(23);
   public static di n = (new di(10)).a(39);
   public static di o = (new iu(11, 2)).a(66);
   public static di p = (new iu(12, 0)).a(64);
   public static di q = (new ms(13, 0)).a(80);
   public static di r = (new y(14, 0)).a(96);
   public static di s = (new ks(15, 0)).a(112);
   public static di t = (new iu(16, 1)).a(65);
   public static di u = (new ms(17, 1)).a(81);
   public static di v = (new y(18, 1)).a(97);
   public static di w = (new ks(19, 1)).a(113);
   public static di x = (new iu(20, 3)).a(67);
   public static di y = (new ms(21, 3)).a(83);
   public static di z = (new y(22, 3)).a(99);
   public static di A = (new ks(23, 3)).a(115);
   public static di B = (new di(24)).a(53).d();
   public static di C = (new di(25)).a(71);
   public static di D = (new ap(26, 10)).a(72);
   public static di E = (new iu(27, 0)).a(68);
   public static di F = (new ms(28, 0)).a(84);
   public static di G = (new y(29, 0)).a(100);
   public static di H = (new ks(30, 0)).a(116);
   public static di I = (new di(31)).a(8);
   public static di J = (new di(32)).a(24);
   public static di K = (new di(33)).a(40);
   public static di L = (new fu(34, 0)).a(128);
   public static di M = (new fu(35, 1)).a(129);
   public static di N = (new fu(36, 2)).a(130);
   public static di O = (new fu(37, 3)).a(131);
   public static di P = (new fu(38, 1)).a(132);
   public static di Q;
   public static di R;
   public static di S;
   public static di T;
   public static di U;
   public static di V;
   public static di W;
   public static di X;
   public static di Y;
   public static di Z;
   public static di aa;
   public static di ab;
   public static di ac;
   public static di ad;
   public static di ae;
   public static di af;
   public static di ag;
   public static di ah;
   public static di ai;
   public static di aj;
   public static di ak;
   public static di al;
   public static di am;
   public static di an;
   public static di ao;
   public static di ap;
   public static di aq;
   public static di ar;
   public static di as;
   public static di at;
   public static di au;
   public static di av;
   public static di aw;
   public static di ax;
   public static di ay;
   public static di az;
   public static di aA;
   public static di aB;
   public static di aC;
   public static di aD;
   public static di aE;
   public static di aF;
   public static di aG;
   public static di aH;
   public static di aI;
   public static di aJ;
   public static di aK;
   public static di aL;
   public static di aM;
   public static di aN;
   public static di aO;
   public static di aP;
   public static di aQ;
   public static di aR;
   public final int aS;
   protected int aT = 64;
   protected int aU = 32;
   protected int aV;
   protected boolean aW = false;

   protected di(int var1) {
      this.aS = 256 + var1;
      if (c[256 + var1] != null) {
         System.out.println("CONFLICT @ " + var1);
      }

      c[256 + var1] = this;
   }

   public di a(int var1) {
      this.aV = var1;
      return this;
   }

   public int a(ev var1) {
      return this.aV;
   }

   public boolean a(ev var1, dm var2, cn var3, int var4, int var5, int var6, int var7) {
      return false;
   }

   public float a(ev var1, ly var2) {
      return 1.0F;
   }

   public ev a(ev var1, cn var2, dm var3) {
      return var1;
   }

   public int b() {
      return this.aT;
   }

   public int c() {
      return this.aU;
   }

   public void a(ev var1, ge var2) {
   }

   public void a(ev var1, int var2, int var3, int var4, int var5) {
   }

   public int a(kh var1) {
      return 1;
   }

   public boolean a(ly var1) {
      return false;
   }

   public void b(ev var1, ge var2) {
   }

   public di d() {
      this.aW = true;
      return this;
   }

   public boolean a() {
      return this.aW;
   }

   static {
      Q = (new jn(39, ly.aA.bc)).a(9);
      R = (new di(40)).a(25);
      S = (new oj(41, 5)).a(41);
      T = (new mr(42, 0, 0, 0)).a(0);
      U = (new mr(43, 0, 0, 1)).a(16);
      V = (new mr(44, 0, 0, 2)).a(32);
      W = (new mr(45, 0, 0, 3)).a(48);
      X = (new mr(46, 1, 1, 0)).a(1);
      Y = (new mr(47, 1, 1, 1)).a(17);
      Z = (new mr(48, 1, 1, 2)).a(33);
      aa = (new mr(49, 1, 1, 3)).a(49);
      ab = (new mr(50, 2, 2, 0)).a(2);
      ac = (new mr(51, 2, 2, 1)).a(18);
      ad = (new mr(52, 2, 2, 2)).a(34);
      ae = (new mr(53, 2, 2, 3)).a(50);
      af = (new mr(54, 3, 3, 0)).a(3);
      ag = (new mr(55, 3, 3, 1)).a(19);
      ah = (new mr(56, 3, 3, 2)).a(35);
      ai = (new mr(57, 3, 3, 3)).a(51);
      aj = (new mr(58, 1, 4, 0)).a(4);
      ak = (new mr(59, 1, 4, 1)).a(20);
      al = (new mr(60, 1, 4, 2)).a(36);
      am = (new mr(61, 1, 4, 3)).a(52);
      an = (new di(62)).a(6);
      ao = (new oj(63, 3)).a(87);
      ap = (new oj(64, 8)).a(88);
      aq = (new od(65)).a(26);
      ar = (new oj(66, 42)).a(11);
      as = (new md(67)).a(42);
      at = (new ec(68, gb.c)).a(43);
      au = (new ac(69, 0)).a(74);
      av = (new ac(70, ly.B.bc)).a(75);
      aw = (new ac(71, ly.D.bc)).a(76);
      ax = (new jo(72, 0)).a(135);
      ay = (new jw(73)).a(104);
      az = (new ec(74, gb.e)).a(44);
      aA = (new ef(75)).a(56);
      aB = (new bp(76)).a(14);
      aC = (new me(77)).a(136);
      aD = (new di(78)).a(103);
      aE = (new ac(79, -1)).a(77);
      aF = (new di(80)).a(22);
      aG = (new di(81)).a(57);
      aH = (new gf(82, ly.aY)).a(27);
      aI = (new di(83)).a(58);
      aJ = (new di(84)).a(59);
      aK = (new di(85)).a(30);
      aL = (new jo(86, 1)).a(151);
      aM = (new jo(87, 2)).a(167);
      aN = (new di(88)).a(12);
      aO = (new di(89)).a(54);
      aP = (new di(90)).a(69);
      aQ = (new lg(2000, "13")).a(240);
      aR = (new lg(2001, "cat")).a(241);
   }
}
