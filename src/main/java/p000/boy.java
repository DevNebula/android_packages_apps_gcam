package p000;

/* compiled from: PG */
/* renamed from: boy */
public final class boy implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ aws f1394a;
    /* renamed from: b */
    private final /* synthetic */ bpi f1395b;
    /* renamed from: c */
    private final /* synthetic */ bpd f1396c;
    /* renamed from: d */
    private final /* synthetic */ ikd f1397d;
    /* renamed from: e */
    private final /* synthetic */ enr f1398e;

    public boy(aws aws, bpi bpi, bpd bpd, ikd ikd, enr enr) {
        this.f1394a = aws;
        this.f1395b = bpi;
        this.f1396c = bpd;
        this.f1397d = ikd;
        this.f1398e = enr;
    }

    public final void run() {
        iji a = this.f1394a.mo1824a();
        bpi bpi = this.f1395b;
        Object obj = this.f1396c;
        jri.m13404b(obj);
        bpi.f22833a.add(obj);
        a.mo8557a(new bpj(bpi, obj));
        eio.m1804a(this.f1397d, this.f1398e, this.f1396c);
    }
}
