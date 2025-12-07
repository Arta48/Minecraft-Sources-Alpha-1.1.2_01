class kc {
   public double a;
   public double b;
   public double c;
   // $FF: synthetic field
   final cx d;

   public kc(cx var1, int var2, int var3) {
      this.d = var1;
      this.a = this.b = (double)(10 + var3) + cx.j().nextDouble() * (double)32.0F + (double)var2;
   }

   public void a() {
      this.b = this.a;
      if (this.a > (double)0.0F) {
         this.c -= 0.6;
      }

      this.a += this.c;
      this.c *= 0.9;
      if (this.a < (double)0.0F) {
         this.a = (double)0.0F;
         this.c = (double)0.0F;
      }

   }
}
