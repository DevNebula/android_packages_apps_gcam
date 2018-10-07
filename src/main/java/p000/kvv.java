package p000;

/* compiled from: PG */
/* renamed from: kvv */
final class kvv implements Runnable {
    /* renamed from: a */
    private kvt f9080a;
    /* renamed from: b */
    private int f9081b;
    /* renamed from: c */
    private int f9082c;
    /* renamed from: d */
    private final /* synthetic */ kvr f9083d;

    kvv(kvr kvr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.f9083d = kvr;
        kvr.f9044c = C0252go.f5916ci;
        this.f9080a = new kvt(kvr.f9048g);
        kvr.f9043b.getValues(kvr.f9047f);
        float[] fArr = kvr.f9047f;
        int i7 = (int) fArr[2];
        int i8 = (int) fArr[5];
        float d = kvr.mo10535d();
        int i9 = kvr.f9050i;
        if (d <= ((float) i9)) {
            i3 = i7;
            i4 = i7;
        } else {
            i4 = i9 - ((int) kvr.mo10535d());
            i3 = 0;
        }
        d = kvr.mo10533c();
        i9 = kvr.f9051j;
        if (d <= ((float) i9)) {
            i5 = i8;
            i6 = i8;
        } else {
            i6 = i9 - ((int) kvr.mo10533c());
            i5 = 0;
        }
        this.f9080a.f9069a.fling(i7, i8, i, i2, i4, i3, i6, i5);
        this.f9081b = i7;
        this.f9082c = i8;
    }

    /* renamed from: a */
    public final void mo10550a() {
        if (this.f9080a != null) {
            this.f9083d.f9044c = C0252go.f5913cf;
            this.f9080a.f9069a.forceFinished(true);
        }
    }

    public final void run() {
        if (this.f9080a.f9069a.isFinished()) {
            this.f9080a = null;
            return;
        }
        kvt kvt = this.f9080a;
        kvt.f9069a.computeScrollOffset();
        if (kvt.f9069a.computeScrollOffset()) {
            int currX = this.f9080a.f9069a.getCurrX();
            int currY = this.f9080a.f9069a.getCurrY();
            int i = this.f9081b;
            int i2 = this.f9082c;
            this.f9081b = currX;
            this.f9082c = currY;
            this.f9083d.f9043b.postTranslate((float) (currX - i), (float) (currY - i2));
            this.f9083d.mo10532b();
            kvr kvr = this.f9083d;
            kvr.setImageMatrix(kvr.f9043b);
            this.f9083d.postOnAnimation(this);
        }
    }
}
