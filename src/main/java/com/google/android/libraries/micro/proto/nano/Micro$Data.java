package com.google.android.libraries.micro.proto.nano;

import p000.iym;
import p000.kvc;
import p000.kvd;
import p000.kvf;
import p000.kvj;
import p000.kvl;
import p000.kvn;

/* compiled from: PG */
public final class Micro$Data extends kvf {
    public static volatile Micro$Data[] _emptyArray;
    public iym debugData;
    public long deviceTimestampUs;
    public int frameHeight;
    public int frameWidth;
    public int[] histogramCountData;
    public int isKeyFrame;
    public float[] motionHomographyData;

    public Micro$Data() {
        clear();
    }

    public static int checkKeyFrameTypeOrThrow(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(44);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum KeyFrameType");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int[] checkKeyFrameTypeOrThrow(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int checkKeyFrameTypeOrThrow : iArr2) {
            checkKeyFrameTypeOrThrow(checkKeyFrameTypeOrThrow);
        }
        return iArr2;
    }

    public final Micro$Data clear() {
        this.motionHomographyData = kvn.f9032g;
        this.histogramCountData = kvn.f9030e;
        this.frameWidth = 0;
        this.frameHeight = 0;
        this.deviceTimestampUs = 0;
        this.isKeyFrame = 0;
        this.debugData = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize() {
        int length;
        int i = 0;
        int computeSerializedSize = super.computeSerializedSize();
        float[] fArr = this.motionHomographyData;
        if (fArr != null) {
            length = fArr.length;
            if (length > 0) {
                length <<= 2;
                computeSerializedSize = ((computeSerializedSize + length) + 1) + kvd.m5484b(length);
            }
        }
        int[] iArr = this.histogramCountData;
        if (iArr == null) {
            i = computeSerializedSize;
        } else if (iArr.length > 0) {
            length = 0;
            while (true) {
                int[] iArr2 = this.histogramCountData;
                if (i >= iArr2.length) {
                    break;
                }
                length += kvd.m5484b(iArr2[i]);
                i++;
            }
            i = ((computeSerializedSize + length) + 1) + kvd.m5484b(length);
        } else {
            i = computeSerializedSize;
        }
        length = this.frameWidth;
        if (length != 0) {
            i += kvd.m5476a(3, length);
        }
        length = this.frameHeight;
        if (length != 0) {
            i += kvd.m5476a(4, length);
        }
        long j = this.deviceTimestampUs;
        if (j != 0) {
            i += kvd.m5477a(5, j);
        }
        length = this.isKeyFrame;
        if (length != 0) {
            i += kvd.m5476a(6, length);
        }
        kvl kvl = this.debugData;
        if (kvl != null) {
            return i + kvd.m5479a(7, kvl);
        }
        return i;
    }

    public static Micro$Data[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (kvj.f9023b) {
                if (_emptyArray == null) {
                    _emptyArray = new Micro$Data[0];
                }
            }
        }
        return _emptyArray;
    }

    public final Micro$Data mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.mo10488i();
            int c;
            int i2;
            Object obj;
            Object obj2;
            Object obj3;
            switch (i) {
                case 0:
                    break;
                case 10:
                    i = kvc.mo10485f();
                    c = kvc.mo10479c(i);
                    i2 = i / 4;
                    obj = this.motionHomographyData;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new float[(i2 + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length) {
                        obj2[i] = Float.intBitsToFloat(kvc.mo10481d());
                        i++;
                    }
                    this.motionHomographyData = obj2;
                    kvc.mo10477b(c);
                    continue;
                case 13:
                    c = kvn.m5518a(kvc, 13);
                    obj2 = this.motionHomographyData;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new float[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = Float.intBitsToFloat(kvc.mo10481d());
                        kvc.mo10488i();
                        i++;
                    }
                    obj3[i] = Float.intBitsToFloat(kvc.mo10481d());
                    this.motionHomographyData = obj3;
                    continue;
                case 16:
                    c = kvn.m5518a(kvc, 16);
                    obj2 = this.histogramCountData;
                    if (obj2 != null) {
                        i = obj2.length;
                    } else {
                        i = 0;
                    }
                    obj3 = new int[(c + i)];
                    if (i != 0) {
                        System.arraycopy(obj2, 0, obj3, 0, i);
                    }
                    while (i < obj3.length - 1) {
                        obj3[i] = kvc.mo10485f();
                        kvc.mo10488i();
                        i++;
                    }
                    obj3[i] = kvc.mo10485f();
                    this.histogramCountData = obj3;
                    continue;
                case 18:
                    i2 = kvc.mo10479c(kvc.mo10485f());
                    c = kvc.mo10476b();
                    i = 0;
                    while (kvc.mo10472a() > 0) {
                        kvc.mo10485f();
                        i++;
                    }
                    kvc.mo10482d(c);
                    obj = this.histogramCountData;
                    if (obj != null) {
                        c = obj.length;
                    } else {
                        c = 0;
                    }
                    Object obj4 = new int[(i + c)];
                    if (c != 0) {
                        System.arraycopy(obj, 0, obj4, 0, c);
                    }
                    while (c < obj4.length) {
                        obj4[c] = kvc.mo10485f();
                        c++;
                    }
                    this.histogramCountData = obj4;
                    kvc.mo10477b(i2);
                    continue;
                case 24:
                    this.frameWidth = kvc.mo10485f();
                    continue;
                case 32:
                    this.frameHeight = kvc.mo10485f();
                    continue;
                case 40:
                    this.deviceTimestampUs = kvc.mo10486g();
                    continue;
                case 48:
                    c = kvc.mo10476b();
                    try {
                        this.isKeyFrame = checkKeyFrameTypeOrThrow(kvc.mo10485f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.mo10482d(c);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 58:
                    if (this.debugData == null) {
                        this.debugData = new iym();
                    }
                    kvc.mo10474a(this.debugData);
                    continue;
                default:
                    if (!super.storeUnknownField(kvc, i)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }

    public static Micro$Data parseFrom(kvc kvc) {
        return new Micro$Data().mergeFrom(kvc);
    }

    public static Micro$Data parseFrom(byte[] bArr) {
        return (Micro$Data) kvl.mergeFrom(new Micro$Data(), bArr);
    }

    public final void writeTo(kvd kvd) {
        int length;
        int i = 0;
        float[] fArr = this.motionHomographyData;
        if (fArr != null) {
            length = fArr.length;
            if (length > 0) {
                kvd.mo10501e(10);
                kvd.mo10501e(length << 2);
                length = 0;
                while (true) {
                    float[] fArr2 = this.motionHomographyData;
                    if (length >= fArr2.length) {
                        break;
                    }
                    kvd.mo10489a(fArr2[length]);
                    length++;
                }
            }
        }
        int[] iArr = this.histogramCountData;
        if (iArr != null && iArr.length > 0) {
            length = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.histogramCountData;
                if (length >= iArr2.length) {
                    break;
                }
                i2 += kvd.m5484b(iArr2[length]);
                length++;
            }
            kvd.mo10501e(18);
            kvd.mo10501e(i2);
            while (true) {
                iArr = this.histogramCountData;
                if (i >= iArr.length) {
                    break;
                }
                kvd.mo10501e(iArr[i]);
                i++;
            }
        }
        length = this.frameWidth;
        if (length != 0) {
            kvd.mo10493b(3, length);
        }
        length = this.frameHeight;
        if (length != 0) {
            kvd.mo10493b(4, length);
        }
        long j = this.deviceTimestampUs;
        if (j != 0) {
            kvd.mo10494b(5, j);
        }
        length = this.isKeyFrame;
        if (length != 0) {
            kvd.mo10493b(6, length);
        }
        kvl kvl = this.debugData;
        if (kvl != null) {
            kvd.mo10496b(7, kvl);
        }
        super.writeTo(kvd);
    }
}
