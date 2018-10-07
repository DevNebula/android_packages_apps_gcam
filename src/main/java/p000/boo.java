package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: boo */
public final class boo implements boi {
    /* renamed from: a */
    private final Context f11658a;
    /* renamed from: b */
    private final ilp f11659b;
    /* renamed from: c */
    private final ilp f11660c;
    /* renamed from: d */
    private final irs f11661d;
    /* renamed from: e */
    private final bmb f11662e;
    /* renamed from: f */
    private final iqz f11663f;

    static {
        keu.m13727a(hhx.PHOTO);
        keu.m13727a(hhx.SETTINGS);
    }

    public boo(Context context, ilp ilp, ilp ilp2, irs irs, ira ira, bmb bmb) {
        this.f11658a = context;
        this.f11659b = ilp;
        this.f11660c = ilp2;
        this.f11661d = irs;
        this.f11662e = bmb;
        this.f11663f = ira.mo8854a("ElmyraGestureL");
        this.f11663f.mo8836d("ElmyraGestureL created.");
    }

    /* renamed from: a */
    public final void mo2069a() {
        this.f11661d.mo8878a(10);
        this.f11663f.mo8836d("ElmyraEvent received: Gesture Detected");
        iqz iqz = this.f11663f;
        String valueOf = String.valueOf(this.f11659b.mo13673b());
        String valueOf2 = String.valueOf(this.f11660c.mo13673b());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 52) + String.valueOf(valueOf2).length());
        stringBuilder.append("Invalid state detected. GCA Mode: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", AGSA available: ");
        stringBuilder.append(valueOf2);
        iqz.mo8834c(stringBuilder.toString());
    }

    /* renamed from: b */
    public final void mo2070b() {
    }
}
