package p000;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: erp */
final class erp implements erq {
    /* renamed from: a */
    private final InputStream f17693a;

    erp(InputStream inputStream) {
        this.f17693a = inputStream;
    }

    public final void close() {
        this.f17693a.close();
    }

    /* renamed from: a */
    public final int mo6523a() {
        return this.f17693a.read();
    }

    /* renamed from: a */
    public final eyo mo6525a(int i, int i2) {
        byte[] bArr = new byte[i];
        return new eyo(bArr, i2, 0, this.f17693a.read(bArr));
    }

    /* renamed from: a */
    public final eyo mo6524a(int i) {
        return mo6525a(this.f17693a.available(), i);
    }

    /* renamed from: b */
    public final void mo6526b(int i) {
        this.f17693a.skip((long) i);
    }
}
