package p000;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: ffw */
public final class ffw extends imq {
    /* renamed from: b */
    private final Collection f26346b;
    /* renamed from: c */
    private final Collection f26347c;
    /* renamed from: d */
    private final fis f26348d;

    public ffw(Collection collection, Collection collection2) {
        this(collection, collection2, fds.m10411a());
    }

    private ffw(Collection collection, Collection collection2, fis fis) {
        super(ilq.m3878a(collection2));
        this.f26346b = collection;
        this.f26347c = collection2;
        this.f26348d = fis;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15010b(Object obj) {
        List<fis> list = (List) obj;
        fio fio = new fio();
        for (fis a : this.f26346b) {
            a.mo6818a(fio);
        }
        for (fis a2 : list) {
            a2.mo6818a(fio);
        }
        this.f26348d.mo6818a(fio);
        return fio.mo6807a();
    }

    /* renamed from: a */
    public final ffw mo15526a(fis... fisArr) {
        return new ffw(this.f26346b, this.f26347c, fds.m10418a(this.f26348d, fds.m10418a(fisArr)));
    }
}
