public class jd extends kh {
   public int a;

   public jd(cn var1) {
      super(var1);
      this.a = 0;
      this.ad = true;
      this.a(0.98F, 0.98F);
      this.aB = this.aD / 2.0F;
   }

   public jd(cn var1, float var2, float var3, float var4) {
      this(var1);
      this.a((double)var2, (double)var3, (double)var4);
      float var5 = (float)(Math.random() * (double)(float)Math.PI * (double)2.0F);
      this.an = (double)(-eo.a(var5 * (float)Math.PI / 180.0F) * 0.02F);
      this.ao = (double)0.2F;
      this.ap = (double)(-eo.b(var5 * (float)Math.PI / 180.0F) * 0.02F);
      this.aG = false;
      this.a = 80;
      this.ah = (double)var2;
      this.ai = (double)var3;
      this.aj = (double)var4;
   }

   public boolean c_() {
      return !this.aA;
   }

   public void e_() {
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      this.ao -= (double)0.04F;
      this.c(this.an, this.ao, this.ap);
      this.an *= (double)0.98F;
      this.ao *= (double)0.98F;
      this.ap *= (double)0.98F;
      if (this.av) {
         this.an *= (double)0.7F;
         this.ap *= (double)0.7F;
         this.ao *= (double)-0.5F;
      }

      if (this.a-- <= 0) {
         this.F();
         this.i();
      } else {
         this.ag.a("smoke", this.ak, this.al + (double)0.5F, this.am, (double)0.0F, (double)0.0F, (double)0.0F);
      }

   }

   private void i() {
      float var1 = 4.0F;
      this.ag.a((kh)null, this.ak, this.al, this.am, var1);
   }

   protected void a(hm var1) {
      var1.a("Fuse", (byte)this.a);
   }

   protected void b(hm var1) {
      this.a = var1.c("Fuse");
   }

   public float h_() {
      return 0.0F;
   }
}
