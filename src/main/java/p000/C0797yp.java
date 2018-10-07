package p000;

/* compiled from: PG */
/* renamed from: yp */
final class C0797yp extends abi {
    C0797yp() {
        super(null);
    }

    /* renamed from: a */
    public final void mo58a(int i) {
        aby aby = C0796yo.f22440a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onCameraError called with no handler set: ");
        stringBuilder.append(i);
        abx.m91e(aby, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo60a(RuntimeException runtimeException, String str, int i, int i2) {
        abx.m88b(C0796yo.f22440a, "onCameraException called with no handler set", runtimeException);
    }

    /* renamed from: a */
    public final void mo59a(RuntimeException runtimeException) {
        abx.m88b(C0796yo.f22440a, "onDispatchThreadException called with no handler set", runtimeException);
    }
}
