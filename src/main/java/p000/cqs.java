package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cqs */
public final class cqs extends cpy {
    /* renamed from: a */
    private static final String f23678a = bli.m887a("VideoItem");
    /* renamed from: j */
    private static final ers f23679j = new exb().mo13193a(ert.CAN_SHARE).mo13193a(ert.CAN_PLAY).mo13193a(ert.CAN_DELETE).mo13193a(ert.CAN_SWIPE_AWAY).mo13193a(ert.HAS_DETAILED_CAPTURE_INFO).mo13193a(ert.IS_VIDEO).mo13194d();
    /* renamed from: k */
    private final cqx f23680k;
    /* renamed from: l */
    private iqp f23681l;

    public cqs(Context context, cqb cqb, cqv cqv, cqx cqx) {
        super(context, cqb, cqv, f23679j);
        this.f23680k = cqx;
    }

    /* renamed from: a */
    public final View mo6527a(kbg kbg, hfz hfz, boolean z, cpx cpx) {
        View view;
        cqu e;
        cqu cqu;
        View view2;
        if (kbg.mo9709b()) {
            View view3 = (View) kbg.mo9706a();
            view = view3;
            e = cqs.m15444e(view3);
        } else {
            Object e2 = null;
            view = null;
        }
        if (e2 == null) {
            View inflate = LayoutInflater.from(this.f13137c).inflate(R.layout.filmstrip_video, null);
            inflate.setTag(R.id.mediadata_tag_viewtype, Integer.valueOf(C0252go.f5842ao - 1));
            cqu cqu2 = new cqu((ImageView) inflate.findViewById(R.id.video_view), (ImageView) inflate.findViewById(R.id.play_button));
            inflate.setTag(R.id.mediadata_tag_target, cqu2);
            cqu = cqu2;
            view2 = inflate;
        } else {
            view2 = view;
            cqu = e2;
        }
        if (cqu == null) {
            bli.m898e(f23678a, "getView called with a view that is not compatible with VideoItem.");
        } else {
            cqu.f2778b.setOnClickListener(new cqt(this, cpx));
            view2.setContentDescription(this.f13137c.getResources().getString(R.string.video_date_content_description, new Object[]{f13136b.format(((cqv) this.f13139e).f4382f)}));
        }
        this.f13143i.mo15641a(cqu.f2777a);
        mo6537c(view2);
        return view2;
    }

    /* renamed from: a */
    public final boolean mo6532a() {
        ContentResolver contentResolver = this.f13137c.getContentResolver();
        Uri uri = cqr.f2773a;
        long j = ((cqv) this.f13139e).f4378b;
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("_id=");
        stringBuilder.append(j);
        return super.mo6532a() || contentResolver.delete(uri, stringBuilder.toString(), null) > 0;
    }

    /* renamed from: a */
    public final hio mo6528a(int i, int i2) {
        try {
            return new hio(kbg.m4803b((Bitmap) this.f13138d.mo5664a().mo124a(this.f13138d.mo5665a(cpy.m8717a(this.f13139e), mo6542h())).mo125a(((cqv) this.f13139e).f4384h).mo126a((int) kvl.UNSET_ENUM_VALUE, (int) kvl.UNSET_ENUM_VALUE).get()));
        } catch (InterruptedException e) {
            bli.m891b(f23678a, "Fails to generate thumbnail");
            return new hio(kau.f21835a);
        } catch (ExecutionException e2) {
            bli.m891b(f23678a, "Fails to generate thumbnail");
            return new hio(kau.f21835a);
        }
    }

    /* renamed from: b */
    private final int m15442b() {
        int i = this.f13140f.f4343b.f4347d;
        if (i > 0) {
            return i;
        }
        return ((cqv) this.f13139e).mo6556g().f7696b;
    }

    /* renamed from: d */
    private final int m15443d() {
        int i = this.f13140f.f4343b.f4346c;
        if (i > 0) {
            return i;
        }
        return ((cqv) this.f13139e).mo6556g().f7695a;
    }

    /* renamed from: h */
    public final iqp mo6542h() {
        int b;
        int d;
        if (m15445n()) {
            b = m15442b();
        } else {
            b = m15443d();
        }
        if (m15445n()) {
            d = m15443d();
        } else {
            d = m15442b();
        }
        iqp iqp = this.f23681l;
        if (!(iqp != null && b == iqp.f7695a && d == iqp.f7696b)) {
            this.f23681l = new iqp(b, d);
        }
        return this.f23681l;
    }

    /* renamed from: e */
    public final int mo6539e() {
        return C0252go.f5842ao;
    }

    /* renamed from: j */
    public final kbg mo6544j() {
        kbg j = super.mo6544j();
        if (j.mo9709b()) {
            ((cqd) j.mo9706a()).mo5667a(8, cqd.m1450a(this.f13137c, TimeUnit.MILLISECONDS.toSeconds(((cqv) this.f13139e).f13165a)));
        }
        return j;
    }

    /* renamed from: e */
    private static cqu m15444e(View view) {
        Object tag = view.getTag(R.id.mediadata_tag_target);
        return (tag == null || !(tag instanceof cqu)) ? null : (cqu) tag;
    }

    /* renamed from: n */
    private final boolean m15445n() {
        String str = this.f13140f.f4343b.f4345b;
        if ("90".equals(str) || "270".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo6529a(View view) {
        super.mo6529a(view);
        cqu e = cqs.m15444e(view);
        if (e != null) {
            acc.m100b(this.f13137c).mo11610a(e.f2777a);
        }
    }

    /* renamed from: c */
    public final err mo6536c() {
        return this.f23680k.mo12895a(((cqv) this.f13139e).f4384h);
    }

    /* renamed from: b */
    public final void mo6535b(View view) {
    }

    /* renamed from: c */
    public final void mo6537c(View view) {
        cqu e = cqs.m15444e(view);
        if (e != null) {
            this.f13138d.mo5664a().mo124a(this.f13138d.mo5665a(cpy.m8717a(this.f13139e), mo6542h())).mo125a(((cqv) this.f13139e).f4384h).mo128a(e.f2777a).mo12303a();
        }
    }

    /* renamed from: a */
    public final void mo6530a(View view, Bitmap bitmap) {
        cqu e = cqs.m15444e(view);
        if (e != null) {
            this.f13138d.mo5664a().mo124a(this.f13138d.mo5665a(cpy.m8717a(this.f13139e), mo6542h())).mo124a(new aqg().mo1701a(new BitmapDrawable(this.f13137c.getResources(), bitmap))).mo125a(((cqv) this.f13139e).f4384h).mo128a(e.f2777a).mo12303a();
        }
    }

    /* renamed from: d */
    public final void mo6538d(View view) {
        cqu e = cqs.m15444e(view);
        if (e != null) {
            this.f13138d.mo5664a().mo124a(this.f13138d.mo5665a(cpy.m8717a(this.f13139e), mo6542h())).mo125a(((cqv) this.f13139e).f4384h).mo128a(e.f2777a);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(((cqv) this.f13139e).toString());
        String str = "VideoItem: ";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}
