package p000;

import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: csh */
public final class csh {
    /* renamed from: a */
    public static final String f2844a = bli.m887a("FilmstripController");
    /* renamed from: b */
    public final kwa f2845b;
    /* renamed from: c */
    public final hfz f2846c;
    /* renamed from: d */
    public final Context f2847d;
    /* renamed from: e */
    public final boolean f2848e;
    /* renamed from: f */
    public final gsp f2849f;
    /* renamed from: g */
    public final gev f2850g;
    /* renamed from: h */
    public final gln f2851h;
    /* renamed from: i */
    public final FragmentManager f2852i;
    /* renamed from: j */
    public final irs f2853j;
    /* renamed from: k */
    public final glj f2854k;
    /* renamed from: l */
    private final csl f2855l;
    /* renamed from: m */
    private final bag f2856m;
    /* renamed from: n */
    private final csf f2857n;
    /* renamed from: o */
    private final gst f2858o;

    public csh(csl csl, hfz hfz, boolean z, Context context, FragmentManager fragmentManager, bag bag, csf csf, gst gst, kwa kwa, gsp gsp, gev gev, gln gln, irs irs, glj glj) {
        this.f2852i = fragmentManager;
        this.f2855l = (csl) jri.m13404b((Object) csl);
        this.f2846c = (hfz) jri.m13404b((Object) hfz);
        this.f2847d = (Context) jri.m13404b((Object) context);
        this.f2856m = (bag) jri.m13404b((Object) bag);
        this.f2857n = csf;
        this.f2848e = z;
        this.f2858o = (gst) jri.m13404b((Object) gst);
        this.f2845b = (kwa) jri.m13404b((Object) kwa);
        this.f2849f = (gsp) jri.m13404b((Object) gsp);
        this.f2850g = (gev) jri.m13404b((Object) gev);
        this.f2851h = (gln) jri.m13404b((Object) gln);
        this.f2853j = irs;
        this.f2854k = glj;
    }

    /* renamed from: a */
    public final Bitmap mo5728a() {
        Throwable e;
        kpk a = this.f2858o.mo7421a();
        if (a.isDone()) {
            try {
                gss gss = (gss) a.get();
                if (gss != null) {
                    Bitmap bitmap = gss.f6036a;
                    if (!(bitmap == null || bitmap.isRecycled())) {
                        return gss.f6036a;
                    }
                }
            } catch (ExecutionException e2) {
                e = e2;
                bli.m899e(f2844a, "getCaptureIndicatorBitmapOrNull() failed to get bitmap from capture indicator cache.", e);
                return null;
            } catch (InterruptedException e3) {
                e = e3;
                bli.m899e(f2844a, "getCaptureIndicatorBitmapOrNull() failed to get bitmap from capture indicator cache.", e);
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo5729a(cre cre) {
        gkr b = this.f2856m.f1069a.mo7201b(cre.mo5692e().mo6541g().f4384h);
        if (b != null) {
            b.mo13376d();
        } else {
            this.f2846c.mo7830b(cre);
            csl csl = this.f2855l;
            if (csl.f13236e) {
                csl.mo12899a();
            }
            bli.m896d(csl.f13232a, "Showing undo deletion bar");
            csl.f13236e = true;
            csl.f13235d.setOnTouchListener(new csn(csl));
            csl.f13234c.setClickable(true);
            csl.f13234c.setAlpha(0.0f);
            csl.f13234c.setVisibility(0);
            csl.f13234c.animate().setDuration(200).alpha(1.0f).setListener(null).start();
        }
        int d = this.f2846c.mo7835d();
        if (d == 0 || (d == 1 && this.f2848e)) {
            this.f2857n.mo5724N();
        }
    }
}
