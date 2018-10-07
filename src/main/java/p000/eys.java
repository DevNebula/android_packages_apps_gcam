package p000;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: eys */
public class eys implements eyt {
    /* renamed from: a */
    public final /* synthetic */ String f18029a;
    /* renamed from: b */
    private final long f18030b;

    /* renamed from: a */
    public final long mo6681a() {
        return TimeUnit.MICROSECONDS.convert(this.f18030b - 1500000000, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public final void mo6682a(eyu eyu) {
        eyu.mo6684a(TimeUnit.MICROSECONDS.convert(this.f18030b + 3000000000L, TimeUnit.NANOSECONDS));
    }

    public eys(String str) {
        this.f18029a = str;
    }

    /* renamed from: b */
    public InputStream mo13202b() {
        try {
            return new FileInputStream(this.f18029a);
        } catch (FileNotFoundException e) {
            String str = ery.f4406a;
            String str2 = this.f18029a;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 52);
            stringBuilder.append("Could not read file: ");
            stringBuilder.append(str2);
            stringBuilder.append(", perhaps it is not a panorama.");
            bli.m898e(str, stringBuilder.toString());
            return null;
        }
    }
}
