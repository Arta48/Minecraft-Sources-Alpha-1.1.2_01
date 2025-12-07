public class ba extends nq {
   public ba(cn var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.i = 1.0F;
      this.j = 1.0F;
      this.k = 1.0F;
      this.b = 32;
      this.a(0.02F, 0.02F);
      this.g *= this.aQ.nextFloat() * 0.6F + 0.2F;
      this.an = var8 * (double)0.2F + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.02F);
      this.ao = var10 * (double)0.2F + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.02F);
      this.ap = var12 * (double)0.2F + (double)((float)(Math.random() * (double)2.0F - (double)1.0F) * 0.02F);
      this.f = (int)((double)8.0F / (Math.random() * 0.8 + 0.2));
   }

   public void e_() {
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      this.ao += 0.002;
      this.c(this.an, this.ao, this.ap);
      this.an *= (double)0.85F;
      this.ao *= (double)0.85F;
      this.ap *= (double)0.85F;
      if (this.ag.f(eo.b(this.ak), eo.b(this.al), eo.b(this.am)) != gb.f) {
         this.F();
      }

      if (this.f-- <= 0) {
         this.F();
      }

   }
}
