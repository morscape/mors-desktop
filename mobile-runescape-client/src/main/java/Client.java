/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  fe
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="Client")
@ObfuscatedName(value="client")
public final class Client
extends class138
implements class57 {
    @ObfuscatedName(value="rx")
    public static int field4988;
    @ObfuscatedName(value="rg")
    @Export(value="archiveLoaders")
    static ArrayList archiveLoaders;
    @ObfuscatedName(value="rr")
    @ObfuscatedGetter(intValue=-1264819345)
    static int field4984;
    @ObfuscatedName(value="sk")
    @ObfuscatedGetter(intValue=-659013011)
    static int field4993;
    @ObfuscatedName(value="rp")
    @ObfuscatedGetter(intValue=184287419)
    static int field4982;
    @ObfuscatedName(value="rk")
    @ObfuscatedGetter(intValue=-1864681557)
    static int field4980;
    @ObfuscatedName(value="se")
    @ObfuscatedSignature(descriptor="Lnh;")
    static class206 field4990;
    @ObfuscatedName(value="qb")
    static short field4963;
    @ObfuscatedName(value="rb")
    @ObfuscatedGetter(intValue=-1394791321)
    static int field4977;
    @ObfuscatedName(value="ro")
    @ObfuscatedSignature(descriptor="Laj;")
    static class6 field4981;
    @ObfuscatedName(value="rq")
    @ObfuscatedGetter(intValue=1626435597)
    static int field4983;
    @ObfuscatedName(value="sg")
    static boolean field4991;
    @ObfuscatedName(value="qf")
    @ObfuscatedGetter(intValue=1602642063)
    static int field4966;
    @ObfuscatedName(value="qq")
    @ObfuscatedGetter(intValue=-1210537091)
    static int field4971;
    @ObfuscatedName(value="rj")
    @ObfuscatedSignature(descriptor="Lae;")
    static class2 field4979;
    @ObfuscatedName(value="qv")
    static short field4974;
    @ObfuscatedName(value="qi")
    static short field4967;
    @ObfuscatedName(value="qm")
    static short field4968;
    @ObfuscatedName(value="qo")
    static short field4969;
    @ObfuscatedName(value="rw")
    @ObfuscatedGetter(intValue=609598693)
    static int field4987;
    @ObfuscatedName(value="qp")
    static short field4970;
    @ObfuscatedName(value="pp")
    static boolean field4958;
    @ObfuscatedName(value="qr")
    static boolean[] field4972;
    @ObfuscatedName(value="qz")
    static int[] field4976;
    @ObfuscatedName(value="qw")
    static short field4975;
    @ObfuscatedName(value="qc")
    static short field4964;
    @ObfuscatedName(value="qa")
    static int[] field4962;
    @ObfuscatedName(value="qu")
    static int[] field4973;
    @ObfuscatedName(value="qd")
    static int[] field4965;
    @ObfuscatedName(value="sb")
    static boolean field4989;
    @ObfuscatedName(value="sm")
    @ObfuscatedSignature(descriptor="Lnh;")
    static class206 field4994;
    @ObfuscatedName(value="rs")
    @ObfuscatedSignature(descriptor="[Lnj;")
    static class208[] field4985;
    @ObfuscatedName(value="rt")
    @ObfuscatedSignature(descriptor="Liq;")
    static class127 field4986;
    @ObfuscatedName(value="si")
    @ObfuscatedSignature(descriptor="Lij;")
    static final class314 field4992;
    @ObfuscatedName(value="sv")
    static int[] field4996;
    @ObfuscatedName(value="st")
    static int[] field4995;
    @ObfuscatedName(value="aa")
    public static boolean field4738 = false;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lclient;")
    public static Client field4740;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lnk;")
    static LoginType field4743;
    @ObfuscatedName(value="am")
    static String field4744 = "";
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-889354895)
    static int field4745 = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1610059309)
    @Export(value="gameBuild")
    static int gameBuild = 0;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-955358373)
    @Export(value="gameState")
    static int gameState = 0;
    @ObfuscatedName(value="bn")
    @ObfuscatedGetter(intValue=1144797683)
    @Export(value="cycle")
    public static int cycle = 0;
    @ObfuscatedName(value="ca")
    static int field4755 = 0;
    @ObfuscatedName(value="cf")
    @ObfuscatedGetter(intValue=2103135727)
    static int field4758 = 0;
    @ObfuscatedName(value="ci")
    @ObfuscatedGetter(intValue=-185488117)
    @Export(value="js5ConnectState")
    static int js5ConnectState = 0;
    @ObfuscatedName(value="cj")
    static int field4761 = 0;
    @ObfuscatedName(value="ck")
    @ObfuscatedGetter(intValue=1244461041)
    static int field4762 = 0;
    @ObfuscatedName(value="cm")
    @ObfuscatedGetter(intValue=826683673)
    static int field4763 = 0;
    @ObfuscatedName(value="cv")
    @ObfuscatedGetter(intValue=349230553)
    static int field4768 = 0;
    @ObfuscatedName(value="ed")
    @ObfuscatedGetter(intValue=-1867547601)
    static int field4779 = 0;
    @ObfuscatedName(value="en")
    @Export(value="randomDatData")
    static byte[] randomDatData;
    @ObfuscatedName(value="ex")
    static int[] field4786;
    @ObfuscatedName(value="fb")
    @ObfuscatedGetter(intValue=1827058161)
    static int field4789 = 0;
    @ObfuscatedName(value="fe")
    @ObfuscatedSignature(descriptor="Loc;")
    static class399 field4791;
    @ObfuscatedName(value="fi")
    @ObfuscatedSignature(descriptor="Lor;")
    static Timer field4792;
    @ObfuscatedName(value="fj")
    static boolean field4793;
    @ObfuscatedName(value="fk")
    @ObfuscatedGetter(intValue=-1482207571)
    static int field4794;
    @ObfuscatedName(value="fm")
    static HashMap field4795;
    @ObfuscatedName(value="fp")
    @ObfuscatedGetter(intValue=-1209115865)
    static int field4796;
    @ObfuscatedName(value="fv")
    @ObfuscatedGetter(intValue=247902917)
    static int field4797;
    @ObfuscatedName(value="fw")
    static boolean field4798;
    @ObfuscatedName(value="gh")
    static int[][][] field4800;
    @ObfuscatedName(value="gj")
    @ObfuscatedGetter(intValue=-1055828507)
    static int field4801;
    @ObfuscatedName(value="gk")
    @ObfuscatedSignature(descriptor="[Lgg;")
    static CollisionMap[] field4802;
    @ObfuscatedName(value="gl")
    static boolean field4803;
    @ObfuscatedName(value="go")
    @ObfuscatedGetter(intValue=1098895076)
    static int field4804;
    @ObfuscatedName(value="gw")
    static final int[] field4806;
    @ObfuscatedName(value="ha")
    @ObfuscatedGetter(intValue=-165260837)
    static int field4807;
    @ObfuscatedName(value="hc")
    static int field4809;
    @ObfuscatedName(value="he")
    static int field4811;
    @ObfuscatedName(value="hi")
    @ObfuscatedGetter(intValue=1283724953)
    static int field4813;
    @ObfuscatedName(value="hj")
    static int field4814;
    @ObfuscatedName(value="hp")
    static int field4816;
    @ObfuscatedName(value="hr")
    @ObfuscatedGetter(intValue=-688612825)
    static int field4817;
    @ObfuscatedName(value="hu")
    @ObfuscatedGetter(intValue=-602059143)
    static int field4819;
    @ObfuscatedName(value="hy")
    static int field4821;
    @ObfuscatedName(value="ib")
    @ObfuscatedGetter(intValue=-1841485799)
    static int field4824;
    @ObfuscatedName(value="ic")
    static boolean field4825;
    @ObfuscatedName(value="if")
    static String[] field4828;
    @ObfuscatedName(value="ig")
    @ObfuscatedGetter(intValue=-1850111067)
    static int field4829;
    @ObfuscatedName(value="ih")
    static int[] field4830;
    @ObfuscatedName(value="im")
    static int field4834;
    @ObfuscatedName(value="io")
    @ObfuscatedGetter(intValue=1938124041)
    @Export(value="viewportTempX")
    static int viewportTempX;
    @ObfuscatedName(value="ip")
    @ObfuscatedGetter(intValue=-28544223)
    static int field4837;
    @ObfuscatedName(value="iq")
    @ObfuscatedGetter(intValue=-591639963)
    static int field4838;
    @ObfuscatedName(value="is")
    static int[][] field4840;
    @ObfuscatedName(value="iu")
    static int[] field4842;
    @ObfuscatedName(value="jc")
    static int field4846;
    @ObfuscatedName(value="jf")
    static int field4847;
    @ObfuscatedName(value="jh")
    static int field4848;
    @ObfuscatedName(value="ji")
    static boolean field4849;
    @ObfuscatedName(value="jj")
    static int field4850;
    @ObfuscatedName(value="jk")
    static int field4851;
    @ObfuscatedName(value="jn")
    static boolean field4852;
    @ObfuscatedName(value="jq")
    @ObfuscatedGetter(intValue=-988971853)
    static int field4854;
    @ObfuscatedName(value="js")
    @ObfuscatedGetter(intValue=-684740725)
    static int field4855;
    @ObfuscatedName(value="jt")
    @Export(value="renderSelf")
    static boolean renderSelf;
    @ObfuscatedName(value="ju")
    public static boolean field4857;
    @ObfuscatedName(value="kc")
    @ObfuscatedSignature(descriptor="Lfe;")
    @Export(value="widgetFlags")
    static NodeDeque widgetFlags;
    @ObfuscatedName(value="kh")
    @ObfuscatedGetter(intValue=-221981217)
    static int field4866;
    @ObfuscatedName(value="ki")
    @ObfuscatedGetter(intValue=2145567295)
    static int field4867;
    @ObfuscatedName(value="kl")
    @ObfuscatedSignature(descriptor="Lfe;")
    static NodeDeque field4869;
    @ObfuscatedName(value="km")
    @ObfuscatedGetter(intValue=-1838144999)
    static int field4870;
    @ObfuscatedName(value="kn")
    static int field4871;
    @ObfuscatedName(value="kw")
    static int[] field4878;
    @ObfuscatedName(value="kx")
    @ObfuscatedGetter(intValue=361511941)
    static int field4879;
    @ObfuscatedName(value="kz")
    @ObfuscatedGetter(intValue=-2015553171)
    static int field4880;
    @ObfuscatedName(value="la")
    @ObfuscatedGetter(intValue=389823149)
    static int field4881;
    @ObfuscatedName(value="lb")
    static boolean field4882;
    @ObfuscatedName(value="ld")
    @ObfuscatedGetter(intValue=-1785671023)
    static int field4884;
    @ObfuscatedName(value="lf")
    @ObfuscatedGetter(intValue=-1562203765)
    static int field4886;
    @ObfuscatedName(value="lh")
    @ObfuscatedSignature(descriptor="Lax;")
    static Widget field4887;
    @ObfuscatedName(value="lj")
    static boolean field4888;
    @ObfuscatedName(value="lk")
    @ObfuscatedGetter(intValue=632062603)
    public static int field4889;
    @ObfuscatedName(value="ln")
    @ObfuscatedGetter(intValue=-1665479207)
    static int field4892;
    @ObfuscatedName(value="lp")
    @ObfuscatedGetter(intValue=-607167729)
    static int field4894;
    @ObfuscatedName(value="lq")
    @ObfuscatedSignature(descriptor="Lpk;")
    @Export(value="interfaceParents")
    static NodeHashTable interfaceParents;
    @ObfuscatedName(value="lr")
    static int field4896;
    @ObfuscatedName(value="ls")
    @ObfuscatedGetter(intValue=554023561)
    static int field4897;
    @ObfuscatedName(value="lt")
    @ObfuscatedSignature(descriptor="Lax;")
    static Widget field4898;
    @ObfuscatedName(value="lu")
    @ObfuscatedGetter(intValue=2128086909)
    static int field4899;
    @ObfuscatedName(value="lv")
    static boolean field4900;
    @ObfuscatedName(value="lw")
    @ObfuscatedGetter(intValue=-2004268505)
    static int field4901;
    @ObfuscatedName(value="ly")
    @ObfuscatedSignature(descriptor="Lax;")
    static Widget field4902;
    @ObfuscatedName(value="mc")
    static int field4903;
    @ObfuscatedName(value="mf")
    @ObfuscatedGetter(intValue=-1831646991)
    static int field4904;
    @ObfuscatedName(value="mk")
    static int[] field4905;
    @ObfuscatedName(value="mq")
    static int[] field4909;
    @ObfuscatedName(value="mr")
    static int field4910;
    @ObfuscatedName(value="mu")
    static int field4911;
    @ObfuscatedName(value="my")
    static int[] field4913;
    @ObfuscatedName(value="mz")
    @ObfuscatedGetter(intValue=1988195317)
    static int field4914;
    @ObfuscatedName(value="na")
    static int[] field4915;
    @ObfuscatedName(value="nb")
    @ObfuscatedGetter(intValue=-2091094173)
    static int field4916;
    @ObfuscatedName(value="nc")
    @ObfuscatedGetter(intValue=-1681572643)
    static int field4917;
    @ObfuscatedName(value="nd")
    static int field4918;
    @ObfuscatedName(value="ne")
    @ObfuscatedGetter(intValue=1662697037)
    static int field4919;
    @ObfuscatedName(value="nf")
    static boolean[] field4920;
    @ObfuscatedName(value="ng")
    @Export(value="isResizable")
    static boolean isResizable;
    @ObfuscatedName(value="nh")
    static int field4922;
    @ObfuscatedName(value="nk")
    @ObfuscatedSignature(descriptor="Lpk;")
    static NodeHashTable field4923;
    @ObfuscatedName(value="nm")
    static int[] field4925;
    @ObfuscatedName(value="no")
    static boolean[] field4926;
    @ObfuscatedName(value="np")
    static boolean[] field4927;
    @ObfuscatedName(value="nq")
    static int[] field4928;
    @ObfuscatedName(value="nr")
    static int field4929;
    @ObfuscatedName(value="nu")
    @ObfuscatedGetter(longValue=1951509518394080689L)
    static long field4932;
    @ObfuscatedName(value="nv")
    @ObfuscatedSignature(descriptor="Lfe;")
    static NodeDeque field4933;
    @ObfuscatedName(value="nw")
    static int[] field4934;
    @ObfuscatedName(value="nx")
    @ObfuscatedSignature(descriptor="Lfe;")
    static NodeDeque field4935;
    @ObfuscatedName(value="od")
    static int field4939;
    @ObfuscatedName(value="oe")
    @ObfuscatedGetter(intValue=1029198239)
    static int field4940;
    @ObfuscatedName(value="of")
    static int[] field4941;
    @ObfuscatedName(value="og")
    @ObfuscatedGetter(longValue=-7685250835808586179L)
    static long field4942;
    @ObfuscatedName(value="ok")
    @ObfuscatedGetter(intValue=-1495103443)
    static int field4944;
    @ObfuscatedName(value="om")
    static int field4945;
    @ObfuscatedName(value="op")
    static int[] field4946;
    @ObfuscatedName(value="oq")
    @ObfuscatedGetter(intValue=1700172899)
    static int field4947;
    @ObfuscatedName(value="os")
    static int field4948;
    @ObfuscatedName(value="ow")
    static long[] field4950;
    @ObfuscatedName(value="pb")
    static boolean field4952;
    @ObfuscatedName(value="pc")
    @ObfuscatedGetter(intValue=-1162568025)
    static int field4953;
    @ObfuscatedName(value="pe")
    static int[] field4954;
    @ObfuscatedName(value="pj")
    static int[] field4955;
    @ObfuscatedName(value="pl")
    static int field4956;
    @ObfuscatedName(value="pr")
    @ObfuscatedSignature(descriptor="[Lhw;")
    static SoundEffect[] field4959;
    @ObfuscatedName(value="pv")
    static int[] field4960;
    @ObfuscatedName(value="pz")
    static int[] field4961;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1222574629)
    public static int field4741 = 306399661;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=253396789)
    static int field4748 = 0;
    @ObfuscatedName(value="bu")
    static boolean field4753 = true;
    @ObfuscatedName(value="cb")
    static int field4756 = 0;
    @ObfuscatedName(value="cn")
    static int field4764 = 0;
    @ObfuscatedName(value="cq")
    static boolean field4766 = false;
    @ObfuscatedName(value="ct")
    @ObfuscatedGetter(intValue=-504469727)
    static int field4767 = 0;
    @ObfuscatedName(value="cy")
    static int field4770 = 0;
    @ObfuscatedName(value="dm")
    static int field4775 = 0;
    @ObfuscatedName(value="eh")
    @ObfuscatedSignature(descriptor="Lhe;")
    static class105 field4780;
    @ObfuscatedName(value="el")
    static int[] field4783;
    @ObfuscatedName(value="et")
    static int field4785 = 0;
    @ObfuscatedName(value="ez")
    @Export(value="Login_isUsernameRemembered")
    static boolean Login_isUsernameRemembered = false;
    @ObfuscatedName(value="fa")
    @ObfuscatedGetter(intValue=1337859839)
    static int field4788 = 0;
    @ObfuscatedName(value="fz")
    static int field4799;
    @ObfuscatedName(value="gr")
    @ObfuscatedGetter(intValue=298870723)
    static int field4805;
    @ObfuscatedName(value="hg")
    static int field4812;
    @ObfuscatedName(value="hk")
    static boolean field4815;
    @ObfuscatedName(value="ht")
    @ObfuscatedGetter(intValue=-76297649)
    static int field4818;
    @ObfuscatedName(value="hz")
    @ObfuscatedGetter(intValue=-720896041)
    static int field4822;
    @ObfuscatedName(value="ia")
    static int field4823;
    @ObfuscatedName(value="ie")
    @ObfuscatedGetter(intValue=1255872291)
    @Export(value="viewportTempY")
    static int viewportTempY;
    @ObfuscatedName(value="ij")
    static int field4831;
    @ObfuscatedName(value="ik")
    static int[] field4832;
    @ObfuscatedName(value="it")
    public static String field4841;
    @ObfuscatedName(value="iv")
    static int[] field4843;
    @ObfuscatedName(value="iy")
    static int[] field4845;
    @ObfuscatedName(value="jv")
    @ObfuscatedGetter(intValue=-377221927)
    static int field4858;
    @ObfuscatedName(value="jx")
    @ObfuscatedSignature(descriptor="[Lhv;")
    public static Player[] field4859;
    @ObfuscatedName(value="jy")
    static int field4860;
    @ObfuscatedName(value="ka")
    static int field4861;
    @ObfuscatedName(value="kb")
    static int[] field4862;
    @ObfuscatedName(value="kd")
    @ObfuscatedSignature(descriptor="[[[Lfe;")
    static NodeDeque[][][] field4864;
    @ObfuscatedName(value="ke")
    static int[] field4865;
    @ObfuscatedName(value="kj")
    static int field4868;
    @ObfuscatedName(value="ko")
    @ObfuscatedGetter(intValue=1255069865)
    public static int field4872;
    @ObfuscatedName(value="kp")
    @ObfuscatedGetter(intValue=282494561)
    static int field4873;
    @ObfuscatedName(value="kq")
    @ObfuscatedGetter(intValue=-1255210505)
    static int field4874;
    @ObfuscatedName(value="ks")
    static int[] field4876;
    @ObfuscatedName(value="kv")
    @ObfuscatedSignature(descriptor="Lfe;")
    static NodeDeque field4877;
    @ObfuscatedName(value="le")
    @ObfuscatedSignature(descriptor="Lax;")
    static Widget field4885;
    @ObfuscatedName(value="ll")
    static int field4890;
    @ObfuscatedName(value="lm")
    @ObfuscatedSignature(descriptor="Lax;")
    public static Widget field4891;
    @ObfuscatedName(value="lo")
    @ObfuscatedGetter(intValue=-2104306015)
    static int field4893;
    @ObfuscatedName(value="mn")
    @ObfuscatedSignature(descriptor="Lax;")
    static Widget field4906;
    @ObfuscatedName(value="mo")
    static int field4907;
    @ObfuscatedName(value="mp")
    static int field4908;
    @ObfuscatedName(value="mv")
    static boolean field4912;
    @ObfuscatedName(value="nl")
    @ObfuscatedSignature(descriptor="Lfe;")
    static NodeDeque field4924;
    @ObfuscatedName(value="ns")
    @ObfuscatedGetter(intValue=-377835551)
    static int field4930;
    @ObfuscatedName(value="nt")
    static int field4931;
    @ObfuscatedName(value="nz")
    static int field4936;
    @ObfuscatedName(value="ob")
    static float field4937;
    @ObfuscatedName(value="ot")
    static int field4949;
    @ObfuscatedName(value="ox")
    @ObfuscatedSignature(descriptor="[Lek;")
    static class384[] field4951;
    @ObfuscatedName(value="pn")
    @ObfuscatedGetter(intValue=-420135773)
    static int field4957;
    @ObfuscatedName(value="ab")
    @Export(value="isLowDetail")
    static boolean isLowDetail = false;
    @ObfuscatedName(value="dc")
    static int field4771 = 0;
    @ObfuscatedName(value="dd")
    @ObfuscatedGetter(intValue=-1486145819)
    static int field4772 = 0;
    @ObfuscatedName(value="dg")
    static int field4774 = 0;
    @ObfuscatedName(value="dp")
    @ObfuscatedGetter(intValue=1183594211)
    @Export(value="js5Errors")
    static int js5Errors = 0;
    @ObfuscatedName(value="dr")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field4777;
    @ObfuscatedName(value="dy")
    @ObfuscatedSignature(descriptor="Lpg;")
    static class360 field4778;
    @ObfuscatedName(value="ei")
    @ObfuscatedSignature(descriptor="Lje;")
    public static final PacketWriter field4781;
    @ObfuscatedName(value="ek")
    @ObfuscatedSignature(descriptor="[Lil;")
    static NPC[] field4782;
    @ObfuscatedName(value="hb")
    static int field4808;
    @ObfuscatedName(value="hd")
    @ObfuscatedGetter(intValue=1667958991)
    static int field4810;
    @ObfuscatedName(value="iw")
    @ObfuscatedGetter(intValue=377530725)
    static int field4844;
    @ObfuscatedName(value="kr")
    static int[] field4875;
    @ObfuscatedName(value="lc")
    @ObfuscatedGetter(intValue=-1461117577)
    static int field4883;
    @ObfuscatedName(value="oc")
    static int[] field4938;
    @ObfuscatedName(value="id")
    static boolean field4826;
    @ObfuscatedName(value="in")
    static int[] field4835;
    @ObfuscatedName(value="ir")
    static int field4839;
    @ObfuscatedName(value="jp")
    @ObfuscatedGetter(intValue=1976218495)
    static int field4853;
    @ObfuscatedName(value="hv")
    static int field4820;
    @ObfuscatedName(value="il")
    static int[] field4833;
    @ObfuscatedName(value="ay")
    public boolean field4997 = false;
    @ObfuscatedName(value="ja")
    @ObfuscatedSignature(descriptor="Lbl;")
    class265 field5000;
    @ObfuscatedName(value="jb")
    @ObfuscatedSignature(descriptor="Lav;")
    class261 field5001;

    static {
        field4778 = class360.field6560;
        Login_isUsernameRemembered = false;
        field4780 = new class105();
        randomDatData = null;
        field4782 = new NPC[32768];
        field4779 = 0;
        field4783 = new int[32768];
        field4785 = 0;
        field4786 = new int[250];
        field4781 = new PacketWriter();
        field4799 = 0;
        field4793 = false;
        field4798 = true;
        field4792 = new Timer();
        field4795 = new HashMap();
        field4789 = 0;
        field4796 = 1;
        field4794 = 0;
        field4788 = 1;
        field4797 = 0;
        field4802 = new CollisionMap[4];
        field4803 = false;
        field4800 = (int[][][])Array.newInstance(Integer.TYPE, 4, 13, 13);
        field4806 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        field4804 = 0;
        field4801 = 2301979;
        field4805 = 5063219;
        field4819 = 3353893;
        field4810 = 7759444;
        field4815 = false;
        field4814 = 0;
        field4812 = -2080859008;
        field4813 = 0;
        field4817 = 0;
        field4808 = 0;
        field4816 = 0;
        field4821 = 0;
        field4822 = 0;
        field4818 = 0;
        field4807 = 0;
        field4820 = -917703754;
        field4809 = 0;
        field4811 = 0;
        field4823 = 0;
        field4839 = -876618116;
        field4834 = 1771657190;
        field4829 = 0;
        field4826 = false;
        field4831 = 0;
        field4825 = false;
        field4837 = 0;
        field4838 = 0;
        field4824 = 50;
        field4843 = new int[field4824];
        field4833 = new int[field4824];
        field4830 = new int[field4824];
        field4842 = new int[field4824];
        field4835 = new int[field4824];
        field4845 = new int[field4824];
        field4832 = new int[field4824];
        field4828 = new String[field4824];
        field4840 = (int[][])Array.newInstance(Integer.TYPE, 104, 104);
        field4844 = 0;
        viewportTempX = -1;
        viewportTempY = -1;
        field4857 = true;
        field4846 = 0;
        field4854 = 0;
        field4853 = 0;
        field4847 = 0;
        field4860 = 0;
        field4851 = 0;
        field4852 = false;
        field4850 = 0;
        field4855 = 0;
        field4849 = true;
        field4859 = new Player[2048];
        field4858 = -1;
        field4848 = 0;
        renderSelf = true;
        field4868 = 0;
        field4861 = 0;
        field4876 = new int[1000];
        field4865 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
        field4874 = -1;
        field4864 = (NodeDeque[][][])Array.newInstance(fe.class, 4, 104, 104);
        field4869 = new NodeDeque();
        widgetFlags = new NodeDeque();
        field4877 = new NodeDeque();
        field4878 = new int[25];
        field4875 = new int[25];
        field4862 = new int[25];
        field4871 = 0;
        field4867 = -1;
        field4873 = -1;
        field4870 = -1;
        field4879 = 0;
        field4880 = 50;
        field4872 = 0;
        field4841 = null;
        field4866 = -1;
        interfaceParents = new NodeHashTable(8);
        field4890 = 0;
        field4883 = 1;
        field4901 = 0;
        field4896 = 0;
        field4891 = null;
        field4892 = 0;
        field4897 = 0;
        field4899 = 0;
        field4889 = 1;
        field4900 = false;
        field4887 = null;
        field4898 = null;
        field4885 = null;
        field4881 = 0;
        field4893 = 0;
        field4902 = null;
        field4882 = false;
        field4886 = -1;
        field4884 = -1;
        field4888 = false;
        field4894 = 1;
        field4914 = 1;
        field4912 = false;
        field4906 = null;
        field4904 = 1;
        field4913 = new int[32];
        field4910 = 0;
        field4905 = new int[32];
        field4911 = 0;
        field4909 = new int[32];
        field4908 = 0;
        field4903 = 0;
        field4907 = 0;
        field4931 = 0;
        field4936 = 0;
        field4929 = 0;
        field4922 = 0;
        field4917 = 0;
        field4916 = 0;
        field4935 = new NodeDeque();
        field4924 = new NodeDeque();
        field4933 = new NodeDeque();
        field4923 = new NodeHashTable(512);
        field4918 = 0;
        field4930 = -2;
        field4920 = new boolean[100];
        field4927 = new boolean[100];
        field4926 = new boolean[100];
        field4925 = new int[100];
        field4934 = new int[100];
        field4915 = new int[100];
        field4928 = new int[100];
        field4919 = 2;
        field4932 = 0L;
        isResizable = true;
        field4937 = 1.77778f;
        field4946 = new int[]{0xFFFF00, 0xFF0000, 65280, 65535, 0xFF00FF, 0xFFFFFF};
        field4944 = 0;
        field4939 = 0;
        field4950 = new long[100];
        field4948 = 0;
        field4942 = 1L;
        field4940 = 1;
        field4947 = 0;
        field4941 = new int[1000];
        field4938 = new int[1000];
        field4951 = new class384[1000];
        field4945 = 0;
        field4949 = 0;
        field4957 = 0;
        field4953 = 1;
        field4952 = false;
        field4956 = 0;
        field4960 = new int[50];
        field4961 = new int[50];
        field4955 = new int[50];
        field4954 = new int[50];
        field4959 = new SoundEffect[50];
        field4958 = false;
        field4972 = new boolean[5];
        field4962 = new int[5];
        field4976 = new int[5];
        field4973 = new int[5];
        field4965 = new int[5];
        Math.log(2.0);
        field4963 = (short)256;
        field4974 = (short)(field4963 * 205 / 256);
        field4975 = (short)256;
        field4964 = (short)320;
        field4970 = 1;
        field4969 = (short)32767;
        field4967 = 1;
        field4968 = (short)32767;
        field4966 = 0;
        field4971 = 0;
        field4980 = 0;
        field4982 = 0;
        field4987 = 0;
        field4981 = new class6();
        field4977 = -1;
        field4983 = -1;
        field4979 = new class258();
        field4985 = new class208[8];
        field4986 = new class127();
        field4988 = 1530546629;
        archiveLoaders = new ArrayList(10);
        field4984 = 0;
        field4993 = 0;
        field4990 = new class206(250);
        field4994 = new class206(250);
        new class206(250);
        field4989 = true;
        field4991 = true;
        field4992 = new class314();
        field4996 = new int[50];
        field4995 = new int[50];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    @ObfuscatedName(value="af")
    protected final void vmethod8278(byte var1_1) {
        var1_1 = 0;
        while (true) {
            block22: {
                if (var1_1 > 20) ** GOTO lbl-1000
                var3_3 = this.method5726(Integer.toString(var1_1));
                if (var3_3 == null) break block22;
                switch (var1_1) {
                    case 19: {
                        class288.field5963 = var3_3;
                        break block22;
                    }
                    case 17: {
                        class17.field314 = var3_3;
                        break block22;
                    }
                    case 15: {
                        Client.gameBuild = Integer.parseInt(var3_3);
                        break block22;
                    }
                    case 14: {
                        Client.field4745 = Integer.parseInt(var3_3);
                        break block22;
                    }
                    case 12: {
                        Client.field4741 = Integer.parseInt(var3_3);
                        break block22;
                    }
                    case 11: {
                        class298.field6041 = var3_3;
                        break block22;
                    }
                    case 10: {
                        class170.field3784 = (class302)class90.method4803(class0.method1(), Integer.parseInt(var3_3), 2133545996);
                        Client.field4743 = class170.field3784 == class302.field6079 ? LoginType.oldscape : LoginType.field3966;
                        break block22;
                    }
                    case 9: {
                        Client.field4744 = var3_3;
                        break block22;
                    }
                    case 8: {
                        var3_3.equalsIgnoreCase(class145.field3605);
                        break block22;
                    }
                    case 7: {
                        class177.field3804 = class63.method4013(Integer.parseInt(var3_3), (byte)17);
                        break block22;
                    }
                    case 6: {
                        class311.field6141 = Language.method11567(Integer.parseInt(var3_3));
                        break block22;
                    }
                    case 5: {
                        Client.field4748 = Integer.parseInt(var3_3);
                        break block22;
                    }
                    case 4: {
                        if (this.method5714(526409609) == -1) {
                            this.method5711(Integer.parseInt(var3_3));
                        }
                        break block22;
                    }
                    case 3: {
                        Client.field4738 = var3_3.equalsIgnoreCase(class145.field3605);
                        break block22;
                    }
                    case 2: {
                        VertexNormal.field518 = var3_3;
                        break block22;
                    }
                    case 1: {
                        var2_2 = Integer.parseInt(var3_3) != 0;
                    }
                }
lbl-1000:
                // 1 sources

                {
                    var3_3 = class177.field3804.name;
                    try {
                        class90.method4804(this.method5763(), "oldschool", var3_3, 0, 21);
                        return;
                    }
                    catch (Exception var3_4) {
                        class56.RunException_sendStackTrace(null, var3_4);
                        return;
                    }
                    default: {
                        break block22;
                    }
                }
                Client.field4798 = var2_2;
            }
            var1_1 = (byte)(var1_1 + 1);
        }
    }

    @Override
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-12038")
    protected final void vmethod8281() {
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;S)V", garbageValue="30942")
    public final void method8282(String string2) {
        class17.field314 = string2;
    }

    @Override
    @ObfuscatedName(value="an")
    protected final void vmethod8283(int n) {
        Object object;
        gameState = 0;
        field4763 = 0;
        if (Skills.field3151 == null) {
            Skills.field3151 = this.method5742().getHost();
        }
        class162.method6379(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}, (short)128);
        n = gameBuild != 0 ? field4741 + 40000 : 43594;
        VarbitDefinition.port1 = n;
        n = gameBuild != 0 ? field4741 + 50000 : 443;
        class292.port2 = n;
        ScriptEvent.port3 = VarbitDefinition.port1;
        GrandExchangeOfferTotalQuantityComparator.field3995 = class0.field3;
        class6.field52 = class0.field0;
        GrandExchangeOfferTotalQuantityComparator.field3994 = class0.field2;
        ByteArrayPool.field3891 = class0.field4;
        class90.field2701 = new UrlRequester();
        this.method5716();
        this.method5707();
        class294.field6004 = new class318();
        class372.field6952 = this.method5713();
        class45.masterDisk = new ArchiveDisk(255, class197.JagexCache_dat2File, class197.field3915, 500000);
        ServerPacket.clientPreferences = class324.method11444(1511834447);
        if (!VertexNormal.field518.endsWith("operator/v1/")) {
            object = new StringBuilder();
            ((StringBuilder)object).append(VertexNormal.field518);
            ((StringBuilder)object).append("operator/v1/");
            VertexNormal.field518 = ((StringBuilder)object).toString();
        }
        BZip2State.field3660.vmethod12662(class298.field6041, VertexNormal.field518, WorldMapElement.method12941("secure", true));
        object = BZip2State.field3660.vmethod12647();
        class119.field3363 = new class120((class18)object, ServerPacket.clientPreferences);
        if (object != null) {
            ((class18)object).vmethod10070();
            if (BZip2State.field3660.method12013()) {
                ((class18)object).vmethod10057();
                ((class18)object).vmethod10052();
                ((class18)object).vmethod10050();
            }
        }
        this.method5712();
        if (gameBuild != 0) {
            field4766 = true;
        }
        this.openMenu(ServerPacket.clientPreferences.field3160, -822566491);
        class381.friendSystem = new FriendSystem(field4743);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lmz;I)V", garbageValue="1265878821")
    public void method8284(class198 class1982) {
        class141.field3579 = class1982;
    }

    @Override
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1562357955")
    protected final void vmethod8285() {
        this.method8309();
        field4781.close();
        class372.field6952 = null;
        if (DevicePcmPlayer.field4627 != null) {
            DevicePcmPlayer.field4627.method5065(494474576);
        }
        if (class28.field494 != null) {
            class28.field494.method5065(-1146421113);
        }
        class9.method156();
        class11.method286();
        archiveLoaders.clear();
        field4984 = 0;
        field4993 = 0;
        field4982 = 0;
        field4980 = 0;
        if (class90.field2701 != null) {
            class90.field2701.close();
            class90.field2701 = null;
        }
        GameObject.method1220((byte)89);
        class69.method4106();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @ObfuscatedName(value="aw")
    protected final void vmethod8288(boolean bl, float f, int n) {
        block23: {
            Object object;
            block24: {
                block27: {
                    block25: {
                        block26: {
                            block22: {
                                class123.field3410 = f;
                                object = this.field3567.vmethod11005();
                                if (DevicePcmPlayer.field4627 != null) {
                                    DevicePcmPlayer.field4627.method5066(BZip2State.field3660.method12008());
                                }
                                if (class28.field494 != null) {
                                    MidiPcmStream midiPcmStream = AbstractWorldMapData.field2346;
                                    boolean bl2 = BZip2State.field3660.method12008() && !field4952;
                                    midiPcmStream.method13735(bl2);
                                    class28.field494.method5066(BZip2State.field3660.method12008());
                                }
                                if (class16.method333() && field4952 && DevicePcmPlayer.field4627 != null) {
                                    DevicePcmPlayer.field4627.method5074();
                                }
                                if ((gameState <= 10 || gameState == 20 || gameState == 30) && 0L != field4932 && class363.currentTimeMillis() > field4932) {
                                    this.openMenu(class294.getWindowedMode(), -1423535665);
                                }
                                if (bl) {
                                    for (n = 0; n < 100; ++n) {
                                        Client.field4920[n] = true;
                                    }
                                }
                                if (gameState != 0) break block22;
                                this.method5755(Login.field3177 * 5, Login.field3176, bl);
                                break block23;
                            }
                            if (gameState == 5 || gameState == 10 || gameState == 11 || gameState == 20) break block24;
                            if (gameState != 25) break block25;
                            Client.field4740.field3567.vmethod11006();
                            if (field4797 != 1) break block26;
                            if (field4789 > field4796) {
                                field4796 = field4789;
                            }
                            break block27;
                        }
                        if (field4797 != 2) {
                            class122.method5420(Strings.field2781, false, -741081282);
                        } else {
                            if (field4794 > field4788) {
                                field4788 = field4794;
                            }
                            n = (field4788 * 50 - field4794 * 50) / field4788;
                            object = new StringBuilder();
                            ((StringBuilder)object).append(Strings.field2781);
                            ((StringBuilder)object).append(class145.field3604);
                            ((StringBuilder)object).append(class145.field3608);
                            ((StringBuilder)object).append(n + 50);
                            ((StringBuilder)object).append("%");
                            ((StringBuilder)object).append(class145.field3602);
                            class122.method5420(((StringBuilder)object).toString(), false, -1434344307);
                        }
                        break block23;
                    }
                    if (gameState == 30) {
                        this.method8294((byte)-126);
                    } else if (gameState == 40) {
                        Client.field4740.field3567.vmethod11006();
                        object = new StringBuilder();
                        ((StringBuilder)object).append(Strings.field2777);
                        ((StringBuilder)object).append(class145.field3604);
                        ((StringBuilder)object).append(Strings.field2778);
                        class122.method5420(((StringBuilder)object).toString(), false, -76678264);
                    } else if (gameState == 45) {
                        Client.field4740.field3567.vmethod11006();
                        class122.method5420("Please wait...", false, -2094901453);
                    }
                    break block23;
                }
                n = (field4796 * 50 - field4789 * 50) / field4796;
                object = new StringBuilder();
                ((StringBuilder)object).append(Strings.field2781);
                ((StringBuilder)object).append(class145.field3604);
                ((StringBuilder)object).append(class145.field3608);
                ((StringBuilder)object).append(n);
                ((StringBuilder)object).append("%");
                ((StringBuilder)object).append(class145.field3602);
                class122.method5420(((StringBuilder)object).toString(), false, -1630897067);
                break block23;
            }
            class6.method79(class265.field4640, class58.field2421, field4791, bl, (class72)object, 1354806209);
        }
        if (gameState == 30 && field4919 == 0 && !bl && !isResizable) {
        } else {
            if (gameState == 1000) {
                this.method5745();
            } else {
                if (gameState <= 0) return;
                this.field3567.vmethod11004(0, 0);
                for (n = 0; n < field4918 * -763111739; ++n) {
                    Client.field4927[n] = false;
                }
                return;
            }
            for (n = 0; n < field4918 * -763111739; ++n) {
                Client.field4927[n] = false;
            }
            return;
        }
        for (n = 0; n < field4918 * -763111739; ++n) {
            if (!field4927[n]) continue;
            this.field3567.vmethod11013(field4925[n], field4934[n], field4915[n], field4928[n]);
            Client.field4927[n] = false;
        }
    }

    @Override
    @ObfuscatedName(value="ay")
    protected final void vmethod8290(int n) {
        cycle -= -1;
        this.drawLoggedIn();
        class301.method11034();
        HorizontalAlignment.method10444(1910772884);
        Projectile.method14468();
        field4917 = 0;
        field4916 = 0;
        if (class372.field6952 != null && (n = class372.field6952.rsOrdinal()) != 0) {
            field4917 = n;
        }
        class294.field6004.method11272((byte)-14);
        if (this.field3570.method10950()) {
            class12.field273 = class363.currentTimeMillis();
        }
        class72 class722 = this.field3567.vmethod11005();
        if (gameState == 0) {
            class145.method6034((byte)-86);
            class277.method10337(1848435416);
        } else if (gameState == 5) {
            class304.method11061(this, class722, 2066244001);
            class145.method6034((byte)-72);
            class277.method10337(514393583);
        } else if (gameState != 10 && gameState != 11) {
            if (gameState == 20) {
                class304.method11061(this, class722, 1703278753);
                this.method8292();
            } else if (gameState == 25) {
                Tile.method7733((byte)1);
            }
        } else {
            class304.method11061(this, class722, 1565252280);
        }
        if (gameState != 30) {
            if (gameState == 40 || gameState == 45) {
                this.method8292();
            }
            return;
        }
        this.method8293();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="87")
    @Export(value="drawLoggedIn")
    void drawLoggedIn() {
        if (gameState != 1000) {
            if (!PacketBuffer.method13784((byte)-15)) {
                this.method8286((byte)124);
            }
            return;
        }
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2087736281")
    final void method8292() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e0expr(TypeTransformer.java:441)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:710)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    @Override
    @ObfuscatedName(value="ce")
    @Export(value="openMenu")
    protected void openMenu(int n, int n2) {
        field4932 = 0L;
        isResizable = n >= 2;
        if (!Client.field4740.field4997 && class294.getWindowedMode() != 1) {
            field4740.method5705(7680, 2160);
        } else {
            float f = gameState == 30 ? field4937 : 1.77778f;
            int n3 = (int)(f * 503.0f);
            n2 = 503;
            if (Client.field4740.field3553 > f) {
                n = (int)(Client.field4740.field3553 * 503.0f);
            } else {
                n = n3;
                if (Client.field4740.field3553 > 0.0f) {
                    n2 = (int)((float)n3 / Client.field4740.field3553);
                    n = n3;
                }
            }
            field4740.method5705(n, n2);
        }
        if (gameState >= 25) {
            class100.method4881();
        }
    }

    @ObfuscatedName(value="cl")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1887876576")
    void method8296() {
        class72 class722 = this.field3567.vmethod11005();
        if (this.field5001 != null) {
            this.field5000.method7656(class722.field2529, class722.field2525, class722.field2527);
            return;
        }
        this.field5000 = new class265(class722.field2529, class722.field2525, class722.field2527);
        this.field5001 = new class261(this.field5000);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="cu")
    void method8297(int n) {
        ClientPreferences clientPreferences;
        int n2 = class50.field2368 * -2044550075;
        n = class127.field3441 * 2035925329;
        if (this.field3554 < n2 * -712192371) {
            n2 = this.field3554 * 566075789;
        }
        if (this.field3552 < n * 891168689) {
            n = this.field3552 * 1160407101;
        }
        if ((clientPreferences = ServerPacket.clientPreferences) == null) return;
        try {
            class142.method5970(field4740, "resize", new Object[]{class294.getWindowedMode()});
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    @ObfuscatedName(value="fc")
    @ObfuscatedSignature(descriptor="(IIIIIIIII)V", garbageValue="-1737730726")
    final void method8301(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (WorldMapIcon_1.loadInterface(n, -1706912946)) {
            class323.field6265 = null;
            this.method8302(class79.Widget_interfaceComponents[n], -1, n2, n3, n4, n5, n6, n7, n8, 1282258510);
            if (class323.field6265 != null) {
                this.method8302(class323.field6265, -1412584499, n2, n3, n4, n5, class37.field579, AbstractWorldMapIcon.field2276, n8, 1767149404);
                class323.field6265 = null;
            }
            return;
        }
        if (n8 == -1) {
            n = 0;
            while (true) {
                if (n >= 100) {
                    return;
                }
                Client.field4920[n] = true;
                ++n;
            }
        }
        Client.field4920[n8] = true;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="fe")
    @ObfuscatedSignature(descriptor="([Lax;IIIIIIIII)V")
    final void method8302(Widget[] var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, int var10_10) {
        var26_11 = var1_1;
        var25_12 = this.field3567.vmethod11005();
        var25_12.method4238(var3_3, var4_4, var5_5, var6_6, -448408016);
        this.field5000.method656(var3_3, var4_4, var5_5, var6_6, 65280);
        this.field5000.method654();
        var12_13 = 0;
        while (true) {
            block157: {
                block158: {
                    block160: {
                        block163: {
                            block168: {
                                block171: {
                                    block170: {
                                        block172: {
                                            block174: {
                                                block191: {
                                                    block190: {
                                                        block175: {
                                                            block176: {
                                                                block173: {
                                                                    block169: {
                                                                        block167: {
                                                                            block161: {
                                                                                block166: {
                                                                                    block165: {
                                                                                        block164: {
                                                                                            block162: {
                                                                                                block159: {
                                                                                                    var16_18 = var3_3;
                                                                                                    var10_10 = var2_2;
                                                                                                    var15_17 = var4_4;
                                                                                                    var14_16 = var5_5;
                                                                                                    var13_15 = var6_6;
                                                                                                    if (var12_13 >= ((Widget[])var26_11).length) {
                                                                                                        return;
                                                                                                    }
                                                                                                    var28_28 = var26_11[var12_13];
                                                                                                    if (var28_28 == null || var10_10 != var28_28.parentId && (var10_10 != -1412584499 || var28_28 != Client.field4898)) break block158;
                                                                                                    if (var9_9 != -1) {
                                                                                                        var20_22 = var9_9;
                                                                                                    } else {
                                                                                                        Client.field4925[Client.field4918 * -763111739] = var7_7 + var28_28.x;
                                                                                                        Client.field4934[Client.field4918 * -763111739] = var8_8 + var28_28.y;
                                                                                                        Client.field4915[Client.field4918 * -763111739] = var28_28.width;
                                                                                                        Client.field4928[Client.field4918 * -763111739] = var28_28.height;
                                                                                                        Client.field4918 = var11_14 = Client.field4918 + 1144469517;
                                                                                                        var20_22 = var11_14 * -763111739 - 1;
                                                                                                    }
                                                                                                    var28_28.field4619 = var20_22;
                                                                                                    var28_28.cycle = Client.cycle;
                                                                                                    if (var28_28.isIf3 && ClientPacket.isComponentHidden((Widget)var28_28)) break block158;
                                                                                                    if (var28_28.type > 0) {
                                                                                                        class45.runScript((Widget)var28_28, -1661141893);
                                                                                                    }
                                                                                                    var19_21 = var7_7 + var28_28.x;
                                                                                                    var21_23 = var8_8 + var28_28.y;
                                                                                                    var22_24 = var28_28.field4504 * 1438386901;
                                                                                                    var17_19 = var19_21;
                                                                                                    var18_20 = var21_23;
                                                                                                    if (var28_28 != Client.field4898) ** GOTO lbl-1000
                                                                                                    if (var10_10 == -1412584499 || var28_28.field4581) break block159;
                                                                                                    class323.field6265 = var26_11;
                                                                                                    class37.field579 = var7_7;
                                                                                                    AbstractWorldMapIcon.field2276 = var8_8;
                                                                                                    break block158;
                                                                                                }
                                                                                                var11_14 = var19_21;
                                                                                                var10_10 = var21_23;
                                                                                                if (Client.field4912) {
                                                                                                    var11_14 = var19_21;
                                                                                                    var10_10 = var21_23;
                                                                                                    if (Client.field4882) {
                                                                                                        var11_14 = class294.field6004.field6208[0];
                                                                                                        var10_10 = class294.field6004.field6200[0];
                                                                                                        var17_19 = var10_10 - Client.field4893;
                                                                                                        var10_10 = var11_14 -= Client.field4881;
                                                                                                        if (var11_14 < Client.field4886) {
                                                                                                            var10_10 = Client.field4886;
                                                                                                        }
                                                                                                        if (var10_10 + var28_28.width > Client.field4886 + Client.field4885.width) {
                                                                                                            var10_10 = Client.field4886 + Client.field4885.width - var28_28.width;
                                                                                                        }
                                                                                                        var11_14 = var17_19;
                                                                                                        if (var17_19 < Client.field4884) {
                                                                                                            var11_14 = Client.field4884;
                                                                                                        }
                                                                                                        var17_19 = var11_14;
                                                                                                        if (var11_14 + var28_28.height > Client.field4884 + Client.field4885.height) {
                                                                                                            var17_19 = Client.field4884 + Client.field4885.height - var28_28.height;
                                                                                                        }
                                                                                                        var11_14 = var10_10;
                                                                                                        var10_10 = var17_19;
                                                                                                    }
                                                                                                }
                                                                                                var17_19 = var11_14;
                                                                                                var18_20 = var10_10;
                                                                                                if (var28_28.field4581) lbl-1000:
                                                                                                // 2 sources

                                                                                                {
                                                                                                    var10_10 = var22_24 * -610083203;
                                                                                                    var11_14 = var17_19;
                                                                                                    var17_19 = var10_10;
                                                                                                    var10_10 = var18_20;
                                                                                                } else {
                                                                                                    var17_19 = 128;
                                                                                                }
                                                                                                if (var28_28.type != 2) {
                                                                                                    if (var28_28.type != 9) {
                                                                                                        var19_21 = var11_14 + var28_28.width;
                                                                                                        var18_20 = var10_10 + var28_28.height;
                                                                                                        if (var11_14 > var16_18) {
                                                                                                            var16_18 = var11_14;
                                                                                                        }
                                                                                                        if (var10_10 > var15_17) {
                                                                                                            var15_17 = var10_10;
                                                                                                        }
                                                                                                        if (var19_21 < var14_16) {
                                                                                                            var14_16 = var19_21;
                                                                                                        }
                                                                                                        if (var18_20 < var13_15) {
                                                                                                            var13_15 = var18_20;
                                                                                                        }
                                                                                                        var18_20 = var14_16;
                                                                                                        var14_16 = var15_17;
                                                                                                        var15_17 = var18_20;
                                                                                                    } else {
                                                                                                        var18_20 = var11_14 + var28_28.width;
                                                                                                        var19_21 = var10_10 + var28_28.height;
                                                                                                        if (var18_20 < var11_14) {
                                                                                                            var21_23 = var11_14;
                                                                                                        } else {
                                                                                                            var21_23 = var18_20;
                                                                                                            var18_20 = var11_14;
                                                                                                        }
                                                                                                        if (var19_21 < var10_10) {
                                                                                                            var22_24 = var10_10;
                                                                                                        } else {
                                                                                                            var23_25 = var10_10;
                                                                                                            var22_24 = var19_21;
                                                                                                            var19_21 = var23_25;
                                                                                                        }
                                                                                                        var23_25 = var21_23 + 1;
                                                                                                        var21_23 = var22_24 + 1;
                                                                                                        if (var18_20 <= var16_18) {
                                                                                                            var18_20 = var16_18;
                                                                                                        }
                                                                                                        if (var19_21 <= var15_17) {
                                                                                                            var19_21 = var15_17;
                                                                                                        }
                                                                                                        var15_17 = var23_25 < var14_16 ? var23_25 : var14_16;
                                                                                                        if (var21_23 < var13_15) {
                                                                                                            var13_15 = var21_23;
                                                                                                        }
                                                                                                        var16_18 = var18_20;
                                                                                                        var14_16 = var19_21;
                                                                                                    }
                                                                                                } else {
                                                                                                    var18_20 = var14_16;
                                                                                                    var14_16 = var15_17;
                                                                                                    var15_17 = var18_20;
                                                                                                }
                                                                                                if (var28_28.isIf3 && (var16_18 >= var15_17 || var14_16 >= var13_15)) break block160;
                                                                                                if (var28_28.type == 0) break block161;
                                                                                                if (var28_28.type != 1336) break block162;
                                                                                                if (!Client.field4766) break block160;
                                                                                                break block163;
                                                                                            }
                                                                                            if (var28_28.type != 1337) break block164;
                                                                                            Client.field4867 = var11_14;
                                                                                            Client.field4873 = var10_10;
                                                                                            Client.field4870 = var28_28.id >>> 16;
                                                                                            ModeWhere.method11616(var11_14, var10_10, var28_28.width, var28_28.height, -1466687688);
                                                                                            Client.field4920[var28_28.field4619] = true;
                                                                                            var25_12.method4238(var3_3, var4_4, var5_5, var6_6, -448408016);
                                                                                            break block160;
                                                                                        }
                                                                                        if (var28_28.type != 1338) break block165;
                                                                                        if (Client.field4991) {
                                                                                            this.method8307((Widget)var28_28, var11_14, var10_10, var20_22, 1835854908);
                                                                                            var25_12.method4238(var3_3, var4_4, var5_5, var6_6, -448408016);
                                                                                        }
                                                                                        break block160;
                                                                                    }
                                                                                    if (var28_28.type != 1339) break block166;
                                                                                    this.method8311((Widget)var28_28, var11_14, var10_10, var20_22);
                                                                                    var25_12.method4238(var3_3, var4_4, var5_5, var6_6, -448408016);
                                                                                    break block160;
                                                                                }
                                                                                if (var28_28.type == 1400) {
                                                                                    class10.field251.method7190(var11_14, var10_10, var28_28.width, var28_28.height, Client.cycle, (class72)var25_12, (byte)97);
                                                                                }
                                                                                if (var28_28.type == 1401) {
                                                                                    class10.field251.getIconsForTiles(var11_14, var10_10, var28_28.width, var28_28.height, (class72)var25_12);
                                                                                }
                                                                                if (var28_28.type == 1402) {
                                                                                    class272.field4710.method5669(var11_14, Client.cycle, (class72)var25_12, -2018378471);
                                                                                }
                                                                            }
                                                                            var18_20 = var13_15;
                                                                            var13_15 = var12_13;
                                                                            if (var28_28.type != 0) break block167;
                                                                            if (!var28_28.isIf3 && ClientPacket.isComponentHidden((Widget)var28_28) && var28_28 != class285.mousedOverWidgetIf1) break block160;
                                                                            if (!var28_28.isIf3) {
                                                                                if (var28_28.field4498 > var28_28.field4507 - var28_28.height) {
                                                                                    var28_28.field4498 = var28_28.field4507 - var28_28.height;
                                                                                }
                                                                                if (var28_28.field4498 < 0) {
                                                                                    var28_28.field4498 = 0;
                                                                                }
                                                                            }
                                                                            var21_23 = var28_28.id * -452062427;
                                                                            var22_24 = var28_28.field4490 * -1758230753;
                                                                            var23_25 = var28_28.field4498 * 1112308815;
                                                                            var19_21 = var10_10;
                                                                            this.method8302(var1_1, var21_23 * -226242387, var16_18, var14_16, var15_17, var18_20, var11_14 - var22_24 * 1056257247, var10_10 - var23_25 * -1397155153, var20_22, 1396436099);
                                                                            if (var28_28.children != null) {
                                                                                this.method8302(var28_28.children, var28_28.id, var16_18, var14_16, var15_17, var18_20, var11_14 - var28_28.field4490, var19_21 - var28_28.field4498, var20_22, -1095462550);
                                                                            }
                                                                            if ((var26_11 = (InterfaceParent)Client.interfaceParents.get(var28_28.id)) != null) {
                                                                                this.method8301(var26_11.group, var16_18, var14_16, var15_17, var18_20, var11_14, var19_21, var20_22);
                                                                            }
                                                                            var25_12.method4238(var3_3, var4_4, var5_5, var6_6, -448408016);
                                                                            this.field5000.method656(var3_3, var4_4, var5_5, var6_6, 65280);
                                                                            this.field5000.method654();
                                                                        }
                                                                        if (!Client.isResizable && !Client.field4926[var20_22] && Client.field4919 <= 1) break block160;
                                                                        if (var28_28.type == 0 && !var28_28.isIf3 && var28_28.field4507 > var28_28.height) {
                                                                            this.method8300(var11_14 + var28_28.width, var10_10, var28_28.field4498, var28_28.height, var28_28.field4507, -1209027911);
                                                                        }
                                                                        var19_21 = var11_14;
                                                                        if (var28_28.type == 1) break block160;
                                                                        if (var28_28.type == 2) break block168;
                                                                        var27_27 = var1_1;
                                                                        if (var28_28.type != 3) break block169;
                                                                        if (Widget.runCs1((Widget)var28_28, 816538220)) break block170;
                                                                        var11_14 = var12_13 = var28_28.field4509;
                                                                        if (var28_28 == class285.mousedOverWidgetIf1) {
                                                                            var11_14 = var12_13;
                                                                            if (var28_28.field4508 != 0) {
                                                                                var11_14 = var28_28.field4508;
                                                                            }
                                                                        }
                                                                        break block171;
                                                                    }
                                                                    if (var28_28.type == 4) break block172;
                                                                    if (var28_28.type != 5) break block173;
                                                                    if (!var28_28.isIf3) break block174;
                                                                    var26_11 = var28_28.field4602 != -1 ? class363.method12197(var28_28.field4602, var28_28.field4587, var28_28.field4515, var28_28.field4519, var28_28.field4529, false, -1890053370) : var28_28.method7546(false, -1054797935);
                                                                    if (var26_11 == null) {
                                                                        if (Widget.field4473) {
                                                                            class135.invalidateWidget((Widget)var28_28);
                                                                        }
                                                                    } else {
                                                                        var20_22 = var26_11.field7130;
                                                                        var21_23 = var26_11.field7128;
                                                                        if (!var28_28.field4528) {
                                                                            var11_14 = var28_28.width * 4096 / var20_22;
                                                                            if (var28_28.field4526 != 0) {
                                                                                var25_12.drawBackgroundCircle((class384)var26_11, var28_28.width / 2 + var19_21, var10_10 + var28_28.height / 2, var28_28.field4526, var11_14);
                                                                            } else if (var17_19 == 0) {
                                                                                var27_27 = var25_12;
                                                                                if (var20_22 == var28_28.width && var21_23 == var28_28.height) {
                                                                                    var27_27.vmethod10761((class384)var26_11, var19_21, var10_10, -1783177100);
                                                                                } else {
                                                                                    var27_27.vmethod10763((class384)var26_11, var19_21, var10_10, var28_28.width, var28_28.height, -64204080);
                                                                                }
                                                                            } else {
                                                                                var25_12.vmethod10770((class384)var26_11, var19_21, var10_10, var28_28.width, var28_28.height, 255 - (var17_19 & 255), 1883291738);
                                                                            }
                                                                        } else {
                                                                            var25_12.method4242(var19_21, var10_10, var19_21 + var28_28.width, var10_10 + var28_28.height);
                                                                            var15_17 = (var20_22 - 1 + var28_28.width) / var20_22;
                                                                            var14_16 = (var21_23 - 1 + var28_28.height) / var21_23;
                                                                            block5: for (var12_13 = 0; var12_13 < var15_17; ++var12_13) {
                                                                                var11_14 = 0;
                                                                                while (true) {
                                                                                    if (var11_14 >= var14_16) {
                                                                                        continue block5;
                                                                                    }
                                                                                    if (var28_28.field4526 != 0) {
                                                                                        var25_12.drawBackgroundCircle((class384)var26_11, var20_22 / 2 + var19_21 + var12_13 * var20_22, var21_23 / 2 + var10_10 + var21_23 * var11_14, var28_28.field4526, 4096);
                                                                                    } else {
                                                                                        var16_18 = var11_14;
                                                                                        var18_20 = var12_13;
                                                                                        var27_27 = var26_11;
                                                                                        if (var17_19 == 0) {
                                                                                            var26_11 = var27_27;
                                                                                            var25_12.vmethod10761((class384)var26_11, var19_21 + var18_20 * var20_22, var10_10 + var16_18 * var21_23, 12021185);
                                                                                        } else {
                                                                                            var25_12.vmethod10769((class384)var27_27, var19_21 + var20_22 * var18_20, var10_10 + var16_18 * var21_23, 255 - (var17_19 & 255), -1949833739);
                                                                                        }
                                                                                    }
                                                                                    ++var11_14;
                                                                                }
                                                                            }
                                                                            var25_12.method4238(var3_3, var4_4, var5_5, var6_6, -448408016);
                                                                        }
                                                                    }
                                                                    ** GOTO lbl572
                                                                }
                                                                var26_11 = var25_12;
                                                                if (var28_28.type == 6) break block175;
                                                                if (var28_28.type != 7) ** GOTO lbl246
                                                                var29_29 = var28_28.getFont();
                                                                if (var29_29 == null) break block176;
                                                                var11_14 = 0;
                                                                var12_13 = 0;
                                                                block7: while (true) {
                                                                    block177: {
                                                                        if (var12_13 < var28_28.field4495) break block177;
lbl246:
                                                                        // 2 sources

                                                                        if (var28_28.type != 8 || var28_28 != class275.field5008 || Client.field4880 != Client.field4879) ** GOTO lbl273
                                                                        var30_30 = Client.field4791;
                                                                        var25_12 = class173.method6515(var28_28.field4545, (Widget)var28_28, 983981849);
                                                                        var12_13 = 0;
                                                                        var11_14 = 0;
                                                                        while (true) {
                                                                            block178: {
                                                                                if (var25_12.length() > 0) break block178;
                                                                                var16_18 = var12_13 + 6;
                                                                                var17_19 = var11_14 + 7;
                                                                                var12_13 = var19_21 + var28_28.width - 5 - var16_18;
                                                                                var14_16 = var10_10 + var28_28.height + 5;
                                                                                var15_17 = var19_21 + 5;
                                                                                var11_14 = var12_13;
                                                                                if (var12_13 < var15_17) {
                                                                                    var11_14 = var15_17;
                                                                                }
                                                                                var12_13 = var11_14;
                                                                                if (var16_18 + var11_14 > var5_5) {
                                                                                    var12_13 = var5_5 - var16_18;
                                                                                }
                                                                                var11_14 = var14_16 + var17_19 > var6_6 ? var6_6 - var17_19 : var14_16;
                                                                                var26_11.vmethod10762(var12_13, var11_14, var16_18, var17_19, 0xFFFFA0, (byte)-59);
                                                                                var26_11.method4255(var12_13, var11_14, var16_18, var17_19, 0);
                                                                                var25_12 = var28_28.field4545;
                                                                                var14_16 = var30_30.field7300;
                                                                                var25_12 = class173.method6515((String)var25_12, (Widget)var28_28, 1608864135);
                                                                                var11_14 = var14_16 + var11_14 + 2;
                                                                                while (true) {
                                                                                    block179: {
                                                                                        if (var25_12.length() > 0) break block179;
lbl273:
                                                                                        // 2 sources

                                                                                        if (var28_28.type != 9) ** GOTO lbl297
                                                                                        if (!var28_28.field4534) {
                                                                                            var11_14 = var28_28.width * 2031473261;
                                                                                            var12_13 = var28_28.height * 529619377;
                                                                                            var14_16 = var19_21 + var11_14 * 978257765;
                                                                                            var11_14 = var10_10;
                                                                                            var12_13 = var10_10 + var12_13 * -35303599;
                                                                                            var10_10 = var14_16;
                                                                                        } else {
                                                                                            var11_14 = var28_28.height * 529619377;
                                                                                            var12_13 = var28_28.width * 2031473261;
                                                                                            var11_14 = var10_10 + var11_14 * -35303599;
                                                                                            var14_16 = var19_21 + var12_13 * 978257765;
                                                                                            var12_13 = var10_10;
                                                                                            var10_10 = var14_16;
                                                                                        }
                                                                                        if (var28_28.field4500 != 1) {
                                                                                            var14_16 = var28_28.field4509 * 1479854417;
                                                                                            var15_17 = var28_28.field4500 * -1694986957;
                                                                                            var25_12 = var26_11;
                                                                                            this.method8303(var19_21, var11_14, var10_10, var12_13, var14_16 * -450879567, var15_17 * -827968005, 1365052808);
                                                                                            var26_11 = var27_27;
                                                                                            var10_10 = var13_15;
                                                                                        } else {
                                                                                            var26_11.vmethod10748(var19_21, var11_14, var10_10, var12_13, var28_28.field4509, (byte)-50);
lbl297:
                                                                                            // 2 sources

                                                                                            var25_12 = var26_11;
                                                                                            var10_10 = var13_15;
                                                                                            var26_11 = var27_27;
                                                                                        }
                                                                                        break block157;
                                                                                    }
                                                                                    var14_16 = var25_12.indexOf(class145.field3604);
                                                                                    if (var14_16 == -1) {
                                                                                        var29_29 = var25_12;
                                                                                        var25_12 = "";
                                                                                    } else {
                                                                                        var29_29 = var25_12.substring(0, var14_16);
                                                                                        var25_12 = var25_12.substring(var14_16 + 4);
                                                                                    }
                                                                                    var30_30.method13830((String)var29_29, var12_13 + 3, var11_14, 0, -1, (class72)var26_11);
                                                                                    var11_14 = var11_14 + var30_30.field7300 + 1;
                                                                                }
                                                                            }
                                                                            var14_16 = var25_12.indexOf(class145.field3604);
                                                                            if (var14_16 == -1) {
                                                                                var29_29 = var25_12;
                                                                                var25_12 = "";
                                                                            } else {
                                                                                var29_29 = var25_12.substring(0, var14_16);
                                                                                var25_12 = var25_12.substring(var14_16 + 4);
                                                                            }
                                                                            var15_17 = var30_30.method13851((String)var29_29);
                                                                            var14_16 = var12_13;
                                                                            if (var15_17 > var12_13) {
                                                                                var14_16 = var15_17;
                                                                            }
                                                                            var11_14 = var11_14 + var30_30.field7300 + 1;
                                                                            var12_13 = var14_16;
                                                                        }
                                                                    }
                                                                    var14_16 = 0;
                                                                    while (true) {
                                                                        block181: {
                                                                            block186: {
                                                                                block185: {
                                                                                    block189: {
                                                                                        block188: {
                                                                                            block187: {
                                                                                                block184: {
                                                                                                    block183: {
                                                                                                        block182: {
                                                                                                            block180: {
                                                                                                                if (var14_16 >= var28_28.field4491) break block180;
                                                                                                                if (var28_28.field4603[var11_14] <= 0) break block181;
                                                                                                                var25_12 = class324.ItemDefinition_get(var28_28.field4603[var11_14] - 1);
                                                                                                                if (var25_12.isStackable == 1 || var28_28.field4600[var11_14] != 1) break block182;
                                                                                                                var30_30 = new StringBuilder();
                                                                                                                var30_30.append(class63.colorStartTag(16748608));
                                                                                                                var30_30.append(var25_12.name);
                                                                                                                var30_30.append(class145.field3606);
                                                                                                                var25_12 = var30_30.toString();
                                                                                                                break block183;
                                                                                                            }
                                                                                                            ++var12_13;
                                                                                                            continue block7;
                                                                                                        }
                                                                                                        var30_30 = new StringBuilder();
                                                                                                        var30_30.append(class63.colorStartTag(16748608));
                                                                                                        var30_30.append(var25_12.name);
                                                                                                        var30_30.append(class145.field3606);
                                                                                                        var30_30.append(" ");
                                                                                                        var30_30.append('x');
                                                                                                        var30_30.append(Tile.formatItemStacks(var28_28.field4600[var11_14]));
                                                                                                        var25_12 = var30_30.toString();
                                                                                                    }
                                                                                                    var16_18 = var19_21 + var14_16 * (var28_28.field4543 + 115);
                                                                                                    var17_19 = (var28_28.field4539 + 12) * var12_13 + var10_10;
                                                                                                    if (var28_28.field4557 != 0) break block184;
                                                                                                    var18_20 = var28_28.field4509 * 1479854417;
                                                                                                    if (var28_28.field4550) break block185;
                                                                                                    var15_17 = -1;
                                                                                                    break block186;
                                                                                                }
                                                                                                if (var28_28.field4557 != 1) break block187;
                                                                                                var18_20 = var28_28.width / 2;
                                                                                                var20_22 = var28_28.field4509 * 1479854417;
                                                                                                if (var28_28.field4550) break block188;
                                                                                                var15_17 = -1;
                                                                                                break block189;
                                                                                            }
                                                                                            var18_20 = var28_28.width * 2031473261;
                                                                                            var20_22 = var28_28.field4509 * 1479854417;
                                                                                            var15_17 = !var28_28.field4550 ? -1 : 0;
                                                                                            var29_29.method13834((String)var25_12, var16_18 + var18_20 * 978257765 - 1, var17_19, var20_22 * -450879567, var15_17, (class72)var26_11);
                                                                                            break block181;
                                                                                        }
                                                                                        var15_17 = 0;
                                                                                    }
                                                                                    var29_29.method13844((String)var25_12, var16_18 + var18_20, var17_19, var20_22 * -450879567, var15_17, (class72)var26_11);
                                                                                    break block181;
                                                                                }
                                                                                var15_17 = 0;
                                                                            }
                                                                            var29_29.method13830((String)var25_12, var16_18, var17_19, var18_20 * -450879567, var15_17, (class72)var26_11);
                                                                        }
                                                                        ++var11_14;
                                                                        ++var14_16;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            if (Widget.field4473) {
                                                                class135.invalidateWidget((Widget)var28_28);
                                                            }
                                                            ** GOTO lbl572
                                                        }
                                                        var24_26 = Widget.runCs1((Widget)var28_28, 1738473461);
                                                        var11_14 = !var24_26 ? var28_28.sequenceId : var28_28.sequenceId2;
                                                        var26_11 = null;
                                                        if (var28_28.field4602 != -1) break block190;
                                                        if (var28_28.field4522 == 5) {
                                                            var26_11 = var28_28.field4513 == 0 ? Client.field4981.method90(null, -1, null, -1, -1918780096) : WorldMapScaleHandler.localPlayer.getModel();
                                                        } else if (var11_14 != -1) {
                                                            var26_11 = var27_27 = var28_28.method7550(class122.SequenceDefinition_get(var11_14), var28_28.modelFrame, var24_26, WorldMapScaleHandler.localPlayer.appearance, (byte)-42);
                                                            if (var27_27 == null) {
                                                                var26_11 = var27_27;
                                                                if (Widget.field4473) {
                                                                    class135.invalidateWidget((Widget)var28_28);
                                                                    var26_11 = var27_27;
                                                                }
                                                            }
                                                        } else {
                                                            var26_11 = var27_27 = var28_28.method7550(null, -1, var24_26, WorldMapScaleHandler.localPlayer.appearance, (byte)-14);
                                                            if (var27_27 == null) {
                                                                var26_11 = var27_27;
                                                                if (Widget.field4473) {
                                                                    class135.invalidateWidget((Widget)var28_28);
                                                                    var26_11 = var27_27;
                                                                }
                                                            }
                                                        }
                                                        var11_14 = 0;
                                                        break block191;
                                                    }
                                                    var27_27 = class324.ItemDefinition_get(var28_28.field4602);
                                                    if (var27_27 == null) ** GOTO lbl429
                                                    var26_11 = var27_27.method13082(var28_28.field4587, (byte)24).method13081(1, 2130903521);
                                                    if (var26_11 == null) {
                                                        class135.invalidateWidget((Widget)var28_28);
lbl429:
                                                        // 2 sources

                                                        var11_14 = 0;
                                                    } else {
                                                        var26_11.calculateBoundsCylinder();
                                                        var11_14 = var26_11.height / 2;
                                                    }
                                                }
                                                var12_13 = Rasterizer3D.Rasterizer3D_sine[var28_28.field4524] * var28_28.field4520 >> 16;
                                                var14_16 = Rasterizer3D.Rasterizer3D_cosine[var28_28.field4524] * var28_28.field4520 >> 16;
                                                if (var26_11 != null) {
                                                    if (!var28_28.field4523) {
                                                        this.field5000.method660(var28_28.width / 2 + var19_21, var10_10 + var28_28.height / 2, 36119907);
                                                        var27_27 = this.field5001.vmethod7589();
                                                        if (!var28_28.isIf3) {
                                                            var27_27.vmethod7687((Model)var26_11, 0, var28_28.field4516, 0, var28_28.field4524, 0, var12_13, var14_16, (byte)0);
                                                        } else {
                                                            var26_11.calculateBoundsCylinder();
                                                            if (var28_28.field4514) {
                                                                var27_27.vmethod7681((Model)var26_11, 0, var28_28.field4516, var28_28.field4537, var28_28.field4524, var28_28.field4530, var11_14 + var12_13 + var28_28.field4535, var14_16 + var28_28.field4535, var28_28.field4520, -2068955973);
                                                            } else {
                                                                var27_27.vmethod7687((Model)var26_11, 0, var28_28.field4516, var28_28.field4537, var28_28.field4524, var28_28.field4530, var11_14 + var12_13 + var28_28.field4535, var14_16 + var28_28.field4535, (byte)0);
                                                            }
                                                        }
                                                        this.field5000.method653();
                                                    } else {
                                                        var27_27 = this.field3567.vmethod11000();
                                                        var27_27.method660(var28_28.width / 2 + var19_21, var10_10 + var28_28.height / 2, -927736473);
                                                        var29_29 = this.field3567.vmethod11003().vmethod7589();
                                                        if (!var28_28.isIf3) {
                                                            var29_29.vmethod7685((Entity)var26_11, 0, Rasterizer3D.Rasterizer3D_sine[var28_28.field4524], Rasterizer3D.Rasterizer3D_cosine[var28_28.field4524], Rasterizer3D.Rasterizer3D_sine[var28_28.field4516], Rasterizer3D.Rasterizer3D_cosine[var28_28.field4516], 0, var12_13, var14_16, 0L);
                                                        } else {
                                                            var26_11.calculateBoundsCylinder();
                                                            var29_29.vmethod7685((Entity)var26_11, 0, Rasterizer3D.Rasterizer3D_sine[var28_28.field4524], Rasterizer3D.Rasterizer3D_cosine[var28_28.field4524], Rasterizer3D.Rasterizer3D_sine[var28_28.field4516], Rasterizer3D.Rasterizer3D_cosine[var28_28.field4516], var28_28.field4530, var11_14 + var12_13 + var28_28.field4535, var14_16 + var28_28.field4535, 0L);
                                                        }
                                                        var27_27.method653();
                                                    }
                                                }
                                                ** GOTO lbl572
                                            }
                                            var26_11 = var28_28.method7546(Widget.runCs1((Widget)var28_28, 562631384), -284070419);
                                            if (var26_11 == null) {
                                                if (Widget.field4473) {
                                                    class135.invalidateWidget((Widget)var28_28);
                                                }
                                            } else {
                                                var25_12.vmethod10761((class384)var26_11, var19_21, var10_10, -1922740932);
                                            }
                                            ** GOTO lbl572
                                        }
                                        var29_29 = var28_28.getFont();
                                        if (var29_29 != null) {
                                            var26_11 = var28_28.field4545;
                                            if (!Widget.runCs1((Widget)var28_28, 1452435112)) {
                                                var12_13 = var28_28.field4509;
                                                var27_27 = var26_11;
                                                var11_14 = var12_13;
                                                if (var28_28 == class285.mousedOverWidgetIf1) {
                                                    var27_27 = var26_11;
                                                    var11_14 = var12_13;
                                                    if (var28_28.field4508 != 0) {
                                                        var11_14 = var28_28.field4508;
                                                        var27_27 = var26_11;
                                                    }
                                                }
                                            } else {
                                                var11_14 = var28_28.field4486;
                                                var12_13 = var11_14;
                                                if (var28_28 == class285.mousedOverWidgetIf1) {
                                                    var12_13 = var11_14;
                                                    if (var28_28.field4497 != 0) {
                                                        var12_13 = var28_28.field4497;
                                                    }
                                                }
                                                var27_27 = var26_11;
                                                var11_14 = var12_13;
                                                if (var28_28.field4544.length() > 0) {
                                                    var27_27 = var28_28.field4544;
                                                    var11_14 = var12_13;
                                                }
                                            }
                                            var26_11 = var27_27;
                                            if (var28_28.isIf3) {
                                                var26_11 = var27_27;
                                                if (var28_28.field4602 != -1) {
                                                    var30_30 = class324.ItemDefinition_get(var28_28.field4602);
                                                    var26_11 = var27_27 = var30_30.name;
                                                    if (var27_27 == null) {
                                                        var26_11 = Strings.field2765;
                                                    }
                                                    if ((var30_30.isStackable == 1 || var28_28.field4587 != 1) && var28_28.field4587 != -1) {
                                                        var27_27 = new StringBuilder();
                                                        var27_27.append(class63.colorStartTag(16748608));
                                                        var27_27.append((String)var26_11);
                                                        var27_27.append(class145.field3606);
                                                        var27_27.append(" ");
                                                        var27_27.append('x');
                                                        var27_27.append(Tile.formatItemStacks(var28_28.field4587));
                                                        var26_11 = var27_27.toString();
                                                    }
                                                }
                                            }
                                            if (var28_28 == Client.field4891) {
                                                var26_11 = "Please wait...";
                                                var11_14 = var28_28.field4509;
                                            }
                                            var27_27 = var26_11;
                                            if (!var28_28.isIf3) {
                                                var27_27 = class173.method6515((String)var26_11, (Widget)var28_28, -1994018986);
                                            }
                                            var14_16 = var28_28.width * 2031473261;
                                            var15_17 = var28_28.height * 529619377;
                                            var12_13 = !var28_28.field4550 ? -1 : 0;
                                            var29_29.method13840((String)var27_27, var19_21, var10_10, var14_16 * 978257765, var15_17 * -35303599, var11_14, var12_13, var28_28.field4557, var28_28.field4547, var28_28.field4552, (class72)var25_12);
                                        } else if (Widget.field4473) {
                                            class135.invalidateWidget((Widget)var28_28);
                                        }
                                        ** GOTO lbl572
                                    }
                                    var12_13 = var28_28.field4486;
                                    var11_14 = var12_13;
                                    if (var28_28 == class285.mousedOverWidgetIf1) {
                                        var11_14 = var12_13;
                                        if (var28_28.field4497 != 0) {
                                            var11_14 = var28_28.field4497;
                                        }
                                    }
                                }
                                if (var28_28.field4506) {
                                    switch (var28_28.fillMode.field5987) {
                                        default: {
                                            if (var17_19 != 0) {
                                                var25_12.vmethod10751(var19_21, var10_10, var28_28.width, var28_28.height, var11_14, 255 - (var17_19 & 255), -1971659939);
                                                break;
                                            }
                                            var12_13 = var28_28.width * 2031473261;
                                            var25_12.vmethod10762(var19_21, var10_10, var12_13 * 978257765, var28_28.height, var11_14, (byte)1);
                                            break;
                                        }
                                        case 2: {
                                            var25_12.vmethod10750(var19_21, var10_10, var28_28.width, var28_28.height, var28_28.field4509, var28_28.field4486, 255 - var28_28.field4504 & 255, 255 - var28_28.field4510 & 255, -1106345367);
                                            break;
                                        }
                                        case 1: {
                                            var11_14 = var28_28.width * 2031473261;
                                            var12_13 = var28_28.height * 529619377;
                                            var14_16 = var28_28.field4509 * 1479854417;
                                            var15_17 = var28_28.field4486 * -1015198523;
                                            var26_11 = var25_12;
                                            var25_12.method4246(var19_21, var10_10, var11_14 * 978257765, var12_13 * -35303599, var14_16 * -450879567, var15_17 * 144462349, 3903097);
                                            var25_12 = var26_11;
                                            break;
                                        }
                                    }
                                } else if (var17_19 != 0) {
                                    var25_12.method4253(var19_21, var10_10, var28_28.width, var28_28.height, var11_14, 255 - (var17_19 & 255));
                                } else {
                                    var25_12.method4255(var19_21, var10_10, var28_28.width, var28_28.height, var11_14);
                                }
                                ** GOTO lbl572
                            }
                            var14_16 = 0;
                            var11_14 = 0;
                            block11: while (true) {
                                block192: {
                                    if (var14_16 < var28_28.field4495) break block192;
lbl572:
                                    // 17 sources

                                    var26_11 = var1_1;
                                    var10_10 = var13_15;
                                    break block157;
                                }
                                var15_17 = 0;
                                var26_11 = var25_12;
                                var25_12 = var28_28;
                                while (true) {
                                    if (var15_17 >= var25_12.field4491) {
                                        ++var14_16;
                                        var28_28 = var25_12;
                                        var25_12 = var26_11;
                                        continue block11;
                                    }
                                    var18_20 = var19_21 + var15_17 * (var25_12.field4543 + 32);
                                    var17_19 = var10_10 + var14_16 * (var25_12.field4539 + 32);
                                    var16_18 = var17_19;
                                    var12_13 = var18_20;
                                    if (var11_14 < 20) {
                                        var12_13 = var18_20 + var25_12.field4554[var11_14];
                                        var16_18 = var17_19 + var25_12.field4559[var11_14];
                                    }
                                    if (var25_12.field4603[var11_14] <= 0) {
                                        var17_19 = var10_10;
                                        var27_27 = var25_12;
                                        var10_10 = var17_19;
                                        if (var27_27.inventorySprites != null) {
                                            var10_10 = var17_19;
                                            if (var11_14 < 20) {
                                                var28_28 = var27_27.getInventorySprite(var11_14);
                                                if (var28_28 == null) {
                                                    var10_10 = var17_19;
                                                    if (Widget.field4473) {
                                                        class135.invalidateWidget((Widget)var27_27);
                                                        var10_10 = var17_19;
                                                    }
                                                } else {
                                                    var26_11.vmethod10761((class384)var28_28, var12_13, var16_18, 536147713);
                                                    var10_10 = var17_19;
                                                }
                                            }
                                        }
                                    } else {
                                        var17_19 = var25_12.field4603[var11_14] - 1;
                                        if (var12_13 + 32 > var3_3 && var12_13 < var5_5 && var16_18 + 32 > var4_4 && var16_18 < var6_6 || var25_12 == class11.field262 && var11_14 == Client.field4853) {
                                            var27_27 = Client.field4872 == 1 && var11_14 == class290.field5984 && var25_12.id == class37.field578 ? class363.method12197(var17_19, var25_12.field4600[var11_14], 2, 0, 2, false, -643676135) : class363.method12197(var17_19, var25_12.field4600[var11_14], 1, 0x302020, 2, false, 487876351);
                                            if (var27_27 == null) {
                                                class135.invalidateWidget((Widget)var25_12);
                                            } else if (Skills.field3152.method4401()) {
                                                var26_11.vmethod10761((class384)var27_27, var12_13, var16_18, 1523933035);
                                            } else {
                                                var28_28 = var26_11;
                                                if (var25_12 != class11.field262 || var11_14 != Client.field4853) {
                                                    if (var25_12 != class358.field6546 || var11_14 != Client.field4854) {
                                                        var28_28.vmethod10761((class384)var27_27, var12_13, var16_18, 21290995);
                                                    } else {
                                                        var28_28.vmethod10769((class384)var27_27, var12_13, var16_18, 128, -2056719451);
                                                    }
                                                } else {
                                                    var18_20 = class294.field6004.field6208[0];
                                                    var22_24 = Client.field4847;
                                                    var17_19 = class294.field6004.field6200[0];
                                                    var20_22 = Client.field4860;
                                                    var21_23 = Client.field4850;
                                                    var18_20 -= var22_24 * -658843909;
                                                    if (var21_23 * -469597953 < 5) {
                                                        var17_19 = 0;
                                                        var18_20 = 0;
                                                    } else {
                                                        var17_19 -= var20_22 * 22995141;
                                                    }
                                                    var20_22 = var17_19 + var16_18;
                                                    var28_28.vmethod10769((class384)var27_27, var12_13 + var18_20, var20_22, 128, -1899927149);
                                                    if (var2_2 != -1) {
                                                        var27_27 = var1_1[65535 & var2_2];
                                                        if (var20_22 < var28_28.field2531 && var27_27.field4498 > 0) {
                                                            var12_13 = var16_18 = (var28_28.field2531 - var16_18 - var17_19) * Client.field4804 * 375836608 / 3;
                                                            if (var16_18 > Client.field4804 * -536601216) {
                                                                var12_13 = Client.field4804 * -536601216;
                                                            }
                                                            var16_18 = var12_13;
                                                            if (var12_13 > var27_27.field4498) {
                                                                var16_18 = var27_27.field4498;
                                                            }
                                                            var27_27.field4498 -= var16_18;
                                                            Client.field4860 = var16_18 * 250715661 + Client.field4860;
                                                            class135.invalidateWidget((Widget)var27_27);
                                                        }
                                                        if ((var12_13 = var20_22 + 32) > var28_28.field2526 && var27_27.field4498 < var27_27.field4507 - var27_27.height) {
                                                            var12_13 = var16_18 = (var12_13 - var28_28.field2526) * Client.field4804 * 375836608 / 3;
                                                            if (var16_18 > Client.field4804 * -536601216) {
                                                                var12_13 = Client.field4804 * -536601216;
                                                            }
                                                            var16_18 = var12_13;
                                                            if (var12_13 > var27_27.field4507 - var27_27.height - var27_27.field4498) {
                                                                var16_18 = var27_27.field4507 - var27_27.height - var27_27.field4498;
                                                            }
                                                            var27_27.field4498 = var16_18 + var27_27.field4498;
                                                            Client.field4860 -= var16_18 * 250715661;
                                                            class135.invalidateWidget((Widget)var27_27);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    ++var11_14;
                                    ++var15_17;
                                }
                                break;
                            }
                        }
                        var26_11 = Runtime.getRuntime();
                        var14_16 = (int)((var26_11.totalMemory() - var26_11.freeMemory()) / 1024L);
                        var13_15 = 0xFFFF00;
                        if (var14_16 > 327680) {
                            var13_15 = 0xFF0000;
                        }
                        var26_11 = new StringBuilder();
                        var26_11.append("Fps:");
                        var26_11.append(class138.field3541);
                        SoundSystem.method5056(var26_11.toString(), var11_14 + var28_28.width, var10_10 += 15);
                        var26_11 = new StringBuilder();
                        var26_11.append("Mem:");
                        var26_11.append(var14_16);
                        var26_11.append("k (");
                        var26_11.append(class304.method11055().field552 / 1024L);
                        var26_11.append("k)");
                        class287.method10623(var26_11.toString(), var11_14 + var28_28.width, var10_10 + 15, var13_15);
                    }
                    var10_10 = var12_13;
                    var26_11 = var1_1;
                    break block157;
                }
                var10_10 = var12_13;
            }
            var12_13 = var10_10 + 1;
        }
    }

    @ObfuscatedName(value="fg")
    final void method8303(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n3 - n;
        int n9 = n4 - n2;
        n3 = n8 >= 0 ? n8 : -n8;
        n4 = n9 >= 0 ? n9 : -n9;
        n7 = n3;
        if (n3 < n4) {
            n7 = n4;
        }
        if (n7 == 0) {
            return;
        }
        n4 = (n9 << 16) / n7;
        n3 = (n8 << 16) / n7;
        if (n4 <= n3) {
            n3 = -n3;
        } else {
            n4 = -n4;
        }
        n7 = n4 * n6;
        n4 = n7 >> 17;
        n7 = n7 + 1 >> 17;
        n6 = n3 * n6;
        n3 = n6 >> 17;
        n6 = n6 + 1 >> 17;
        class72 class722 = this.field3567.vmethod11005();
        int n10 = n - class722.field2530;
        n = n2 - class722.field2531;
        n2 = n10 + n4;
        int n11 = n10 - n7;
        n8 = n10 + n8;
        n7 = n8 - n7;
        n4 = n8 + n4;
        n8 = n3 + n;
        n10 = (n9 += n) - n6;
        this.field5000.method659(n2, n11, n7);
        this.field5000.method7645(n8, n - n6, n10, n2, n11, n7, n5, (byte)2);
        this.field5000.method659(n2, n7, n4);
        this.field5000.method7645(n8, n10, n3 + n9, n2, n7, n4, n5, (byte)2);
    }

    @ObfuscatedName(value="fu")
    @ObfuscatedSignature(descriptor="(ZZI)V", garbageValue="1736004337")
    final void method8305(boolean bl, boolean bl2) {
        class72.method4139(field4866, class50.field2368, class127.field3441, bl, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="hf")
    @ObfuscatedSignature(descriptor="(Lax;IIII)V")
    final void method8307(Widget object, int n, int n2, int n3, int n4) {
        block24: {
            DualNode dualNode;
            class363 class3632;
            class72 class722;
            block23: {
                Projectile.method14468();
                class722 = this.field3567.vmethod11005();
                class3632 = ((Widget)object).method7555(false, -109754887);
                if (class3632 == null) {
                    return;
                }
                class722.method4238(n, n2, n + class3632.field6581, n2 + class3632.field6579, -448408016);
                if (field4957 != 2 && field4957 != 5) break block23;
                class722.method4251(n, n2, -16777216, class3632.field6582, class3632.field6580, 578597337);
                break block24;
            }
            n4 = field4813 * 763616681;
            int n5 = WorldMapScaleHandler.localPlayer.x / 32;
            int n6 = WorldMapScaleHandler.localPlayer.field7523 * -144332757 / 32;
            class722.vmethod10778(class12.field274, n, n2, class3632.field6581, class3632.field6579, n5 + 48, 464 - n6, n4 * 1283724953 & 0x7FF, 256, class3632.field6582, class3632.field6580, -270670383);
            for (n4 = 0; n4 < field4947; ++n4) {
                this.method8310(n, n2, field4941[n4] * 4 + 2 - WorldMapScaleHandler.localPlayer.x / 32, field4938[n4] * 4 + 2 - WorldMapScaleHandler.localPlayer.field7523 * -144332757 / 32, field4951[n4], class3632, 1683313639);
            }
            n4 = 0;
            block1: while (true) {
                if (n4 >= 104) break;
                n5 = 0;
                while (true) {
                    block26: {
                        block27: {
                            block25: {
                                if (n5 >= 104) break block25;
                                if (field4864[WorldMapIcon_1.field5913 * 63889799][n4][n5] == null) break block26;
                                break block27;
                            }
                            ++n4;
                            continue block1;
                        }
                        this.method8310(n, n2, n4 * 4 + 2 - WorldMapScaleHandler.localPlayer.x / 32, n5 * 4 + 2 - WorldMapScaleHandler.localPlayer.field7523 * -144332757 / 32, class317.field6184[0], class3632, 1683313639);
                    }
                    ++n5;
                }
                break;
            }
            n4 = 0;
            while (true) {
                if (n4 >= field4779) break;
                NPC nPC = field4782[field4783[n4]];
                if (nPC != null) {
                    if (nPC.isVisible()) {
                        dualNode = nPC.definition;
                        object = dualNode;
                        if (dualNode != null) {
                            object = dualNode;
                            if (((NPCDefinition)dualNode).field7189 != null) {
                                object = ((NPCDefinition)dualNode).method13364(-944307993);
                            }
                        }
                        if (object != null && ((NPCDefinition)object).field7179 && ((NPCDefinition)object).field7193) {
                            this.method8310(n, n2, nPC.x / 32 - WorldMapScaleHandler.localPlayer.x / 32, nPC.field7523 * -144332757 / 32 - WorldMapScaleHandler.localPlayer.field7523 * -144332757 / 32, class317.field6184[1], class3632, 1683313639);
                        }
                    }
                }
                ++n4;
            }
            n6 = Players.Players_count;
            object = Players.Players_indices;
            n4 = 0;
            while (true) {
                block29: {
                    block30: {
                        block28: {
                            if (n4 >= n6 * 527068741) break block28;
                            dualNode = field4859[object[n4]];
                            if (dualNode == null) break block29;
                            break block30;
                        }
                        if (field4768 != 0 && cycle % 20 < 10) {
                            if (field4768 == 1 && field4758 >= 0 && field4758 < field4782.length && (object = field4782[field4758]) != null) {
                                this.method8308(n, n2, ((Actor)object).x / 32 - WorldMapScaleHandler.localPlayer.x / 32, ((Actor)object).field7523 * -144332757 / 32 - WorldMapScaleHandler.localPlayer.field7523 * -144332757 / 32, GameBuild.field2491[1], class3632, (byte)0);
                            }
                            if (field4768 == 2) {
                                this.method8308(n, n2, field4756 * 546102036 - class302.field6082 * 4 + 2 - WorldMapScaleHandler.localPlayer.x / 32, field4755 * -148138500 - class237.field4107 * 4 + 2 - WorldMapScaleHandler.localPlayer.field7523 * -144332757 / 32, GameBuild.field2491[1], class3632, (byte)0);
                            }
                            if (field4768 == 10 && field4762 >= 0 && field4762 < field4859.length && (object = field4859[field4762]) != null) {
                                this.method8308(n, n2, ((Actor)object).x / 32 - WorldMapScaleHandler.localPlayer.x / 32, ((Actor)object).field7523 * -144332757 / 32 - WorldMapScaleHandler.localPlayer.field7523 * -144332757 / 32, GameBuild.field2491[1], class3632, (byte)0);
                            }
                        }
                        if (field4945 * -519909523 != 0) {
                            this.method8310(n, n2, field4945 * -2079638092 + 2 - WorldMapScaleHandler.localPlayer.x / 32, field4949 * -1770351372 + 2 - WorldMapScaleHandler.localPlayer.field7523 * -144332757 / 32, GameBuild.field2491[0], class3632, 1683313639);
                        }
                        if (WorldMapScaleHandler.localPlayer.isHidden) break;
                        class722.vmethod10762(class3632.field6581 / 2 + n - 1, n2 + class3632.field6579 / 2 - 1, 3, 3, 0xFFFFFF, (byte)-31);
                        break;
                    }
                    if (((Player)dualNode).isVisible() && !((Player)dualNode).isHidden && dualNode != WorldMapScaleHandler.localPlayer) {
                        int n7 = ((Actor)dualNode).x / 32 - WorldMapScaleHandler.localPlayer.x / 32;
                        int n8 = ((Actor)dualNode).field7523 * -144332757 / 32 - WorldMapScaleHandler.localPlayer.field7523 * -144332757 / 32;
                        n5 = WorldMapScaleHandler.localPlayer.field7861 != 0 && ((Player)dualNode).field7861 != 0 && ((Player)dualNode).field7861 == WorldMapScaleHandler.localPlayer.field7861 ? 1 : 0;
                        if (((Player)dualNode).method15491()) {
                            this.method8310(n, n2, n7, n8, class317.field6184[3], class3632, 1683313639);
                        } else if (n5 != 0) {
                            this.method8310(n, n2, n7, n8, class317.field6184[4], class3632, 1683313639);
                        } else if (((Player)dualNode).method15494()) {
                            this.method8310(n, n2, n7, n8, class317.field6184[5], class3632, 1683313639);
                        } else {
                            this.method8310(n, n2, n7, n8, class317.field6184[2], class3632, 1683313639);
                        }
                    }
                }
                ++n4;
            }
        }
        Client.field4927[n3] = true;
    }

    @ObfuscatedName(value="hn")
    @ObfuscatedSignature(descriptor="(IIIILek;Lab;I)V")
    final void method8310(int n, int n2, int n3, int n4, class384 class3842, class363 class3632, int n5) {
        if (class3842 == null) {
            return;
        }
        class72 class722 = this.field3567.vmethod11005();
        int n6 = field4813 & 0x7FF;
        n5 = n3 * n3 + n4 * n4;
        if (n5 > 6400) {
            return;
        }
        int n7 = Rasterizer3D.Rasterizer3D_sine[n6];
        int n8 = Rasterizer3D.Rasterizer3D_cosine[n6];
        n6 = n7 * n4 + n3 * n8 >> 16;
        n3 = n8 * n4 - n3 * n7 >> 16;
        if (n5 <= 2500) {
            class722.vmethod10761(class3842, n6 + class3632.field6581 / 2 + n - class3842.field7130 / 2, n2 + class3632.field6579 / 2 - n3 - class3842.field7128 / 2, -999250603);
            return;
        }
        class722.vmethod10777(class3842, n6 + class3632.field6581 / 2 - class3842.field7130 / 2, class3632.field6579 / 2 - n3 - class3842.field7128 / 2, n, n2, class3632.field6581, class3632.field6579, class3632.field6582, class3632.field6580, -2135062096);
    }

    @ObfuscatedName(value="hx")
    @ObfuscatedSignature(descriptor="(Lax;IIII)V", garbageValue="1323331966")
    final void method8311(Widget node, int n, int n2, int n3) {
        class72 class722 = this.field3567.vmethod11005();
        if ((node = node.method7555(false, -109754887)) == null) {
            return;
        }
        if (field4957 >= 3) {
            class722.method4251(n, n2, -16777216, ((class363)node).field6582, ((class363)node).field6580, 1769223218);
            return;
        }
        class722.vmethod10778(class72.field2524, n, n2, ((class363)node).field6581, ((class363)node).field6579, 25, 25, field4813, 256, ((class363)node).field6582, ((class363)node).field6580, -1108832779);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="at")
    void method8286(byte by) {
        Object object;
        boolean bl;
        block18: {
            block17: {
                block16: {
                    if (NetCache.field3737 >= 4) {
                        this.error(class196.field3900);
                        gameState = 1000;
                        return;
                    }
                    if (NetCache.field3736 * -1 >= 4) {
                        if (gameState <= 5) {
                            this.error(class196.field3902);
                            gameState = 1000;
                            return;
                        }
                        field4770 = -653241960;
                        NetCache.field3736 = -3;
                    }
                    by = (byte)(field4770 - 729926693);
                    field4770 = by;
                    bl = true;
                    if (by * -1390317651 + 1 > 0) {
                        return;
                    }
                    try {
                        if (js5ConnectState == 0) {
                            class71.js5SocketTask = class248.field4306.method6709(Skills.field3151, ScriptEvent.port3);
                        }
                        if (++js5ConnectState == 1) {
                            if (class71.js5SocketTask.status == 2) {
                                this.js5Error(-1);
                                return;
                            }
                            if (class71.js5SocketTask.status == 1) {
                                ++js5ConnectState;
                            }
                        }
                        if (js5ConnectState == 2) {
                            SecureRandomCallable.js5Socket = field4798 ? NPC.method15536((Socket)class71.js5SocketTask.result, 40000, 5000) : new NetSocket((Socket)class71.js5SocketTask.result, class248.field4306, 5000);
                            object = new Buffer(5);
                            ((Buffer)object).method11652(15, 422009005);
                            ((Buffer)object).method11640(193, (byte)16);
                            SecureRandomCallable.js5Socket.write(((Buffer)object).array, 0, 5);
                            ++js5ConnectState;
                            Ignored.field5942 = class363.currentTimeMillis();
                        }
                        if (js5ConnectState == 3) {
                            if (SecureRandomCallable.js5Socket.vmethod12093() <= 0 && (field4798 || gameState > 5)) {
                                if (class363.currentTimeMillis() - Ignored.field5942 > 30000L) {
                                    this.js5Error(-2);
                                    return;
                                }
                            } else {
                                by = (byte)SecureRandomCallable.js5Socket.vmethod12077();
                                if (by != 0) {
                                    this.js5Error(by);
                                    return;
                                }
                                ++js5ConnectState;
                            }
                        }
                        if (js5ConnectState != 4) break block16;
                        object = SecureRandomCallable.js5Socket;
                        if (gameState <= 20) break block17;
                        break block18;
                    }
                    catch (IOException iOException) {}
                    this.js5Error(-3);
                }
                return;
            }
            bl = false;
        }
        class76.method4321((AbstractSocket)object, bl, (byte)19);
        class71.js5SocketTask = null;
        SecureRandomCallable.js5Socket = null;
        js5ConnectState = 0;
        js5Errors = 0;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="896576383")
    @Export(value="js5Error")
    void js5Error(int n) {
        block4: {
            block5: {
                block7: {
                    block6: {
                        class71.js5SocketTask = null;
                        SecureRandomCallable.js5Socket = null;
                        js5ConnectState = 0;
                        ScriptEvent.port3 = ScriptEvent.port3 == VarbitDefinition.port1 ? class292.port2 : VarbitDefinition.port1;
                        if (++js5Errors >= 2 && (n == 7 || n == 9)) break block4;
                        if (js5Errors >= 2 && n == 6) break block5;
                        if (js5Errors < 4) break block6;
                        if (gameState <= 5) break block7;
                        field4770 = -653241960;
                    }
                    return;
                }
                this.error(class196.field3907);
                gameState = 1000;
                return;
            }
            this.error(class196.field3906);
            gameState = 1000;
            return;
        }
        if (gameState > 5) {
            field4770 = -653241960;
            return;
        }
        this.error(class196.field3901);
        gameState = 1000;
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1134769059")
    final void method8293() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="cc")
    final void method8294(byte by) {
        block12: {
            this.field3567.method3857();
            class72 class722 = this.field3567.vmethod11005();
            class722.vmethod10747(946355559);
            this.method8296();
            if (field4866 != -1) {
                class272.method7781(field4866);
            }
            by = 0;
            while (true) {
                if (by < field4918 * -763111739) {
                    if (field4920[by]) {
                        Client.field4927[by] = true;
                    }
                } else {
                    field4930 = cycle;
                    field4867 = -1;
                    field4873 = -1;
                    class146.field3612 = null;
                    if (field4866 != -1) {
                        field4918 = 0;
                        long l = System.nanoTime();
                        this.method8301(field4866, 0, 0, class50.field2368, class127.field3441, 0, 0, -1);
                        field4990.method6843(System.nanoTime() - l);
                    }
                    class722.method4252();
                    Skills.field3152.method4359(Client.field4740.field3567.vmethod11005(), -2132253535);
                    if (!Skills.field3152.method4401()) {
                        if (field4867 != -1) {
                            Skills.field3152.method4331(field4867, field4873, class722, -2041595521);
                        }
                    } else {
                        Skills.field3152.method4335(class722, -1267766130);
                    }
                    if (field4919 == 3) {
                        break;
                    }
                    break block12;
                }
                Client.field4926[by] = field4920[by];
                Client.field4920[by] = false;
                by = (byte)(by + 1);
            }
            for (by = 0; by < field4918 * -763111739; by = (byte)(by + 1)) {
                if (field4926[by]) {
                    class722.vmethod10751(field4925[by], field4934[by], field4915[by], field4928[by], 0xFF00FF, 128, -1653585998);
                    continue;
                }
                if (!field4927[by]) continue;
                class722.vmethod10751(field4925[by], field4934[by], field4915[by], field4928[by], 0xFF0000, 128, -1552022770);
            }
        }
        DevicePcmPlayer.method7586(WorldMapIcon_1.field5913 * 63889799, WorldMapScaleHandler.localPlayer.x, WorldMapScaleHandler.localPlayer.field7523 * -144332757, field4804 * 375836608, (short)-16720);
        field4804 = 0;
    }

    @Override
    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="1")
    @Export(value="resizeRoot")
    protected final void resizeRoot(boolean bl) {
        field4932 = class363.currentTimeMillis() + 500L;
        this.method8297(-1605007999);
        if (field4866 != -1) {
            this.method8305(true, bl);
        }
    }

    @ObfuscatedName(value="fa")
    final void method8300(int n, int n2, int n3, int n4, int n5, int n6) {
        class72 class722 = this.field3567.vmethod11005();
        class722.vmethod10757(class88.field2670[0], n, n2, -1713248280);
        class722.vmethod10757(class88.field2670[1], n, n2 + n4 - 16, -1713248280);
        int n7 = n2 + 16;
        int n8 = n4 - 32;
        class722.vmethod10762(n, n7, 16, n8, field4801, (byte)-77);
        n6 = n8 * n4 / n5;
        if (n6 < 8) {
            n6 = 8;
        }
        n3 = n3 * (n8 - n6) / (n5 - n4);
        n4 = n3 + n7;
        class722.vmethod10762(n, n4, 16, n6, field4805, (byte)10);
        class722.vmethod10745(n, n4, n6, field4810, (byte)53);
        n5 = n + 1;
        class722.vmethod10745(n5, n4, n6, field4810, (byte)38);
        class722.vmethod10752(n, n4, 16, field4810, 52640937);
        n7 = n3 + n2 + 17;
        class722.vmethod10752(n, n7, 16, field4810, -292658057);
        class722.vmethod10745(n + 15, n4, n6, field4819, (byte)63);
        class722.vmethod10745(n + 14, n7, n6 - 1, field4819, (byte)21);
        class722.vmethod10752(n, n3 + n2 + n6 + 15, 16, field4819, 1140997651);
        class722.vmethod10752(n5, n3 + n2 + n6 + 14, 15, field4819, 1497958672);
    }

    @ObfuscatedName(value="hh")
    @ObfuscatedSignature(descriptor="(IIIILek;Lab;B)V")
    final void method8308(int n, int n2, int n3, int n4, class384 class3842, class363 class3632, byte by) {
        by = (byte)(n3 * n3 + n4 * n4);
        if (by <= 4225 || by >= 90000) {
            this.method8310(n, n2, n3, n4, class3842, class3632, 1683313639);
            return;
        }
        int n5 = field4813 & 0x7FF;
        by = (byte)Rasterizer3D.Rasterizer3D_sine[n5];
        n5 = Rasterizer3D.Rasterizer3D_cosine[n5];
        double d = Math.atan2(n4 * by + n3 * n5 >> 16, n5 * n4 - n3 * by >> 16);
        n3 = class3632.field6581 / 2;
        double d2 = Math.sin(d);
        double d3 = n3 - 25;
        n3 = (int)(d2 * d3);
        d2 = Math.cos(d);
        n4 = (int)(d2 * d3);
        this.field3567.vmethod11005().vmethod10771(WorldMapRegion.field594, n3 + (class3632.field6581 / 2 + n - 10), n2 + class3632.field6579 / 2 - 10 - n4 - 10, 20, 20, 15, 15, d, 256, (byte)-58);
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="28")
    @Export(value="kill0")
    public final void kill0() {
        if (this.hasUnwrittenChanges()) {
            class285.method10474();
            field4740 = this;
            class97.field2747 = this.method5714(526409609);
            this.method5727(765, 503, 193, 1);
            return;
        }
    }

    @ObfuscatedName(value="hm")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1511340774")
    public final void method8309() {
        if (ParamDefinition.field7083 != null && ParamDefinition.field7083.method6012()) {
            ParamDefinition.field7083.method5996(-868288887);
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)[Ldm;", garbageValue="55")
    static VerticalAlignment[] method7890() {
        VerticalAlignment verticalAlignment = VerticalAlignment.field5933;
        VerticalAlignment verticalAlignment2 = VerticalAlignment.field5934;
        VerticalAlignment verticalAlignment3 = VerticalAlignment.VerticalAlignment_centered;
        return new VerticalAlignment[]{verticalAlignment, verticalAlignment2, verticalAlignment3};
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Lax;")
    @Export(value="getWidgetChild")
    public static Widget getWidgetChild(int n, int n2) {
        n2 = n >> 16;
        if (class79.Widget_interfaceComponents[n2] != null && class79.Widget_interfaceComponents[n2][n &= 0xFFFF] != null || WorldMapIcon_1.loadInterface(n2, -1896604888)) {
            Widget widget = class79.Widget_interfaceComponents[n2][n];
            return widget;
        }
        return null;
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(III[I[IIIIIIIIIII)V", garbageValue="-955358373")
    static void method7891(int n, int n2, int n3, int[] arrn, int[] arrn2, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        n2 = -n9;
        while (true) {
            if (n2 < 0) {
                n3 = -n8;
                n = n6;
            } else {
                return;
            }
            while (n3 < 0) {
                n5 = arrn2[n4];
                if (n5 != 0) {
                    n6 = n12 * (n5 & 0xFF00FF);
                    n6 = (n6 & 0xFF00FF00) + (n12 * n5 - n6 & 0xFF0000) >>> 8;
                    n7 = arrn[n];
                    n5 = n7 + n6;
                    n6 = (n6 & 0xFF00FF) + (n7 & 0xFF00FF);
                    n6 = (n5 - n6 & 0x10000) + (0x1000100 & n6);
                    arrn[n] = n6 - (n6 >>> 8) | n5 - n6;
                    ++n;
                } else {
                    ++n;
                }
                ++n3;
                ++n4;
            }
            n6 = n10 + n;
            n4 += n11;
            ++n2;
        }
    }
}

