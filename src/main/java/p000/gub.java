package p000;

import android.os.StatFs;
import android.os.storage.StorageManager;

/* compiled from: PG */
/* renamed from: gub */
public final class gub {
    /* renamed from: a */
    private static final String f6062a = bli.m887a("PlatformSpaceChk");
    /* renamed from: b */
    private final StorageManager f6063b;
    /* renamed from: c */
    private final ivx f6064c;

    gub(StorageManager storageManager, ivx ivx) {
        this.f6063b = storageManager;
        this.f6064c = ivx;
    }

    /* renamed from: a */
    public final long mo7455a(gsx gsx) {
        try {
            long allocatableBytes;
            if (this.f6064c.f7868c) {
                allocatableBytes = this.f6063b.getAllocatableBytes(this.f6063b.getUuidForPath(gsx.mo7425a()));
            } else {
                StatFs statFs = new StatFs(gsx.mo7426b());
                allocatableBytes = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            }
            String str = f6062a;
            StringBuilder stringBuilder = new StringBuilder(49);
            stringBuilder.append("available space size (byte): ");
            stringBuilder.append(allocatableBytes);
            bli.m888a(str, stringBuilder.toString());
            return allocatableBytes;
        } catch (Exception e) {
            return -1;
        }
    }
}
