package p000;

import java.util.concurrent.Future;

/* renamed from: gna */
final /* synthetic */ class gna implements Runnable {
    /* renamed from: a */
    private final gmz f5715a;
    /* renamed from: b */
    private final hec f5716b;
    /* renamed from: c */
    private final glw f5717c;

    gna(gmz gmz, hec hec, glw glw) {
        this.f5715a = gmz;
        this.f5716b = hec;
        this.f5717c = glw;
    }

    public final void run() {
        gkt gkt = this.f5715a;
        eql eql = (eql) kow.m13881c((Future) jri.m13404b(gkt.f24409z));
        gkt.mo15546a(this.f5716b, this.f5717c, eql);
        gkt.mo14914a(gkt.f24402s);
        if (gkt.f26440d == null) {
            gkt.f26440d = eql;
        }
    }
}
