public class nl extends nq {
   float a;

   public nl(cn var1, double var2, double var4, double var6) {
      this(var1, var2, var4, var6, 1.0F);
   }

   public nl(cn var1, double var2, double var4, double var6, float var8) {
      super(var1, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
      this.an *= (double)0.1F;
      this.ao *= (double)0.1F;
      this.ap *= (double)0.1F;
      this.i = this.j = this.k = (float)(Math.random() * (double)0.3F);
      this.g *= 0.75F;
      this.g *= var8;
      this.a = this.g;
      this.f = (int)((double)8.0F / (Math.random() * 0.8 + 0.2));
      this.f = (int)((float)this.f * var8);
      this.aN = false;
   }

   public void a(ho var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.e + var2) / (float)this.f * 32.0F;
      if (var8 < 0.0F) {
         var8 = 0.0F;
      }

      if (var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.g = this.a * var8;
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void e_() {
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      if (this.e++ >= this.f) {
         this.F();
      }

      this.b = 7 - this.e * 8 / this.f;
      this.ao += 0.004;
      this.c(this.an, this.ao, this.ap);
      if (this.al == this.ai) {
         this.an *= 1.1;
         this.ap *= 1.1;
      }

      this.an *= (double)0.96F;
      this.ao *= (double)0.96F;
      this.ap *= (double)0.96F;
      if (this.av) {
         this.an *= (double)0.7F;
         this.ap *= (double)0.7F;
      }

   }
}
