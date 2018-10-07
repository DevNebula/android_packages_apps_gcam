package p000;

/* compiled from: PG */
/* renamed from: fns */
final class fns implements iqt {
    /* renamed from: a */
    private int f18497a = -1;
    /* renamed from: b */
    private final /* synthetic */ int f18498b;

    fns(int i) {
        this.f18498b = i;
    }

    /* renamed from: a */
    private final synchronized void m10738a(Integer num) {
        if (num != null) {
            if (this.f18497a != num.intValue()) {
                this.f18497a = num.intValue();
                String str = fnr.f4866a;
                String valueOf = String.valueOf(num);
                int i = this.f18498b;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                stringBuilder.append("Global ticket count: ");
                stringBuilder.append(valueOf);
                stringBuilder.append("/");
                stringBuilder.append(i);
                bli.m888a(str, stringBuilder.toString());
            }
        }
    }
}
