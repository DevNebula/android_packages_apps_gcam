package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.util.Set;

/* renamed from: hwc */
public abstract class hwc extends hvm implements huo, hwe {
    /* renamed from: l */
    private final Set f24521l;
    /* renamed from: m */
    private final Account f24522m;

    public hwc(Context context, Looper looper, int i, hvx hvx, hus hus, hut hut) {
        this(context, looper, hwf.m3608a(context), hua.f20814a, i, hvx, (hus) htl.m3488b((Object) hus), (hut) htl.m3488b((Object) hut));
    }

    /* renamed from: j */
    public final Account mo8194j() {
        return this.f24522m;
    }

    /* renamed from: n */
    public final zzc[] mo8198n() {
        return new zzc[0];
    }

    /* renamed from: q */
    protected final Set mo8201q() {
        return this.f24521l;
    }

    private hwc(Context context, Looper looper, hwf hwf, hua hua, int i, hvx hvx, hus hus, hut hut) {
        super(context, looper, hwf, hua, i, hus != null ? new hvo(hus) : null, hut != null ? new hvp(hut) : null, hvx.f7116f);
        this.f24522m = hvx.f7111a;
        Set<Scope> set = hvx.f7113c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f24521l = set;
    }
}
