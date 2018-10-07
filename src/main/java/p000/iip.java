package p000;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.zzbz;
import com.google.android.gms.wearable.internal.zzcc;
import com.google.android.gms.wearable.internal.zzh;
import com.google.android.gms.wearable.internal.zzk;
import com.google.android.gms.wearable.internal.zzo;
import com.google.android.gms.wearable.internal.zzs;
import java.util.List;

/* renamed from: iip */
public final class iip extends ihr {
    /* renamed from: a */
    public ieg f24626a;
    /* renamed from: b */
    public final IntentFilter[] f24627b;

    iip(IntentFilter[] intentFilterArr) {
        this.f24627b = (IntentFilter[]) htl.m3488b((Object) intentFilterArr);
    }

    /* renamed from: a */
    public final void mo15003a() {
        iip.m16384a(null);
        iip.m16384a(null);
        iip.m16384a(null);
        iip.m16384a(this.f24626a);
        this.f24626a = null;
        iip.m16384a(null);
        iip.m16384a(null);
        iip.m16384a(null);
        iip.m16384a(null);
    }

    /* renamed from: a */
    public final void mo8479a(DataHolder dataHolder) {
        dataHolder.close();
    }

    /* renamed from: a */
    public final void mo8480a(zzbz zzbz) {
        ieg ieg = this.f24626a;
        if (ieg != null) {
            ieg.mo8404a(new iiq(zzbz));
        }
    }

    /* renamed from: a */
    public final void mo8481a(zzcc zzcc) {
    }

    /* renamed from: a */
    public final void mo8482a(zzh zzh) {
    }

    /* renamed from: a */
    public final void mo8483a(zzk zzk) {
    }

    /* renamed from: a */
    public final void mo8484a(zzo zzo) {
    }

    /* renamed from: a */
    public final void mo8485a(zzs zzs) {
    }

    /* renamed from: a */
    public final void mo8486a(List list) {
    }

    /* renamed from: b */
    public final void mo8487b(zzcc zzcc) {
    }

    /* renamed from: a */
    private static void m16384a(ieg ieg) {
        if (ieg != null) {
            ieg.f7336a = null;
        }
    }
}
