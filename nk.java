class nk extends Thread {
   // $FF: synthetic field
   final ii a;

   nk(ii var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      synchronized(ii.a) {
         ++ii.c;
      }

      try {
         while(ii.a(this.a)) {
            ii.d(this.a);
         }
      } finally {
         synchronized(ii.a) {
            --ii.c;
         }
      }

   }
}
