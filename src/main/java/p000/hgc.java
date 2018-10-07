package p000;

import android.os.Trace;

/* compiled from: PG */
/* renamed from: hgc */
public final class hgc implements hgb {
    /* renamed from: a */
    private final String f20010a;

    public hgc(String str) {
        this.f20010a = str;
    }

    /* renamed from: a */
    public final void mo7867a(String str) {
        String str2 = this.f20010a;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(str2);
        stringBuilder.append(":");
        stringBuilder.append(str);
        Trace.beginSection(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo7866a() {
        Trace.endSection();
    }
}
