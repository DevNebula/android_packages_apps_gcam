package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: gj */
public final class C0247gj {
    /* renamed from: a */
    public final IntentFilter f5499a;
    /* renamed from: b */
    public final BroadcastReceiver f5500b;
    /* renamed from: c */
    public boolean f5501c;

    public C0247gj(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f5499a = intentFilter;
        this.f5500b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("Receiver{");
        stringBuilder.append(this.f5500b);
        stringBuilder.append(" filter=");
        stringBuilder.append(this.f5499a);
        if (this.f5501c) {
            stringBuilder.append(" DEAD");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
