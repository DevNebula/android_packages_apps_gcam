package p000;

/* renamed from: gle */
final /* synthetic */ class gle implements iqb {
    /* renamed from: a */
    private final gkt f19275a;

    gle(gkt gkt) {
        this.f19275a = gkt;
    }

    /* renamed from: a */
    public final void mo8765a(Object obj) {
        gkt gkt = this.f19275a;
        eql eql = (eql) obj;
        if (eql != null) {
            boolean e = eql.mo13171e();
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("rows deleted successfully : ");
            stringBuilder.append(e);
            gkt.mo14919a(stringBuilder.toString());
        }
    }
}
