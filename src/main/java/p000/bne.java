package p000;

import com.google.android.GoogleCamera.R;

/* renamed from: bne */
final /* synthetic */ class bne implements Runnable {
    /* renamed from: a */
    private final bnh f1362a;
    /* renamed from: b */
    private final bnk f1363b;

    bne(bnh bnh, bnk bnk) {
        this.f1362a = bnh;
        this.f1363b = bnk;
    }

    public final void run() {
        bnh bnh = this.f1362a;
        bnk bnk = this.f1363b;
        bnh.f1375k = bnk.mo12399g();
        if (bnh.f1375k != null) {
            bnh.f1365a.mo13362a(bnh.f1375k);
        } else {
            String valueOf = String.valueOf(bnk.f11580b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
            stringBuilder.append("Error: Could not decode thumbnail image: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("!");
            bli.m891b("BurstController", stringBuilder.toString());
        }
        bnh.f1365a.mo13370a(hci.m11979a((int) R.string.burst_process_creation, new Object[0]));
    }
}
