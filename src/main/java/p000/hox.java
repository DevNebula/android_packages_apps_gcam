package p000;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.zoomui.ZoomMarkerView;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* compiled from: PG */
/* renamed from: hox */
public final class hox implements how, iqo {
    /* renamed from: e */
    private static final String f20223e = bli.m887a("ZoomUiCtrl");
    /* renamed from: a */
    public float f20224a = 1.0f;
    /* renamed from: b */
    public final hpf f20225b = new hom();
    /* renamed from: c */
    public SeekBar f20226c;
    /* renamed from: d */
    public ZoomMarkerView f20227d;
    /* renamed from: f */
    private float f20228f;
    /* renamed from: g */
    private final hpt f20229g = new hot(this.f20225b);
    /* renamed from: h */
    private ImageButton f20230h;
    /* renamed from: i */
    private ImageButton f20231i;
    /* renamed from: j */
    private final ilp f20232j;
    /* renamed from: k */
    private final ikb f20233k = new ikb();
    /* renamed from: l */
    private final boolean f20234l;
    /* renamed from: m */
    private final irs f20235m;
    /* renamed from: n */
    private final hjf f20236n;
    /* renamed from: o */
    private iut f20237o = iut.BACK;
    /* renamed from: p */
    private kbg f20238p = kau.f21835a;
    /* renamed from: q */
    private final ilp f20239q;

    public hox(ilp ilp, ilp ilp2, boolean z, irs irs, hjf hjf) {
        this.f20232j = ilp;
        this.f20234l = z;
        this.f20235m = irs;
        this.f20236n = hjf;
        this.f20239q = ilp2;
    }

    public final void close() {
        this.f20233k.close();
    }

    /* renamed from: a */
    public final void mo7996a() {
        this.f20229g.mo13436c();
    }

    /* renamed from: b */
    public final void mo8001b() {
        this.f20231i.setSoundEffectsEnabled(false);
        this.f20230h.setSoundEffectsEnabled(false);
    }

    /* renamed from: c */
    public final void mo8003c() {
        this.f20229g.mo14951ag();
        if (this.f20234l) {
            this.f20225b.mo14941ah();
        }
    }

    /* renamed from: d */
    public final void mo8005d() {
        this.f20231i.setSoundEffectsEnabled(true);
        this.f20230h.setSoundEffectsEnabled(true);
    }

    /* renamed from: e */
    public final void mo8006e() {
        if (!this.f20234l) {
            this.f20225b.mo13438e();
        }
    }

    /* renamed from: a */
    public final void mo7998a(ZoomUi zoomUi, Context context) {
        this.f20230h = (ImageButton) zoomUi.findViewById(R.id.zoom_minus_button);
        this.f20231i = (ImageButton) zoomUi.findViewById(R.id.zoom_plus_button);
        this.f20226c = zoomUi.mo2760b();
        this.f20227d = zoomUi.mo2759a();
        m12173a(this.f20230h, false);
        m12173a(this.f20231i, true);
        this.f20233k.mo8557a(this.f20232j.mo13672a(new hpb(this), kpq.f8776a));
        this.f20226c.setOnSeekBarChangeListener(new hpc(this));
        ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(context, R.animator.scrolling);
        valueAnimator.addUpdateListener(new hpd(this));
        this.f20225b.mo15547a(this.f20229g, zoomUi, this.f20227d, this.f20232j, this.f20234l, valueAnimator, this.f20235m);
        this.f20229g.mo15548a(zoomUi);
        this.f20229g.mo7343a();
    }

    /* renamed from: f */
    public final void mo8007f() {
        this.f20225b.mo14940ag();
    }

    /* renamed from: a */
    public final void mo7997a(float f) {
        this.f20225b.mo14948b(f);
    }

    /* renamed from: g */
    public final void mo8008g() {
        this.f20225b.mo14947an();
    }

    /* renamed from: h */
    public final void mo8009h() {
        this.f20225b.mo13440g();
    }

    /* renamed from: i */
    public final void mo8010i() {
        this.f20232j.mo8826a(Float.valueOf(this.f20224a));
    }

    /* renamed from: b */
    public final void mo8002b(float f) {
        if (f < this.f20224a) {
            String str = f20223e;
            float f2 = this.f20224a;
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("resetZoom zoomValue=");
            stringBuilder.append(f);
            stringBuilder.append(" minZoomValue=");
            stringBuilder.append(f2);
            bli.m898e(str, stringBuilder.toString());
            f = this.f20224a;
        }
        this.f20232j.mo8826a(Float.valueOf(f));
        this.f20227d.mo2757a(f);
    }

    /* renamed from: l */
    private final void m12175l() {
        float f;
        String str;
        float f2 = this.f20228f;
        if (!this.f20236n.mo7905c()) {
            f = f2;
        } else if (this.f20238p.mo9709b()) {
            inc inc = (inc) this.f20238p.mo9706a();
            if (this.f20237o.equals(iut.FRONT)) {
                f = 5.0f;
            } else if (inc.equals(inc.FPS_30)) {
                f = 5.0f;
            } else if (inc.equals(inc.FPS_60)) {
                f = 3.0f;
            } else if (inc.equals(inc.FPS_120)) {
                f = 3.0f;
            } else if (inc.equals(inc.FPS_240)) {
                f = 3.0f;
            } else {
                str = f20223e;
                String valueOf = String.valueOf(inc);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
                stringBuilder.append("Unknown camcorder capture rate");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
                f = f2;
            }
        } else {
            f = f2;
        }
        String str2 = f20223e;
        str = String.valueOf(this.f20238p);
        String valueOf2 = String.valueOf(this.f20237o);
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(valueOf2).length());
        stringBuilder2.append("Set the max zoom level to ");
        stringBuilder2.append(f);
        stringBuilder2.append(" for ");
        stringBuilder2.append(str);
        stringBuilder2.append(" and ");
        stringBuilder2.append(valueOf2);
        bli.m888a(str2, stringBuilder2.toString());
        this.f20239q.mo8826a(Float.valueOf(f));
        ZoomMarkerView zoomMarkerView = this.f20227d;
        zoomMarkerView.f2643e = f;
        zoomMarkerView.f2639a.f6804i = f;
        this.f20225b.f26485t = f;
    }

    /* renamed from: c */
    public final void mo8004c(float f) {
        if (f < 1.0f) {
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("Invalid min zoom value: ");
            stringBuilder.append(f);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f20224a = f;
        this.f20225b.f26486u = f;
        ZoomMarkerView zoomMarkerView = this.f20227d;
        zoomMarkerView.f2644f = f;
        zoomMarkerView.f2639a.f6805j = f;
        zoomMarkerView.f2641c = f;
        if (((Float) this.f20232j.mo13673b()).floatValue() < f) {
            this.f20232j.mo8826a(Float.valueOf(f));
        }
    }

    /* renamed from: a */
    private final void m12173a(ImageButton imageButton, boolean z) {
        imageButton.setOnClickListener(new hoy(this, z));
        imageButton.setOnLongClickListener(new hoz(this, z));
        imageButton.setOnTouchListener(new hpa(this));
    }

    /* renamed from: a */
    public final void mo8000a(kbg kbg) {
        this.f20238p = kbg;
        m12175l();
    }

    /* renamed from: a */
    public final void mo7999a(ffc ffc) {
        this.f20237o = ffc.mo9064c();
        this.f20228f = ffc.mo9072k();
        m12175l();
    }

    /* renamed from: j */
    public final void mo8011j() {
        this.f20225b.mo14941ah();
        this.f20225b.mo14949b(true);
    }

    /* renamed from: k */
    public final void mo8012k() {
        this.f20225b.mo14941ah();
        this.f20225b.mo14949b(false);
    }
}
