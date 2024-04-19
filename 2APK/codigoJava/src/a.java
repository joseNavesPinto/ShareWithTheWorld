
import java.util.Base64;
public class a {
    public static boolean a(String var0) {
        byte[] var1 = Base64.getDecoder().decode("5UJiFctbmgbDoLXmpL12mkno8HT4Lv8dlat8FxR2GOc=");

        //as-is
        try {
            var1 = a1.a(b("8d127684cbc37c17616d806cf50473cc"), var1);
        } catch (Exception var3) {
            StringBuilder var4 = new StringBuilder();
            var4.append("AES error:");
        }

        //ver password em debug
        String DecodedText=new String(var1);

        return var0.equals(new String(var1));
    }

    public static byte[] b(String var0) {
        int var2 = var0.length();
        byte[] var3 = new byte[var2 / 2];

        for(int var1 = 0; var1 < var2; var1 += 2) {
            var3[var1 / 2] = (byte)((Character.digit(var0.charAt(var1), 16) << 4) + Character.digit(var0.charAt(var1 + 1), 16));
        }

        return var3;
    }

}
