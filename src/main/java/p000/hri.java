package p000;

import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* renamed from: hri */
public final class hri {
    /* renamed from: c */
    private static final String f6858c = bli.m887a("Dataset");
    /* renamed from: a */
    public final String f6859a;
    /* renamed from: b */
    public final String f6860b;

    private hri(String str, String str2) {
        this.f6859a = str;
        this.f6860b = str2;
    }

    /* renamed from: a */
    public static hri m3358a(File file, gtf gtf) {
        String absolutePath = file.getAbsolutePath();
        String a = gtf.mo7437a(System.currentTimeMillis());
        String str = File.separator;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(absolutePath).length() + String.valueOf(str).length()) + String.valueOf(a).length());
        stringBuilder.append(absolutePath);
        stringBuilder.append(str);
        stringBuilder.append(a);
        str = stringBuilder.toString();
        File file2 = new File(str);
        int i = 1;
        while (file2.exists()) {
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 12);
            stringBuilder2.append(str);
            stringBuilder2.append("_");
            stringBuilder2.append(i);
            file2 = new File(stringBuilder2.toString());
            i++;
        }
        File file3 = new File(file2.getParent(), file2.getName());
        if (file3.mkdirs() || file3.exists()) {
            return new hri(file3.getParent(), file3.getName());
        }
        bli.m891b(f6858c, "Failed to create directory");
        absolutePath = String.valueOf(file3.getPath());
        str = "Failed to create directory ";
        if (absolutePath.length() == 0) {
            absolutePath = new String(str);
        } else {
            absolutePath = str.concat(absolutePath);
        }
        throw new FileNotFoundException(absolutePath);
    }

    /* renamed from: a */
    public final String mo8055a(int i) {
        String a = mo8054a();
        String str = File.separator;
        String str2 = this.f6860b;
        String format = String.format("%02d", new Object[]{Integer.valueOf(i)});
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 5) + length2) + String.valueOf(str2).length()) + String.valueOf(format).length());
        stringBuilder.append(a);
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append("_");
        stringBuilder.append(format);
        stringBuilder.append(".jpg");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final String mo8054a() {
        String str = this.f6859a;
        String str2 = File.separator;
        String str3 = this.f6860b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final String mo8056b() {
        String a = mo8054a();
        String str = File.separator;
        String str2 = this.f6860b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + String.valueOf(str).length()) + String.valueOf(str2).length());
        stringBuilder.append(a);
        stringBuilder.append(str);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
