public class cb extends cr {
   public void a(float var1, float var2, float var3, float var4, float var5, float var6) {
      super.a(var1, var2, var3, var4, var5, var6);
      float var7 = eo.a(this.k * (float)Math.PI);
      float var8 = eo.a((1.0F - (1.0F - this.k) * (1.0F - this.k)) * (float)Math.PI);
      this.d.f = 0.0F;
      this.e.f = 0.0F;
      this.d.e = -(0.1F - var7 * 0.6F);
      this.e.e = 0.1F - var7 * 0.6F;
      this.d.d = (-(float)Math.PI / 2F);
      this.e.d = (-(float)Math.PI / 2F);
      ip var10000 = this.d;
      var10000.d -= var7 * 1.2F - var8 * 0.4F;
      var10000 = this.e;
      var10000.d -= var7 * 1.2F - var8 * 0.4F;
      var10000 = this.d;
      var10000.f += eo.b(var3 * 0.09F) * 0.05F + 0.05F;
      var10000 = this.e;
      var10000.f -= eo.b(var3 * 0.09F) * 0.05F + 0.05F;
      var10000 = this.d;
      var10000.d += eo.a(var3 * 0.067F) * 0.05F;
      var10000 = this.e;
      var10000.d -= eo.a(var3 * 0.067F) * 0.05F;
   }
}
