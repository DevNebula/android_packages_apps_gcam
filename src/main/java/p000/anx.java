package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: anx */
final class anx {
    /* renamed from: a */
    private final Queue f823a = arq.m677a(0);

    anx() {
    }

    /* renamed from: a */
    final synchronized add mo1622a(ByteBuffer byteBuffer) {
        add add;
        add = (add) this.f823a.poll();
        if (add == null) {
            add = new add();
        }
        add.f314b = null;
        Arrays.fill(add.f313a, (byte) 0);
        add.f315c = new adc();
        add.f316d = 0;
        add.f314b = byteBuffer.asReadOnlyBuffer();
        add.f314b.position(0);
        add.f314b.order(ByteOrder.LITTLE_ENDIAN);
        return add;
    }

    /* renamed from: a */
    final synchronized void mo1623a(add add) {
        add.f314b = null;
        add.f315c = null;
        this.f823a.offer(add);
    }
}
