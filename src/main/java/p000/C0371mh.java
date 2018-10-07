package p000;

/* compiled from: PG */
/* renamed from: mh */
final class C0371mh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0713mg f9194a;

    C0371mh(C0713mg c0713mg) {
        this.f9194a = c0713mg;
    }

    public final void run() {
        C0713mg c0713mg = this.f9194a;
        if ((c0713mg.f22073p & 1) != 0) {
            c0713mg.mo14221d(0);
        }
        c0713mg = this.f9194a;
        if ((c0713mg.f22073p & 4096) != 0) {
            c0713mg.mo14221d(108);
        }
        c0713mg = this.f9194a;
        c0713mg.f22072o = false;
        c0713mg.f22073p = 0;
    }
}
