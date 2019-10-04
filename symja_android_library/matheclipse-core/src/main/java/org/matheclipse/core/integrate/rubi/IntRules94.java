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
public class IntRules94 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(2351,Int(Times(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,r))),q)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,m,n,q,r),x),IntegerQ(q),Or(GtQ(q,C0),And(IntegerQ(m),IntegerQ(r))))));
IIntegrate(2352,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_))),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,CN1),Subst(Int(Times(Power(x,Subtract(Simplify(Times(Plus(m,C1),Power(n,CN1))),C1)),Power(Plus(d,Times(e,Power(x,Times(r,Power(n,CN1))))),q),Power(Plus(a,Times(b,Log(Times(c,x)))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,e,m,n,p,q,r),x),IntegerQ(q),IntegerQ(Times(r,Power(n,CN1))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1)))),Or(GtQ(Times(Plus(m,C1),Power(n,CN1)),C0),IGtQ(p,C0)))));
IIntegrate(2353,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,r))),q)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x),IntegerQ(q),Or(GtQ(q,C0),And(IGtQ(p,C0),IntegerQ(m),IntegerQ(r))))));
IIntegrate(2354,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,r_DEFAULT))),q_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Power(x,r))),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),FreeQ(List(a,b,c,d,e,f,m,n,p,q,r),x)));
IIntegrate(2355,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(u_,q_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(f,x),m),Power(ExpandToSum(u,x),q),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),And(FreeQ(List(a,b,c,f,m,n,p,q),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x)))));
IIntegrate(2356,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),$p("§polyx")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§polyx"),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),x),And(FreeQ(List(a,b,c,n,p),x),PolynomialQ($s("§polyx"),x))));
IIntegrate(2357,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,n),x),RationalFunctionQ($s("§rfx"),x),IGtQ(p,C0))));
IIntegrate(2358,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§rfx"),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,n),x),RationalFunctionQ($s("§rfx"),x),IGtQ(p,C0))));
IIntegrate(2359,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),$p("§afx")),x_Symbol),
    Condition(Unintegrable(Times($s("§afx"),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),And(FreeQ(List(a,b,c,n,p),x),AlgebraicFunctionQ($s("§afx"),x,True))));
IIntegrate(2360,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Plus(Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),e_DEFAULT),d_),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(c,Power(x,n))))),q)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),IntegerQ(p),IntegerQ(q))));
IIntegrate(2361,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Plus(d_DEFAULT,Times(Log(Times(f_DEFAULT,Power(x_,r_DEFAULT))),e_DEFAULT))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),x))),Subtract(Dist(Plus(d,Times(e,Log(Times(f,Power(x,r))))),u,x),Dist(Times(e,r),Int(SimplifyIntegrand(Times(u,Power(x,CN1)),x),x),x))),FreeQ(List(a,b,c,d,e,f,n,p,r),x)));
IIntegrate(2362,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Plus(d_DEFAULT,Times(Log(Times(f_DEFAULT,Power(x_,r_DEFAULT))),e_DEFAULT)),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q)),x),Negate(Dist(Times(b,n,p),Int(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Subtract(p,C1)),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q)),x),x)),Negate(Dist(Times(e,q,r),Int(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),Subtract(q,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,n,r),x),IGtQ(p,C0),IGtQ(q,C0))));
IIntegrate(2363,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Plus(d_DEFAULT,Times(Log(Times(f_DEFAULT,Power(x_,r_DEFAULT))),e_DEFAULT)),q_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q)),x),FreeQ(List(a,b,c,d,e,f,n,p,q,r),x)));
IIntegrate(2364,Int(Times(Power(Plus(a_DEFAULT,Times(Log(v_),b_DEFAULT)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(Log(v_),d_DEFAULT)),q_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coeff(v,x,C1),CN1),Subst(Int(Times(Power(Plus(a,Times(b,Log(x))),p),Power(Plus(c,Times(d,Log(x))),q)),x),x,v),x),And(FreeQ(List(a,b,c,d,p,q),x),LinearQ(v,x),NeQ(Coeff(v,x,C0),C0))));
IIntegrate(2365,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Plus(d_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),e_DEFAULT)),q_DEFAULT),Power(x_,CN1)),x_Symbol),
    Condition(Dist(Power(n,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Plus(d,Times(e,x)),q)),x),x,Log(Times(c,Power(x,n)))),x),FreeQ(List(a,b,c,d,e,n,p,q),x)));
IIntegrate(2366,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Plus(d_DEFAULT,Times(Log(Times(f_DEFAULT,Power(x_,r_DEFAULT))),e_DEFAULT)),Power(Times(g_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x))),Subtract(Dist(Plus(d,Times(e,Log(Times(f,Power(x,r))))),u,x),Dist(Times(e,r),Int(SimplifyIntegrand(Times(u,Power(x,CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p,r),x),Not(And(EqQ(p,C1),EqQ(a,C0),NeQ(d,C0))))));
IIntegrate(2367,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Plus(d_DEFAULT,Times(Log(Times(f_DEFAULT,Power(x_,r_DEFAULT))),e_DEFAULT)),q_DEFAULT),Power(Times(g_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(g,x),Plus(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q),Power(Times(g,Plus(m,C1)),CN1)),x),Negate(Dist(Times(b,n,p,Power(Plus(m,C1),CN1)),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Subtract(p,C1)),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q)),x),x)),Negate(Dist(Times(e,q,r,Power(Plus(m,C1),CN1)),Int(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),Subtract(q,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,m,n,r),x),IGtQ(p,C0),IGtQ(q,C0),NeQ(m,CN1))));
IIntegrate(2368,Int(Times(Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(Plus(d_DEFAULT,Times(Log(Times(f_DEFAULT,Power(x_,r_DEFAULT))),e_DEFAULT)),q_DEFAULT),Power(Times(g_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(g,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(Plus(d,Times(e,Log(Times(f,Power(x,r))))),q)),x),FreeQ(List(a,b,c,d,e,f,g,m,n,p,q,r),x)));
IIntegrate(2369,Int(Times(Power(Plus(a_DEFAULT,Times(Log(v_),b_DEFAULT)),p_DEFAULT),Power(Plus(c_DEFAULT,Times(Log(v_),d_DEFAULT)),q_DEFAULT),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(e,Coeff(u,x,C0)),Set(f,Coeff(u,x,C1)),Set(g,Coeff(v,x,C0)),Set(h,Coeff(v,x,C1))),Condition(Dist(Power(h,CN1),Subst(Int(Times(Power(Times(f,x,Power(h,CN1)),m),Power(Plus(a,Times(b,Log(x))),p),Power(Plus(c,Times(d,Log(x))),q)),x),x,v),x),And(EqQ(Subtract(Times(f,g),Times(e,h)),C0),NeQ(g,C0)))),And(FreeQ(List(a,b,c,d,m,p,q),x),LinearQ(List(u,v),x))));
IIntegrate(2370,Int(Times(Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT))),Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r))),x))),Subtract(Dist(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),u,x),Dist(Times(b,n,p),Int(Dist(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Subtract(p,C1)),Power(x,CN1)),u,x),x),x))),And(FreeQ(List(a,b,c,d,e,f,r,m,n),x),IGtQ(p,C0),RationalQ(m),Or(EqQ(p,C1),And(FractionQ(m),IntegerQ(Power(m,CN1))),And(EqQ(r,C1),EqQ(m,C1),EqQ(Times(d,e),C1))))));
IIntegrate(2371,Int(Times(Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT))),Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),x))),Subtract(Dist(Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r))),u,x),Dist(Times(f,m,r),Int(Dist(Times(Power(x,Subtract(m,C1)),Power(Plus(e,Times(f,Power(x,m))),CN1)),u,x),x),x))),And(FreeQ(List(a,b,c,d,e,f,r,m,n),x),IGtQ(p,C0),IntegerQ(m))));
IIntegrate(2372,Int(Times(Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT))),Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r)))),x),FreeQ(List(a,b,c,d,e,f,r,m,n,p),x)));
IIntegrate(2373,Int(Times(Log(Times(d_DEFAULT,Power(u_,r_DEFAULT))),Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Log(Times(d,Power(ExpandToSum(u,x),r))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p)),x),And(FreeQ(List(a,b,c,d,r,n,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x)))));
IIntegrate(2374,Int(Times(Log(Times(d_DEFAULT,Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))))),Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(x_,CN1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(PolyLog(C2,Times(CN1,d,f,Power(x,m))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),p),Power(m,CN1)),x)),Dist(Times(b,n,p,Power(m,CN1)),Int(Times(PolyLog(C2,Times(CN1,d,f,Power(x,m))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Subtract(p,C1)),Power(x,CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,m,n),x),IGtQ(p,C0),EqQ(Times(d,e),C1))));
IIntegrate(2375,Int(Times(Log(Times(d_DEFAULT,Power(Plus(e_,Times(f_DEFAULT,Power(x_,m_DEFAULT))),r_DEFAULT))),Power(Plus(a_DEFAULT,Times(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))),b_DEFAULT)),p_DEFAULT),Power(x_,CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(Log(Times(d,Power(Plus(e,Times(f,Power(x,m))),r))),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),x),Dist(Times(f,m,r,Power(Times(b,n,Plus(p,C1)),CN1)),Int(Times(Power(x,Subtract(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(x,n))))),Plus(p,C1)),Power(Plus(e,Times(f,Power(x,m))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,r,m,n),x),IGtQ(p,C0),NeQ(Times(d,e),C1))));
  }
}
}
