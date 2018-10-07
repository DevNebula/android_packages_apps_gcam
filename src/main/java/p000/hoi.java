package p000;

import android.graphics.Bitmap.CompressFormat;

/* compiled from: PG */
/* renamed from: hoi */
final class hoi implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f6776a;
    /* renamed from: b */
    private final /* synthetic */ aqq f6777b;
    /* renamed from: c */
    private final /* synthetic */ hod f6778c;

    hoi(hod hod, byte[] bArr, aqq aqq) {
        this.f6778c = hod;
        this.f6776a = bArr;
        this.f6777b = aqq;
    }

    public final void run() {
        acj a = acc.m100b(this.f6778c.f24497b).mo11609a(byte[].class);
        if (aqg.f893b == null) {
            aqg.f893b = new aqg().mo1709e().mo1693a();
        }
        acj a2 = a.mo124a(aqg.f893b.mo1696a(alu.f22485b, (CompressFormat) aqe.m610a(CompressFormat.JPEG, "Argument must not be null")).mo1696a(alu.f22484a, Integer.valueOf(30))).mo125a(this.f6776a);
        if (!a2.f236a.mo1702a(4)) {
            a2 = a2.mo124a(aqg.m620b(afm.f412a));
        }
        if (!a2.f236a.mo1702a(256)) {
            if (aqg.f892a == null) {
                aqg.f892a = new aqg().mo1713h().mo1693a();
            }
            a2 = a2.mo124a(aqg.f892a);
        }
        a2.mo127a(this.f6777b, null);
    }
}
