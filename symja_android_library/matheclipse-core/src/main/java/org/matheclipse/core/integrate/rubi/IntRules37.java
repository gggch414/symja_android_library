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
public class IntRules37 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(926,Int(Times(Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Simp(Times(CSqrt2,Sqrt(Subtract(Times(C2,c,f),Times(g,Plus(b,q)))),Sqrt(Plus(b,Negate(q),Times(C2,c,x))),Plus(d,Times(e,x)),Sqrt(Times(Subtract(Times(e,f),Times(d,g)),Plus(b,q,Times(C2,c,x)),Power(Times(Subtract(Times(C2,c,f),Times(g,Plus(b,q))),Plus(d,Times(e,x))),CN1))),Sqrt(Times(Subtract(Times(e,f),Times(d,g)),Plus(Times(C2,a),Times(Plus(b,q),x)),Power(Times(Subtract(Plus(Times(b,f),Times(q,f)),Times(C2,a,g)),Plus(d,Times(e,x))),CN1))),EllipticPi(Times(e,Subtract(Times(C2,c,f),Times(g,Plus(b,q))),Power(Times(g,Subtract(Times(C2,c,d),Times(e,Plus(b,q)))),CN1)),ArcSin(Times(Sqrt(Subtract(Times(C2,c,d),Times(e,Plus(b,q)))),Sqrt(Plus(f,Times(g,x))),Power(Times(Sqrt(Subtract(Times(C2,c,f),Times(g,Plus(b,q)))),Sqrt(Plus(d,Times(e,x)))),CN1))),Times(Subtract(Plus(Times(b,d),Times(q,d)),Times(C2,a,e)),Subtract(Times(C2,c,f),Times(g,Plus(b,q))),Power(Times(Subtract(Plus(Times(b,f),Times(q,f)),Times(C2,a,g)),Subtract(Times(C2,c,d),Times(e,Plus(b,q)))),CN1))),Power(Times(g,Sqrt(Subtract(Times(C2,c,d),Times(e,Plus(b,q)))),Sqrt(Plus(Times(C2,a,c,Power(Plus(b,q),CN1)),Times(c,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1)),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0))));
IIntegrate(927,Int(Times(Sqrt(Plus(d_DEFAULT,Times(e_DEFAULT,x_))),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN4,a,c),C2))),Simp(Times(CSqrt2,Sqrt(Subtract(Times(C2,c,f),Times(g,q))),Sqrt(Plus(Negate(q),Times(C2,c,x))),Plus(d,Times(e,x)),Sqrt(Times(Subtract(Times(e,f),Times(d,g)),Plus(q,Times(C2,c,x)),Power(Times(Subtract(Times(C2,c,f),Times(g,q)),Plus(d,Times(e,x))),CN1))),Sqrt(Times(Subtract(Times(e,f),Times(d,g)),Plus(Times(C2,a),Times(q,x)),Power(Times(Subtract(Times(q,f),Times(C2,a,g)),Plus(d,Times(e,x))),CN1))),EllipticPi(Times(e,Subtract(Times(C2,c,f),Times(g,q)),Power(Times(g,Subtract(Times(C2,c,d),Times(e,q))),CN1)),ArcSin(Times(Sqrt(Subtract(Times(C2,c,d),Times(e,q))),Sqrt(Plus(f,Times(g,x))),Power(Times(Sqrt(Subtract(Times(C2,c,f),Times(g,q))),Sqrt(Plus(d,Times(e,x)))),CN1))),Times(Subtract(Times(q,d),Times(C2,a,e)),Subtract(Times(C2,c,f),Times(g,q)),Power(Times(Subtract(Times(q,f),Times(C2,a,g)),Subtract(Times(C2,c,d),Times(e,q))),CN1))),Power(Times(g,Sqrt(Subtract(Times(C2,c,d),Times(e,q))),Sqrt(Plus(Times(C2,a,c,Power(q,CN1)),Times(c,x))),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1)),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0))));
IIntegrate(928,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),QQ(3L,2L)),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Subtract(Dist(Times(e,Power(g,CN1)),Int(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2)),x),x),Dist(Times(Subtract(Times(e,f),Times(d,g)),Power(g,CN1)),Int(Times(Sqrt(Plus(d,Times(e,x))),Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0))));
IIntegrate(929,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),QQ(3L,2L)),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Subtract(Dist(Times(e,Power(g,CN1)),Int(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x))),Power(Plus(a,Times(c,Sqr(x))),CN1D2)),x),x),Dist(Times(Subtract(Times(e,f),Times(d,g)),Power(g,CN1)),Int(Times(Sqrt(Plus(d,Times(e,x))),Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0))));
IIntegrate(930,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Subtract(Simp(Times(C2,Sqr(e),Power(Plus(d,Times(e,x)),Subtract(m,C2)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(c,g,Subtract(Times(C2,m),C1)),CN1)),x),Dist(Power(Times(c,g,Subtract(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(d,Times(e,x)),Subtract(m,C3)),Simp(Plus(Times(b,d,Sqr(e),f),Times(a,Sqr(e),Plus(Times(d,g),Times(C2,e,f,Subtract(m,C2)))),Times(CN1,c,Power(d,C3),g,Subtract(Times(C2,m),C1)),Times(e,Plus(Times(e,Plus(Times(C2,b,d,g),Times(e,Plus(Times(b,f),Times(a,g)),Subtract(Times(C2,m),C3)))),Times(c,d,Subtract(Times(C2,e,f),Times(C3,d,g,Subtract(Times(C2,m),C1))))),x),Times(C2,Sqr(e),Plus(Times(c,e,f),Times(CN1,C3,c,d,g),Times(b,e,g)),Subtract(m,C1),Sqr(x))),x),Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(Times(C2,m)),GeQ(m,C2))));
IIntegrate(931,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Subtract(Simp(Times(C2,Sqr(e),Power(Plus(d,Times(e,x)),Subtract(m,C2)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x)))),Power(Times(c,g,Subtract(Times(C2,m),C1)),CN1)),x),Dist(Power(Times(c,g,Subtract(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(d,Times(e,x)),Subtract(m,C3)),Simp(Plus(Times(a,Sqr(e),Plus(Times(d,g),Times(C2,e,f,Subtract(m,C2)))),Times(CN1,c,Power(d,C3),g,Subtract(Times(C2,m),C1)),Times(e,Plus(Times(e,a,e,g,Subtract(Times(C2,m),C3)),Times(c,d,Subtract(Times(C2,e,f),Times(C3,d,g,Subtract(Times(C2,m),C1))))),x),Times(C2,Sqr(e),Subtract(Times(c,e,f),Times(C3,c,d,g)),Subtract(m,C1),Sqr(x))),x),Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IntegerQ(Times(C2,m)),GeQ(m,C2))));
IIntegrate(932,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,c,Power(a,CN1)),C2))),Dist(Power(a,CN1D2),Int(Power(Times(Plus(d,Times(e,x)),Sqrt(Plus(f,Times(g,x))),Sqrt(Subtract(C1,Times(q,x))),Sqrt(Plus(C1,Times(q,x)))),CN1),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),GtQ(a,C0))));
IIntegrate(933,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,c,Power(a,CN1)),C2))),Dist(Times(Sqrt(Plus(C1,Times(c,Sqr(x),Power(a,CN1)))),Power(Plus(a,Times(c,Sqr(x))),CN1D2)),Int(Power(Times(Plus(d,Times(e,x)),Sqrt(Plus(f,Times(g,x))),Sqrt(Subtract(C1,Times(q,x))),Sqrt(Plus(C1,Times(q,x)))),CN1),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(GtQ(a,C0)))));
IIntegrate(934,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Dist(Times(Sqrt(Plus(b,Negate(q),Times(C2,c,x))),Sqrt(Plus(b,q,Times(C2,c,x))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2)),Int(Power(Times(Plus(d,Times(e,x)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(b,Negate(q),Times(C2,c,x))),Sqrt(Plus(b,q,Times(C2,c,x)))),CN1),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0))));
IIntegrate(935,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1D2),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,Plus(d,Times(e,x)),Sqrt(Times(Sqr(Subtract(Times(e,f),Times(d,g))),Plus(a,Times(b,x),Times(c,Sqr(x))),Power(Times(Plus(Times(c,Sqr(f)),Times(CN1,b,f,g),Times(a,Sqr(g))),Sqr(Plus(d,Times(e,x)))),CN1))),Power(Times(Subtract(Times(e,f),Times(d,g)),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1)),Subst(Int(Power(Plus(C1,Times(CN1,Plus(Times(C2,c,d,f),Times(CN1,b,e,f),Times(CN1,b,d,g),Times(C2,a,e,g)),Sqr(x),Power(Plus(Times(c,Sqr(f)),Times(CN1,b,f,g),Times(a,Sqr(g))),CN1)),Times(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),Power(x,C4),Power(Plus(Times(c,Sqr(f)),Times(CN1,b,f,g),Times(a,Sqr(g))),CN1))),CN1D2),x),x,Times(Sqrt(Plus(f,Times(g,x))),Power(Plus(d,Times(e,x)),CN1D2))),x),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0))));
IIntegrate(936,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1D2),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,Plus(d,Times(e,x)),Sqrt(Times(Sqr(Subtract(Times(e,f),Times(d,g))),Plus(a,Times(c,Sqr(x))),Power(Times(Plus(Times(c,Sqr(f)),Times(a,Sqr(g))),Sqr(Plus(d,Times(e,x)))),CN1))),Power(Times(Subtract(Times(e,f),Times(d,g)),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1)),Subst(Int(Power(Plus(C1,Times(CN1,Plus(Times(C2,c,d,f),Times(C2,a,e,g)),Sqr(x),Power(Plus(Times(c,Sqr(f)),Times(a,Sqr(g))),CN1)),Times(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),Power(x,C4),Power(Plus(Times(c,Sqr(f)),Times(a,Sqr(g))),CN1))),CN1D2),x),x,Times(Sqrt(Plus(f,Times(g,x))),Power(Plus(d,Times(e,x)),CN1D2))),x),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0))));
IIntegrate(937,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),QQ(-3L,2L)),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(g,Power(Subtract(Times(e,f),Times(d,g)),CN1)),Int(Power(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1),x),x)),Dist(Times(e,Power(Subtract(Times(e,f),Times(d,g)),CN1)),Int(Times(Sqrt(Plus(f,Times(g,x))),Power(Times(Power(Plus(d,Times(e,x)),QQ(3L,2L)),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0))));
IIntegrate(938,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),QQ(-3L,2L)),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(g,Power(Subtract(Times(e,f),Times(d,g)),CN1)),Int(Power(Times(Sqrt(Plus(d,Times(e,x))),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1),x),x)),Dist(Times(e,Power(Subtract(Times(e,f),Times(d,g)),CN1)),Int(Times(Sqrt(Plus(f,Times(g,x))),Power(Times(Power(Plus(d,Times(e,x)),QQ(3L,2L)),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0))));
IIntegrate(939,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(e),Power(Plus(d,Times(e,x)),Plus(m,C1)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(Plus(m,C1),Subtract(Times(e,f),Times(d,g)),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),CN1)),x),Dist(Power(Times(C2,Plus(m,C1),Subtract(Times(e,f),Times(d,g)),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),CN1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Simp(Subtract(Plus(Times(C2,d,Plus(Times(c,e,f),Times(CN1,c,d,g),Times(b,e,g)),Plus(m,C1)),Times(CN1,Sqr(e),Plus(Times(b,f),Times(a,g)),Plus(Times(C2,m),C3)),Times(C2,e,Subtract(Times(c,d,g,Plus(m,C1)),Times(e,Plus(Times(c,f),Times(b,g)),Plus(m,C2))),x)),Times(c,Sqr(e),g,Plus(Times(C2,m),C5),Sqr(x))),x),Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(Times(C2,m)),LeQ(m,CN2))));
IIntegrate(940,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),CN1D2),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Sqr(e),Power(Plus(d,Times(e,x)),Plus(m,C1)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x)))),Power(Times(Plus(m,C1),Subtract(Times(e,f),Times(d,g)),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),CN1)),x),Dist(Power(Times(C2,Plus(m,C1),Subtract(Times(e,f),Times(d,g)),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),CN1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Simp(Subtract(Plus(Times(C2,d,Subtract(Times(c,e,f),Times(c,d,g)),Plus(m,C1)),Times(CN1,a,Sqr(e),g,Plus(Times(C2,m),C3)),Times(C2,e,Subtract(Times(c,d,g,Plus(m,C1)),Times(c,e,f,Plus(m,C2))),x)),Times(c,Sqr(e),g,Plus(Times(C2,m),C5),Sqr(x))),x),Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IntegerQ(Times(C2,m)),LeQ(m,CN2))));
IIntegrate(941,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Sqrt(Plus(f_DEFAULT,Times(g_DEFAULT,x_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Subtract(Simp(Times(C2,e,Power(Plus(d,Times(e,x)),Subtract(m,C1)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(c,Plus(Times(C2,m),C1)),CN1)),x),Dist(Power(Times(c,Plus(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(d,Times(e,x)),Subtract(m,C2)),Simp(Plus(Times(e,Plus(Times(b,d,f),Times(a,Plus(Times(d,g),Times(C2,e,f,Subtract(m,C1)))))),Times(CN1,c,Sqr(d),f,Plus(Times(C2,m),C1)),Times(Plus(Times(a,Sqr(e),g,Subtract(Times(C2,m),C1)),Times(CN1,c,d,Plus(Times(C4,e,f,m),Times(d,g,Plus(Times(C2,m),C1)))),Times(b,e,Plus(Times(C2,d,g),Times(e,f,Subtract(Times(C2,m),C1))))),x),Times(e,Subtract(Times(C2,b,e,g,m),Times(c,Plus(Times(e,f),Times(d,g,Subtract(Times(C4,m),C1))))),Sqr(x))),x),Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(Times(C2,m)),GtQ(m,C1))));
IIntegrate(942,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Sqrt(Plus(f_DEFAULT,Times(g_DEFAULT,x_))),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Subtract(Simp(Times(C2,e,Power(Plus(d,Times(e,x)),Subtract(m,C1)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x)))),Power(Times(c,Plus(Times(C2,m),C1)),CN1)),x),Dist(Power(Times(c,Plus(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(d,Times(e,x)),Subtract(m,C2)),Simp(Subtract(Plus(Times(a,e,Plus(Times(d,g),Times(C2,e,f,Subtract(m,C1)))),Times(CN1,c,Sqr(d),f,Plus(Times(C2,m),C1)),Times(Subtract(Times(a,Sqr(e),g,Subtract(Times(C2,m),C1)),Times(c,d,Plus(Times(C4,e,f,m),Times(d,g,Plus(Times(C2,m),C1))))),x)),Times(c,e,Plus(Times(e,f),Times(d,g,Subtract(Times(C4,m),C1))),Sqr(x))),x),Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IntegerQ(Times(C2,m)),GtQ(m,C1))));
IIntegrate(943,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1),Sqrt(Plus(f_DEFAULT,Times(g_DEFAULT,x_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(g,Power(e,CN1)),Int(Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1),x),x),Dist(Times(Subtract(Times(e,f),Times(d,g)),Power(e,CN1)),Int(Power(Times(Plus(d,Times(e,x)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0))));
IIntegrate(944,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),CN1),Sqrt(Plus(f_DEFAULT,Times(g_DEFAULT,x_))),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(g,Power(e,CN1)),Int(Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1),x),x),Dist(Times(Subtract(Times(e,f),Times(d,g)),Power(e,CN1)),Int(Power(Times(Plus(d,Times(e,x)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0))));
IIntegrate(945,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Sqrt(Plus(f_DEFAULT,Times(g_DEFAULT,x_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,C1)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(Plus(m,C1),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),CN1)),x),Dist(Power(Times(C2,Plus(m,C1),Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e)))),CN1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Simp(Subtract(Subtract(Subtract(Times(C2,c,d,f,Plus(m,C1)),Times(e,Plus(Times(a,g),Times(b,f,Plus(Times(C2,m),C3))))),Times(C2,Subtract(Times(b,e,g,Plus(C2,m)),Times(c,Subtract(Times(d,g,Plus(m,C1)),Times(e,f,Plus(m,C2))))),x)),Times(c,e,g,Plus(Times(C2,m),C5),Sqr(x))),x),Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(Times(C2,m)),LeQ(m,CN2))));
IIntegrate(946,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Sqrt(Plus(f_DEFAULT,Times(g_DEFAULT,x_))),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,C1)),Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x)))),Power(Times(Plus(m,C1),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),CN1)),x),Dist(Power(Times(C2,Plus(m,C1),Plus(Times(c,Sqr(d)),Times(a,Sqr(e)))),CN1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Simp(Subtract(Plus(Times(C2,c,d,f,Plus(m,C1)),Times(CN1,e,a,g),Times(C2,c,Subtract(Times(d,g,Plus(m,C1)),Times(e,f,Plus(m,C2))),x)),Times(c,e,g,Plus(Times(C2,m),C5),Sqr(x))),x),Power(Times(Sqrt(Plus(f,Times(g,x))),Sqrt(Plus(a,Times(c,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IntegerQ(Times(C2,m)),LeQ(m,CN2))));
IIntegrate(947,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),n),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IGtQ(p,C0),Or(IGtQ(m,C0),And(EqQ(m,CN2),EqQ(p,C1),EqQ(Subtract(Times(C2,c,d),Times(b,e)),C0))))));
IIntegrate(948,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),n),Power(Plus(a,Times(c,Sqr(x))),p)),x),x),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(p,C0),Or(IGtQ(m,C0),And(EqQ(m,CN2),EqQ(p,C1),EqQ(d,C0))))));
IIntegrate(949,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("§qx"),PolynomialQuotient(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Plus(d,Times(e,x)),x)),Set($s("R"),PolynomialRemainder(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p),Plus(d,Times(e,x)),x))),Plus(Simp(Times($s("R"),Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(f,Times(g,x)),Plus(n,C1)),Power(Times(Plus(m,C1),Subtract(Times(e,f),Times(d,g))),CN1)),x),Dist(Power(Times(Plus(m,C1),Subtract(Times(e,f),Times(d,g))),CN1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(f,Times(g,x)),n),ExpandToSum(Subtract(Times(Plus(m,C1),Subtract(Times(e,f),Times(d,g)),$s("§qx")),Times(g,$s("R"),Plus(m,n,C2))),x)),x),x))),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IGtQ(p,C0),LtQ(m,CN1))));
IIntegrate(950,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Power(Plus(f_DEFAULT,Times(g_DEFAULT,x_)),n_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("§qx"),PolynomialQuotient(Power(Plus(a,Times(c,Sqr(x))),p),Plus(d,Times(e,x)),x)),Set($s("R"),PolynomialRemainder(Power(Plus(a,Times(c,Sqr(x))),p),Plus(d,Times(e,x)),x))),Plus(Simp(Times($s("R"),Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(f,Times(g,x)),Plus(n,C1)),Power(Times(Plus(m,C1),Subtract(Times(e,f),Times(d,g))),CN1)),x),Dist(Power(Times(Plus(m,C1),Subtract(Times(e,f),Times(d,g))),CN1),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(f,Times(g,x)),n),ExpandToSum(Subtract(Times(Plus(m,C1),Subtract(Times(e,f),Times(d,g)),$s("§qx")),Times(g,$s("R"),Plus(m,n,C2))),x)),x),x))),And(FreeQ(List(a,c,d,e,f,g),x),NeQ(Subtract(Times(e,f),Times(d,g)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),IGtQ(p,C0),LtQ(m,CN1))));
  }
}
}
