package p000;

import android.annotation.TargetApi;
import android.location.Location;
import android.support.p001v4.app.NotificationCompatJellybean;
import java.io.File;
import java.util.concurrent.TimeUnit;

@TargetApi(16)
/* compiled from: PG */
/* renamed from: eqt */
public final class eqt {
    /* renamed from: a */
    public File f4318a = null;
    /* renamed from: b */
    public kbg f4319b = null;
    /* renamed from: c */
    public boolean f4320c = false;
    /* renamed from: d */
    private final epw f4321d;
    /* renamed from: e */
    private long f4322e = -1;
    /* renamed from: f */
    private ixx f4323f = null;
    /* renamed from: g */
    private iqp f4324g = null;
    /* renamed from: h */
    private long f4325h = -1;
    /* renamed from: i */
    private String f4326i = null;

    public eqt(epw epw) {
        this.f4321d = epw;
    }

    /* renamed from: a */
    public final epv mo6510a() {
        if (this.f4322e < 0) {
            throw new IllegalStateException("video duration is not set.");
        } else if (this.f4318a == null) {
            throw new IllegalStateException("video file is not set.");
        } else if (this.f4319b == null) {
            throw new IllegalStateException("video location optional is not set.");
        } else if (this.f4323f == null) {
            throw new IllegalStateException("video MIME type is not set.");
        } else if (this.f4324g == null) {
            throw new IllegalStateException("video resolution is not set.");
        } else if (this.f4325h < 0) {
            throw new IllegalStateException("video taken time is not set.");
        } else if (this.f4326i == null) {
            throw new IllegalStateException("video title is not set.");
        } else {
            epv a = new epv();
            a.mo6482a("media_type", Integer.valueOf(3));
            a.mo6484a("_data", this.f4318a.getAbsolutePath());
            a.mo6483a("_size", Long.valueOf(this.f4318a.length()));
            a.mo6484a("_display_name", this.f4318a.getName());
            a.mo6484a(NotificationCompatJellybean.KEY_TITLE, this.f4326i);
            a.mo6483a("date_added", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f4325h)));
            a.mo6483a("date_modified", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f4318a.lastModified())));
            a.mo6484a("mime_type", this.f4323f.f7911i);
            a.mo6482a("width", Integer.valueOf(this.f4324g.f7695a));
            a.mo6482a("height", Integer.valueOf(this.f4324g.f7696b));
            a.mo6483a("duration", Long.valueOf(this.f4322e));
            String num = Integer.toString(this.f4324g.f7695a);
            String num2 = Integer.toString(this.f4324g.f7696b);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(num).length() + 1) + String.valueOf(num2).length());
            stringBuilder.append(num);
            stringBuilder.append("x");
            stringBuilder.append(num2);
            a.mo6484a("resolution", stringBuilder.toString());
            if (this.f4319b.mo9709b()) {
                a.mo6481a("latitude", Double.valueOf(((Location) this.f4319b.mo9706a()).getLatitude()));
                a.mo6481a("longitude", Double.valueOf(((Location) this.f4319b.mo9706a()).getLongitude()));
            }
            a.mo6483a("datetaken", Long.valueOf(this.f4325h));
            if (this.f4320c) {
                a.mo6482a("mini_thumb_magic", Integer.valueOf(1));
            }
            return a;
        }
    }

    /* renamed from: a */
    public final eqt mo6511a(long j) {
        if (j <= 0) {
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("invalid video duration ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4322e = j;
        return this;
    }

    /* renamed from: a */
    public final eqt mo6513a(ixx ixx) {
        if (ixx.mo9169a()) {
            this.f4323f = ixx;
            return this;
        }
        String valueOf = String.valueOf(ixx);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("invalid video MIME type ");
        stringBuilder.append(valueOf);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final eqt mo6512a(iqp iqp) {
        if (iqp.mo8812a() <= 0) {
            String valueOf = String.valueOf(iqp);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
            stringBuilder.append("invalid video size ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4324g = iqp;
        return this;
    }

    /* renamed from: b */
    public final eqt mo6515b(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("invalid video taken time ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f4325h = j;
        return this;
    }

    /* renamed from: a */
    public final eqt mo6514a(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("empty video title");
        }
        this.f4326i = str;
        return this;
    }
}
