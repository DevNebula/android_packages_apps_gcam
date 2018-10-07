package p000;

import com.google.android.apps.camera.jni.lensoffset.LensOffsetQueueNative;

/* compiled from: PG */
/* renamed from: cdl */
public final class cdl implements cdk {
    /* renamed from: a */
    private static final String f12214a = bli.m887a("LensOffsetQueueImpl");
    /* renamed from: b */
    private final long f12215b;
    /* renamed from: c */
    private boolean f12216c;

    public cdl(int i, iqp iqp) {
        cdm cdm = new cdm();
        this(i, iqp, (byte) 0);
    }

    private cdl(int i, iqp iqp, byte b) {
        this.f12215b = LensOffsetQueueNative.createHandle(i, iqp.f7695a, iqp.f7696b);
        this.f12216c = false;
    }

    public final synchronized void close() {
        if (!this.f12216c) {
            LensOffsetQueueNative.releaseHandle(this.f12215b);
            this.f12216c = true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo2266a(long j, float f, float f2) {
        boolean z;
        if (this.f12216c) {
            z = false;
        } else {
            z = LensOffsetQueueNative.processAndEnqueueLensOffset(this.f12215b, j, f, f2);
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized float[] mo2267a(long j) {
        float[] fArr;
        fArr = new float[]{0.0f, 0.0f};
        if (!this.f12216c) {
            if (!LensOffsetQueueNative.getLensOffsetAtTime(this.f12215b, j, fArr)) {
                String str = f12214a;
                StringBuilder stringBuilder = new StringBuilder(67);
                stringBuilder.append("Lens offset cannot be computed for timestamp = ");
                stringBuilder.append(j);
                bli.m898e(str, stringBuilder.toString());
            }
        }
        return fArr;
    }

    /* renamed from: a */
    public final synchronized float[] mo2268a(long j, long j2) {
        float[] fArr;
        int i = 0;
        synchronized (this) {
            fArr = new float[]{0.0f, 0.0f};
            if (!this.f12216c) {
                if (j2 >= 2000000) {
                    long j3 = j2 / 2;
                    j3 += j;
                    float[] fArr2 = new float[]{0.0f, 0.0f};
                    for (long j4 = j - j3; j4 < j3; j4 += 2000000) {
                        if (!LensOffsetQueueNative.getLensOffsetAtTime(this.f12215b, j, fArr2)) {
                            String str = f12214a;
                            StringBuilder stringBuilder = new StringBuilder(61);
                            stringBuilder.append("Invalid timestamp ");
                            stringBuilder.append(j);
                            stringBuilder.append(": used an approximation");
                            bli.m898e(str, stringBuilder.toString());
                        }
                        fArr[0] = fArr[0] + fArr2[0];
                        fArr[1] = fArr[1] + fArr2[1];
                        i++;
                    }
                    if (i > 0) {
                        float f = (float) i;
                        fArr[0] = fArr[0] / f;
                        fArr[1] = fArr[1] / f;
                    }
                } else if (!LensOffsetQueueNative.getLensOffsetAtTime(this.f12215b, j, fArr)) {
                    String str2 = f12214a;
                    StringBuilder stringBuilder2 = new StringBuilder(61);
                    stringBuilder2.append("Invalid timestamp ");
                    stringBuilder2.append(j);
                    stringBuilder2.append(": used an approximation");
                    bli.m898e(str2, stringBuilder2.toString());
                }
            }
        }
        return fArr;
    }
}
