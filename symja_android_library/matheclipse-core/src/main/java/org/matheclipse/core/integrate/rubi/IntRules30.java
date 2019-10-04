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
public class IntRules30 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(751,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),CN1),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D3)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(C6,Sqr(c),Sqr(e),Power(d,CN2)),C3))),Plus(Negate(Simp(Times(CSqrt3,c,e,ArcTan(Plus(C1DSqrt3,Times(C2,c,Subtract(d,Times(e,x)),Power(Times(CSqrt3,d,q,Power(Plus(a,Times(c,Sqr(x))),C1D3)),CN1)))),Power(Times(Sqr(d),Sqr(q)),CN1)),x)),Negate(Simp(Times(C3,c,e,Log(Plus(d,Times(e,x))),Power(Times(C2,Sqr(d),Sqr(q)),CN1)),x)),Simp(Times(C3,c,e,Log(Subtract(Subtract(Times(c,d),Times(c,e,x)),Times(d,q,Power(Plus(a,Times(c,Sqr(x))),C1D3)))),Power(Times(C2,Sqr(d),Sqr(q)),CN1)),x))),And(FreeQ(List(a,c,d,e),x),EqQ(Subtract(Times(c,Sqr(d)),Times(C3,a,Sqr(e))),C0))));
IIntegrate(752,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D3)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN3,c,Sqr(e),Subtract(Times(C2,c,d),Times(b,e))),C3))),Plus(Negate(Simp(Times(CSqrt3,c,e,ArcTan(Subtract(C1DSqrt3,Times(C2,Subtract(Subtract(Times(c,d),Times(b,e)),Times(c,e,x)),Power(Times(CSqrt3,q,Power(Plus(a,Times(b,x),Times(c,Sqr(x))),C1D3)),CN1)))),Power(q,CN2)),x)),Negate(Simp(Times(C3,c,e,Log(Plus(d,Times(e,x))),Power(Times(C2,Sqr(q)),CN1)),x)),Simp(Times(C3,c,e,Log(Plus(Times(c,d),Times(CN1,b,e),Times(CN1,c,e,x),Times(q,Power(Plus(a,Times(b,x),Times(c,Sqr(x))),C1D3)))),Power(Times(C2,Sqr(q)),CN1)),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Subtract(Times(C2,c,d),Times(b,e)),C0),EqQ(Subtract(Plus(Times(Sqr(c),Sqr(d)),Times(CN1,b,c,d,e),Times(Sqr(b),Sqr(e))),Times(C3,a,c,Sqr(e))),C0),NegQ(Times(c,Sqr(e),Subtract(Times(C2,c,d),Times(b,e)))))));
IIntegrate(753,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),CN1),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D3)),x_Symbol),
    Condition(Dist(Power(a,C1D3),Int(Power(Times(Plus(d,Times(e,x)),Power(Subtract(C1,Times(C3,e,x,Power(d,CN1))),C1D3),Power(Plus(C1,Times(C3,e,x,Power(d,CN1))),C1D3)),CN1),x),x),And(FreeQ(List(a,c,d,e),x),EqQ(Plus(Times(c,Sqr(d)),Times(C9,a,Sqr(e))),C0),GtQ(a,C0))));
IIntegrate(754,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),CN1),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D3)),x_Symbol),
    Condition(Dist(Times(Power(Plus(C1,Times(c,Sqr(x),Power(a,CN1))),C1D3),Power(Plus(a,Times(c,Sqr(x))),CN1D3)),Int(Power(Times(Plus(d,Times(e,x)),Power(Plus(C1,Times(c,Sqr(x),Power(a,CN1))),C1D3)),CN1),x),x),And(FreeQ(List(a,c,d,e),x),EqQ(Plus(Times(c,Sqr(d)),Times(C9,a,Sqr(e))),C0),Not(GtQ(a,C0)))));
IIntegrate(755,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D3)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Dist(Times(Power(Plus(b,q,Times(C2,c,x)),C1D3),Power(Plus(b,Negate(q),Times(C2,c,x)),C1D3),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D3)),Int(Power(Times(Plus(d,Times(e,x)),Power(Plus(b,q,Times(C2,c,x)),C1D3),Power(Plus(b,Negate(q),Times(C2,c,x)),C1D3)),CN1),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(Sqr(c),Sqr(d)),Times(CN1,b,c,d,e),Times(CN1,C2,Sqr(b),Sqr(e)),Times(C9,a,c,Sqr(e))),C0))));
IIntegrate(756,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(Rt(a,C2),Times(Rt(Negate(c),C2),x)),p),Power(Subtract(Rt(a,C2),Times(Rt(Negate(c),C2),x)),p)),x),And(FreeQ(List(a,c,d,e,m,p),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),GtQ(a,C0),LtQ(c,C0))));
IIntegrate(757,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(c,Sqr(x))),p),Power(Subtract(Times(d,Power(Subtract(Sqr(d),Times(Sqr(e),Sqr(x))),CN1)),Times(e,x,Power(Subtract(Sqr(d),Times(Sqr(e),Sqr(x))),CN1))),Negate(m)),x),x),And(FreeQ(List(a,c,d,e,p),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),ILtQ(m,C0))));
IIntegrate(758,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Negate(Dist(Times(Power(Power(Plus(d,Times(e,x)),CN1),Times(C2,p)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(e,Power(Times(e,Plus(b,Negate(q),Times(C2,c,x)),Power(Times(C2,c,Plus(d,Times(e,x))),CN1)),p),Power(Times(e,Plus(b,q,Times(C2,c,x)),Power(Times(C2,c,Plus(d,Times(e,x))),CN1)),p)),CN1)),Subst(Int(Times(Power(x,Subtract(Negate(m),Times(C2,Plus(p,C1)))),Power(Simp(Subtract(C1,Times(Subtract(d,Times(e,Subtract(b,q),Power(Times(C2,c),CN1))),x)),x),p),Power(Simp(Subtract(C1,Times(Subtract(d,Times(e,Plus(b,q),Power(Times(C2,c),CN1))),x)),x),p)),x),x,Power(Plus(d,Times(e,x)),CN1)),x))),And(FreeQ(List(a,b,c,d,e,p),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Subtract(Times(C2,c,d),Times(b,e)),C0),Not(IntegerQ(p)),ILtQ(m,C0))));
IIntegrate(759,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Dist(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Power(Times(e,Power(Subtract(C1,Times(Plus(d,Times(e,x)),Power(Subtract(d,Times(e,Subtract(b,q),Power(Times(C2,c),CN1))),CN1))),p),Power(Subtract(C1,Times(Plus(d,Times(e,x)),Power(Subtract(d,Times(e,Plus(b,q),Power(Times(C2,c),CN1))),CN1))),p)),CN1)),Subst(Int(Times(Power(x,m),Power(Simp(Subtract(C1,Times(x,Power(Subtract(d,Times(e,Subtract(b,q),Power(Times(C2,c),CN1))),CN1))),x),p),Power(Simp(Subtract(C1,Times(x,Power(Subtract(d,Times(e,Plus(b,q),Power(Times(C2,c),CN1))),CN1))),x),p)),x),x,Plus(d,Times(e,x))),x)),And(FreeQ(List(a,b,c,d,e,m,p),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Subtract(Times(C2,c,d),Times(b,e)),C0),Not(IntegerQ(p)))));
IIntegrate(760,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,a,c),C2))),Dist(Times(Power(Plus(a,Times(c,Sqr(x))),p),Power(Times(e,Power(Subtract(C1,Times(Plus(d,Times(e,x)),Power(Plus(d,Times(e,q,Power(c,CN1))),CN1))),p),Power(Subtract(C1,Times(Plus(d,Times(e,x)),Power(Subtract(d,Times(e,q,Power(c,CN1))),CN1))),p)),CN1)),Subst(Int(Times(Power(x,m),Power(Simp(Subtract(C1,Times(x,Power(Plus(d,Times(e,q,Power(c,CN1))),CN1))),x),p),Power(Simp(Subtract(C1,Times(x,Power(Subtract(d,Times(e,q,Power(c,CN1))),CN1))),x),p)),x),x,Plus(d,Times(e,x))),x)),And(FreeQ(List(a,c,d,e,m,p),x),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)))));
IIntegrate(761,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,u_),Times(c_DEFAULT,Sqr(u_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x,u),x),And(FreeQ(List(a,b,c,d,e,m,p),x),LinearQ(u,x),NeQ(u,x))));
IIntegrate(762,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,u_)),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Sqr(u_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),p)),x),x,u),x),And(FreeQ(List(a,c,d,e,m,p),x),LinearQ(u,x),NeQ(u,x))));
IIntegrate(763,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Plus(f_,Times(g_DEFAULT,x_)),Power(Plus(Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(g,Power(Times(e,x),m),Power(Plus(Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C2)),CN1)),x),And(FreeQ(List(b,c,e,f,g,m,p),x),EqQ(Subtract(Times(b,g,Plus(m,p,C1)),Times(c,f,Plus(m,Times(C2,p),C2))),C0),NeQ(Plus(m,Times(C2,p),C2),C0))));
IIntegrate(764,Int(Times(Power(x_,m_DEFAULT),Plus(f_,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Dist(f,Int(Times(Power(x,m),Power(Plus(a,Times(c,Sqr(x))),p)),x),x),Dist(g,Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,f,g,p),x),IntegerQ(m),Not(IntegerQ(Times(C2,p))))));
IIntegrate(765,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(e,x),m),Plus(f,Times(g,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,e,f,g,m),x),IntegerQ(p),Or(GtQ(p,C0),And(EqQ(a,C0),IntegerQ(m))))));
IIntegrate(766,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(e,x),m),Plus(f,Times(g,x)),Power(Plus(a,Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,c,e,f,g,m),x),IGtQ(p,C0))));
IIntegrate(767,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT),Plus(f_,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Negate(Simp(Times(f,g,Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(b,Plus(p,C1),Subtract(Times(e,f),Times(d,g))),CN1)),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,p),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(m,Times(C2,p),C3),C0),EqQ(Subtract(Times(C2,c,f),Times(b,g)),C0))));
IIntegrate(768,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(g,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,c,Plus(p,C1)),CN1)),x),Dist(Times(e,g,m,Power(Times(C2,c,Plus(p,C1)),CN1)),Int(Times(Power(Plus(d,Times(e,x)),Subtract(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Subtract(Times(C2,c,f),Times(b,g)),C0),LtQ(p,CN1),GtQ(m,C0))));
IIntegrate(769,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,c,Subtract(Times(e,f),Times(d,g)),Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Plus(p,C1),Sqr(Subtract(Times(C2,c,d),Times(b,e)))),CN1)),x),Dist(Times(Subtract(Times(C2,c,f),Times(b,g)),Power(Subtract(Times(C2,c,d),Times(b,e)),CN1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,p),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(m,Times(C2,p),C3),C0),NeQ(Subtract(Times(C2,c,f),Times(b,g)),C0),NeQ(Subtract(Times(C2,c,d),Times(b,e)),C0))));
IIntegrate(770,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),FracPart(p)),Power(Times(Power(c,IntPart(p)),Power(Plus(Times(C1D2,b),Times(c,x)),Times(C2,FracPart(p)))),CN1)),Int(Times(Power(Plus(d,Times(e,x)),m),Plus(f,Times(g,x)),Power(Plus(Times(C1D2,b),Times(c,x)),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m),x),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0))));
IIntegrate(771,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Plus(f,Times(g,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(p),Or(GtQ(p,C0),And(EqQ(a,C0),IntegerQ(m))))));
IIntegrate(772,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Plus(f,Times(g,x)),Power(Plus(a,Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,c,d,e,f,g,m),x),IGtQ(p,C0))));
IIntegrate(773,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Plus(f_,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(e,g,x,Power(c,CN1)),x),Dist(Power(c,CN1),Int(Times(Plus(Times(c,d,f),Times(CN1,a,e,g),Times(Subtract(Plus(Times(c,e,f),Times(c,d,g)),Times(b,e,g)),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0))));
IIntegrate(774,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Plus(f_,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Plus(Simp(Times(e,g,x,Power(c,CN1)),x),Dist(Power(c,CN1),Int(Times(Plus(Times(c,d,f),Times(CN1,a,e,g),Times(c,Plus(Times(e,f),Times(d,g)),x)),Power(Plus(a,Times(c,Sqr(x))),CN1)),x),x)),FreeQ(List(a,c,d,e,f,g),x)));
IIntegrate(775,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Negate(Simp(Times(Subtract(Subtract(Times(b,e,g,Plus(p,C2)),Times(c,Plus(Times(e,f),Times(d,g)),Plus(Times(C2,p),C3))),Times(C2,c,e,g,Plus(p,C1),x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,Sqr(c),Plus(p,C1),Plus(Times(C2,p),C3)),CN1)),x)),And(FreeQ(List(a,b,c,d,e,f,g,p),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(Sqr(b),e,g,Plus(p,C2)),Times(CN1,C2,a,c,e,g),Times(c,Subtract(Times(C2,c,d,f),Times(b,Plus(Times(e,f),Times(d,g)))),Plus(Times(C2,p),C3))),C0),NeQ(p,CN1))));
  }
}
}
