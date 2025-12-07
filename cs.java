public class cs extends ly {
   protected cs(int var1) {
      super(var1, gb.c);
      this.bb = 59;
   }

   public int a(int var1) {
      if (var1 == 1) {
         return this.bb - 16;
      } else if (var1 == 0) {
         return ly.y.a(0);
      } else {
         return var1 != 2 && var1 != 4 ? this.bb : this.bb + 1;
      }
   }

   public boolean a(cn var1, int var2, int var3, int var4, dm var5) {
      var5.l();
      return true;
   }
}
