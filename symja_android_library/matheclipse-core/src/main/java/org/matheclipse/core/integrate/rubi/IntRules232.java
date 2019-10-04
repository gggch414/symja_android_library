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
public class IntRules232 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(5801,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Times(e,Plus(m,C1)),CN1)),x),Dist(Times(b,c,n,Power(Times(e,Plus(m,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Subtract(n,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),IGtQ(n,C0),NeQ(m,CN1))));
IIntegrate(5802,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(e,Plus(m,C1)),CN1)),x),Dist(Times(b,c,n,Power(Times(e,Plus(m,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1)),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),IGtQ(n,C0),NeQ(m,CN1))));
IIntegrate(5803,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),IGtQ(m,C0),LtQ(n,CN1))));
IIntegrate(5804,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),IGtQ(m,C0),LtQ(n,CN1))));
IIntegrate(5805,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Cosh(x),Power(Plus(Times(c,d),Times(e,Sinh(x))),m)),x),x,ArcSinh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(m,C0))));
IIntegrate(5806,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(c,Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Plus(Times(c,d),Times(e,Cosh(x))),m),Sinh(x)),x),x,ArcCosh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),IGtQ(m,C0))));
IIntegrate(5807,Int(Times(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px")),x_Symbol),
    Condition(With(List(Set(u,IntHide(ExpandExpression($s("§px"),x),x))),Subtract(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c),x),PolynomialQ($s("§px"),x))));
IIntegrate(5808,Int(Times(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px")),x_Symbol),
    Condition(With(List(Set(u,IntHide(ExpandExpression($s("§px"),x),x))),Subtract(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Dist(Times(b,c,Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x)))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),CN1)),Int(SimplifyIntegrand(Times(u,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c),x),PolynomialQ($s("§px"),x))));
IIntegrate(5809,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),$p("§px")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,n),x),PolynomialQ($s("§px"),x))));
IIntegrate(5810,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),$p("§px")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,n),x),PolynomialQ($s("§px"),x))));
IIntegrate(5811,Int(Times(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px"),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times($s("§px"),Power(Plus(d,Times(e,x)),m)),x))),Subtract(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),PolynomialQ($s("§px"),x))));
IIntegrate(5812,Int(Times(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),$p("§px"),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times($s("§px"),Power(Plus(d,Times(e,x)),m)),x))),Subtract(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Dist(Times(b,c,Sqrt(Subtract(C1,Times(Sqr(c),Sqr(x)))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),CN1)),Int(SimplifyIntegrand(Times(u,Power(Subtract(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),PolynomialQ($s("§px"),x))));
IIntegrate(5813,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),p),Power(Plus(d,Times(e,x)),m)),x))),Subtract(Dist(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),u,x),Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Subtract(n,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(n,C0),IGtQ(p,C0),ILtQ(m,C0),LtQ(Plus(m,p,C1),C0))));
IIntegrate(5814,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),p),Power(Plus(d,Times(e,x)),m)),x))),Subtract(Dist(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),u,x),Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1)),Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),IGtQ(n,C0),IGtQ(p,C0),ILtQ(m,C0),LtQ(Plus(m,p,C1),C0))));
IIntegrate(5815,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),CN2),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_),Times(h_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x),Times(h,Sqr(x))),p),Power(Plus(d,Times(e,x)),CN2)),x))),Subtract(Dist(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),u,x),Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Subtract(n,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h),x),IGtQ(n,C0),IGtQ(p,C0),EqQ(Subtract(Times(e,g),Times(C2,d,h)),C0))));
IIntegrate(5816,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_),Power(Plus(d_,Times(e_DEFAULT,x_)),CN2),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_),Times(h_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x),Times(h,Sqr(x))),p),Power(Plus(d,Times(e,x)),CN2)),x))),Subtract(Dist(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),u,x),Dist(Times(b,c,n),Int(SimplifyIntegrand(Times(u,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Subtract(n,C1)),Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g,h),x),IGtQ(n,C0),IGtQ(p,C0),EqQ(Subtract(Times(e,g),Times(C2,d,h)),C0))));
IIntegrate(5817,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),$p("§px"),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),PolynomialQ($s("§px"),x),IGtQ(n,C0),IntegerQ(m))));
IIntegrate(5818,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),$p("§px"),Power(Plus(d_,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§px"),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),PolynomialQ($s("§px"),x),IGtQ(n,C0),IntegerQ(m))));
IIntegrate(5819,Int(Times(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),p)),x))),Subtract(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Dist(Times(b,c),Int(Dist(Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2),u,x),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),IGtQ(m,C0),ILtQ(Plus(p,C1D2),C0),GtQ(d,C0),Or(LtQ(m,Subtract(Times(CN2,p),C1)),GtQ(m,C3)))));
IIntegrate(5820,Int(Times(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Plus(f,Times(g,x)),m),Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p)),x))),Subtract(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Dist(Times(b,c),Int(Dist(Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),CN1),u,x),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),EqQ(Subtract($s("e1"),Times(c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IGtQ(m,C0),ILtQ(Plus(p,C1D2),C0),GtQ($s("d1"),C0),LtQ($s("d2"),C0),Or(LtQ(m,Subtract(Times(CN2,p),C1)),GtQ(m,C3)))));
IIntegrate(5821,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),Power(Plus(f,Times(g,x)),m),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),IGtQ(m,C0),IntegerQ(Plus(p,C1D2)),GtQ(d,C0),IGtQ(n,C0),Or(And(EqQ(n,C1),GtQ(p,CN1)),GtQ(p,C0),EqQ(m,C1),And(EqQ(m,C2),LtQ(p,CN2))))));
IIntegrate(5822,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),Power(Plus(f,Times(g,x)),m),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),EqQ(Subtract($s("e1"),Times(c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IGtQ(m,C0),IntegerQ(Plus(p,C1D2)),GtQ($s("d1"),C0),LtQ($s("d2"),C0),IGtQ(n,C0),Or(And(EqQ(n,C1),GtQ(p,CN1)),GtQ(p,C0),EqQ(m,C1),And(EqQ(m,C2),LtQ(p,CN2))))));
IIntegrate(5823,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),m_),Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(f,Times(g,x)),m),Plus(d,Times(e,Sqr(x))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1)),x),Dist(Power(Times(b,c,Sqrt(d),Plus(n,C1)),CN1),Int(Times(Plus(Times(d,g,m),Times(C2,e,f,x),Times(e,g,Plus(m,C2),Sqr(x))),Power(Plus(f,Times(g,x)),Subtract(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),ILtQ(m,C0),GtQ(d,C0),IGtQ(n,C0))));
IIntegrate(5824,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Sqrt(Plus($p("d1"),Times($p("e1",true),x_))),Sqrt(Plus($p("d2"),Times($p("e2",true),x_))),Power(Plus(f_,Times(g_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(f,Times(g,x)),m),Plus(Times($s("d1"),$s("d2")),Times($s("e1"),$s("e2"),Sqr(x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),CN1)),x),Dist(Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),CN1),Int(Times(Plus(Times($s("d1"),$s("d2"),g,m),Times(C2,$s("e1"),$s("e2"),f,x),Times($s("e1"),$s("e2"),g,Plus(m,C2),Sqr(x))),Power(Plus(f,Times(g,x)),Subtract(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x),x)),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),EqQ(Subtract($s("e1"),Times(c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),ILtQ(m,C0),GtQ($s("d1"),C0),LtQ($s("d2"),C0),IGtQ(n,C0))));
IIntegrate(5825,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),Power(Plus(f_,Times(g_DEFAULT,x_)),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),Times(Power(Plus(f,Times(g,x)),m),Power(Plus(d,Times(e,Sqr(x))),Subtract(p,C1D2))),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(e,Times(Sqr(c),d)),IntegerQ(m),IGtQ(Plus(p,C1D2),C0),GtQ(d,C0),IGtQ(n,C0))));
  }
}
}
