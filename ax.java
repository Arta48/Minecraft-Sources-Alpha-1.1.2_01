public class ax extends dq {
   public ax(cn var1) {
      super(var1);
      this.u = "/mob/spider.png";
      this.a(1.4F, 0.9F);
      this.aa = 0.8F;
   }

   public double h() {
      return (double)this.aD * (double)0.75F - (double)0.5F;
   }

   protected kh i() {
      float var1 = this.a(1.0F);
      if (var1 < 0.5F) {
         double var2 = (double)16.0F;
         return this.ag.a(this, var2);
      } else {
         return null;
      }
   }

   protected String c() {
      return "mob.spider";
   }

   protected String d() {
      return "mob.spider";
   }

   protected String e() {
      return "mob.spiderdeath";
   }

   protected void a(kh var1, float var2) {
      float var3 = this.a(1.0F);
      if (var3 > 0.5F && this.aQ.nextInt(100) == 0) {
         this.f = null;
      } else {
         if (var2 > 2.0F && var2 < 6.0F && this.aQ.nextInt(10) == 0) {
            if (this.av) {
               double var4 = var1.ak - this.ak;
               double var6 = var1.am - this.am;
               float var8 = eo.a(var4 * var4 + var6 * var6);
               this.an = var4 / (double)var8 * (double)0.5F * (double)0.8F + this.an * (double)0.2F;
               this.ap = var6 / (double)var8 * (double)0.5F * (double)0.8F + this.ap * (double)0.2F;
               this.ao = (double)0.4F;
            }
         } else {
            super.a(var1, var2);
         }

      }
   }

   public void a(hm var1) {
      super.a(var1);
   }

   public void b(hm var1) {
      super.b(var1);
   }

   protected int g() {
      return di.I.aS;
   }
}
