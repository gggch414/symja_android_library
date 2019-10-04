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
public class IntRules55 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(1376,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(x,n),CN1)),Times(c,Power(Power(x,Times(C2,n)),CN1))),p),Power(Power(x,Plus(m,C2)),CN1)),x),x,Power(x,CN1))),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),ILtQ(n,C0),IntegerQ(m))));
IIntegrate(1377,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(k,Denominator(m))),Negate(Dist(Times(k,Power(d,CN1)),Subst(Int(Times(Power(Plus(a,Times(b,Power(Times(Power(d,n),Power(x,Times(k,n))),CN1)),Times(c,Power(Times(Power(d,Times(C2,n)),Power(x,Times(C2,k,n))),CN1))),p),Power(Power(x,Plus(Times(k,Plus(m,C1)),C1)),CN1)),x),x,Power(Power(Times(d,x),Power(k,CN1)),CN1)),x))),And(FreeQ(List(a,b,c,d,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),ILtQ(n,C0),FractionQ(m))));
IIntegrate(1378,Int(Times(Power(Times(d_DEFAULT,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(d,IntPart(m)),Power(Times(d,x),FracPart(m)),Power(Power(x,CN1),FracPart(m))),Subst(Int(Times(Power(Plus(a,Times(b,Power(Power(x,n),CN1)),Times(c,Power(Power(x,Times(C2,n)),CN1))),p),Power(Power(x,Plus(m,C2)),CN1)),x),x,Power(x,CN1)),x)),And(FreeQ(List(a,b,c,d,m,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),ILtQ(n,C0),Not(RationalQ(m)))));
IIntegrate(1379,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(k,Denominator(n))),Dist(k,Subst(Int(Times(Power(x,Subtract(Times(k,Plus(m,C1)),C1)),Power(Plus(a,Times(b,Power(x,Times(k,n))),Times(c,Power(x,Times(C2,k,n)))),p)),x),x,Power(x,Power(k,CN1))),x)),And(FreeQ(List(a,b,c,m,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),FractionQ(n))));
IIntegrate(1380,Int(Times(Power(Times(d_,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(m)),Power(Times(d,x),FracPart(m)),Power(Power(x,FracPart(m)),CN1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),FractionQ(n))));
IIntegrate(1381,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Power(Plus(m,C1),CN1),Subst(Int(Power(Plus(a,Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),CN1))))),Times(c,Power(x,Simplify(Times(C2,n,Power(Plus(m,C1),CN1)))))),p),x),x,Power(x,Plus(m,C1))),x),And(FreeQ(List(a,b,c,m,n,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),CN1)))),Not(IntegerQ(n)))));
IIntegrate(1382,Int(Times(Power(Times(d_,x_),m_),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(m)),Power(Times(d,x),FracPart(m)),Power(Power(x,FracPart(m)),CN1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),CN1)))),Not(IntegerQ(n)))));
IIntegrate(1383,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),CN1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Times(C2,c,Power(q,CN1)),Int(Times(Power(Times(d,x),m),Power(Plus(b,Negate(q),Times(C2,c,Power(x,n))),CN1)),x),x),Dist(Times(C2,c,Power(q,CN1)),Int(Times(Power(Times(d,x),m),Power(Plus(b,q,Times(C2,c,Power(x,n))),CN1)),x),x))),And(FreeQ(List(a,b,c,d,m,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0))));
IIntegrate(1384,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(d,x),Plus(m,C1)),Plus(Sqr(b),Times(CN1,C2,a,c),Times(b,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,d,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1)),x)),Dist(Power(Times(a,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1),Int(Times(Power(Times(d,x),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Simp(Plus(Times(Sqr(b),Plus(Times(n,Plus(p,C1)),m,C1)),Times(CN1,C2,a,c,Plus(m,Times(C2,n,Plus(p,C1)),C1)),Times(b,c,Plus(Times(C2,n,p),Times(C3,n),m,C1),Power(x,n))),x)),x),x)),And(FreeQ(List(a,b,c,d,m,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),ILtQ(Plus(p,C1),C0))));
IIntegrate(1385,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(a,IntPart(p)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2)),CN1))),FracPart(p)),Power(Plus(C1,Times(C2,c,Power(x,n),Power(Subtract(b,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2)),CN1))),FracPart(p))),CN1)),Int(Times(Power(Times(d,x),m),Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Sqrt(Subtract(Sqr(b),Times(C4,a,c)))),CN1))),p),Power(Plus(C1,Times(C2,c,Power(x,n),Power(Subtract(b,Sqrt(Subtract(Sqr(b),Times(C4,a,c)))),CN1))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("n2"),Times(C2,n)))));
IIntegrate(1386,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("mn")))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Subtract(m,Times(n,p))),Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,b,c,m,n),x),EqQ($s("mn"),Negate(n)),IntegerQ(p),PosQ(n))));
IIntegrate(1387,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("mn")))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(x,Times(n,FracPart(p))),Power(Plus(a,Times(b,Power(Power(x,n),CN1)),Times(c,Power(x,n))),FracPart(p)),Power(Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),CN1)),Int(Times(Power(x,Subtract(m,Times(n,p))),Power(Plus(b,Times(a,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,m,n,p),x),EqQ($s("mn"),Negate(n)),Not(IntegerQ(p)),PosQ(n))));
IIntegrate(1388,Int(Times(Power(Times(d_,x_),m_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,n_DEFAULT)),Times(b_DEFAULT,Power(x_,$p("mn")))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,IntPart(m)),Power(Times(d,x),FracPart(m)),Power(Power(x,FracPart(m)),CN1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(Power(x,n),CN1)),Times(c,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,d,m,n,p),x),EqQ($s("mn"),Negate(n)))));
IIntegrate(1389,Int(Times(Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power(v_,$p("n2",true))),Times(b_DEFAULT,Power(v_,n_))),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(Coefficient(v,x,C1),Plus(m,C1)),CN1),Subst(Int(SimplifyIntegrand(Times(Power(Subtract(x,Coefficient(v,x,C0)),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),x,v),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),LinearQ(v,x),IntegerQ(m),NeQ(v,x))));
IIntegrate(1390,Int(Times(Power(u_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power(v_,$p("n2",true))),Times(b_DEFAULT,Power(v_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(u,m),Power(Times(Coefficient(v,x,C1),Power(v,m)),CN1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x,v),x),And(FreeQ(List(a,b,c,m,n,p),x),EqQ($s("n2"),Times(C2,n)),LinearPairQ(u,v,x))));
IIntegrate(1391,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(Plus(d,Times(e,Power(x,n))),Times(C2,p)),CN1)),Int(Power(Plus(d,Times(e,Power(x,n))),Plus(q,Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p)),EqQ(Subtract(Times(C2,c,d),Times(b,e)),C0))));
IIntegrate(1392,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_DEFAULT))),q_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),FracPart(p)),Power(Times(Power(c,IntPart(p)),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,FracPart(p)))),CN1)),Int(Times(Power(Plus(d,Times(e,Power(x,n))),q),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,p))),x),x),And(FreeQ(List(a,b,c,d,e,n,p,q),x),EqQ($s("n2"),Times(C2,n)),EqQ(Subtract(Sqr(b),Times(C4,a,c)),C0),Not(IntegerQ(p)))));
IIntegrate(1393,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,Plus(Times(C2,p),q))),Power(Plus(e,Times(d,Power(Power(x,n),CN1))),q),Power(Plus(c,Times(b,Power(Power(x,n),CN1)),Times(a,Power(Power(x,Times(C2,n)),CN1))),p)),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),IntegersQ(p,q),NegQ(n))));
IIntegrate(1394,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Times(n,Plus(Times(C2,p),q))),Power(Plus(e,Times(d,Power(Power(x,n),CN1))),q),Power(Plus(c,Times(a,Power(Power(x,Times(C2,n)),CN1))),p)),x),And(FreeQ(List(a,c,d,e,n),x),EqQ($s("n2"),Times(C2,n)),IntegersQ(p,q),NegQ(n))));
IIntegrate(1395,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(d,Times(e,Power(Power(x,n),CN1))),q),Power(Plus(a,Times(b,Power(Power(x,n),CN1)),Times(c,Power(Power(x,Times(C2,n)),CN1))),p),Power(x,CN2)),x),x,Power(x,CN1))),And(FreeQ(List(a,b,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),ILtQ(n,C0))));
IIntegrate(1396,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Negate(Subst(Int(Times(Power(Plus(d,Times(e,Power(Power(x,n),CN1))),q),Power(Plus(a,Times(c,Power(Power(x,Times(C2,n)),CN1))),p),Power(x,CN2)),x),x,Power(x,CN1))),And(FreeQ(List(a,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),ILtQ(n,C0))));
IIntegrate(1397,Int(Times(Power(Plus(a_DEFAULT,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(g,Denominator(n))),Dist(g,Subst(Int(Times(Power(x,Subtract(g,C1)),Power(Plus(d,Times(e,Power(x,Times(g,n)))),q),Power(Plus(a,Times(b,Power(x,Times(g,n))),Times(c,Power(x,Times(C2,g,n)))),p)),x),x,Power(x,Power(g,CN1))),x)),And(FreeQ(List(a,b,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),FractionQ(n))));
IIntegrate(1398,Int(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(g,Denominator(n))),Dist(g,Subst(Int(Times(Power(x,Subtract(g,C1)),Power(Plus(d,Times(e,Power(x,Times(g,n)))),q),Power(Plus(a,Times(c,Power(x,Times(C2,g,n)))),p)),x),x,Power(x,Power(g,CN1))),x)),And(FreeQ(List(a,c,d,e,p,q),x),EqQ($s("n2"),Times(C2,n)),FractionQ(n))));
IIntegrate(1399,Int(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(b,e),Times(d,c)),Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(b,c,n,Plus(p,C1),Power(x,Times(C2,n,Plus(p,C1)))),CN1)),x),Dist(Times(e,Power(c,CN1)),Int(Times(Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Power(x,n),CN1)),x),x)),And(FreeQ(List(b,c,d,e,n,p),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(p)),EqQ(Plus(Times(n,Plus(Times(C2,p),C1)),C1),C0))));
IIntegrate(1400,Int(Times(Plus(d_,Times(e_DEFAULT,Power(x_,n_))),Power(Plus(Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Simp(Times(e,Power(x,Plus(Negate(n),C1)),Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(c,Plus(Times(n,Plus(Times(C2,p),C1)),C1)),CN1)),x),And(FreeQ(List(b,c,d,e,n,p),x),EqQ($s("n2"),Times(C2,n)),Not(IntegerQ(p)),NeQ(Plus(Times(n,Plus(Times(C2,p),C1)),C1),C0),EqQ(Subtract(Times(b,e,Plus(Times(n,p),C1)),Times(c,d,Plus(Times(n,Plus(Times(C2,p),C1)),C1))),C0))));
  }
}
}
