package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: afs */
public final class afs implements agb, agf, ahx {
    /* renamed from: a */
    public static final boolean f10208a = Log.isLoggable("Engine", 2);
    /* renamed from: b */
    public final agj f10209b;
    /* renamed from: c */
    public final ahw f10210c;
    /* renamed from: d */
    public final afv f10211d;
    /* renamed from: e */
    public final aft f10212e;
    /* renamed from: f */
    public final aet f10213f;
    /* renamed from: g */
    private final agq f10214g;
    /* renamed from: h */
    private final afg f10215h;

    private afs(ahw ahw, ahn ahn, aie aie, aie aie2, aie aie3, aie aie4, boolean z) {
        this.f10210c = ahw;
        this.f10215h = new afg(ahn);
        aet aet = new aet(false);
        this.f10213f = aet;
        aet.f357c = this;
        agd agd = new agd();
        this.f10209b = new agj();
        this.f10211d = new afv(aie, aie2, aie3, aie4, this);
        this.f10212e = new aft(this.f10215h);
        this.f10214g = new agq();
        ahw.mo308a((ahx) this);
    }

    public afs(ahw ahw, ahn ahn, aie aie, aie aie2, aie aie3, aie aie4) {
        this(ahw, ahn, aie, aie2, aie3, aie4, false);
    }

    /* renamed from: a */
    public static void m6445a(String str, long j, adl adl) {
        double a = arm.m654a(j);
        String valueOf = String.valueOf(adl);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(valueOf).length());
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(a);
        stringBuilder.append("ms, key: ");
        stringBuilder.append(valueOf);
        Log.v("Engine", stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo244a(afy afy, adl adl) {
        arq.m678a();
        this.f10209b.mo259a(adl, afy);
    }

    /* renamed from: a */
    public final void mo245a(afy afy, adl adl, age age) {
        arq.m678a();
        if (age != null) {
            age.mo11635a(adl, this);
            if (age.f10251a) {
                this.f10213f.mo208a(adl, age);
            }
        }
        this.f10209b.mo259a(adl, afy);
    }

    /* renamed from: a */
    public final void mo246a(adl adl, age age) {
        arq.m678a();
        aex aex = (aex) this.f10213f.f356b.remove(adl);
        if (aex != null) {
            aex.mo212a();
        }
        if (age.f10251a) {
            this.f10210c.mo304a(adl, age);
        } else {
            this.f10214g.mo266a(age);
        }
    }

    /* renamed from: a */
    public final void mo309a(agn agn) {
        arq.m678a();
        this.f10214g.mo266a(agn);
    }

    /* renamed from: b */
    public static void m6446b(agn agn) {
        arq.m678a();
        if (agn instanceof age) {
            ((age) agn).mo11636f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}
