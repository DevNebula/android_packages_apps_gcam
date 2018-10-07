package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: tb */
final class C0488tb {
    /* renamed from: a */
    public C0503tt f9762a;
    /* renamed from: b */
    public int f9763b;
    /* renamed from: c */
    public int f9764c;
    /* renamed from: d */
    public boolean f9765d;
    /* renamed from: e */
    public boolean f9766e;

    C0488tb() {
        mo11136b();
    }

    /* renamed from: a */
    final void mo11134a() {
        int b;
        if (this.f9765d) {
            b = this.f9762a.mo11171b();
        } else {
            b = this.f9762a.mo11179f();
        }
        this.f9764c = b;
    }

    /* renamed from: a */
    public final void mo11135a(View view, int i) {
        if (this.f9765d) {
            this.f9764c = this.f9762a.mo11169a(view) + this.f9762a.mo11182h();
        } else {
            this.f9764c = this.f9762a.mo11176d(view);
        }
        this.f9763b = i;
    }

    /* renamed from: b */
    public final void mo11137b(View view, int i) {
        int h = this.f9762a.mo11182h();
        if (h >= 0) {
            mo11135a(view, i);
            return;
        }
        this.f9763b = i;
        int b;
        int i2;
        int f;
        if (this.f9765d) {
            h = (this.f9762a.mo11171b() - h) - this.f9762a.mo11169a(view);
            this.f9764c = this.f9762a.mo11171b() - h;
            if (h > 0) {
                b = this.f9762a.mo11172b(view);
                i2 = this.f9764c;
                f = this.f9762a.mo11179f();
                b = (i2 - b) - (Math.min(this.f9762a.mo11176d(view) - f, 0) + f);
                if (b < 0) {
                    this.f9764c = Math.min(h, -b) + this.f9764c;
                    return;
                }
                return;
            }
            return;
        }
        b = this.f9762a.mo11176d(view);
        i2 = b - this.f9762a.mo11179f();
        this.f9764c = b;
        if (i2 > 0) {
            f = this.f9762a.mo11172b(view);
            int b2 = this.f9762a.mo11171b();
            h = (this.f9762a.mo11171b() - Math.min(0, (b2 - h) - this.f9762a.mo11169a(view))) - (b + f);
            if (h < 0) {
                this.f9764c -= Math.min(i2, -h);
            }
        }
    }

    /* renamed from: b */
    final void mo11136b() {
        this.f9763b = -1;
        this.f9764c = kvl.UNSET_ENUM_VALUE;
        this.f9765d = false;
        this.f9766e = false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnchorInfo{mPosition=");
        stringBuilder.append(this.f9763b);
        stringBuilder.append(", mCoordinate=");
        stringBuilder.append(this.f9764c);
        stringBuilder.append(", mLayoutFromEnd=");
        stringBuilder.append(this.f9765d);
        stringBuilder.append(", mValid=");
        stringBuilder.append(this.f9766e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
