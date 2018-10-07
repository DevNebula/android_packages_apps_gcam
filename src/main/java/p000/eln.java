package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: eln */
public final class eln implements Serializable {
    /* renamed from: a */
    public String f4164a;
    /* renamed from: b */
    public gkr f4165b;
    /* renamed from: c */
    public String f4166c;
    /* renamed from: d */
    public String f4167d;
    /* renamed from: e */
    public String f4168e;
    /* renamed from: f */
    public String f4169f;
    /* renamed from: g */
    public int f4170g;

    public final String toString() {
        String str = this.f4164a;
        String str2 = this.f4166c;
        String str3 = this.f4167d;
        String str4 = this.f4168e;
        String str5 = this.f4169f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 75) + length2) + length3) + String.valueOf(str4).length()) + String.valueOf(str5).length());
        stringBuilder.append("Session ID : ");
        stringBuilder.append(str);
        stringBuilder.append("\n SessionDir : ");
        stringBuilder.append(str2);
        stringBuilder.append("\n thumbnail : ");
        stringBuilder.append(str3);
        stringBuilder.append("\n metadata : ");
        stringBuilder.append(str4);
        stringBuilder.append("\n orientationFile : ");
        stringBuilder.append(str5);
        return stringBuilder.toString();
    }
}
