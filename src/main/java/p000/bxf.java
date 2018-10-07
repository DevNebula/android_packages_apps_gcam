package p000;

import com.google.googlex.gcam.GyroSample;
import com.google.googlex.gcam.GyroSampleVector;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: bxf */
public final class bxf implements bwq {
    /* renamed from: b */
    private static final String f11916b = bli.m887a("GyroSampleWorker");
    /* renamed from: a */
    private final kpw f11917a = kpw.m18486d();

    /* renamed from: a */
    public final GyroSampleVector mo12440a() {
        Object e;
        try {
            return (GyroSampleVector) this.f11917a.get();
        } catch (InterruptedException e2) {
            e = e2;
        } catch (ExecutionException e3) {
            e = e3;
        }
        String str = f11916b;
        String valueOf = String.valueOf(e);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("getGyroSampleVectorBlocking() was interrupted: ");
        stringBuilder.append(valueOf);
        bli.m891b(str, stringBuilder.toString());
        return null;
    }

    /* renamed from: a */
    public final void mo2188a(List list) {
        Object gyroSampleVector = new GyroSampleVector();
        for (bwr bwr : list) {
            GyroSample gyroSample = new GyroSample();
            gyroSample.setTimestamp_ns(bwr.f1689e);
            gyroSample.setX(bwr.f1690f);
            gyroSample.setY(bwr.f1691g);
            gyroSample.setZ(bwr.f1692h);
            gyroSampleVector.add(gyroSample);
        }
        this.f11917a.mo15641a(gyroSampleVector);
    }
}
