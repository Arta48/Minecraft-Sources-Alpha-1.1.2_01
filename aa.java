import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;

public class aa extends z {
   protected float[] g = new float[320];
   protected float[] h = new float[320];
   private Minecraft i;
   private int[] j = new int[256];
   private double k;
   private double l;

   public aa(Minecraft var1) {
      super(di.aO.a((ev)null));
      this.i = var1;
      this.f = 1;

      try {
         BufferedImage var2 = ImageIO.read(Minecraft.class.getResource("/gui/items.png"));
         int var3 = this.b % 16 * 16;
         int var4 = this.b / 16 * 16;
         var2.getRGB(var3, var4, 16, 16, this.j, 0, 16);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   public void a() {
      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.j[var1] >> 24 & 255;
         int var3 = this.j[var1] >> 16 & 255;
         int var4 = this.j[var1] >> 8 & 255;
         int var5 = this.j[var1] >> 0 & 255;
         if (this.c) {
            int var6 = (var3 * 30 + var4 * 59 + var5 * 11) / 100;
            int var7 = (var3 * 30 + var4 * 70) / 100;
            int var8 = (var3 * 30 + var5 * 70) / 100;
            var3 = var6;
            var4 = var7;
            var5 = var8;
         }

         this.a[var1 * 4 + 0] = (byte)var3;
         this.a[var1 * 4 + 1] = (byte)var4;
         this.a[var1 * 4 + 2] = (byte)var5;
         this.a[var1 * 4 + 3] = (byte)var2;
      }

      double var20 = (double)0.0F;
      if (this.i.e != null && this.i.g != null) {
         double var21 = (double)this.i.e.o - this.i.g.ak;
         double var23 = (double)this.i.e.q - this.i.g.am;
         var20 = (double)(this.i.g.aq - 90.0F) * Math.PI / (double)180.0F - Math.atan2(var23, var21);
      }

      double var22;
      for(var22 = var20 - this.k; var22 < -Math.PI; var22 += (Math.PI * 2D)) {
      }

      while(var22 >= Math.PI) {
         var22 -= (Math.PI * 2D);
      }

      if (var22 < (double)-1.0F) {
         var22 = (double)-1.0F;
      }

      if (var22 > (double)1.0F) {
         var22 = (double)1.0F;
      }

      this.l += var22 * 0.1;
      this.l *= 0.8;
      this.k += this.l;
      double var24 = Math.sin(this.k);
      double var25 = Math.cos(this.k);

      for(int var9 = -4; var9 <= 4; ++var9) {
         int var10 = (int)((double)8.5F + var25 * (double)var9 * 0.3);
         int var11 = (int)((double)7.5F - var24 * (double)var9 * 0.3 * (double)0.5F);
         int var12 = var11 * 16 + var10;
         int var13 = 100;
         int var14 = 100;
         int var15 = 100;
         short var16 = 255;
         if (this.c) {
            int var17 = (var13 * 30 + var14 * 59 + var15 * 11) / 100;
            int var18 = (var13 * 30 + var14 * 70) / 100;
            int var19 = (var13 * 30 + var15 * 70) / 100;
            var13 = var17;
            var14 = var18;
            var15 = var19;
         }

         this.a[var12 * 4 + 0] = (byte)var13;
         this.a[var12 * 4 + 1] = (byte)var14;
         this.a[var12 * 4 + 2] = (byte)var15;
         this.a[var12 * 4 + 3] = (byte)var16;
      }

      for(int var26 = -8; var26 <= 16; ++var26) {
         int var27 = (int)((double)8.5F + var24 * (double)var26 * 0.3);
         int var28 = (int)((double)7.5F + var25 * (double)var26 * 0.3 * (double)0.5F);
         int var29 = var28 * 16 + var27;
         int var30 = var26 >= 0 ? 255 : 100;
         int var31 = var26 >= 0 ? 20 : 100;
         int var32 = var26 >= 0 ? 20 : 100;
         short var33 = 255;
         if (this.c) {
            int var34 = (var30 * 30 + var31 * 59 + var32 * 11) / 100;
            int var35 = (var30 * 30 + var31 * 70) / 100;
            int var36 = (var30 * 30 + var32 * 70) / 100;
            var30 = var34;
            var31 = var35;
            var32 = var36;
         }

         this.a[var29 * 4 + 0] = (byte)var30;
         this.a[var29 * 4 + 1] = (byte)var31;
         this.a[var29 * 4 + 2] = (byte)var32;
         this.a[var29 * 4 + 3] = (byte)var33;
      }

   }
}
