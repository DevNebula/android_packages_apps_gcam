package p000;

import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: ckb */
final class ckb implements kov {
    /* renamed from: a */
    private final /* synthetic */ ckd f12652a;

    ckb(ckd ckd) {
        this.f12652a = ckd;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m892b(cjq.f12640a, "Failed to set or retrieve BurstChip.", th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        BurstChip burstChip = (BurstChip) obj;
        burstChip.post(new ckc(this.f12652a, burstChip));
    }
}
