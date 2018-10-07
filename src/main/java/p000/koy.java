package p000;

/* compiled from: PG */
/* renamed from: koy */
final class koy extends knt implements Runnable {
    /* renamed from: e */
    private kpk f26777e;

    koy(kpk kpk) {
        this.f26777e = kpk;
    }

    /* renamed from: a */
    protected final void mo15639a() {
        this.f26777e = null;
    }

    /* renamed from: b */
    protected final String mo15643b() {
        kpk kpk = this.f26777e;
        if (kpk == null) {
            return null;
        }
        String valueOf = String.valueOf(kpk);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
        stringBuilder.append("delegate=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void run() {
        kpk kpk = this.f26777e;
        if (kpk != null) {
            mo15644b(kpk);
        }
    }
}
