package p000;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: arg */
public final class arg {
    static {
        AtomicReference atomicReference = new AtomicReference();
    }

    /* renamed from: a */
    public static ByteBuffer m647a(File file) {
        Throwable th;
        RandomAccessFile randomAccessFile = null;
        FileChannel channel;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            } else if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            } else {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile2.getChannel();
                    try {
                        ByteBuffer load = channel.map(MapMode.READ_ONLY, 0, length).load();
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException e) {
                            }
                        }
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e2) {
                        }
                        return load;
                    } catch (Throwable th2) {
                        th = th2;
                        randomAccessFile = randomAccessFile2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    channel = null;
                    randomAccessFile = randomAccessFile2;
                }
            }
        } catch (Throwable th32) {
            th = th32;
            channel = null;
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException e3) {
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e4) {
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static byte[] m649a(ByteBuffer byteBuffer) {
        ari ari = null;
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            ari = new ari(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        if (ari != null && ari.f935a == 0 && ari.f936b == ari.f937c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A:{SYNTHETIC, Splitter: B:15:0x002b} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A:{SYNTHETIC, Splitter: B:18:0x0030} */
    /* renamed from: a */
    public static void m648a(java.nio.ByteBuffer r4, java.io.File r5) {
        /*
        r0 = 0;
        r1 = 0;
        r4.position(r0);
        r2 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x0026 }
        r0 = "rw";
        r2.<init>(r5, r0);	 Catch:{ all -> 0x0026 }
        r1 = r2.getChannel();	 Catch:{ all -> 0x0034 }
        r1.write(r4);	 Catch:{ all -> 0x003a }
        r0 = 0;
        r1.force(r0);	 Catch:{ all -> 0x003a }
        r1.close();	 Catch:{ all -> 0x003a }
        r2.close();	 Catch:{ all -> 0x003a }
        if (r1 == 0) goto L_0x0022;
    L_0x001f:
        r1.close();	 Catch:{ IOException -> 0x0040 }
    L_0x0022:
        r2.close();	 Catch:{ IOException -> 0x0042 }
    L_0x0025:
        return;
    L_0x0026:
        r0 = move-exception;
        r2 = r0;
        r0 = r1;
    L_0x0029:
        if (r0 == 0) goto L_0x002e;
    L_0x002b:
        r0.close();	 Catch:{ IOException -> 0x0044 }
    L_0x002e:
        if (r1 == 0) goto L_0x0033;
    L_0x0030:
        r1.close();	 Catch:{ IOException -> 0x0046 }
    L_0x0033:
        throw r2;
    L_0x0034:
        r0 = move-exception;
        r3 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r3;
        goto L_0x0029;
    L_0x003a:
        r0 = move-exception;
        r3 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r3;
        goto L_0x0029;
    L_0x0040:
        r0 = move-exception;
        goto L_0x0022;
    L_0x0042:
        r0 = move-exception;
        goto L_0x0025;
    L_0x0044:
        r0 = move-exception;
        goto L_0x002e;
    L_0x0046:
        r0 = move-exception;
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: arg.a(java.nio.ByteBuffer, java.io.File):void");
    }

    /* renamed from: b */
    public static InputStream m650b(ByteBuffer byteBuffer) {
        return new arh(byteBuffer);
    }
}
