package p000;

/* compiled from: PG */
/* renamed from: uv */
public final class C0528uv {
    /* renamed from: a */
    public int f9855a = -1;
    /* renamed from: b */
    public int f9856b = 0;
    /* renamed from: c */
    public int f9857c = 0;
    /* renamed from: d */
    public int f9858d = 1;
    /* renamed from: e */
    public int f9859e = 0;
    /* renamed from: f */
    public boolean f9860f = false;
    /* renamed from: g */
    public boolean f9861g = false;
    /* renamed from: h */
    public boolean f9862h = false;
    /* renamed from: i */
    public boolean f9863i = false;
    /* renamed from: j */
    public boolean f9864j = false;
    /* renamed from: k */
    public boolean f9865k = false;
    /* renamed from: l */
    public int f9866l;
    /* renamed from: m */
    public long f9867m;
    /* renamed from: n */
    public int f9868n;

    /* renamed from: a */
    public final void mo11305a(int i) {
        if ((this.f9858d & i) == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Layout state should be one of ");
            stringBuilder.append(Integer.toBinaryString(i));
            stringBuilder.append(" but it is ");
            stringBuilder.append(Integer.toBinaryString(this.f9858d));
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final int mo11304a() {
        return this.f9861g ? this.f9856b - this.f9857c : this.f9859e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("State{mTargetPosition=");
        stringBuilder.append(this.f9855a);
        stringBuilder.append(", mData=");
        stringBuilder.append(null);
        stringBuilder.append(", mItemCount=");
        stringBuilder.append(this.f9859e);
        stringBuilder.append(", mIsMeasuring=");
        stringBuilder.append(this.f9863i);
        stringBuilder.append(", mPreviousLayoutItemCount=");
        stringBuilder.append(this.f9856b);
        stringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        stringBuilder.append(this.f9857c);
        stringBuilder.append(", mStructureChanged=");
        stringBuilder.append(this.f9860f);
        stringBuilder.append(", mInPreLayout=");
        stringBuilder.append(this.f9861g);
        stringBuilder.append(", mRunSimpleAnimations=");
        stringBuilder.append(this.f9864j);
        stringBuilder.append(", mRunPredictiveAnimations=");
        stringBuilder.append(this.f9865k);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
