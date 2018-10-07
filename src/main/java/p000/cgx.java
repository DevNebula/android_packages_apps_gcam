package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: cgx */
final class cgx implements abn {
    /* renamed from: a */
    private final /* synthetic */ cgu f12476a;

    cgx(cgu cgu) {
        this.f12476a = cgu;
    }

    /* renamed from: a */
    public final void mo64a(int i) {
        bli.m898e(cgu.f12460a, "CameraExceptionHandler: onCameraError");
        Iterator it = this.f12476a.f12470k.iterator();
        while (it.hasNext()) {
            ((abi) it.next()).mo58a(i);
        }
    }

    /* renamed from: a */
    public final void mo66a(RuntimeException runtimeException, String str, int i, int i2) {
        bli.m898e(cgu.f12460a, "CameraExceptionHandler: onCameraException");
        Iterator it = this.f12476a.f12470k.iterator();
        while (it.hasNext()) {
            ((abi) it.next()).mo60a(runtimeException, str, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo65a(RuntimeException runtimeException) {
        bli.m898e(cgu.f12460a, "CameraExceptionHandler: onDispatchThreadException");
        Iterator it = this.f12476a.f12470k.iterator();
        while (it.hasNext()) {
            ((abi) it.next()).mo59a(runtimeException);
        }
    }
}
