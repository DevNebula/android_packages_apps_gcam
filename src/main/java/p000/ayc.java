package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ayc */
public final class ayc implements ayb {
    /* renamed from: c */
    private static final String f11030c = bli.m887a("AdviceManagerImpl");
    /* renamed from: a */
    public final Set f11031a;
    /* renamed from: b */
    public final iji f11032b;
    /* renamed from: d */
    private ilp f11033d;
    /* renamed from: e */
    private ilp f11034e;
    /* renamed from: f */
    private ilp f11035f;
    /* renamed from: g */
    private ilp f11036g;
    /* renamed from: h */
    private boolean f11037h;
    /* renamed from: i */
    private final kaw f11038i = new ayf();

    public ayc(Set set, iji iji) {
        this.f11031a = set;
        this.f11032b = iji;
    }

    /* renamed from: a */
    public final void mo1839a() {
        this.f11037h = false;
        for (ayo a : this.f11031a) {
            a.mo1851a();
        }
    }

    /* renamed from: b */
    public final void mo1843b() {
        this.f11037h = true;
    }

    /* renamed from: c */
    public final int mo1845c() {
        return ((Integer) this.f11033d.mo13673b()).intValue();
    }

    /* renamed from: d */
    public final boolean mo1846d() {
        return ((Boolean) this.f11034e.mo13673b()).booleanValue();
    }

    /* renamed from: a */
    public final void mo1842a(iur iur) {
        for (ayo a : this.f11031a) {
            a.mo1853a(iur);
        }
    }

    /* renamed from: a */
    public final void mo1841a(gfw gfw) {
        if (!this.f11037h) {
            return;
        }
        if (((Boolean) this.f11036g.mo13673b()).booleanValue()) {
            Object iuz = new iuz(gfw.f5387b, this.f11031a.size());
            for (ayo ayo : this.f11031a) {
                if (((Boolean) ayo.mo1854b().f1059b.mo13673b()).booleanValue() && (ayo instanceof ayq)) {
                    gfw gfw2 = new gfw(new iva(iuz), gfw.f5388c, gfw.f5389d, gfw.f5391f);
                    ((ayq) ayo).mo12337d();
                } else {
                    iuz.close();
                }
            }
            return;
        }
        gfw.f5387b.close();
    }

    /* renamed from: b */
    public final void mo1844b(gfw gfw) {
        if (this.f11037h && mo1846d()) {
            Object iuz = new iuz(gfw.f5387b, this.f11031a.size());
            for (ayo ayo : this.f11031a) {
                if (((Boolean) ayo.mo1854b().f1059b.mo13673b()).booleanValue() && (ayo instanceof ays)) {
                    ((ays) ayo).mo12339a(new gfw(new iva(iuz), gfw.f5388c, gfw.f5389d, gfw.f5391f));
                } else {
                    iuz.close();
                }
            }
            return;
        }
        gfw.f5387b.close();
    }

    /* renamed from: e */
    public final void mo1847e() {
        if (this.f11037h && ((Boolean) this.f11035f.mo13673b()).booleanValue()) {
            for (ayo ayo : this.f11031a) {
                if (((Boolean) ayo.mo1854b().f1059b.mo13673b()).booleanValue() && (ayo instanceof ayr)) {
                    ((ayr) ayo).mo12338d();
                }
            }
        }
    }

    /* renamed from: g */
    final void mo12336g() {
        Collection arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        Collection arrayList3 = new ArrayList();
        Collection arrayList4 = new ArrayList();
        Object valueOf = Boolean.valueOf(false);
        arrayList2.add(ilq.m3876a(valueOf));
        arrayList3.add(ilq.m3876a(valueOf));
        arrayList4.add(ilq.m3876a(valueOf));
        for (ayo ayo : this.f11031a) {
            ayp b = ayo.mo1854b();
            if (ayo instanceof ays) {
                arrayList2.add(b.f1059b);
                if (((Boolean) b.f1059b.mo13673b()).booleanValue()) {
                    arrayList.add(b.f1058a);
                }
            } else if (ayo instanceof ayr) {
                arrayList3.add(b.f1059b);
                if (((Boolean) b.f1059b.mo13673b()).booleanValue()) {
                    arrayList.add(b.f1058a);
                }
            } else if (ayo instanceof ayq) {
                arrayList4.add(b.f1059b);
            }
        }
        this.f11033d = ilq.m3875a(ilq.m3878a(arrayList), this.f11038i);
        this.f11034e = ilq.m3899e(arrayList2);
        this.f11035f = ilq.m3899e(arrayList3);
        this.f11036g = ilq.m3899e(arrayList4);
        String str = f11030c;
        String valueOf2 = String.valueOf(this.f11033d.mo13673b());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 20);
        stringBuilder.append("samplingFrequency = ");
        stringBuilder.append(valueOf2);
        bli.m888a(str, stringBuilder.toString());
        str = f11030c;
        valueOf2 = String.valueOf(this.f11034e.mo13673b());
        stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 18);
        stringBuilder.append("isPreviewActive = ");
        stringBuilder.append(valueOf2);
        bli.m888a(str, stringBuilder.toString());
        str = f11030c;
        valueOf2 = String.valueOf(this.f11035f.mo13673b());
        stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 26);
        stringBuilder.append("isPreviewMetadataActive = ");
        stringBuilder.append(valueOf2);
        bli.m888a(str, stringBuilder.toString());
        str = f11030c;
        valueOf2 = String.valueOf(this.f11036g.mo13673b());
        stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 22);
        stringBuilder.append("isPostCaptureActive = ");
        stringBuilder.append(valueOf2);
        bli.m888a(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo1840a(ayx ayx) {
        for (ayo a : this.f11031a) {
            a.mo1852a(ayx);
        }
    }

    /* renamed from: f */
    public final void mo1848f() {
        for (ayo c : this.f11031a) {
            c.mo1855c();
        }
    }
}
