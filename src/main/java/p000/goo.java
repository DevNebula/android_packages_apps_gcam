package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: goo */
abstract class goo implements ilp {
    /* renamed from: a */
    public final gos f24437a;
    /* renamed from: b */
    public final String f24438b;
    /* renamed from: c */
    public final String f24439c;

    goo(gos gos, String str, String str2) {
        this.f24437a = gos;
        this.f24438b = str;
        this.f24439c = str2;
    }

    /* renamed from: a */
    protected abstract Object mo14933a();

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        jri.m13404b((Object) iqt);
        jri.m13404b((Object) executor);
        gol gop = new gop(this, iqt, executor);
        this.f24437a.mo7287a(gop);
        gop.mo7276a(this.f24439c);
        return gop;
    }

    /* renamed from: b */
    public final Object mo13673b() {
        Object a = mo14933a();
        if (a != null) {
            return a;
        }
        String str = this.f24438b;
        String str2 = this.f24439c;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str2).length());
        stringBuilder.append("Null value for setting: ");
        stringBuilder.append(str);
        stringBuilder.append(" : ");
        stringBuilder.append(str2);
        throw new NullPointerException(stringBuilder.toString());
    }
}
