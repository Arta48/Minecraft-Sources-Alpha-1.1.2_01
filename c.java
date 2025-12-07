public class c extends ly {
   public c(int var1, int var2) {
      super(var1, gb.e);
      this.bb = var2;
   }

   public int a(int var1) {
      if (var1 == 1) {
         return this.bb - 16;
      } else {
         return var1 == 0 ? this.bb + 16 : this.bb;
      }
   }
}
