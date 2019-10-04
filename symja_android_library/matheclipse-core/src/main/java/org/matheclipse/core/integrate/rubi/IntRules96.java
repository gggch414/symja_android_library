package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules96 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(2401,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(f,Times(g,x)),q),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),IGtQ(q,C0))));
IIntegrate(2402,Int(Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),CN1))),Power(Plus(f_,Times(g_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Negate(Dist(Times(e,Power(g,CN1)),Subst(Int(Times(Log(Times(C2,d,x)),Power(Subtract(C1,Times(C2,d,x)),CN1)),x),x,Power(Plus(d,Times(e,x)),CN1)),x)),And(FreeQ(List(c,d,e,f,g),x),EqQ(c,Times(C2,d)),EqQ(Plus(Times(Sqr(e),f),Times(Sqr(d),g)),C0))));
IIntegrate(2403,Int(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),CN1))),b_DEFAULT)),Power(Plus(f_,Times(g_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Dist(Plus(a,Times(b,Log(Times(c,Power(Times(C2,d),CN1))))),Int(Power(Plus(f,Times(g,Sqr(x))),CN1),x),x),Dist(b,Int(Times(Log(Times(C2,d,Power(Plus(d,Times(e,x)),CN1))),Power(Plus(f,Times(g,Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(Sqr(e),f),Times(Sqr(d),g)),C0),GtQ(Times(c,Power(Times(C2,d),CN1)),C0))));
IIntegrate(2404,Int(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),Power(Plus(f_,Times(g_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(f,Times(g,Sqr(x))),CN1D2),x))),Subtract(Simp(Times(u,Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n)))))),x),Dist(Times(b,e,n),Int(SimplifyIntegrand(Times(u,Power(Plus(d,Times(e,x)),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,n),x),GtQ(f,C0))));
IIntegrate(2405,Int(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),Power(Plus($p("f1"),Times($p("g1",true),x_)),CN1D2),Power(Plus($p("f2"),Times($p("g2",true),x_)),CN1D2)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(Times($s("f1"),$s("f2")),Times($s("g1"),$s("g2"),Sqr(x))),CN1D2),x))),Subtract(Simp(Times(u,Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n)))))),x),Dist(Times(b,e,n),Int(SimplifyIntegrand(Times(u,Power(Plus(d,Times(e,x)),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,$s("f1"),$s("g1"),$s("f2"),$s("g2"),n),x),EqQ(Plus(Times($s("f2"),$s("g1")),Times($s("f1"),$s("g2"))),C0),GtQ($s("f1"),C0),GtQ($s("f2"),C0))));
IIntegrate(2406,Int(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),Power(Plus(f_,Times(g_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(g,Sqr(x),Power(f,CN1)))),Power(Plus(f,Times(g,Sqr(x))),CN1D2)),Int(Times(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Plus(C1,Times(g,Sqr(x),Power(f,CN1))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n),x),Not(GtQ(f,C0)))));
IIntegrate(2407,Int(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),Power(Plus($p("f1"),Times($p("g1",true),x_)),CN1D2),Power(Plus($p("f2"),Times($p("g2",true),x_)),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times($s("g1"),$s("g2"),Sqr(x),Power(Times($s("f1"),$s("f2")),CN1)))),Power(Times(Sqrt(Plus($s("f1"),Times($s("g1"),x))),Sqrt(Plus($s("f2"),Times($s("g2"),x)))),CN1)),Int(Times(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Plus(C1,Times($s("g1"),$s("g2"),Sqr(x),Power(Times($s("f1"),$s("f2")),CN1))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,$s("f1"),$s("g1"),$s("f2"),$s("g2"),n),x),EqQ(Plus(Times($s("f2"),$s("g1")),Times($s("f1"),$s("g2"))),C0))));
IIntegrate(2408,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Plus(f_DEFAULT,Times(g_DEFAULT,Power(x_,r_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,Denominator(r))),Dist(k,Subst(Int(Times(Power(x,Subtract(k,C1)),Power(Plus(f,Times(g,Power(x,Times(k,r)))),q),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,Power(x,k))),n))))),p)),x),x,Power(x,Power(k,CN1))),x)),And(FreeQ(List(a,b,c,d,e,f,g,n,p,q),x),FractionQ(r),IGtQ(p,C0))));
IIntegrate(2409,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Power(x_,r_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(Plus(f,Times(g,Power(x,r))),q),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n,r),x),IGtQ(p,C0),IntegerQ(q),Or(GtQ(q,C0),And(IntegerQ(r),NeQ(r,C1))))));
IIntegrate(2410,Int(Times(Log(Times(c_DEFAULT,Plus(d_,Times(e_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Log(Times(c,Plus(d,Times(e,x)))),Times(Power(x,m),Power(Plus(f,Times(g,x)),CN1)),x),x),And(FreeQ(List(c,d,e,f,g),x),EqQ(Subtract(Times(e,f),Times(d,g)),C0),EqQ(Times(c,d),C1),IntegerQ(m))));
IIntegrate(2411,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),q_DEFAULT),Power(Plus(h_DEFAULT,Times(i_DEFAULT,x_)),r_DEFAULT)),x_Symbol),
    Condition(Dist(Power(e,CN1),Subst(Int(Times(Power(Times(g,x,Power(e,CN1)),q),Power(Plus(Times(Subtract(Times(e,h),Times(d,i)),Power(e,CN1)),Times(i,x,Power(e,CN1))),r),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),x,Plus(d,Times(e,x))),x),And(FreeQ(List(a,b,c,d,e,f,g,h,i,n,p,q,r),x),EqQ(Subtract(Times(e,f),Times(d,g)),C0),Or(IGtQ(p,C0),IGtQ(r,C0)),IntegerQ(Times(C2,r)))));
IIntegrate(2412,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Power(x_,CN1))),q_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(g,Times(f,x)),q),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p,q),x),EqQ(m,q),IntegerQ(q))));
IIntegrate(2413,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(f_DEFAULT,Times(g_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(f,Times(g,Power(x,r))),Plus(q,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(Times(g,r,Plus(q,C1)),CN1)),x),Dist(Times(b,e,n,p,Power(Times(g,r,Plus(q,C1)),CN1)),Int(Times(Power(Plus(f,Times(g,Power(x,r))),Plus(q,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Subtract(p,C1)),Power(Plus(d,Times(e,x)),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,n,q,r),x),EqQ(m,Subtract(r,C1)),NeQ(q,CN1),IGtQ(p,C0))));
IIntegrate(2414,Int(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),Power(x_,m_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(x,m),Power(Plus(f,Times(g,Power(x,r))),q)),x))),Condition(Subtract(Dist(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),u,x),Dist(Times(b,e,n),Int(SimplifyIntegrand(Times(u,Power(Plus(d,Times(e,x)),CN1)),x),x),x)),InverseFunctionFreeQ(u,x))),And(FreeQ(List(a,b,c,d,e,f,g,m,n,q,r),x),IntegerQ(m),IntegerQ(q),IntegerQ(r))));
IIntegrate(2415,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(f_DEFAULT,Times(g_DEFAULT,Power(x_,r_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,Denominator(r))),Dist(k,Subst(Int(Times(Power(x,Subtract(Times(k,Plus(m,C1)),C1)),Power(Plus(f,Times(g,Power(x,Times(k,r)))),q),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,Power(x,k))),n))))),p)),x),x,Power(x,Power(k,CN1))),x)),And(FreeQ(List(a,b,c,d,e,f,g,n,p,q),x),FractionQ(r),IGtQ(p,C0),IntegerQ(m))));
IIntegrate(2416,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Times(h_DEFAULT,x_),m_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Times(Power(Times(h,x),m),Power(Plus(f,Times(g,Power(x,r))),q)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,m,n,p,q,r),x),IntegerQ(m),IntegerQ(q))));
IIntegrate(2417,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),$p("§polyx")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§polyx"),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),x),x),And(FreeQ(List(a,b,c,d,e,n,p),x),PolynomialQ($s("§polyx"),x))));
IIntegrate(2418,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,n),x),RationalFunctionQ($s("§rfx"),x),IntegerQ(p))));
IIntegrate(2419,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§rfx"),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,n),x),RationalFunctionQ($s("§rfx"),x),IntegerQ(p))));
IIntegrate(2420,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT),$p("§afx")),x_Symbol),
    Condition(Unintegrable(Times($s("§afx"),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),x),And(FreeQ(List(a,b,c,d,e,n,p),x),AlgebraicFunctionQ($s("§afx"),x,True))));
IIntegrate(2421,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(v_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(u_,q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),q),Power(Plus(a,Times(b,Log(Times(c,Power(ExpandToSum(v,x),n))))),p)),x),And(FreeQ(List(a,b,c,n,p,q),x),BinomialQ(u,x),LinearQ(v,x),Not(And(BinomialMatchQ(u,x),LinearMatchQ(v,x))))));
IIntegrate(2422,Int(Times(Log(Times(f_DEFAULT,Power(x_,m_DEFAULT))),Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Subtract(m,Log(Times(f,Power(x,m)))),Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n)))))),x)),Negate(Dist(Times(b,e,n),Int(Times(x,Log(Times(f,Power(x,m))),Power(Plus(d,Times(e,x)),CN1)),x),x)),Dist(Times(b,e,m,n),Int(Times(x,Power(Plus(d,Times(e,x)),CN1)),x),x)),FreeQ(List(a,b,c,d,e,f,m,n),x)));
IIntegrate(2423,Int(Times(Log(Times(f_DEFAULT,Power(x_,m_DEFAULT))),Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),x))),Subtract(Dist(Log(Times(f,Power(x,m))),u,x),Dist(m,Int(Dist(Power(x,CN1),u,x),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IGtQ(p,C1))));
IIntegrate(2424,Int(Times(Log(Times(f_DEFAULT,Power(x_,m_DEFAULT))),Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Log(Times(f,Power(x,m))),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),x),FreeQ(List(a,b,c,d,e,f,m,n,p),x)));
IIntegrate(2425,Int(Times(Log(Times(f_DEFAULT,Power(x_,m_DEFAULT))),Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,x_)),n_DEFAULT))),b_DEFAULT)),Power(x_,CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(Sqr(Log(Times(f,Power(x,m)))),Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Times(C2,m),CN1)),x),Dist(Times(b,e,n,Power(Times(C2,m),CN1)),Int(Times(Sqr(Log(Times(f,Power(x,m)))),Power(Plus(d,Times(e,x)),CN1)),x),x)),FreeQ(List(a,b,c,d,e,f,m,n),x)));
  }
}
}
