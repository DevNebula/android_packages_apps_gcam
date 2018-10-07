package p000;

import android.support.p001v4.app.FrameMetricsAggregator.FrameMetricsApi24Impl;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PG */
/* renamed from: wq */
public final class C0774wq implements C0551vz {
    /* renamed from: a */
    private int f22353a = 0;
    /* renamed from: b */
    private int f22354b = 0;
    /* renamed from: c */
    private int f22355c = 0;
    /* renamed from: d */
    private int f22356d = 0;
    /* renamed from: e */
    private int f22357e = 0;
    /* renamed from: f */
    private int f22358f = 0;
    /* renamed from: g */
    private TimeZone f22359g = TimeZone.getTimeZone("UTC");
    /* renamed from: h */
    private int f22360h;

    public C0774wq(Calendar calendar) {
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.f22353a = gregorianCalendar.get(1);
        this.f22354b = gregorianCalendar.get(2) + 1;
        this.f22355c = gregorianCalendar.get(5);
        this.f22356d = gregorianCalendar.get(11);
        this.f22357e = gregorianCalendar.get(12);
        this.f22358f = gregorianCalendar.get(13);
        this.f22360h = gregorianCalendar.get(14) * FrameMetricsApi24Impl.NANOS_PER_MS;
        this.f22359g = gregorianCalendar.getTimeZone();
    }

    public C0774wq(Date date, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTime(date);
        this.f22353a = gregorianCalendar.get(1);
        this.f22354b = gregorianCalendar.get(2) + 1;
        this.f22355c = gregorianCalendar.get(5);
        this.f22356d = gregorianCalendar.get(11);
        this.f22357e = gregorianCalendar.get(12);
        this.f22358f = gregorianCalendar.get(13);
        this.f22360h = gregorianCalendar.get(14) * FrameMetricsApi24Impl.NANOS_PER_MS;
        this.f22359g = timeZone;
    }

    public final int compareTo(Object obj) {
        C0551vz c0551vz = (C0551vz) obj;
        long timeInMillis = mo11417a().getTimeInMillis() - c0551vz.mo11417a().getTimeInMillis();
        if (timeInMillis != 0) {
            return (int) (timeInMillis % 2);
        }
        return (int) (((long) (this.f22360h - c0551vz.mo11428f())) % 2);
    }

    /* renamed from: a */
    public final Calendar mo11417a() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(this.f22359g);
        gregorianCalendar.set(1, this.f22353a);
        gregorianCalendar.set(2, this.f22354b - 1);
        gregorianCalendar.set(5, this.f22355c);
        gregorianCalendar.set(11, this.f22356d);
        gregorianCalendar.set(12, this.f22357e);
        gregorianCalendar.set(13, this.f22358f);
        gregorianCalendar.set(14, this.f22360h / FrameMetricsApi24Impl.NANOS_PER_MS);
        return gregorianCalendar;
    }

    /* renamed from: b */
    public final int mo11420b() {
        return this.f22355c;
    }

    /* renamed from: c */
    public final int mo11422c() {
        return this.f22356d;
    }

    /* renamed from: d */
    public final int mo11424d() {
        return this.f22357e;
    }

    /* renamed from: e */
    public final int mo11426e() {
        return this.f22354b;
    }

    /* renamed from: f */
    public final int mo11428f() {
        return this.f22360h;
    }

    /* renamed from: g */
    public final int mo11430g() {
        return this.f22358f;
    }

    /* renamed from: h */
    public final TimeZone mo11432h() {
        return this.f22359g;
    }

    /* renamed from: i */
    public final int mo11433i() {
        return this.f22353a;
    }

    /* renamed from: a */
    public final void mo11418a(int i) {
        if (i <= 0) {
            this.f22355c = 1;
        } else if (i > 31) {
            this.f22355c = 31;
        } else {
            this.f22355c = i;
        }
    }

    /* renamed from: b */
    public final void mo11421b(int i) {
        this.f22356d = Math.min(Math.abs(i), 23);
    }

    /* renamed from: c */
    public final void mo11423c(int i) {
        this.f22357e = Math.min(Math.abs(i), 59);
    }

    /* renamed from: d */
    public final void mo11425d(int i) {
        if (i <= 0) {
            this.f22354b = 1;
        } else if (i > 12) {
            this.f22354b = 12;
        } else {
            this.f22354b = i;
        }
    }

    /* renamed from: e */
    public final void mo11427e(int i) {
        this.f22360h = i;
    }

    /* renamed from: f */
    public final void mo11429f(int i) {
        this.f22358f = Math.min(Math.abs(i), 59);
    }

    /* renamed from: a */
    public final void mo11419a(TimeZone timeZone) {
        this.f22359g = timeZone;
    }

    /* renamed from: g */
    public final void mo11431g(int i) {
        this.f22353a = Math.min(Math.abs(i), 9999);
    }

    public final String toString() {
        return C0509tz.m5939a((C0551vz) this);
    }
}
