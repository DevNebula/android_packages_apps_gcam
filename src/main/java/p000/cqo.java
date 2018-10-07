package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import java.util.Date;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: cqo */
public final class cqo implements err {
    /* renamed from: a */
    public static long f13152a = -1;
    /* renamed from: b */
    private static final ers f13153b = new exb().mo13194d();
    /* renamed from: c */
    private final LayoutInflater f13154c;
    /* renamed from: d */
    private final Resources f13155d;
    /* renamed from: e */
    private final int f13156e;
    /* renamed from: f */
    private final eru f13157f;
    /* renamed from: g */
    private final ers f13158g;
    /* renamed from: h */
    private final awk f13159h;
    /* renamed from: i */
    private hfz f13160i;
    /* renamed from: j */
    private eri f13161j;
    /* renamed from: k */
    private kpw f13162k;
    /* renamed from: l */
    private View f13163l = null;

    static {
        bli.m887a("PlaceholderItem");
    }

    public cqo(int i, awk awk, int i2, int i3, LayoutInflater layoutInflater, Resources resources) {
        this.f13154c = (LayoutInflater) jri.m13404b((Object) layoutInflater);
        this.f13155d = (Resources) jri.m13404b((Object) resources);
        this.f13156e = i;
        this.f13159h = (awk) jri.m13404b((Object) awk);
        iqp iqp = new iqp(i2, i3);
        Date date = new Date(0);
        Date date2 = new Date(0);
        erj erj = new erj();
        erj.f4344a = true;
        this.f13161j = erj.mo6522a();
        Builder builder = new Builder();
        String uuid = UUID.randomUUID().toString();
        builder.scheme("simple_view_data").appendPath(uuid);
        this.f13157f = new eru(f13152a, uuid, "", date, date2, "", builder.build(), false, kbg.m4804c(iqp), 0, 0, erx.f4403a, false);
        this.f13158g = f13153b;
        this.f13162k = kpw.m18486d();
    }

    /* renamed from: a */
    public final View mo6527a(kbg kbg, hfz hfz, boolean z, cpx cpx) {
        m8759b();
        View view = this.f13163l;
        if (view instanceof ImageView) {
            this.f13162k.mo15641a((ImageView) view);
        } else {
            this.f13162k.mo15642a(new IllegalStateException("Image view future set in placeholder item that does not have an ImageView"));
        }
        this.f13160i = hfz;
        return this.f13163l;
    }

    /* renamed from: a */
    public final boolean mo6532a() {
        return false;
    }

    /* renamed from: b */
    private final synchronized void m8759b() {
        if (this.f13163l == null) {
            ikd.m12501a();
            this.f13163l = (ImageView) this.f13154c.inflate(R.layout.secure_album_placeholder, null);
            this.f13163l.setTag(R.id.mediadata_tag_viewtype, Integer.valueOf(C0252go.f5843ap - 1));
            this.f13163l.setContentDescription(this.f13155d.getString(R.string.accessibility_unlock_to_camera));
        }
    }

    /* renamed from: a */
    public final hio mo6528a(int i, int i2) {
        return new hio(kau.f21835a);
    }

    /* renamed from: f */
    public final ers mo6540f() {
        return this.f13158g;
    }

    /* renamed from: g */
    public final eru mo6541g() {
        return this.f13157f;
    }

    /* renamed from: h */
    public final iqp mo6542h() {
        return this.f13157f.mo6556g();
    }

    /* renamed from: i */
    public final kpk mo6543i() {
        return this.f13162k;
    }

    /* renamed from: e */
    public final int mo6539e() {
        return this.f13156e;
    }

    /* renamed from: j */
    public final kbg mo6544j() {
        return kau.f21835a;
    }

    /* renamed from: k */
    public final eri mo6545k() {
        return this.f13161j;
    }

    /* renamed from: l */
    public final int mo6546l() {
        return this.f13157f.f4387k;
    }

    /* renamed from: a */
    public final boolean mo6533a(cfh cfh, cre cre) {
        awk awk = this.f13159h;
        awk.f1008a.putExtra("filmstrip_index", this.f13160i.mo7832c() - 1);
        awk.mo1815a();
        return true;
    }

    /* renamed from: a */
    public final void mo6529a(View view) {
    }

    /* renamed from: c */
    public final err mo6536c() {
        return this;
    }

    /* renamed from: b */
    public final void mo6535b(View view) {
    }

    /* renamed from: c */
    public final void mo6537c(View view) {
    }

    /* renamed from: a */
    public final void mo6530a(View view, Bitmap bitmap) {
    }

    /* renamed from: d */
    public final void mo6538d(View view) {
    }

    /* renamed from: a */
    public final void mo6531a(eri eri) {
        this.f13161j = eri;
    }

    /* renamed from: b */
    public final void mo6534b(int i, int i2) {
    }

    /* renamed from: m */
    public final void mo6547m() {
    }
}
