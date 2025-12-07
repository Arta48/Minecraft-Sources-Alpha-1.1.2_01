public class ms extends bs {
   private static ly[] aX;

   public ms(int var1, int var2) {
      super(var1, 1, var2, aX);
   }

   public boolean a(ly var1) {
      if (var1 == ly.aT) {
         return true;
      } else {
         return var1 == ly.aV;
      }
   }

   static {
      aX = new ly[]{ly.v, ly.w, ly.F, ly.G, ly.aT, ly.aV, ly.aX};
   }
}
