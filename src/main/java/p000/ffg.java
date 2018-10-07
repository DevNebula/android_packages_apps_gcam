package p000;

/* compiled from: PG */
/* renamed from: ffg */
final class ffg implements Runnable {
    /* renamed from: a */
    private final ffe f4758a;
    /* renamed from: b */
    private final /* synthetic */ fff f4759b;

    public ffg(fff fff, ffe ffe) {
        this.f4759b = fff;
        this.f4758a = ffe;
    }

    public final void run() {
        try {
            ird ird = this.f4759b.f4752a;
            String valueOf = String.valueOf(this.f4758a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 8);
            stringBuilder.append("Command#");
            stringBuilder.append(valueOf);
            ird.mo8856a(stringBuilder.toString());
            this.f4758a.mo6771a();
            this.f4759b.f4752a.mo8857b();
        } catch (isr e) {
            this.f4759b.f4752a.mo8857b();
        } catch (InterruptedException e2) {
            this.f4759b.f4752a.mo8857b();
        } catch (Exception e3) {
            this.f4759b.f4753b.execute(new ffh(e3));
            this.f4759b.f4752a.mo8857b();
        } catch (Throwable th) {
            this.f4759b.f4752a.mo8857b();
        }
    }
}
