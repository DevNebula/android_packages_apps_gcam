package p000;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: kvf */
public abstract class kvf extends kvl {
    public kvh unknownFieldData;

    public kvf clone() {
        kvf kvf = (kvf) super.clone();
        kvj.m5514a(this, kvf);
        return kvf;
    }

    public int computeSerializedSize() {
        int i = 0;
        if (this.unknownFieldData == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.unknownFieldData.mo10507b()) {
            i2 += this.unknownFieldData.mo10508b(i).mo10516b();
            i++;
        }
        return i2;
    }

    protected int computeSerializedSizeAsMessageSet() {
        if (this.unknownFieldData == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (i < this.unknownFieldData.mo10507b()) {
            kvi b = this.unknownFieldData.mo10508b(i);
            if (b.f9020b == null) {
                int i3 = 0;
                for (kvm kvm : b.f9021c) {
                    int i4 = kvm.f9024a;
                    byte[] bArr = kvm.f9025b;
                    int b2 = kvd.m5484b(8);
                    i3 = (bArr.length + (((kvd.m5484b(i4) + kvd.m5484b(16)) + (b2 + b2)) + kvd.m5484b(24))) + i3;
                }
                i2 += i3;
                i++;
            } else {
                throw new NoSuchMethodError();
            }
        }
        return i2;
    }

    public final Object getExtension(kvg kvg) {
        kvh kvh = this.unknownFieldData;
        if (kvh == null) {
            return null;
        }
        kvi c = kvh.mo10509c(kvg.f9013b >>> 3);
        if (c == null) {
            return null;
        }
        if (c.f9020b == null) {
            c.f9019a = kvg;
            throw new NoSuchMethodError();
        } else if (c.f9019a.equals(kvg)) {
            return c.f9020b;
        } else {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
    }

    public final kvh getUnknownFieldArray() {
        return this.unknownFieldData;
    }

    public final boolean hasExtension(kvg kvg) {
        kvh kvh = this.unknownFieldData;
        if (kvh == null || kvh.mo10509c(kvg.f9013b >>> 3) == null) {
            return false;
        }
        return true;
    }

    public final kvf setExtension(kvg kvg, Object obj) {
        kvi kvi = null;
        int i = kvg.f9013b >>> 3;
        kvh kvh;
        if (obj == null) {
            kvh = this.unknownFieldData;
            if (kvh != null) {
                i = kvh.mo10504a(i);
                if (i >= 0 && kvh.f9016c[i] != kvh.f9014a) {
                    kvh.f9016c[i] = kvh.f9014a;
                    kvh.f9015b = true;
                }
                if (this.unknownFieldData.mo10507b() == 0) {
                    this.unknownFieldData = null;
                }
            }
        } else {
            kvh = this.unknownFieldData;
            if (kvh == null) {
                this.unknownFieldData = new kvh();
            } else {
                kvi = kvh.mo10509c(i);
            }
            if (kvi == null) {
                this.unknownFieldData.mo10506a(i, new kvi(kvg, obj));
            } else {
                kvi.mo10515a(kvg, obj);
            }
        }
        return this;
    }

    public final boolean storeUnknownField(kvc kvc, int i) {
        int b = kvc.mo10476b();
        if (!kvc.mo10484e(i)) {
            return false;
        }
        storeUnknownFieldData(i >>> 3, new kvm(i, kvc.mo10475a(b, kvc.mo10476b() - b)));
        return true;
    }

    protected final boolean storeUnknownFieldAsMessageSet(kvc kvc, int i) {
        if (i != kvn.f9026a) {
            return storeUnknownField(kvc, i);
        }
        int i2 = 0;
        byte[] bArr = null;
        while (true) {
            int i3 = kvc.mo10488i();
            if (i3 == 0) {
                break;
            } else if (i3 == kvn.f9028c) {
                i2 = kvc.mo10485f();
            } else if (i3 == kvn.f9029d) {
                int b = kvc.mo10476b();
                kvc.mo10484e(i3);
                bArr = kvc.mo10475a(b, kvc.mo10476b() - b);
            } else if (!kvc.mo10484e(i3)) {
                break;
            }
        }
        kvc.mo10473a(kvn.f9027b);
        if (!(bArr == null || i2 == 0)) {
            storeUnknownFieldData(i2, new kvm(i2, bArr));
        }
        return true;
    }

    private void storeUnknownFieldData(int i, kvm kvm) {
        kvi kvi;
        kvi kvi2;
        kvh kvh = this.unknownFieldData;
        if (kvh == null) {
            this.unknownFieldData = new kvh();
            kvi = null;
        } else {
            kvi = kvh.mo10509c(i);
        }
        if (kvi == null) {
            kvi = new kvi();
            this.unknownFieldData.mo10506a(i, kvi);
            kvi2 = kvi;
        } else {
            kvi2 = kvi;
        }
        List list = kvi2.f9021c;
        if (list != null) {
            list.add(kvm);
            return;
        }
        Object obj = kvi2.f9020b;
        if (obj instanceof kvl) {
            byte[] bArr = kvm.f9025b;
            int length = bArr.length;
            kvc a = kvc.m5454a(bArr, 0, length);
            int f = a.mo10485f();
            if (f != length - kvd.m5475a(f)) {
                throw kvk.m5517c();
            }
            kvi2.mo10515a(kvi2.f9019a, ((kvl) kvi2.f9020b).mergeFrom(a));
        } else if (obj instanceof kvl[]) {
            Collections.singletonList(kvm);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(kvm);
            throw new NoSuchMethodError();
        }
    }

    protected void writeAsMessageSetTo(kvd kvd) {
        if (this.unknownFieldData != null) {
            int i = 0;
            while (i < this.unknownFieldData.mo10507b()) {
                kvi b = this.unknownFieldData.mo10508b(i);
                if (b.f9020b == null) {
                    for (kvm kvm : b.f9021c) {
                        int i2 = kvm.f9024a;
                        byte[] bArr = kvm.f9025b;
                        kvd.mo10498c(1, 3);
                        kvd.mo10498c(2, 0);
                        kvd.mo10501e(i2);
                        kvd.mo10498c(3, 2);
                        kvd.mo10492a(bArr);
                        kvd.mo10498c(1, 4);
                    }
                    i++;
                } else {
                    throw new NoSuchMethodError();
                }
            }
        }
    }

    public void writeTo(kvd kvd) {
        if (this.unknownFieldData != null) {
            for (int i = 0; i < this.unknownFieldData.mo10507b(); i++) {
                this.unknownFieldData.mo10508b(i).mo10514a(kvd);
            }
        }
    }
}
