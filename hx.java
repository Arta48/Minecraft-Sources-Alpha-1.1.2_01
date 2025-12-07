import org.lwjgl.opengl.GL11;

public class hx extends ee {
   public et j = new et();

   public hx(eu var1) {
      this.i.add(new an(this, this.j.a, this.j.b, 0, 124, 35));

      for(int var2 = 0; var2 < 3; ++var2) {
         for(int var3 = 0; var3 < 3; ++var3) {
            this.i.add(new mm(this, this.j.a, var3 + var2 * 3, 30 + var3 * 18, 17 + var2 * 18));
         }
      }

      for(int var4 = 0; var4 < 3; ++var4) {
         for(int var6 = 0; var6 < 9; ++var6) {
            this.i.add(new mm(this, var1, var6 + (var4 + 1) * 9, 8 + var6 * 18, 84 + var4 * 18));
         }
      }

      for(int var5 = 0; var5 < 9; ++var5) {
         this.i.add(new mm(this, var1, var5, 8 + var5 * 18, 142));
      }

   }

   public void h() {
      super.h();
      this.j.a((dm)this.b.g);
   }

   protected void j() {
      this.g.b("Crafting", 28, 6, 4210752);
      this.g.b("Inventory", 8, this.h - 96 + 2, 4210752);
   }

   protected void a(float var1) {
      int var2 = this.b.n.a("/gui/crafting.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.b.n.b(var2);
      int var3 = (this.c - this.a) / 2;
      int var4 = (this.d - this.h) / 2;
      this.b(var3, var4, 0, 0, this.a, this.h);
   }
}
