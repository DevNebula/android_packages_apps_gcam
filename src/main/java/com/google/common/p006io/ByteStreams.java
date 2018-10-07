package com.google.common.p006io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import p000.jri;
import p000.kim;
import p000.kin;
import p000.kio;
import p000.kir;
import p000.kis;

/* compiled from: PG */
/* renamed from: com.google.common.io.ByteStreams */
public final class ByteStreams {
    public static final int BUFFER_SIZE = 8192;
    public static final int MAX_ARRAY_LEN = 2147483639;
    public static final OutputStream NULL_OUTPUT_STREAM = new kir();
    public static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    public static final int ZERO_COPY_CHUNK_SIZE = 524288;

    private ByteStreams() {
    }

    private static byte[] combineBuffers(Deque deque, int i) {
        Object obj = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr = (byte[]) deque.removeFirst();
            int min = Math.min(i2, bArr.length);
            System.arraycopy(bArr, 0, obj, i - i2, min);
            i2 -= min;
        }
        return obj;
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        jri.m13404b((Object) inputStream);
        jri.m13404b((Object) outputStream);
        byte[] createBuffer = ByteStreams.createBuffer();
        long j = 0;
        while (true) {
            int read = inputStream.read(createBuffer);
            if (read == -1) {
                return j;
            }
            outputStream.write(createBuffer, 0, read);
            j += (long) read;
        }
    }

    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) {
        jri.m13404b((Object) readableByteChannel);
        jri.m13404b((Object) writableByteChannel);
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long position = fileChannel.position();
            long j = position;
            while (true) {
                long transferTo = fileChannel.transferTo(j, 524288, writableByteChannel);
                j += transferTo;
                fileChannel.position(j);
                if (transferTo <= 0 && j >= fileChannel.size()) {
                    return j - position;
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(ByteStreams.createBuffer());
            long j2 = 0;
            while (readableByteChannel.read(wrap) != -1) {
                wrap.flip();
                while (wrap.hasRemaining()) {
                    j2 += (long) writableByteChannel.write(wrap);
                }
                wrap.clear();
            }
            return j2;
        }
    }

    static byte[] createBuffer() {
        return new byte[8192];
    }

    public static long exhaust(InputStream inputStream) {
        byte[] createBuffer = ByteStreams.createBuffer();
        long j = 0;
        while (true) {
            long read = (long) inputStream.read(createBuffer);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public static InputStream limit(InputStream inputStream, long j) {
        return new kis(inputStream, j);
    }

    public static kim newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new kim((ByteArrayInputStream) jri.m13404b((Object) byteArrayInputStream));
    }

    public static kim newDataInput(byte[] bArr) {
        return ByteStreams.newDataInput(new ByteArrayInputStream(bArr));
    }

    public static kim newDataInput(byte[] bArr, int i) {
        int length = bArr.length;
        jri.m13403b(i, length);
        return ByteStreams.newDataInput(new ByteArrayInputStream(bArr, i, length - i));
    }

    public static kin newDataOutput() {
        return ByteStreams.newDataOutput(new ByteArrayOutputStream());
    }

    public static kin newDataOutput(int i) {
        if (i >= 0) {
            return ByteStreams.newDataOutput(new ByteArrayOutputStream(i));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", new Object[]{Integer.valueOf(i)}));
    }

    public static kin newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new kin((ByteArrayOutputStream) jri.m13404b((Object) byteArrayOutputStream));
    }

    public static OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) {
        jri.m13404b((Object) inputStream);
        jri.m13404b((Object) bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    public static Object readBytes(InputStream inputStream, kio kio) {
        jri.m13404b((Object) inputStream);
        jri.m13404b((Object) kio);
        byte[] createBuffer = ByteStreams.createBuffer();
        while (inputStream.read(createBuffer) != -1) {
            if (!kio.mo10051b()) {
                break;
            }
        }
        return kio.mo10050a();
    }

    public static void readFully(InputStream inputStream, byte[] bArr) {
        ByteStreams.readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) {
        int read = ByteStreams.read(inputStream, bArr, i, i2);
        if (read != i2) {
            StringBuilder stringBuilder = new StringBuilder(81);
            stringBuilder.append("reached end of stream after reading ");
            stringBuilder.append(read);
            stringBuilder.append(" bytes; ");
            stringBuilder.append(i2);
            stringBuilder.append(" bytes expected");
            throw new EOFException(stringBuilder.toString());
        }
    }

    public static void skipFully(InputStream inputStream, long j) {
        long skipUpTo = ByteStreams.skipUpTo(inputStream, j);
        if (skipUpTo < j) {
            StringBuilder stringBuilder = new StringBuilder(100);
            stringBuilder.append("reached end of stream after skipping ");
            stringBuilder.append(skipUpTo);
            stringBuilder.append(" bytes; ");
            stringBuilder.append(j);
            stringBuilder.append(" bytes expected");
            throw new EOFException(stringBuilder.toString());
        }
    }

    private static long skipSafely(InputStream inputStream, long j) {
        int available = inputStream.available();
        return available != 0 ? inputStream.skip(Math.min((long) available, j)) : 0;
    }

    static long skipUpTo(InputStream inputStream, long j) {
        byte[] createBuffer = ByteStreams.createBuffer();
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            long skipSafely = ByteStreams.skipSafely(inputStream, j3);
            if (skipSafely == 0) {
                skipSafely = (long) inputStream.read(createBuffer, 0, (int) Math.min(j3, (long) createBuffer.length));
                if (skipSafely == -1) {
                    break;
                }
            }
            j2 = skipSafely + j2;
        }
        return j2;
    }

    public static byte[] toByteArray(InputStream inputStream) {
        jri.m13404b((Object) inputStream);
        return ByteStreams.toByteArrayInternal(inputStream, new ArrayDeque(20), 0);
    }

    public static byte[] toByteArray(InputStream inputStream, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13399a(z, "expectedSize (%s) must be non-negative", j);
        if (j > 2147483639) {
            StringBuilder stringBuilder = new StringBuilder(62);
            stringBuilder.append(j);
            stringBuilder.append(" bytes is too large to fit in a byte array");
            throw new OutOfMemoryError(stringBuilder.toString());
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = inputStream.read(bArr, i3, i2);
            if (read == -1) {
                return Arrays.copyOf(bArr, i3);
            }
            i2 -= read;
        }
        if (inputStream.read() == -1) {
            return bArr;
        }
        Deque arrayDeque = new ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) i2});
        return ByteStreams.toByteArrayInternal(inputStream, arrayDeque, bArr.length + 1);
    }

    /* JADX WARNING: Missing block: B:9:0x0028, code:
            r2 = (long) r2;
            r2 = p000.khx.m4994a(r2 + r2);
     */
    private static byte[] toByteArrayInternal(java.io.InputStream r7, java.util.Deque r8, int r9) {
        /*
        r6 = -1;
        r5 = 2147483639; // 0x7ffffff7 float:NaN double:1.060997891E-314;
        r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r2 = r0;
        r1 = r9;
    L_0x0008:
        if (r1 >= r5) goto L_0x0030;
    L_0x000a:
        r0 = r5 - r1;
        r0 = java.lang.Math.min(r2, r0);
        r3 = new byte[r0];
        r8.add(r3);
        r0 = 0;
    L_0x0016:
        r4 = r3.length;
        if (r0 >= r4) goto L_0x0028;
    L_0x0019:
        r4 = r4 - r0;
        r4 = r7.read(r3, r0, r4);
        if (r4 != r6) goto L_0x0025;
    L_0x0020:
        r0 = com.google.common.p006io.ByteStreams.combineBuffers(r8, r1);
    L_0x0024:
        return r0;
    L_0x0025:
        r0 = r0 + r4;
        r1 = r1 + r4;
        goto L_0x0016;
    L_0x0028:
        r2 = (long) r2;
        r2 = r2 + r2;
        r0 = p000.khx.m4994a(r2);
        r2 = r0;
        goto L_0x0008;
    L_0x0030:
        r0 = r7.read();
        if (r0 != r6) goto L_0x003b;
    L_0x0036:
        r0 = com.google.common.p006io.ByteStreams.combineBuffers(r8, r5);
        goto L_0x0024;
    L_0x003b:
        r0 = new java.lang.OutOfMemoryError;
        r1 = "input is too large to fit in a byte array";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.ByteStreams.toByteArrayInternal(java.io.InputStream, java.util.Deque, int):byte[]");
    }
}
