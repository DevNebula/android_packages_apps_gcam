package p000;

import android.graphics.Matrix;
import android.view.View.OnLayoutChangeListener;

/* compiled from: PG */
/* renamed from: hao */
public final class hao implements han {
    /* renamed from: a */
    private static final String f19866a = bli.m887a("PrevConAdaptLogger");
    /* renamed from: b */
    private final han f19867b;
    /* renamed from: c */
    private final String f19868c;

    public hao(String str, han han) {
        this.f19867b = han;
        this.f19868c = str;
    }

    /* renamed from: a */
    public final void mo7603a(ham ham) {
        String str = f19866a;
        String str2 = this.f19868c;
        String valueOf = String.valueOf(ham);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 47) + String.valueOf(valueOf).length());
        stringBuilder.append(str2);
        stringBuilder.append("addPreviewAreaSizeChangedListener(listener = ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" )");
        bli.m896d(str, stringBuilder.toString());
        this.f19867b.mo7603a(ham);
    }

    /* renamed from: a */
    public final void mo7599a() {
        bli.m896d(f19866a, String.valueOf(this.f19868c).concat("clearTransform()"));
        this.f19867b.mo7599a();
    }

    /* renamed from: b */
    public final int mo7604b() {
        int b = this.f19867b.mo7604b();
        String str = f19866a;
        String str2 = this.f19868c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 41);
        stringBuilder.append(str2);
        stringBuilder.append("getViewHeight() returns int = ");
        stringBuilder.append(b);
        bli.m896d(str, stringBuilder.toString());
        return b;
    }

    /* renamed from: c */
    public final int mo7606c() {
        int c = this.f19867b.mo7606c();
        String str = f19866a;
        String str2 = this.f19868c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 40);
        stringBuilder.append(str2);
        stringBuilder.append("getViewWidth() returns int = ");
        stringBuilder.append(c);
        bli.m896d(str, stringBuilder.toString());
        return c;
    }

    /* renamed from: d */
    public final kpk mo7607d() {
        bli.m896d(f19866a, String.valueOf(this.f19868c).concat("onModuleActivate()"));
        return this.f19867b.mo7607d();
    }

    /* renamed from: e */
    public final kpk mo7608e() {
        bli.m896d(f19866a, String.valueOf(this.f19868c).concat("onModuleDeactivate()"));
        return this.f19867b.mo7608e();
    }

    /* renamed from: b */
    public final void mo7605b(ham ham) {
        String str = f19866a;
        String str2 = this.f19868c;
        String valueOf = String.valueOf(ham);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 50) + String.valueOf(valueOf).length());
        stringBuilder.append(str2);
        stringBuilder.append("removePreviewAreaSizeChangedListener(listener = ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" )");
        bli.m896d(str, stringBuilder.toString());
        this.f19867b.mo7605b(ham);
    }

    /* renamed from: f */
    public final void mo7609f() {
        bli.m896d(f19866a, String.valueOf(this.f19868c).concat("requestLayout()"));
        this.f19867b.mo7609f();
    }

    /* renamed from: a */
    public final void mo7602a(OnLayoutChangeListener onLayoutChangeListener) {
        String str = f19866a;
        String str2 = this.f19868c;
        String valueOf = String.valueOf(onLayoutChangeListener);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 39) + String.valueOf(valueOf).length());
        stringBuilder.append(str2);
        stringBuilder.append("setOnLayoutChangeListener(listener = ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" )");
        bli.m896d(str, stringBuilder.toString());
        this.f19867b.mo7602a(onLayoutChangeListener);
    }

    /* renamed from: a */
    public final void mo7600a(float f) {
        String str = f19866a;
        String str2 = this.f19868c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 49);
        stringBuilder.append(str2);
        stringBuilder.append("updateAspectRatio(aspectRatio = ");
        stringBuilder.append(f);
        stringBuilder.append(" )");
        bli.m896d(str, stringBuilder.toString());
        this.f19867b.mo7600a(f);
    }

    /* renamed from: a */
    public final void mo7601a(Matrix matrix) {
        String str = f19866a;
        String str2 = this.f19868c;
        String valueOf = String.valueOf(matrix);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 25) + String.valueOf(valueOf).length());
        stringBuilder.append(str2);
        stringBuilder.append("updateTransform(matrix =");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        bli.m896d(str, stringBuilder.toString());
        this.f19867b.mo7601a(matrix);
    }
}
