public class y extends bs {
   private static ly[] aX;
   private int aY;

   public y(int var1, int var2) {
      super(var1, 2, var2, aX);
      this.aY = var2;
   }

   public boolean a(ly var1) {
      if (var1 == ly.aq) {
         return this.aY == 3;
      } else if (var1 != ly.ay && var1 != ly.ax) {
         if (var1 != ly.ai && var1 != ly.H) {
            if (var1 != ly.aj && var1 != ly.I) {
               if (var1 != ly.aO && var1 != ly.aP) {
                  if (var1.bn == gb.d) {
                     return true;
                  } else {
                     return var1.bn == gb.e;
                  }
               } else {
                  return this.aY >= 2;
               }
            } else {
               return this.aY >= 1;
            }
         } else {
            return this.aY >= 2;
         }
      } else {
         return this.aY >= 2;
      }
   }

   static {
      aX = new ly[]{ly.x, ly.ak, ly.al, ly.u, ly.ap, ly.I, ly.aj, ly.J, ly.ai, ly.H, ly.ax, ly.ay, ly.aU};
   }
}
