import java.util.ArrayList;
import java.util.List;

public class jc extends kh {
   private int c;
   public int a;
   private int d;
   private int e;
   private int f;
   public er b;

   public jc(cn var1) {
      super(var1);
      this.c = 0;
      this.a = 0;
      this.aB = 0.0F;
      this.a(0.5F, 0.5F);
   }

   public jc(cn var1, int var2, int var3, int var4, int var5) {
      this(var1);
      this.d = var2;
      this.e = var3;
      this.f = var4;
      ArrayList var6 = new ArrayList();

      for(er var10 : er.values()) {
         this.b = var10;
         this.b(var5);
         if (this.i()) {
            var6.add(var10);
         }
      }

      if (var6.size() > 0) {
         this.b = (er)var6.get(this.aQ.nextInt(var6.size()));
      }

      this.b(var5);
   }

   public void b(int var1) {
      this.a = var1;
      this.as = this.aq = (float)(var1 * 90);
      float var2 = (float)this.b.z;
      float var3 = (float)this.b.A;
      float var4 = (float)this.b.z;
      if (var1 != 0 && var1 != 2) {
         var2 = 0.5F;
      } else {
         var4 = 0.5F;
      }

      var2 /= 32.0F;
      var3 /= 32.0F;
      var4 /= 32.0F;
      float var5 = (float)this.d + 0.5F;
      float var6 = (float)this.e + 0.5F;
      float var7 = (float)this.f + 0.5F;
      float var8 = 0.5625F;
      if (var1 == 0) {
         var7 -= var8;
      }

      if (var1 == 1) {
         var5 -= var8;
      }

      if (var1 == 2) {
         var7 += var8;
      }

      if (var1 == 3) {
         var5 += var8;
      }

      if (var1 == 0) {
         var5 -= this.c(this.b.z);
      }

      if (var1 == 1) {
         var7 += this.c(this.b.z);
      }

      if (var1 == 2) {
         var5 += this.c(this.b.z);
      }

      if (var1 == 3) {
         var7 -= this.c(this.b.z);
      }

      var6 += this.c(this.b.A);
      this.a((double)var5, (double)var6, (double)var7);
      float var9 = -0.00625F;
      this.au.c((double)(var5 - var2 - var9), (double)(var6 - var3 - var9), (double)(var7 - var4 - var9), (double)(var5 + var2 + var9), (double)(var6 + var3 + var9), (double)(var7 + var4 + var9));
   }

   private float c(int var1) {
      if (var1 == 32) {
         return 0.5F;
      } else {
         return var1 == 64 ? 0.5F : 0.0F;
      }
   }

   public void e_() {
      if (this.c++ == 100 && !this.i()) {
         this.c = 0;
         this.F();
         this.ag.a((kh)(new dx(this.ag, this.ak, this.al, this.am, new ev(di.aq))));
      }

   }

   public boolean i() {
      if (this.ag.a((kh)this, (cf)this.au).size() > 0) {
         return false;
      } else {
         int var1 = this.b.z / 16;
         int var2 = this.b.A / 16;
         int var3 = this.d;
         int var4 = this.e;
         int var5 = this.f;
         if (this.a == 0) {
            var3 = eo.b(this.ak - (double)((float)this.b.z / 32.0F));
         }

         if (this.a == 1) {
            var5 = eo.b(this.am - (double)((float)this.b.z / 32.0F));
         }

         if (this.a == 2) {
            var3 = eo.b(this.ak - (double)((float)this.b.z / 32.0F));
         }

         if (this.a == 3) {
            var5 = eo.b(this.am - (double)((float)this.b.z / 32.0F));
         }

         var4 = eo.b(this.al - (double)((float)this.b.A / 32.0F));

         for(int var6 = 0; var6 < var1; ++var6) {
            for(int var7 = 0; var7 < var2; ++var7) {
               gb var8;
               if (this.a != 0 && this.a != 2) {
                  var8 = this.ag.f(this.d, var4 + var7, var5 + var6);
               } else {
                  var8 = this.ag.f(var3 + var6, var4 + var7, this.f);
               }

               if (!var8.a()) {
                  return false;
               }
            }
         }

         List var10 = this.ag.b((kh)this, (cf)this.au);

         for(int var11 = 0; var11 < var10.size(); ++var11) {
            if (var10.get(var11) instanceof jc) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean c_() {
      return true;
   }

   public boolean a(kh var1, int var2) {
      this.F();
      this.ag.a((kh)(new dx(this.ag, this.ak, this.al, this.am, new ev(di.aq))));
      return true;
   }

   public void a(hm var1) {
      var1.a("Dir", (byte)this.a);
      var1.a("Motive", this.b.y);
      var1.a("TileX", this.d);
      var1.a("TileY", this.e);
      var1.a("TileZ", this.f);
   }

   public void b(hm var1) {
      this.a = var1.c("Dir");
      this.d = var1.e("TileX");
      this.e = var1.e("TileY");
      this.f = var1.e("TileZ");
      String var2 = var1.i("Motive");

      for(er var6 : er.values()) {
         if (var6.y.equals(var2)) {
            this.b = var6;
         }
      }

      if (this.b == null) {
         this.b = er.a;
      }

      this.b(this.a);
   }
}
