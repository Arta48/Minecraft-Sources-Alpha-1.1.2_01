import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class ey {
   public static boolean a = false;
   private HashMap b = new HashMap();
   private HashMap c = new HashMap();
   private IntBuffer d = df.c(1);
   private ByteBuffer e = df.b(1048576);
   private List f = new ArrayList();
   private Map g = new HashMap();
   private fr h;
   private boolean i = false;

   public ey(fr var1) {
      this.h = var1;
   }

   public int a(String var1) {
      Integer var2 = (Integer)this.b.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         try {
            this.d.clear();
            df.a(this.d);
            int var4 = this.d.get(0);
            if (var1.startsWith("##")) {
               this.a(this.b(ImageIO.read(ey.class.getResourceAsStream(var1.substring(2)))), var4);
            } else if (var1.startsWith("%%")) {
               this.i = true;
               this.a(ImageIO.read(ey.class.getResourceAsStream(var1.substring(2))), var4);
               this.i = false;
            } else {
               this.a(ImageIO.read(ey.class.getResourceAsStream(var1)), var4);
            }

            this.b.put(var1, var4);
            return var4;
         } catch (IOException var3) {
            throw new RuntimeException("!!");
         }
      }
   }

   private BufferedImage b(BufferedImage var1) {
      int var2 = var1.getWidth() / 16;
      BufferedImage var3 = new BufferedImage(16, var1.getHeight() * var2, 2);
      Graphics var4 = var3.getGraphics();

      for(int var5 = 0; var5 < var2; ++var5) {
         var4.drawImage(var1, -var5 * 16, var5 * var1.getHeight(), (ImageObserver)null);
      }

      var4.dispose();
      return var3;
   }

   public int a(BufferedImage var1) {
      this.d.clear();
      df.a(this.d);
      int var2 = this.d.get(0);
      this.a(var1, var2);
      this.c.put(var2, var1);
      return var2;
   }

   public void a(BufferedImage var1, int var2) {
      GL11.glBindTexture(3553, var2);
      if (a) {
         GL11.glTexParameteri(3553, 10241, 9987);
         GL11.glTexParameteri(3553, 10240, 9729);
      } else {
         GL11.glTexParameteri(3553, 10241, 9728);
         GL11.glTexParameteri(3553, 10240, 9728);
      }

      if (this.i) {
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }

      int var3 = var1.getWidth();
      int var4 = var1.getHeight();
      int[] var5 = new int[var3 * var4];
      byte[] var6 = new byte[var3 * var4 * 4];
      var1.getRGB(0, 0, var3, var4, var5, 0, var3);

      for(int var7 = 0; var7 < var5.length; ++var7) {
         int var8 = var5[var7] >> 24 & 255;
         int var9 = var5[var7] >> 16 & 255;
         int var10 = var5[var7] >> 8 & 255;
         int var11 = var5[var7] & 255;
         if (this.h != null && this.h.g) {
            int var12 = (var9 * 30 + var10 * 59 + var11 * 11) / 100;
            int var13 = (var9 * 30 + var10 * 70) / 100;
            int var14 = (var9 * 30 + var11 * 70) / 100;
            var9 = var12;
            var10 = var13;
            var11 = var14;
         }

         var6[var7 * 4 + 0] = (byte)var9;
         var6[var7 * 4 + 1] = (byte)var10;
         var6[var7 * 4 + 2] = (byte)var11;
         var6[var7 * 4 + 3] = (byte)var8;
      }

      this.e.clear();
      this.e.put(var6);
      this.e.position(0).limit(var6.length);
      GL11.glTexImage2D(3553, 0, 6408, var3, var4, 0, 6408, 5121, this.e);
      if (a) {
         for(int var18 = 1; var18 <= 4; ++var18) {
            int var19 = var3 >> var18 - 1;
            int var20 = var3 >> var18;
            int var21 = var4 >> var18;

            for(int var22 = 0; var22 < var20; ++var22) {
               for(int var23 = 0; var23 < var21; ++var23) {
                  int var24 = this.e.getInt((var22 * 2 + 0 + (var23 * 2 + 0) * var19) * 4);
                  int var25 = this.e.getInt((var22 * 2 + 1 + (var23 * 2 + 0) * var19) * 4);
                  int var15 = this.e.getInt((var22 * 2 + 1 + (var23 * 2 + 1) * var19) * 4);
                  int var16 = this.e.getInt((var22 * 2 + 0 + (var23 * 2 + 1) * var19) * 4);
                  int var17 = this.b(this.b(var24, var25), this.b(var15, var16));
                  this.e.putInt((var22 + var23 * var20) * 4, var17);
               }
            }

            GL11.glTexImage2D(3553, var18, 6408, var20, var21, 0, 6408, 5121, this.e);
         }
      }

   }

   public void a(int var1) {
      this.c.remove(var1);
      this.d.clear();
      this.d.put(var1);
      this.d.flip();
      GL11.glDeleteTextures(this.d);
   }

   public int a(String var1, String var2) {
      cc var3 = (cc)this.g.get(var1);
      if (var3 != null && var3.a != null && !var3.d) {
         if (var3.c < 0) {
            var3.c = this.a(var3.a);
         } else {
            this.a(var3.a, var3.c);
         }

         var3.d = true;
      }

      return var3 != null && var3.c >= 0 ? var3.c : this.a(var2);
   }

   public cc a(String var1, hb var2) {
      cc var3 = (cc)this.g.get(var1);
      if (var3 == null) {
         this.g.put(var1, new cc(var1, var2));
      } else {
         ++var3.b;
      }

      return var3;
   }

   public void b(String var1) {
      cc var2 = (cc)this.g.get(var1);
      if (var2 != null) {
         --var2.b;
         if (var2.b == 0) {
            if (var2.c >= 0) {
               this.a(var2.c);
            }

            this.g.remove(var1);
         }
      }

   }

   public void a(z var1) {
      this.f.add(var1);
      var1.a();
   }

   public void a() {
      for(int var1 = 0; var1 < this.f.size(); ++var1) {
         z var2 = (z)this.f.get(var1);
         var2.c = this.h.g;
         var2.a();
         this.e.clear();
         this.e.put(var2.a);
         this.e.position(0).limit(var2.a.length);
         var2.a(this);

         for(int var3 = 0; var3 < var2.e; ++var3) {
            for(int var4 = 0; var4 < var2.e; ++var4) {
               GL11.glTexSubImage2D(3553, 0, var2.b % 16 * 16 + var3 * 16, var2.b / 16 * 16 + var4 * 16, 16, 16, 6408, 5121, this.e);
               if (a) {
                  for(int var5 = 1; var5 <= 4; ++var5) {
                     int var6 = 16 >> var5 - 1;
                     int var7 = 16 >> var5;

                     for(int var8 = 0; var8 < var7; ++var8) {
                        for(int var9 = 0; var9 < var7; ++var9) {
                           int var10 = this.e.getInt((var8 * 2 + 0 + (var9 * 2 + 0) * var6) * 4);
                           int var11 = this.e.getInt((var8 * 2 + 1 + (var9 * 2 + 0) * var6) * 4);
                           int var12 = this.e.getInt((var8 * 2 + 1 + (var9 * 2 + 1) * var6) * 4);
                           int var13 = this.e.getInt((var8 * 2 + 0 + (var9 * 2 + 1) * var6) * 4);
                           int var14 = this.a(this.a(var10, var11), this.a(var12, var13));
                           this.e.putInt((var8 + var9 * var7) * 4, var14);
                        }
                     }

                     GL11.glTexSubImage2D(3553, var5, var2.b % 16 * var7, var2.b / 16 * var7, var7, var7, 6408, 5121, this.e);
                  }
               }
            }
         }
      }

      for(int var15 = 0; var15 < this.f.size(); ++var15) {
         z var16 = (z)this.f.get(var15);
         if (var16.d > 0) {
            this.e.clear();
            this.e.put(var16.a);
            this.e.position(0).limit(var16.a.length);
            GL11.glBindTexture(3553, var16.d);
            GL11.glTexSubImage2D(3553, 0, 0, 0, 16, 16, 6408, 5121, this.e);
            if (a) {
               for(int var17 = 1; var17 <= 4; ++var17) {
                  int var18 = 16 >> var17 - 1;
                  int var19 = 16 >> var17;

                  for(int var20 = 0; var20 < var19; ++var20) {
                     for(int var21 = 0; var21 < var19; ++var21) {
                        int var22 = this.e.getInt((var20 * 2 + 0 + (var21 * 2 + 0) * var18) * 4);
                        int var23 = this.e.getInt((var20 * 2 + 1 + (var21 * 2 + 0) * var18) * 4);
                        int var24 = this.e.getInt((var20 * 2 + 1 + (var21 * 2 + 1) * var18) * 4);
                        int var25 = this.e.getInt((var20 * 2 + 0 + (var21 * 2 + 1) * var18) * 4);
                        int var26 = this.a(this.a(var22, var23), this.a(var24, var25));
                        this.e.putInt((var20 + var21 * var19) * 4, var26);
                     }
                  }

                  GL11.glTexSubImage2D(3553, var17, 0, 0, var19, var19, 6408, 5121, this.e);
               }
            }
         }
      }

   }

   private int a(int var1, int var2) {
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 & -16777216) >> 24 & 255;
      return (var3 + var4 >> 1 << 24) + ((var1 & 16711422) + (var2 & 16711422) >> 1);
   }

   private int b(int var1, int var2) {
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 & -16777216) >> 24 & 255;
      short var5 = 255;
      if (var3 + var4 == 0) {
         var3 = 1;
         var4 = 1;
         var5 = 0;
      }

      int var6 = (var1 >> 16 & 255) * var3;
      int var7 = (var1 >> 8 & 255) * var3;
      int var8 = (var1 & 255) * var3;
      int var9 = (var2 >> 16 & 255) * var4;
      int var10 = (var2 >> 8 & 255) * var4;
      int var11 = (var2 & 255) * var4;
      int var12 = (var6 + var9) / (var3 + var4);
      int var13 = (var7 + var10) / (var3 + var4);
      int var14 = (var8 + var11) / (var3 + var4);
      return var5 << 24 | var12 << 16 | var13 << 8 | var14;
   }

   public void b() {
      for(int var2 : this.c.keySet()) {
         BufferedImage var3 = (BufferedImage)this.c.get(var2);
         this.a(var3, var2);
      }

      for(cc var8 : this.g.values()) {
         var8.d = false;
      }

      for(String var9 : this.b.keySet()) {
         try {
            BufferedImage var10;
            if (var9.startsWith("##")) {
               var10 = this.b(ImageIO.read(ey.class.getResourceAsStream(var9.substring(2))));
            } else if (var9.startsWith("%%")) {
               this.i = true;
               var10 = ImageIO.read(ey.class.getResourceAsStream(var9.substring(2)));
               this.i = false;
            } else {
               var10 = ImageIO.read(ey.class.getResourceAsStream(var9));
            }

            int var4 = (Integer)this.b.get(var9);
            this.a(var10, var4);
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      }

   }

   public void b(int var1) {
      if (var1 >= 0) {
         GL11.glBindTexture(3553, var1);
      }
   }
}
