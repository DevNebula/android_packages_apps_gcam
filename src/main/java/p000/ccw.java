package p000;

import com.google.android.camera.experimental2017.ExperimentalKeys;

/* compiled from: PG */
/* renamed from: ccw */
public final class ccw implements kwk {
    /* renamed from: a */
    private final kwk f12185a;
    /* renamed from: b */
    private final kwk f12186b;

    private ccw(kwk kwk, kwk kwk2) {
        this.f12185a = kwk;
        this.f12186b = kwk2;
    }

    /* renamed from: a */
    public static ccw m8124a(kwk kwk, kwk kwk2) {
        return new ccw(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        int obj2;
        kwk kwk = this.f12185a;
        hjf hjf = (hjf) this.f12186b.mo10566a();
        iut c = ((ffc) kwk.mo10566a()).mo9064c();
        iut iut = iut.BACK;
        if (!hjf.mo7905c()) {
            obj2 = null;
        } else if (c == iut) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = Integer.valueOf(-1);
        } else {
            if (!hjf.mo7905c()) {
                obj2 = -1;
            } else if (!hjf.mo7905c()) {
                obj2 = 1;
            } else if (ExperimentalKeys.getLibraryVersion() <= 2) {
                obj2 = 0;
            } else {
                obj2 = 1;
            }
            obj2 = Integer.valueOf(obj2);
        }
        return (Integer) ktm.m14219a(obj2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
