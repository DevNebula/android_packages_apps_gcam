package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.widget.BurstItemView;
import java.io.File;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: cou */
public final class cou extends cpy {
    /* renamed from: j */
    private static final String f23660j = bli.m887a("BurstItem");
    /* renamed from: k */
    private static final ers f23661k = new exb().mo13193a(ert.IS_BURST).mo13193a(ert.CAN_DELETE).mo13193a(ert.CAN_SWIPE_AWAY).mo13194d();
    /* renamed from: l */
    private static final ers f23662l = new exb().mo13193a(ert.IS_RENDERING).mo13194d();
    /* renamed from: a */
    public kbg f23663a;
    /* renamed from: m */
    private final gev f23664m;
    /* renamed from: n */
    private final gln f23665n;
    /* renamed from: o */
    private final gsp f23666o;

    public cou(gev gev, gln gln, Context context, cqb cqb, cov cov, gsp gsp) {
        ers ers;
        if (cov.mo12886d() != 0) {
            ers = f23661k;
        } else {
            ers = f23662l;
        }
        super(context, cqb, cov, ers);
        this.f23663a = kau.f21835a;
        this.f23664m = gev;
        this.f23665n = gln;
        this.f23666o = gsp;
    }

    /* renamed from: a */
    public final View mo6527a(kbg kbg, hfz hfz, boolean z, cpx cpx) {
        View view;
        BurstItemView burstItemView;
        if (kbg.mo9709b()) {
            view = (View) kbg.mo9706a();
            if (view instanceof BurstItemView) {
                view = (BurstItemView) view;
            } else {
                bli.m898e(f23660j, "getView was called with a view that is not an BurstItemView!");
                view = null;
            }
        } else {
            view = null;
        }
        if (view == null) {
            BurstItemView burstItemView2 = (BurstItemView) LayoutInflater.from(this.f13137c).inflate(R.layout.filmstrip_burst, null);
            burstItemView2.setTag(R.id.mediadata_tag_viewtype, Integer.valueOf(C0252go.f5844aq - 1));
            burstItemView = burstItemView2;
        } else {
            View burstItemView3 = view;
        }
        m15406a(burstItemView3);
        if (this.f13141g.mo6552e()) {
            burstItemView3.setContentDescription(this.f13137c.getResources().getString(R.string.media_processing_content_description));
        } else {
            int d = ((cov) this.f13139e).mo12886d();
            burstItemView3.setContentDescription(this.f13137c.getResources().getString(R.string.burst_date_content_description, new Object[]{Integer.valueOf(d), f13136b.format(((cov) this.f13139e).f4382f)}));
        }
        this.f13143i.mo15641a(burstItemView3.f2623a);
        return burstItemView3;
    }

    /* renamed from: a */
    public final boolean mo6532a() {
        for (err a : ((cov) this.f13139e).mo12885c()) {
            a.mo6532a();
        }
        File file = new File(((cov) this.f13139e).f4383g);
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    if (cov.m8626e(file2) || cov.m8618a(file2) || cov.m8624d(file2) || cov.m8621b(file2)) {
                        file2.delete();
                    }
                } else if (file2.isDirectory() && cov.m8623c(file2)) {
                    for (File delete : file2.listFiles()) {
                        delete.delete();
                    }
                    file2.delete();
                }
            }
        }
        return super.mo6532a();
    }

    /* renamed from: a */
    public final hio mo6528a(int i, int i2) {
        Object a;
        Exception e;
        err e2 = ((cov) this.f13139e).mo12887e();
        if (e2 == null) {
            bli.m894c(f23660j, "Cover item doesnt exist, using storage");
            kbg c = this.f23666o.mo7412c(((cov) this.f13139e).f4384h);
            if (c.mo9709b()) {
                a = hid.m3223a(((anq) c.mo9706a()).mo262b());
            } else {
                bli.m891b(f23660j, "no placeholder in storage either");
                a = null;
            }
        } else {
            try {
                a = hid.m3223a((Drawable) m15407b(e2.mo6541g()).mo126a(i, i2).get());
            } catch (InterruptedException e3) {
                e = e3;
            } catch (ExecutionException e4) {
                e = e4;
            }
        }
        return new hio(kbg.m4803b(a));
        String str = f23660j;
        String valueOf = String.valueOf(e.getMessage());
        String str2 = "Error loading thumbnail: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m891b(str, valueOf);
        a = null;
        return new hio(kbg.m4803b(a));
    }

    /* renamed from: b */
    public final cot mo14824b() {
        return cov.m8620b(((cov) this.f13139e).mo12885c());
    }

    /* renamed from: d */
    public final int mo14825d() {
        return ((cov) this.f13139e).mo12886d();
    }

    /* renamed from: e */
    public final int mo6539e() {
        return C0252go.f5844aq;
    }

    /* renamed from: a */
    public final boolean mo6533a(cfh cfh, cre cre) {
        if (this.f13141g.mo6552e()) {
            return false;
        }
        cfh.mo12470a(cre);
        if (((Activity) cfh.mo12461C().get()) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo6529a(View view) {
        super.mo6529a(view);
        acc.m100b(this.f13137c).mo11610a(view);
        if (this.f23663a.mo9709b()) {
            this.f23663a = kau.f21835a;
        }
    }

    /* renamed from: c */
    public final err mo6536c() {
        if (this.f13141g.mo6552e()) {
            return this;
        }
        kbg f = ((cov) this.f13139e).mo12888f();
        if (f.mo9709b()) {
            return new cou(this.f23664m, this.f23665n, this.f13137c, this.f13138d, (cov) f.mo9706a(), this.f23666o);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo6535b(View view) {
    }

    /* renamed from: b */
    private final acj m15407b(eru eru) {
        aqg a = this.f13138d.mo5665a(cpy.m8717a(eru), this.f13142h);
        if (this.f23663a.mo9709b()) {
            a.mo1701a(((anq) this.f23663a.mo9706a()).mo262b());
        }
        return this.f13138d.mo5666b().mo124a(a).mo125a(eru.f4384h);
    }

    /* renamed from: c */
    public final void mo6537c(View view) {
        if (view instanceof BurstItemView) {
            m15406a((BurstItemView) view);
        } else {
            bli.m898e(f23660j, "renderThumbnail was called with an object that is not an BurstItemView!");
        }
    }

    /* renamed from: a */
    public final void mo6530a(View view, Bitmap bitmap) {
    }

    /* renamed from: d */
    public final void mo6538d(View view) {
        mo6537c(view);
    }

    /* renamed from: a */
    private final void m15406a(BurstItemView burstItemView) {
        ImageView imageView = burstItemView.f2623a;
        if (imageView == null) {
            bli.m898e(f23660j, "updateView was called with a view that has no burst view!");
            return;
        }
        if (this.f13141g.mo6552e()) {
            cpy.m8718a(((cov) this.f13139e).f4384h, imageView, this.f23666o);
        } else {
            err e = ((cov) this.f13139e).mo12887e();
            if (e != null) {
                m15407b(e.mo6541g()).mo128a(imageView);
            }
        }
        if ((this.f13141g.mo6552e() ^ 1) != 0) {
            burstItemView.f2624b.setVisibility(0);
        } else {
            burstItemView.f2624b.setVisibility(8);
        }
    }
}
