public class dp extends nq {
   public dp(cn var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.an = var8 + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.05F);
      this.ao = var10 + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.05F);
      this.ap = var12 + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.05F);
      this.i = this.j = this.k = this.aQ.nextFloat() * 0.3F + 0.7F;
      this.g = this.aQ.nextFloat() * this.aQ.nextFloat() * 6.0F + 1.0F;
      this.f = (int)((double)16.0F / ((double)this.aQ.nextFloat() * 0.8 + 0.2)) + 2;
   }

   public void a(ho var1, float var2, float var3, float var4, float var5, float var6, float var7) {
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
      this.an *= (double)0.9F;
      this.ao *= (double)0.9F;
      this.ap *= (double)0.9F;
      if (this.av) {
         this.an *= (double)0.7F;
         this.ap *= (double)0.7F;
      }

   }
}
