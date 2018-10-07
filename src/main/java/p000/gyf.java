package p000;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.google.android.apps.camera.p005ui.gridlines.GridLinesUi;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: gyf */
public final class gyf {
    /* renamed from: a */
    public final RectF f6157a = new RectF();
    /* renamed from: b */
    public gxj f6158b;
    /* renamed from: c */
    public final View f6159c;
    /* renamed from: d */
    public final gxm f6160d;
    /* renamed from: e */
    public final gxm f6161e;
    /* renamed from: f */
    public final gyd f6162f;
    /* renamed from: g */
    public final gyd f6163g;
    /* renamed from: h */
    public final gxm f6164h;
    /* renamed from: i */
    public final gyd f6165i;

    public gyf(GridLinesUi gridLinesUi, Paint paint, Paint paint2) {
        this.f6159c = gridLinesUi;
        this.f6160d = new gxm(paint);
        this.f6161e = new gxm(paint);
        this.f6162f = new gyd(paint, (byte) 0);
        this.f6163g = new gyd(paint, (byte) 0);
        this.f6164h = new gxm(paint2);
        this.f6165i = new gyd(paint2, (byte) 0);
    }

    /* renamed from: a */
    public final void mo7540a(gxj gxj) {
        this.f6158b = gxj;
        mo7539a();
        this.f6159c.invalidate();
    }

    /* renamed from: a */
    public final void mo7539a() {
        int i = 0;
        gyd gyd = this.f6160d;
        gxj gxj = this.f6158b;
        boolean z = gxj.f6125i;
        gyd.f6155b = z;
        this.f6161e.f6155b = z;
        this.f6162f.f6155b = z;
        this.f6163g.f6155b = z;
        gyd gyd2 = this.f6164h;
        gyd2.f6155b = z;
        this.f6165i.f6155b = z;
        gyd2.mo7537a(!gxj.f6124h ? 0 : Illuminant.kOther);
        gyd = this.f6165i;
        if (this.f6158b.f6124h) {
            i = Illuminant.kOther;
        }
        gyd.mo7537a(i);
        this.f6158b.mo7502a(this.f6157a);
        gyd = this.f6160d;
        gxj gxj2 = this.f6158b;
        gyd.f6154a = gxj2.f6117a;
        this.f6161e.f6154a = gxj2.f6118b;
        this.f6162f.f6154a = gxj2.f6119c;
        this.f6163g.f6154a = gxj2.f6120d;
        this.f6164h.f6154a = gxj2.f6121e;
        this.f6165i.f6154a = gxj2.f6122f;
        this.f6159c.invalidate();
    }
}
