import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class dw {
   private static final dw a = new dw();
   private List b = new ArrayList();

   public static final dw a() {
      return a;
   }

   private dw() {
      (new dr()).a(this);
      (new nd()).a(this);
      (new lf()).a(this);
      (new hr()).a(this);
      (new fj()).a(this);
      (new l()).a(this);
      this.a(new ev(di.aI, 3), "###", '#', di.aH);
      this.a(new ev(di.aJ, 1), "#", "#", "#", '#', di.aI);
      this.a(new ev(ly.ba, 2), "###", "###", '#', di.B);
      this.a(new ev(ly.aZ, 1), "###", "#X#", "###", '#', ly.y, 'X', di.l);
      this.a(new ev(ly.ao, 1), "###", "XXX", "###", '#', ly.y, 'X', di.aJ);
      this.a(new ev(ly.aV, 1), "##", "##", '#', di.aB);
      this.a(new ev(ly.aX, 1), "##", "##", '#', di.aG);
      this.a(new ev(ly.am, 1), "##", "##", '#', di.aF);
      this.a(new ev(ly.ac, 1), "###", "###", "###", '#', di.I);
      this.a(new ev(ly.an, 1), "X#X", "#X#", "X#X", 'X', di.K, '#', ly.F);
      this.a(new ev(ly.al, 3), "###", '#', ly.x);
      this.a(new ev(ly.aG, 1), "# #", "###", "# #", '#', di.B);
      this.a(new ev(di.at, 1), "##", "##", "##", '#', ly.y);
      this.a(new ev(di.az, 1), "##", "##", "##", '#', di.m);
      this.a(new ev(di.as, 1), "###", "###", " X ", '#', ly.y, 'X', di.B);
      this.a(new ev(ly.y, 4), "#", '#', ly.K);
      this.a(new ev(di.B, 4), "#", "#", '#', ly.y);
      this.a(new ev(ly.ar, 4), "X", "#", 'X', di.k, '#', di.B);
      this.a(new ev(di.C, 4), "# #", " # ", '#', ly.y);
      this.a(new ev(ly.aH, 16), "X X", "X#X", "X X", 'X', di.m, '#', di.B);
      this.a(new ev(di.ax, 1), "# #", "###", '#', di.m);
      this.a(new ev(di.aL, 1), "A", "B", 'A', ly.av, 'B', di.ax);
      this.a(new ev(di.aM, 1), "A", "B", 'A', ly.aC, 'B', di.ax);
      this.a(new ev(di.aC, 1), "# #", "###", '#', ly.y);
      this.a(new ev(di.au, 1), "# #", " # ", '#', di.m);
      this.a(new ev(di.g, 1), "A ", " B", 'A', di.m, 'B', di.an);
      this.a(new ev(di.S, 1), "###", '#', di.R);
      this.a(new ev(ly.au, 4), "#  ", "## ", "###", '#', ly.y);
      this.a(new ev(di.aP, 1), "  #", " #X", "# X", '#', di.B, 'X', di.I);
      this.a(new ev(ly.aI, 4), "#  ", "## ", "###", '#', ly.x);
      this.a(new ev(di.aq, 1), "###", "#X#", "###", '#', di.B, 'X', ly.ac);
      this.a(new ev(di.ar, 1), "###", "#X#", "###", '#', ly.ai, 'X', di.h);
      this.a(new ev(ly.aK, 1), "X", "#", '#', ly.x, 'X', di.B);
      this.a(new ev(ly.aR, 1), "X", "#", '#', di.B, 'X', di.aA);
      this.a(new ev(di.aO, 1), " # ", "#X#", " # ", '#', di.m, 'X', di.aA);
      this.a(new ev(ly.aS, 1), "#", "#", '#', ly.u);
      this.a(new ev(ly.aL, 1), "###", '#', ly.u);
      this.a(new ev(ly.aN, 1), "###", '#', ly.y);
      Collections.sort(this.b, new fs(this));
      System.out.println(this.b.size() + " recipes");
   }

   void a(ev var1, Object... var2) {
      String var3 = "";
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      if (var2[var4] instanceof String[]) {
         String[] var11 = (String[])var2[var4++];

         for(int var8 = 0; var8 < var11.length; ++var8) {
            String var9 = var11[var8];
            ++var6;
            var5 = var9.length();
            var3 = var3 + var9;
         }
      } else {
         while(var2[var4] instanceof String) {
            String var7 = (String)var2[var4++];
            ++var6;
            var5 = var7.length();
            var3 = var3 + var7;
         }
      }

      HashMap var12;
      for(var12 = new HashMap(); var4 < var2.length; var4 += 2) {
         Character var13 = (Character)var2[var4];
         int var15 = 0;
         if (var2[var4 + 1] instanceof di) {
            var15 = ((di)var2[var4 + 1]).aS;
         } else if (var2[var4 + 1] instanceof ly) {
            var15 = ((ly)var2[var4 + 1]).bc;
         }

         var12.put(var13, var15);
      }

      int[] var14 = new int[var5 * var6];

      for(int var16 = 0; var16 < var5 * var6; ++var16) {
         char var10 = var3.charAt(var16);
         if (var12.containsKey(var10)) {
            var14[var16] = (Integer)var12.get(var10);
         } else {
            var14[var16] = -1;
         }
      }

      this.b.add(new bv(var5, var6, var14, var1));
   }

   public ev a(int[] var1) {
      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         bv var3 = (bv)this.b.get(var2);
         if (var3.a(var1)) {
            return var3.b(var1);
         }
      }

      return null;
   }
}
