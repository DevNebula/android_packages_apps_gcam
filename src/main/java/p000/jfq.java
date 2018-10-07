package p000;

import android.media.AudioFormat;

/* compiled from: PG */
/* renamed from: jfq */
final class jfq {
    /* renamed from: a */
    public final Object f8137a;
    /* renamed from: b */
    public long f8138b;
    /* renamed from: c */
    private final long f8139c;
    /* renamed from: d */
    private final int f8140d;
    /* renamed from: e */
    private final int f8141e;

    public jfq(AudioFormat audioFormat) {
        int i;
        this.f8139c = 1000000000 / ((long) audioFormat.getSampleRate());
        this.f8141e = audioFormat.getChannelCount();
        switch (audioFormat.getEncoding()) {
            case 1:
            case 2:
            case 13:
                i = 2;
                break;
            case 3:
                i = 1;
                break;
            case 4:
                i = 4;
                break;
            default:
                String valueOf = String.valueOf(audioFormat);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                stringBuilder.append("Bad audio format ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f8140d = i;
        this.f8137a = new Object();
        this.f8138b = 0;
    }
}
