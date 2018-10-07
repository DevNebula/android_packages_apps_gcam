package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.widget.PhotoItemView;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@TargetApi(4)
/* compiled from: PG */
/* renamed from: cql */
public final class cql extends cpy {
    /* renamed from: j */
    private static final String f23670j = bli.m887a("PhotoItem");
    /* renamed from: k */
    private static final ers f23671k = new exb().mo13193a(ert.CAN_SHARE).mo13193a(ert.CAN_DELETE).mo13193a(ert.CAN_SWIPE_AWAY).mo13193a(ert.CAN_ZOOM_IN_PLACE).mo13193a(ert.HAS_DETAILED_CAPTURE_INFO).mo13193a(ert.IS_IMAGE).mo13193a(ert.IS_ANIMATION).mo13194d();
    /* renamed from: l */
    private static final ers f23672l = new exb().mo13193a(ert.CAN_EDIT).mo13193a(ert.CAN_SHARE).mo13193a(ert.CAN_DELETE).mo13193a(ert.CAN_SWIPE_AWAY).mo13193a(ert.CAN_ZOOM_IN_PLACE).mo13193a(ert.HAS_DETAILED_CAPTURE_INFO).mo13193a(ert.IS_IMAGE).mo13194d();
    /* renamed from: m */
    private static final ers f23673m = new exb().mo13193a(ert.IS_RENDERING).mo13193a(ert.CAN_DELETE).mo13194d();
    /* renamed from: n */
    private static final ers f23674n = new exb().mo13193a(ert.IS_RENDERING).mo13194d();
    /* renamed from: a */
    public kbg f23675a;
    /* renamed from: o */
    private final cqm f23676o;
    /* renamed from: p */
    private final gsp f23677p;

    public cql(Context context, cqb cqb, eru eru, cqm cqm, gsp gsp) {
        ers ers;
        if (eru.f4385i) {
            if (eru.f4389m) {
                ers = f23673m;
            } else {
                ers = f23674n;
            }
        } else if (ixx.m4391a(eru.f4380d) == ixx.GIF) {
            ers = f23671k;
        } else {
            ers = f23672l;
        }
        super(context, cqb, eru, ers);
        this.f23675a = kau.f21835a;
        this.f23676o = (cqm) jri.m13404b((Object) cqm);
        this.f23677p = (gsp) jri.m13404b((Object) gsp);
    }

    /* renamed from: a */
    public final View mo6527a(kbg kbg, hfz hfz, boolean z, cpx cpx) {
        View view;
        View view2;
        if (kbg.mo9709b()) {
            view = (View) kbg.mo9706a();
            if (view instanceof PhotoItemView) {
                view = (PhotoItemView) view;
            } else {
                bli.m898e(f23670j, "getView was called with a view that is not an ImageView!");
                view = null;
            }
        } else {
            view = null;
        }
        if (view == null) {
            view = (PhotoItemView) LayoutInflater.from(this.f13137c).inflate(R.layout.photo_item_view, null, false);
            view.setTag(R.id.mediadata_tag_viewtype, Integer.valueOf(C0252go.f5841an - 1));
            view2 = view;
        } else {
            view2 = view;
        }
        mo6537c(view2);
        ImageView a = view2.mo2747a();
        if (this.f13141g.mo6552e()) {
            a.setContentDescription(this.f13137c.getResources().getString(R.string.media_processing_content_description));
        } else {
            int i;
            erj erj = this.f13140f.f4343b;
            if (erj.f4349f) {
                i = R.string.panorama_date_content_description;
            } else if (erj.f4350g) {
                i = R.string.panorama_date_content_description;
            } else {
                i = !erj.f4351h ? erj.f4352i ? R.string.refocus_date_content_description : R.string.photo_date_content_description : R.string.photosphere_date_content_description;
            }
            a.setContentDescription(this.f13137c.getResources().getString(i, new Object[]{f13136b.format(this.f13139e.f4382f)}));
        }
        this.f13143i.mo15641a(view2.mo2747a());
        if (view2.f2629a == null) {
            view2.f2629a = (ImageView) view2.findViewById(R.id.photo_sphere_center_badge);
        }
        ImageView imageView = view2.f2629a;
        if (this.f13140f.f4343b.f4351h) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        return view2;
    }

    /* renamed from: a */
    public final boolean mo6532a() {
        ContentResolver contentResolver = this.f13137c.getContentResolver();
        Uri uri = cqk.f2769a;
        long j = this.f13139e.f4378b;
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("_id=");
        stringBuilder.append(j);
        return super.mo6532a() || contentResolver.delete(uri, stringBuilder.toString(), null) > 0;
    }

    /* renamed from: a */
    public final hio mo6528a(int i, int i2) {
        String str;
        String valueOf;
        eru eru = this.f13139e;
        if (this.f13141g.mo6552e()) {
            kbg c = this.f23677p.mo7412c(eru.f4384h);
            if (c.mo9709b()) {
                return new hio(kbg.m4803b(hid.m3223a(((anq) c.mo9706a()).mo262b())));
            }
            return new hio(kau.f21835a);
        }
        try {
            InputStream fileInputStream = new FileInputStream(eru.f4383g);
            int i3 = eru.mo6556g().f7695a;
            int i4 = eru.mo6556g().f7696b;
            int i5 = eru.f4387k;
            Point a = hjg.m3257a(i3, i4, i5, i, i2);
            if (i5 % MediaDecoder.ROTATE_180 != 0) {
                i3 = a.x;
                a.x = a.y;
                a.y = i3;
            }
            Bitmap a2 = cpz.m1444a(fileInputStream, eru.mo6556g().f7695a, eru.mo6556g().f7696b, (int) (((float) a.x) * 0.7f), (int) (((double) a.y) * 0.7d), eru.f4387k);
            try {
                fileInputStream.close();
            } catch (IOException e) {
                str = f23670j;
                valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("Failed to close the stream.");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
            }
            return new hio(kbg.m4803b(a2));
        } catch (FileNotFoundException e2) {
            String str2 = f23670j;
            valueOf = String.valueOf(eru.f4383g);
            str = "File not found:";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            bli.m891b(str2, valueOf);
            return new hio(kau.f21835a);
        }
    }

    /* renamed from: e */
    public final int mo6539e() {
        return C0252go.f5841an;
    }

    /* renamed from: j */
    public final kbg mo6544j() {
        kbg j = super.mo6544j();
        if (j.mo9709b()) {
            cqd cqd = (cqd) j.mo9706a();
            if (ixx.m4391a(this.f13139e.f4380d) == ixx.JPEG) {
                cqd.m1452a(cqd, this.f13139e.f4383g);
            }
        }
        return j;
    }

    /* renamed from: a */
    public static eru m15428a(Uri uri, iqp iqp, long j, boolean z, kbg kbg) {
        Date date = new Date(j);
        erv erv = (erv) ((erv) new erv(uri).mo6559a(date)).mo6561b(date);
        erv.f4400i = iqp;
        erv = (erv) ((erv) erv.mo6562c()).mo6563d();
        erv.f4402k = z;
        erv = (erv) erv.mo6562c();
        if (kbg.mo9709b()) {
            erv.mo6558a(((Long) kbg.mo9706a()).longValue());
        }
        return erv.mo6560b();
    }

    /* renamed from: a */
    public final boolean mo6533a(cfh cfh, cre cre) {
        if (!this.f13140f.f4343b.f4351h) {
            return false;
        }
        cfh.mo12468a(this.f13139e.f4384h);
        return true;
    }

    /* renamed from: a */
    public final void mo6529a(View view) {
        super.mo6529a(view);
        acc.m100b(this.f13137c).mo11610a(view);
        if (this.f23675a.mo9709b()) {
            this.f23675a = kau.f21835a;
        }
    }

    /* renamed from: c */
    public final err mo6536c() {
        if (!this.f13141g.mo6552e()) {
            return this.f23676o.mo12891a(this.f13139e.f4384h);
        }
        if (this.f23677p.mo7414e(this.f13139e.f4384h) != null) {
            return this.f23676o.mo12892a(this.f13139e.f4384h, this.f13139e.f4389m, kbg.m4804c(Long.valueOf(this.f13139e.f4378b)));
        }
        bli.m898e(f23670j, "Cannot refresh item, session does not exist.");
        return this;
    }

    /* renamed from: b */
    public final void mo6535b(View view) {
        if (!(view instanceof PhotoItemView)) {
            bli.m898e(f23670j, "renderFullRes was called with an object that is not an ImageView!");
        } else if (this.f13141g.mo6552e()) {
            cpy.m8718a(this.f13139e.f4384h, ((PhotoItemView) view).mo2747a(), this.f23677p);
        } else {
            Object obj = this.f13139e.f4384h;
            iqp g = this.f13139e.mo6556g();
            cqb cqb = this.f13138d;
            adl a = cpy.m8717a(this.f13139e);
            g = cqb.m1445a(g, (double) cqb.f2759d, cqb.m1446c());
            acj a2 = this.f13138d.mo5666b().mo124a(new aqg().mo1695a(a).mo1704b(cqb.f2754a).mo1709e().mo1705b(g.f7695a, g.f7696b).mo1706c());
            a2.f238c = m15427a((Uri) obj);
            a2.mo125a(obj).mo128a(((PhotoItemView) view).mo2747a());
        }
    }

    /* renamed from: a */
    private final acj m15427a(Uri uri) {
        aqg aqg;
        aqg a = this.f13138d.mo5665a(cpy.m8717a(this.f13139e), this.f13142h);
        if (this.f13139e == null) {
            aqg = a;
        } else if (ixx.m4391a(this.f13139e.f4380d) == ixx.GIF) {
            aqg = a.mo1708d();
        } else {
            aqg = a;
        }
        if (this.f23675a.mo9709b()) {
            aqg.mo1701a(((anq) this.f23675a.mo9706a()).mo262b());
            return this.f13138d.mo5666b().mo124a(aqg).mo125a((Object) uri);
        }
        acj a2 = this.f13138d.mo5666b().mo124a(aqg);
        a2.f238c = m15429b(uri);
        return a2.mo125a((Object) uri);
    }

    /* renamed from: c */
    public final void mo6537c(View view) {
        if (!(view instanceof PhotoItemView)) {
            bli.m898e(f23670j, "renderThumbnail was called with an object that is not an ImageView!");
        } else if (this.f13141g.mo6552e()) {
            cpy.m8718a(this.f13139e.f4384h, ((PhotoItemView) view).mo2747a(), this.f23677p);
        } else {
            m15427a(this.f13139e.f4384h).mo128a(((PhotoItemView) view).mo2747a());
        }
    }

    /* renamed from: a */
    public final void mo6530a(View view, Bitmap bitmap) {
    }

    /* renamed from: d */
    public final void mo6538d(View view) {
        if (!(view instanceof PhotoItemView)) {
            bli.m898e(f23670j, "renderTiny was called with an object that is not an ImageView!");
        } else if (this.f13141g.mo6552e()) {
            cpy.m8718a(this.f13139e.f4384h, ((PhotoItemView) view).mo2747a(), this.f23677p);
        } else {
            m15429b(this.f13139e.f4384h).mo128a(((PhotoItemView) view).mo2747a());
        }
    }

    /* renamed from: b */
    private final acj m15429b(Uri uri) {
        cqb cqb = this.f13138d;
        adl a = cpy.m8717a(this.f13139e);
        iqp a2 = cqb.m1445a(cqb.f2757b, (double) cqb.f2758c, cqb.m1446c());
        return this.f13138d.mo5666b().mo124a(new aqg().mo1695a(a).mo1704b(cqb.f2754a).mo1709e().mo1705b(a2.f7695a, a2.f7696b).mo1706c()).mo125a((Object) uri);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13139e.toString());
        String str = "PhotoItem: ";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }
}
