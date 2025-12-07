import org.lwjgl.opengl.GL11;

public class id extends ee {
   private ke j;

   public id(eu var1, ke var2) {
      this.j = var2;
      this.i.add(new mm(this, var2, 0, 56, 17));
      this.i.add(new mm(this, var2, 1, 56, 53));
      this.i.add(new mm(this, var2, 2, 116, 35));

      for(int var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 9; ++var4) {
            this.i.add(new mm(this, var1, var4 + (var3 + 1) * 9, 8 + var4 * 18, 84 + var3 * 18));
         }
      }

      for(int var5 = 0; var5 < 9; ++var5) {
         this.i.add(new mm(this, var1, var5, 8 + var5 * 18, 142));
      }

   }

   protected void j() {
      this.g.b("Furnace", 60, 6, 4210752);
      this.g.b("Inventory", 8, this.h - 96 + 2, 4210752);
   }

   protected void a(float var1) {
      int var2 = this.b.n.a("/gui/furnace.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.b.n.b(var2);
      int var3 = (this.c - this.a) / 2;
      int var4 = (this.d - this.h) / 2;
      this.b(var3, var4, 0, 0, this.a, this.h);
      if (this.j.a()) {
         int var5 = this.j.b(12);
         this.b(var3 + 56, var4 + 36 + 12 - var5, 176, 12 - var5, 14, var5 + 2);
      }

      int var6 = this.j.a(24);
      this.b(var3 + 79, var4 + 34, 176, 14, var6 + 1, 16);
   }
}
