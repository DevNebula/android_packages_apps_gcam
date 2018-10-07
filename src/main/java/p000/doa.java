package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: doa */
public final class doa implements iqo {
    /* renamed from: A */
    public final ilp f14222A;
    /* renamed from: B */
    public final ecd f14223B;
    /* renamed from: C */
    public final asu f14224C;
    /* renamed from: D */
    public final hat f14225D;
    /* renamed from: E */
    public final irs f14226E;
    /* renamed from: F */
    public final imy f14227F;
    /* renamed from: G */
    public final div f14228G;
    /* renamed from: H */
    public final kwk f14229H;
    /* renamed from: I */
    public kbg f14230I = kau.f21835a;
    /* renamed from: J */
    public ilp f14231J;
    /* renamed from: K */
    public final cfh f14232K;
    /* renamed from: L */
    private final HandlerThread f14233L;
    /* renamed from: a */
    public final Intent f14234a;
    /* renamed from: b */
    public final dli f14235b;
    /* renamed from: c */
    public final ikd f14236c;
    /* renamed from: d */
    public final Context f14237d;
    /* renamed from: e */
    public final fbn f14238e;
    /* renamed from: f */
    public final hjw f14239f;
    /* renamed from: g */
    public final gci f14240g;
    /* renamed from: h */
    public final dzh f14241h;
    /* renamed from: i */
    public final bpq f14242i;
    /* renamed from: j */
    public final dkb f14243j;
    /* renamed from: k */
    public final hek f14244k;
    /* renamed from: l */
    public final heq f14245l;
    /* renamed from: m */
    public final gpn f14246m;
    /* renamed from: n */
    public final Resources f14247n;
    /* renamed from: o */
    public final ContentResolver f14248o;
    /* renamed from: p */
    public final ilb f14249p;
    /* renamed from: q */
    public final irh f14250q;
    /* renamed from: r */
    public final bfk f14251r;
    /* renamed from: s */
    public final djo f14252s;
    /* renamed from: t */
    public final cbu f14253t;
    /* renamed from: u */
    public final ing f14254u;
    /* renamed from: v */
    public final ilp f14255v;
    /* renamed from: w */
    public final fer f14256w;
    /* renamed from: x */
    public final ehx f14257x;
    /* renamed from: y */
    public final eid f14258y;
    /* renamed from: z */
    public final fbr f14259z;

    public doa(Intent intent, dli dli, ikd ikd, Context context, fbn fbn, hjw hjw, gci gci, gpn gpn, dzh dzh, cfh cfh, cbu cbu, bpq bpq, Resources resources, ContentResolver contentResolver, dkb dkb, hek hek, heq heq, irh irh, bfk bfk, djo djo, ing ing, ilp ilp, fer fer, ehx ehx, eid eid, fbr fbr, ilp ilp2, ilp ilp3, ecd ecd, asu asu, hat hat, irs irs, HandlerThread handlerThread, ilb ilb, imy imy, div div, kwk kwk) {
        this.f14234a = intent;
        this.f14235b = dli;
        this.f14236c = ikd;
        this.f14237d = context;
        this.f14253t = cbu;
        this.f14238e = fbn;
        this.f14239f = hjw;
        this.f14240g = gci;
        this.f14241h = dzh;
        this.f14242i = bpq;
        this.f14243j = dkb;
        this.f14244k = hek;
        this.f14245l = heq;
        this.f14246m = gpn;
        this.f14232K = cfh;
        this.f14248o = contentResolver;
        this.f14247n = resources;
        this.f14233L = handlerThread;
        this.f14249p = ilb;
        this.f14250q = irh;
        this.f14251r = bfk;
        this.f14252s = djo;
        this.f14254u = ing;
        this.f14255v = ilp;
        this.f14256w = fer;
        this.f14257x = ehx;
        this.f14258y = eid;
        this.f14259z = fbr;
        this.f14231J = ilp2;
        this.f14222A = ilp3;
        this.f14223B = ecd;
        this.f14224C = asu;
        this.f14225D = hat;
        this.f14226E = irs;
        this.f14227F = imy;
        this.f14228G = div;
        this.f14229H = kwk;
    }

    public final void close() {
        this.f14233L.quit();
    }

    /* renamed from: a */
    public final void mo13044a(Uri uri) {
        if (uri != null) {
            this.f14230I = kbg.m4804c(uri);
        } else {
            this.f14230I = kau.f21835a;
        }
    }
}
