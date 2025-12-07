import java.util.Comparator;

public class gl implements Comparator {
   private dm a;

   public gl(dm var1) {
      this.a = var1;
   }

   public int a(bn var1, bn var2) {
      boolean var3 = var1.o;
      boolean var4 = var2.o;
      if (var3 && !var4) {
         return 1;
      } else if (var4 && !var3) {
         return -1;
      } else {
         return var1.a((kh)this.a) < var2.a((kh)this.a) ? 1 : -1;
      }
   }
}
