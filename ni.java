class ni extends Thread {
   // $FF: synthetic field
   final ii a;

   ni(ii var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      synchronized(ii.a) {
         ++ii.b;
      }

      try {
         while(ii.a(this.a) && !ii.b(this.a)) {
            ii.c(this.a);
         }
      } finally {
         synchronized(ii.a) {
            --ii.b;
         }
      }

   }
}
