import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class kd {
   private int[] b = new int[256];
   public int a = 0;
   private int c;
   private IntBuffer d = df.c(1024);

   public kd(fr var1, String var2, ey var3) {
      BufferedImage var4;
      try {
         var4 = ImageIO.read(ey.class.getResourceAsStream(var2));
      } catch (IOException var18) {
         throw new RuntimeException(var18);
      }

      int var5 = var4.getWidth();
      int var6 = var4.getHeight();
      int[] var7 = new int[var5 * var6];
      var4.getRGB(0, 0, var5, var6, var7, 0, var5);

      for(int var8 = 0; var8 < 256; ++var8) {
         int var9 = var8 % 16;
         int var10 = var8 / 16;

         int var11;
         for(var11 = 7; var11 >= 0; --var11) {
            int var12 = var9 * 8 + var11;
            boolean var13 = true;

            for(int var14 = 0; var14 < 8 && var13; ++var14) {
               int var15 = (var10 * 8 + var14) * var5;
               int var16 = var7[var12 + var15] & 255;
               if (var16 > 0) {
                  var13 = false;
               }
            }

            if (!var13) {
               break;
            }
         }

         if (var8 == 32) {
            var11 = 2;
         }

         this.b[var8] = var11 + 2;
      }

      this.a = var3.a(var4);
      this.c = df.a(288);
      ho var19 = ho.a;

      for(int var20 = 0; var20 < 256; ++var20) {
         GL11.glNewList(this.c + var20, 4864);
         var19.b();
         int var22 = var20 % 16 * 8;
         int var24 = var20 / 16 * 8;
         float var26 = 7.99F;
         float var28 = 0.0F;
         float var30 = 0.0F;
         var19.a((double)0.0F, (double)(0.0F + var26), (double)0.0F, (double)((float)var22 / 128.0F + var28), (double)(((float)var24 + var26) / 128.0F + var30));
         var19.a((double)(0.0F + var26), (double)(0.0F + var26), (double)0.0F, (double)(((float)var22 + var26) / 128.0F + var28), (double)(((float)var24 + var26) / 128.0F + var30));
         var19.a((double)(0.0F + var26), (double)0.0F, (double)0.0F, (double)(((float)var22 + var26) / 128.0F + var28), (double)((float)var24 / 128.0F + var30));
         var19.a((double)0.0F, (double)0.0F, (double)0.0F, (double)((float)var22 / 128.0F + var28), (double)((float)var24 / 128.0F + var30));
         var19.a();
         GL11.glTranslatef((float)this.b[var20], 0.0F, 0.0F);
         GL11.glEndList();
      }

      for(int var21 = 0; var21 < 32; ++var21) {
         int var23 = (var21 >> 3 & 1) * 85;
         int var25 = (var21 >> 2 & 1) * 170 + var23;
         int var27 = (var21 >> 1 & 1) * 170 + var23;
         int var29 = (var21 >> 0 & 1) * 170 + var23;
         if (var21 == 6) {
            var25 += 85;
         }

         boolean var31 = var21 >= 16;
         if (var1.g) {
            int var32 = (var25 * 30 + var27 * 59 + var29 * 11) / 100;
            int var33 = (var25 * 30 + var27 * 70) / 100;
            int var17 = (var25 * 30 + var29 * 70) / 100;
            var25 = var32;
            var27 = var33;
            var29 = var17;
         }

         if (var31) {
            var25 /= 4;
            var27 /= 4;
            var29 /= 4;
         }

         GL11.glNewList(this.c + 256 + var21, 4864);
         GL11.glColor3f((float)var25 / 255.0F, (float)var27 / 255.0F, (float)var29 / 255.0F);
         GL11.glEndList();
      }

   }

   public void a(String var1, int var2, int var3, int var4) {
      this.a(var1, var2 + 1, var3 + 1, var4, true);
      this.b(var1, var2, var3, var4);
   }

   public void b(String var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, false);
   }

   public void a(String var1, int var2, int var3, int var4, boolean var5) {
      if (var1 != null) {
         if (var5) {
            int var6 = var4 & -16777216;
            var4 = (var4 & 16579836) >> 2;
            var4 += var6;
         }

         GL11.glBindTexture(3553, this.a);
         float var11 = (float)(var4 >> 16 & 255) / 255.0F;
         float var7 = (float)(var4 >> 8 & 255) / 255.0F;
         float var8 = (float)(var4 & 255) / 255.0F;
         float var9 = (float)(var4 >> 24 & 255) / 255.0F;
         if (var9 == 0.0F) {
            var9 = 1.0F;
         }

         GL11.glColor4f(var11, var7, var8, var9);
         this.d.clear();
         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var3, 0.0F);

         for(int var12 = 0; var12 < var1.length(); ++var12) {
            for(; var1.charAt(var12) == 167 && var1.length() > var12 + 1; var12 += 2) {
               int var13 = "0123456789abcdef".indexOf(var1.toLowerCase().charAt(var12 + 1));
               if (var13 < 0 || var13 > 15) {
                  var13 = 15;
               }

               this.d.put(this.c + 256 + var13 + (var5 ? 16 : 0));
               if (this.d.remaining() == 0) {
                  this.d.flip();
                  GL11.glCallLists(this.d);
                  this.d.clear();
               }
            }

            int var14 = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(var1.charAt(var12));
            if (var14 >= 0) {
               this.d.put(this.c + var14 + 32);
            }

            if (this.d.remaining() == 0) {
               this.d.flip();
               GL11.glCallLists(this.d);
               this.d.clear();
            }
         }

         this.d.flip();
         GL11.glCallLists(this.d);
         GL11.glPopMatrix();
      }
   }

   public int a(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (var1.charAt(var3) == 167) {
               ++var3;
            } else {
               int var4 = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»".indexOf(var1.charAt(var3));
               if (var4 >= 0) {
                  var2 += this.b[var4 + 32];
               }
            }
         }

         return var2;
      }
   }
}
