package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dsz */
public final class dsz extends imq implements ilp {
    /* renamed from: b */
    private final fwl f26165b;
    /* renamed from: c */
    private final fwl f26166c;

    public dsz(ilp ilp, ilp ilp2, fwl fwl, fwl fwl2) {
        super(ilq.m3880a(ilp, ilp2));
        this.f26165b = fwl;
        this.f26166c = fwl2;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15010b(Object obj) {
        List list = (List) obj;
        fxi fxi = (fxi) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        if (fxi == fxi.ON) {
            return this.f26165b;
        }
        if (fxi == fxi.AUTO && booleanValue) {
            return this.f26165b;
        }
        return this.f26166c;
    }
}
