package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: bbk */
public final class bbk extends bck {
    /* renamed from: a */
    private final /* synthetic */ List f25498a;

    public bbk(bbi bbi, List list) {
        this.f25498a = list;
        super(bbi);
    }

    public final void close() {
        for (bbi close : this.f25498a) {
            close.close();
        }
        super.close();
    }
}
