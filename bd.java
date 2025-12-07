public class bd extends ic {
   public int a = -1;
   public String b = "Pig";
   public double c;
   public double d = (double)0.0F;

   public bd() {
      this.a = 20;
   }

   public boolean a() {
      return this.e.a((double)this.f + (double)0.5F, (double)this.g + (double)0.5F, (double)this.h + (double)0.5F, (double)16.0F) != null;
   }

   public void b() {
      this.d = this.c;
      if (this.a()) {
         double var1 = (double)((float)this.f + this.e.n.nextFloat());
         double var3 = (double)((float)this.g + this.e.n.nextFloat());
         double var5 = (double)((float)this.h + this.e.n.nextFloat());
         this.e.a("smoke", var1, var3, var5, (double)0.0F, (double)0.0F, (double)0.0F);
         this.e.a("flame", var1, var3, var5, (double)0.0F, (double)0.0F, (double)0.0F);

         for(this.c += (double)(1000.0F / ((float)this.a + 200.0F)); this.c > (double)360.0F; this.d -= (double)360.0F) {
            this.c -= (double)360.0F;
         }

         if (this.a == -1) {
            this.c();
         }

         if (this.a > 0) {
            --this.a;
         } else {
            byte var7 = 4;

            for(int var8 = 0; var8 < var7; ++var8) {
               ge var9 = (ge)ew.a(this.b, this.e);
               if (var9 == null) {
                  return;
               }

               int var10 = this.e.a(var9.getClass(), cf.b((double)this.f, (double)this.g, (double)this.h, (double)(this.f + 1), (double)(this.g + 1), (double)(this.h + 1)).b((double)8.0F, (double)4.0F, (double)8.0F)).size();
               if (var10 >= 6) {
                  this.c();
                  return;
               }

               if (var9 != null) {
                  double var11 = (double)this.f + (this.e.n.nextDouble() - this.e.n.nextDouble()) * (double)4.0F;
                  double var13 = (double)(this.g + this.e.n.nextInt(3) - 1);
                  double var15 = (double)this.h + (this.e.n.nextDouble() - this.e.n.nextDouble()) * (double)4.0F;
                  var9.c(var11, var13, var15, this.e.n.nextFloat() * 360.0F, 0.0F);
                  if (var9.a()) {
                     this.e.a((kh)var9);

                     for(int var17 = 0; var17 < 20; ++var17) {
                        var1 = (double)this.f + (double)0.5F + ((double)this.e.n.nextFloat() - (double)0.5F) * (double)2.0F;
                        var3 = (double)this.g + (double)0.5F + ((double)this.e.n.nextFloat() - (double)0.5F) * (double)2.0F;
                        var5 = (double)this.h + (double)0.5F + ((double)this.e.n.nextFloat() - (double)0.5F) * (double)2.0F;
                        this.e.a("smoke", var1, var3, var5, (double)0.0F, (double)0.0F, (double)0.0F);
                        this.e.a("flame", var1, var3, var5, (double)0.0F, (double)0.0F, (double)0.0F);
                     }

                     var9.z();
                     this.c();
                  }
               }
            }

            super.b();
         }
      }
   }

   private void c() {
      this.a = 200 + this.e.n.nextInt(600);
   }

   public void a(hm var1) {
      super.a(var1);
      this.b = var1.i("EntityId");
      this.a = var1.d("Delay");
   }

   public void b(hm var1) {
      super.b(var1);
      var1.a("EntityId", this.b);
      var1.a("Delay", (short)this.a);
   }
}
