public class ir {
   public float a;
   private double f;
   public int b;
   public float c;
   public float d = 1.0F;
   public float e = 0.0F;
   private long g;
   private long h;
   private double i = (double)1.0F;

   public ir(float var1) {
      this.a = var1;
      this.g = System.currentTimeMillis();
      this.h = System.nanoTime() / 1000000L;
   }

   public void a() {
      long var1 = System.currentTimeMillis();
      long var3 = var1 - this.g;
      long var5 = System.nanoTime() / 1000000L;
      if (var3 > 1000L) {
         long var7 = var5 - this.h;
         double var9 = (double)var3 / (double)var7;
         this.i += (var9 - this.i) * (double)0.2F;
         this.g = var1;
         this.h = var5;
      }

      if (var3 < 0L) {
         this.g = var1;
         this.h = var5;
      }

      double var11 = (double)var5 / (double)1000.0F;
      double var12 = (var11 - this.f) * this.i;
      this.f = var11;
      if (var12 < (double)0.0F) {
         var12 = (double)0.0F;
      }

      if (var12 > (double)1.0F) {
         var12 = (double)1.0F;
      }

      this.e = (float)((double)this.e + var12 * (double)this.d * (double)this.a);
      this.b = (int)this.e;
      this.e -= (float)this.b;
      if (this.b > 10) {
         this.b = 10;
      }

      this.c = this.e;
   }
}
