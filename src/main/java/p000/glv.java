package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: glv */
public final class glv {
    /* renamed from: a */
    private final AtomicInteger f5623a = new AtomicInteger(C0252go.f5826aY - 1);
    /* renamed from: b */
    private final boolean f5624b;

    glv(boolean z) {
        this.f5624b = z;
    }

    /* renamed from: a */
    final void mo7216a(int... iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (this.f5623a.get() == i - 1) {
                z = true;
            }
        }
        int i2 = this.f5623a.get();
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("Invalid session state: ");
        stringBuilder.append(i2);
        jri.m13406b(z, stringBuilder.toString());
    }

    /* renamed from: a */
    final boolean mo7217a() {
        return this.f5623a.get() == C0252go.f5882bb + -1;
    }

    /* renamed from: b */
    final boolean mo7218b() {
        return this.f5623a.get() == C0252go.f5827aZ + -1;
    }

    /* renamed from: a */
    final void mo7214a(int i) {
        this.f5623a.set(i - 1);
    }

    /* renamed from: a */
    final void mo7215a(int i, int i2, String str) {
        int i3 = i - 1;
        if (this.f5623a.getAndSet(i2 - 1) == i3) {
            return;
        }
        if (this.f5624b) {
            throw new IllegalStateException();
        }
        int i4 = this.f5623a.get();
        StringBuilder stringBuilder = new StringBuilder(79);
        stringBuilder.append("Warning: CaptureSession in unexpected state ");
        stringBuilder.append(i4);
        stringBuilder.append("! Expected: ");
        stringBuilder.append(i3);
        stringBuilder.append(".");
        bli.m898e(str, stringBuilder.toString());
    }
}
