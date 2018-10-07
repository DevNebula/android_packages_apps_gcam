package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: imt */
public abstract class imt implements ilp {
    /* renamed from: a */
    private final ilp f24650a;
    /* renamed from: b */
    private final ilp f24651b;

    public imt(ilp ilp) {
        this.f24650a = ilp;
        this.f24651b = ilq.m3875a(ilp, new imu(this));
    }

    /* renamed from: b */
    public abstract Object mo15011b(Object obj);

    /* renamed from: c */
    public abstract Object mo15012c(Object obj);

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        return this.f24651b.mo13672a(iqt, executor);
    }

    /* renamed from: b */
    public Object mo13673b() {
        return this.f24651b.mo13673b();
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        ilp ilp = this.f24650a;
        jri.m13404b(obj);
        Object c = mo15012c(obj);
        if (c == null) {
            String valueOf = String.valueOf(obj);
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 64) + String.valueOf(name).length());
            stringBuilder.append("Transforming output value: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" resulted in a null input value for: ");
            stringBuilder.append(name);
            throw new NullPointerException(stringBuilder.toString());
        }
        ilp.mo8826a(c);
    }
}
