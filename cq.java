public class cq extends nq {
   private float a;

   public cq(cn var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, (double)0.0F, (double)0.0F, (double)0.0F);
      this.an *= (double)0.8F;
      this.ao *= (double)0.8F;
      this.ap *= (double)0.8F;
      this.ao = (double)(this.aQ.nextFloat() * 0.4F + 0.05F);
      this.i = this.j = this.k = 1.0F;
      this.g *= this.aQ.nextFloat() * 2.0F + 0.2F;
      this.a = this.g;
      this.f = (int)((double)16.0F / (Math.random() * 0.8 + 0.2));
      this.aN = false;
      this.b = 49;
   }

   public float a(float var1) {
      return 1.0F;
   }

   public void a(ho var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.e + var2) / (float)this.f;
      this.g = this.a * (1.0F - var8 * var8);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void e_() {
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      if (this.e++ >= this.f) {
         this.F();
      }

      float var1 = (float)this.e / (float)this.f;
      if (this.aQ.nextFloat() > var1) {
         this.ag.a("smoke", this.ak, this.al, this.am, this.an, this.ao, this.ap);
      }

      this.ao -= 0.03;
      this.c(this.an, this.ao, this.ap);
      this.an *= (double)0.999F;
      this.ao *= (double)0.999F;
      this.ap *= (double)0.999F;
      if (this.av) {
         this.an *= (double)0.7F;
         this.ap *= (double)0.7F;
      }

   }
}
