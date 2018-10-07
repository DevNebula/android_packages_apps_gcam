package p000;

/* compiled from: PG */
/* renamed from: fmz */
final class fmz implements ixg {
    /* renamed from: a */
    private final /* synthetic */ fmw f18475a;

    fmz(fmw fmw) {
        this.f18475a = fmw;
    }

    /* renamed from: a */
    public final void mo9149a() {
        Object obj = (fyr) this.f18475a.f18471a.poll();
        jri.m13391a(obj, (Object) "ImageWriter.ImageListener#onInputImageReleased called, but there are no in-flight images!");
        obj.close();
    }
}
