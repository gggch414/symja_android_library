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
public class IntRules90 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(2251,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Power(a,p),Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Hypergeometric2F1(Negate(p),Times(g,h,Log(GSymbol),Power(Times(d,e,Log(FSymbol)),CN1)),Plus(Times(g,h,Log(GSymbol),Power(Times(d,e,Log(FSymbol)),CN1)),C1),Simplify(Times(CN1,b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))),Power(a,CN1)))),Power(Times(g,h,Log(GSymbol)),CN1)),x),And(FreeQ(List(FSymbol,GSymbol,a,b,c,d,e,f,g,h,p),x),Or(ILtQ(p,C0),GtQ(a,C0)))));
IIntegrate(2252,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_))))),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p),Power(Power(Plus(C1,Times(b,Power(a,CN1),Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p),CN1)),Int(Times(Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Power(Plus(C1,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))),Power(a,CN1))),p)),x),x),And(FreeQ(List(FSymbol,GSymbol,a,b,c,d,e,f,g,h,p),x),Not(Or(ILtQ(p,C0),GtQ(a,C0))))));
IIntegrate(2253,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,v_)))),p_),Power(G_,Times(h_DEFAULT,u_))),x_Symbol),
    Condition(Int(Times(Power(GSymbol,Times(h,ExpandToSum(u,x))),Power(Plus(a,Times(b,Power(FSymbol,Times(e,ExpandToSum(v,x))))),p)),x),And(FreeQ(List(FSymbol,GSymbol,a,b,e,h,p),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x)))));
IIntegrate(2254,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,u_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,Power(F_,v_))),q_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(w,ExpandIntegrand(Power(Plus(e,Times(f,x)),m),Times(Power(Plus(a,Times(b,Power(FSymbol,u))),p),Power(Plus(c,Times(d,Power(FSymbol,v))),q)),x))),Condition(Int(w,x),SumQ(w))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,m),x),IntegersQ(p,q),LinearQ(List(u,v),x),RationalQ(Simplify(Times(u,Power(v,CN1)))))));
IIntegrate(2255,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_DEFAULT),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power($p("H"),Times(t_DEFAULT,Plus(r_DEFAULT,Times(s_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(m,FullSimplify(Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(d,e,Log(FSymbol)),CN1))))),Condition(Dist(Times(Denominator(m),Power(GSymbol,Subtract(Times(f,h),Times(c,g,h,Power(d,CN1)))),Power($s("H"),Subtract(Times(r,t),Times(c,s,t,Power(d,CN1)))),Power(Times(d,e,Log(FSymbol)),CN1)),Subst(Int(Times(Power(x,Subtract(Numerator(m),C1)),Power(Plus(a,Times(b,Power(x,Denominator(m)))),p)),x),x,Power(FSymbol,Times(e,Plus(c,Times(d,x)),Power(Denominator(m),CN1)))),x),RationalQ(m))),FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,c,d,e,f,g,h,r,s,t,p),x)));
IIntegrate(2256,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_DEFAULT),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power($p("H"),Times(t_DEFAULT,Plus(r_DEFAULT,Times(s_DEFAULT,x_))))),x_Symbol),
    Condition(Dist(Power(GSymbol,Times(Subtract(f,Times(c,g,Power(d,CN1))),h)),Int(Times(Power($s("H"),Times(t,Plus(r,Times(s,x)))),Power(Plus(b,Times(a,Power(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),CN1))),p)),x),x),And(FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,c,d,e,f,g,h,r,s,t),x),EqQ(Plus(Times(d,e,p,Log(FSymbol)),Times(g,h,Log(GSymbol))),C0),IntegerQ(p))));
IIntegrate(2257,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_DEFAULT),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power($p("H"),Times(t_DEFAULT,Plus(r_DEFAULT,Times(s_DEFAULT,x_))))),x_Symbol),
    Condition(Int(Expand(Times(Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Power($s("H"),Times(t,Plus(r,Times(s,x)))),Power(Plus(a,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p)),x),x),And(FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,c,d,e,f,g,h,r,s,t),x),IGtQ(p,C0))));
IIntegrate(2258,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power($p("H"),Times(t_DEFAULT,Plus(r_DEFAULT,Times(s_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Power(a,p),Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Power($s("H"),Times(t,Plus(r,Times(s,x)))),Hypergeometric2F1(Negate(p),Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(d,e,Log(FSymbol)),CN1)),Plus(Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(d,e,Log(FSymbol)),CN1)),C1),Simplify(Times(CN1,b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))),Power(a,CN1)))),Power(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),CN1)),x),And(FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,c,d,e,f,g,h,r,s,t),x),ILtQ(p,C0))));
IIntegrate(2259,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),Power($p("H"),Times(t_DEFAULT,Plus(r_DEFAULT,Times(s_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Power($s("H"),Times(t,Plus(r,Times(s,x)))),Power(Plus(a,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p),Hypergeometric2F1(Negate(p),Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(d,e,Log(FSymbol)),CN1)),Plus(Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(d,e,Log(FSymbol)),CN1)),C1),Simplify(Times(CN1,b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))),Power(a,CN1)))),Power(Times(Plus(Times(g,h,Log(GSymbol)),Times(s,t,Log($s("H")))),Power(Times(Plus(a,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),Power(a,CN1)),p)),CN1)),x),And(FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,c,d,e,f,g,h,r,s,t,p),x),Not(IntegerQ(p)))));
IIntegrate(2260,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,v_)))),p_),Power(G_,Times(h_DEFAULT,u_)),Power($p("H"),Times(t_DEFAULT,w_))),x_Symbol),
    Condition(Int(Times(Power(GSymbol,Times(h,ExpandToSum(u,x))),Power($s("H"),Times(t,ExpandToSum(w,x))),Power(Plus(a,Times(b,Power(FSymbol,Times(e,ExpandToSum(v,x))))),p)),x),And(FreeQ(List(FSymbol,GSymbol,$s("H"),a,b,e,h,t,p),x),LinearQ(List(u,v,w),x),Not(LinearMatchQ(List(u,v,w),x)))));
IIntegrate(2261,Int(Times(Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),Power(Plus(Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),Times(a_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(Times(a,Power(x,n)),Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),Plus(p,C1)),Power(Times(b,d,e,Plus(p,C1),Log(FSymbol)),CN1)),x),Dist(Times(a,n,Power(Times(b,d,e,Log(FSymbol)),CN1)),Int(Times(Power(x,Subtract(n,C1)),Power(Plus(Times(a,Power(x,n)),Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p)),x),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,n,p),x),NeQ(p,CN1))));
IIntegrate(2262,Int(Times(Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),Power(x_,m_DEFAULT),Power(Plus(Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),Times(a_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Power(Plus(Times(a,Power(x,n)),Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),Plus(p,C1)),Power(Times(b,d,e,Plus(p,C1),Log(FSymbol)),CN1)),x),Negate(Dist(Times(m,Power(Times(b,d,e,Plus(p,C1),Log(FSymbol)),CN1)),Int(Times(Power(x,Subtract(m,C1)),Power(Plus(Times(a,Power(x,n)),Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),Plus(p,C1))),x),x)),Negate(Dist(Times(a,n,Power(Times(b,d,e,Log(FSymbol)),CN1)),Int(Times(Power(x,Subtract(Plus(m,n),C1)),Power(Plus(Times(a,Power(x,n)),Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p)),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,m,n,p),x),NeQ(p,CN1))));
IIntegrate(2263,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,u_)),Times(c_DEFAULT,Power(F_,v_))),CN1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Times(C2,c,Power(q,CN1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(b,Negate(q),Times(C2,c,Power(FSymbol,u))),CN1)),x),x),Dist(Times(C2,c,Power(q,CN1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(b,q,Times(C2,c,Power(FSymbol,u))),CN1)),x),x))),And(FreeQ(List(FSymbol,a,b,c,f,g),x),EqQ(v,Times(C2,u)),LinearQ(u,x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(m,C0))));
IIntegrate(2264,Int(Times(Power(F_,u_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,u_)),Times(c_DEFAULT,Power(F_,v_))),CN1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Times(C2,c,Power(q,CN1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(FSymbol,u),Power(Plus(b,Negate(q),Times(C2,c,Power(FSymbol,u))),CN1)),x),x),Dist(Times(C2,c,Power(q,CN1)),Int(Times(Power(Plus(f,Times(g,x)),m),Power(FSymbol,u),Power(Plus(b,q,Times(C2,c,Power(FSymbol,u))),CN1)),x),x))),And(FreeQ(List(FSymbol,a,b,c,f,g),x),EqQ(v,Times(C2,u)),LinearQ(u,x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(m,C0))));
IIntegrate(2265,Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,u_)),Times(c_DEFAULT,Power(F_,v_))),CN1),Plus(Times(i_DEFAULT,Power(F_,u_)),h_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Plus(Simplify(Times(Subtract(Times(C2,c,h),Times(b,i)),Power(q,CN1))),i),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(b,Negate(q),Times(C2,c,Power(FSymbol,u))),CN1)),x),x),Dist(Subtract(Simplify(Times(Subtract(Times(C2,c,h),Times(b,i)),Power(q,CN1))),i),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(b,q,Times(C2,c,Power(FSymbol,u))),CN1)),x),x))),And(FreeQ(List(FSymbol,a,b,c,f,g,h,i),x),EqQ(v,Times(C2,u)),LinearQ(u,x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(m,C0))));
IIntegrate(2266,Int(Times(Power(Plus(Times(b_DEFAULT,Power(F_,v_)),Times(a_DEFAULT,Power(F_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),CN1),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(Times(a,Power(FSymbol,Plus(c,Times(d,x)))),Times(b,Power(FSymbol,v))),CN1),x))),Subtract(Simp(Times(Power(x,m),u),x),Dist(m,Int(Times(Power(x,Subtract(m,C1)),u),x),x))),And(FreeQ(List(FSymbol,a,b,c,d),x),EqQ(v,Negate(Plus(c,Times(d,x)))),GtQ(m,C0))));
IIntegrate(2267,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,v_)),Times(c_DEFAULT,Power(F_,w_))),CN1),u_),x_Symbol),
    Condition(Int(Times(u,Power(FSymbol,v),Power(Plus(c,Times(a,Power(FSymbol,v)),Times(b,Power(FSymbol,Times(C2,v)))),CN1)),x),And(FreeQ(List(FSymbol,a,b,c),x),EqQ(w,Negate(v)),LinearQ(v,x),If(RationalQ(Coefficient(v,x,C1)),GtQ(Coefficient(v,x,C1),C0),LtQ(LeafCount(v),LeafCount(w))))));
IIntegrate(2268,Int(Times(Power(F_,Times(g_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(g,Power(Plus(d,Times(e,x)),n))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1),x),x),FreeQ(List(FSymbol,a,b,c,d,e,g,n),x)));
IIntegrate(2269,Int(Times(Power(F_,Times(g_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(g,Power(Plus(d,Times(e,x)),n))),Power(Plus(a,Times(c,Sqr(x))),CN1),x),x),FreeQ(List(FSymbol,a,c,d,e,g,n),x)));
IIntegrate(2270,Int(Times(Power(F_,Times(g_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_,Sqr(x_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(g,Power(Plus(d,Times(e,x)),n))),Times(Power(u,m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1)),x),x),And(FreeQ(List(FSymbol,a,b,c,d,e,g,n),x),PolynomialQ(u,x),IntegerQ(m))));
IIntegrate(2271,Int(Times(Power(F_,Times(g_DEFAULT,Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),n_DEFAULT))),Power(u_,m_DEFAULT),Power(Plus(a_,Times(c_,Sqr(x_))),CN1)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(FSymbol,Times(g,Power(Plus(d,Times(e,x)),n))),Times(Power(u,m),Power(Plus(a,Times(c,Sqr(x))),CN1)),x),x),And(FreeQ(List(FSymbol,a,c,d,e,g,n),x),PolynomialQ(u,x),IntegerQ(m))));
IIntegrate(2272,Int(Power(F_,Times(Power(x_,CN2),Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,C4))))),x_Symbol),
    Condition(Subtract(Simp(Times(Sqrt(Pi),Exp(Times(C2,Sqrt(Times(CN1,a,Log(FSymbol))),Sqrt(Times(CN1,b,Log(FSymbol))))),Erf(Times(Plus(Sqrt(Times(CN1,a,Log(FSymbol))),Times(Sqrt(Times(CN1,b,Log(FSymbol))),Sqr(x))),Power(x,CN1))),Power(Times(C4,Sqrt(Times(CN1,b,Log(FSymbol)))),CN1)),x),Simp(Times(Sqrt(Pi),Exp(Times(CN2,Sqrt(Times(CN1,a,Log(FSymbol))),Sqrt(Times(CN1,b,Log(FSymbol))))),Erf(Times(Subtract(Sqrt(Times(CN1,a,Log(FSymbol))),Times(Sqrt(Times(CN1,b,Log(FSymbol))),Sqr(x))),Power(x,CN1))),Power(Times(C4,Sqrt(Times(CN1,b,Log(FSymbol)))),CN1)),x)),FreeQ(List(FSymbol,a,b),x)));
IIntegrate(2273,Int(Times(Power(x_,m_DEFAULT),Power(Plus(Exp(x_),Power(x_,m_DEFAULT)),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Plus(Exp(x),Power(x,m)),Plus(n,C1)),Power(Plus(n,C1),CN1)),x)),Dist(m,Int(Times(Power(x,Subtract(m,C1)),Power(Plus(Exp(x),Power(x,m)),n)),x),x),Int(Power(Plus(Exp(x),Power(x,m)),Plus(n,C1)),x)),And(RationalQ(m,n),GtQ(m,C0),LtQ(n,C0),NeQ(n,CN1))));
IIntegrate(2274,Int(Times(u_DEFAULT,Power(F_,Times(a_DEFAULT,Plus(Times(Log(z_),b_DEFAULT),v_DEFAULT)))),x_Symbol),
    Condition(Int(Times(u,Power(FSymbol,Times(a,v)),Power(z,Times(a,b,Log(FSymbol)))),x),FreeQ(List(FSymbol,a,b),x)));
IIntegrate(2275,Int(Power(F_,Times(Plus(a_DEFAULT,Times(Sqr(Log(Times(c_DEFAULT,Power(x_,n_DEFAULT)))),b_DEFAULT)),d_DEFAULT)),x_Symbol),
    Condition(Dist(Times(x,Power(Times(n,Power(Times(c,Power(x,n)),Power(n,CN1))),CN1)),Subst(Int(Exp(Plus(Times(a,d,Log(FSymbol)),Times(x,Power(n,CN1)),Times(b,d,Log(FSymbol),Sqr(x)))),x),x,Log(Times(c,Power(x,n)))),x),FreeQ(List(FSymbol,a,b,c,d,n),x)));
  }
}
}
