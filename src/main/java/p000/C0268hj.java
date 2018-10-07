package p000;

import android.util.Base64;
import java.util.List;

/* compiled from: PG */
/* renamed from: hj */
public final class C0268hj {
    /* renamed from: a */
    public final String f6624a;
    /* renamed from: b */
    public final String f6625b;
    /* renamed from: c */
    public final String f6626c;
    /* renamed from: d */
    public final List f6627d;
    /* renamed from: e */
    public final String f6628e;

    public C0268hj(String str, String str2, String str3, List list) {
        this.f6624a = (String) C0261ha.m3030b(str);
        this.f6625b = (String) C0261ha.m3030b(str2);
        this.f6626c = (String) C0261ha.m3030b(str3);
        this.f6627d = (List) C0261ha.m3030b(list);
        StringBuilder stringBuilder = new StringBuilder(this.f6624a);
        stringBuilder.append("-");
        stringBuilder.append(this.f6625b);
        stringBuilder.append("-");
        stringBuilder.append(this.f6626c);
        this.f6628e = stringBuilder.toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("FontRequest {mProviderAuthority: ");
        stringBuilder2.append(this.f6624a);
        stringBuilder2.append(", mProviderPackage: ");
        stringBuilder2.append(this.f6625b);
        stringBuilder2.append(", mQuery: ");
        stringBuilder2.append(this.f6626c);
        stringBuilder2.append(", mCertificates:");
        stringBuilder.append(stringBuilder2.toString());
        for (int i = 0; i < this.f6627d.size(); i++) {
            stringBuilder.append(" [");
            List list = (List) this.f6627d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("mCertificatesArray: ");
        stringBuilder2.append(0);
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}
