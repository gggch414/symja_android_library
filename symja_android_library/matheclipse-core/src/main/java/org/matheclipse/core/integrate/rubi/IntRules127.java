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
public class IntRules127 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(3176,Int(Times(u_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_)),x_Symbol),
    Condition(Int(ActivateTrig(Times(u,Power(Times(a,Sqr($($s("§cos"),Plus(e,Times(f,x))))),p))),x),And(FreeQ(List(a,b,e,f,p),x),EqQ(Plus(a,b),C0))));
IIntegrate(3177,Int(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Simp(Times(Sqrt(a),EllipticE(Plus(e,Times(f,x)),Times(CN1,b,Power(a,CN1))),Power(f,CN1)),x),And(FreeQ(List(a,b,e,f),x),GtQ(a,C0))));
IIntegrate(3178,Int(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Sqr(Sin(Plus(e,Times(f,x))))))),Power(Plus(C1,Times(b,Sqr(Sin(Plus(e,Times(f,x)))),Power(a,CN1))),CN1D2)),Int(Sqrt(Plus(C1,Times(b,Sqr(Sin(Plus(e,Times(f,x)))),Power(a,CN1)))),x),x),And(FreeQ(List(a,b,e,f),x),Not(GtQ(a,C0)))));
IIntegrate(3179,Int(Sqr(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(QQ(1L,8L),Plus(Times(C8,Sqr(a)),Times(C8,a,b),Times(C3,Sqr(b))),x),x),Negate(Simp(Times(Sqr(b),Cos(Plus(e,Times(f,x))),Power(Sin(Plus(e,Times(f,x))),C3),Power(Times(C4,f),CN1)),x)),Negate(Simp(Times(b,Plus(Times(C8,a),Times(C3,b)),Cos(Plus(e,Times(f,x))),Sin(Plus(e,Times(f,x))),Power(Times(C8,f),CN1)),x))),FreeQ(List(a,b,e,f),x)));
IIntegrate(3180,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cos(Plus(e,Times(f,x))),Sin(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sqr(Sin(Plus(e,Times(f,x)))))),Subtract(p,C1)),Power(Times(C2,f,p),CN1)),x)),Dist(Power(Times(C2,p),CN1),Int(Times(Power(Plus(a,Times(b,Sqr(Sin(Plus(e,Times(f,x)))))),Subtract(p,C2)),Simp(Plus(Times(a,Plus(b,Times(C2,a,p))),Times(b,Plus(Times(C2,a),b),Subtract(Times(C2,p),C1),Sqr(Sin(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Plus(a,b),C0),GtQ(p,C1))));
IIntegrate(3181,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),CN1),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Power(Plus(a,Times(Plus(a,b),Sqr($s("ff")),Sqr(x))),CN1),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),FreeQ(List(a,b,e,f),x)));
IIntegrate(3182,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),CN1D2),x_Symbol),
    Condition(Simp(Times(C1,EllipticF(Plus(e,Times(f,x)),Times(CN1,b,Power(a,CN1))),Power(Times(Sqrt(a),f),CN1)),x),And(FreeQ(List(a,b,e,f),x),GtQ(a,C0))));
IIntegrate(3183,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),CN1D2),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(b,Sqr(Sin(Plus(e,Times(f,x)))),Power(a,CN1)))),Power(Plus(a,Times(b,Sqr(Sin(Plus(e,Times(f,x)))))),CN1D2)),Int(Power(Plus(C1,Times(b,Sqr(Sin(Plus(e,Times(f,x)))),Power(a,CN1))),CN1D2),x),x),And(FreeQ(List(a,b,e,f),x),Not(GtQ(a,C0)))));
IIntegrate(3184,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,Cos(Plus(e,Times(f,x))),Sin(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sqr(Sin(Plus(e,Times(f,x)))))),Plus(p,C1)),Power(Times(C2,a,f,Plus(p,C1),Plus(a,b)),CN1)),x)),Dist(Power(Times(C2,a,Plus(p,C1),Plus(a,b)),CN1),Int(Times(Power(Plus(a,Times(b,Sqr(Sin(Plus(e,Times(f,x)))))),Plus(p,C1)),Simp(Subtract(Plus(Times(C2,a,Plus(p,C1)),Times(b,Plus(Times(C2,p),C3))),Times(C2,b,Plus(p,C2),Sqr(Sin(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,e,f),x),NeQ(Plus(a,b),C0),LtQ(p,CN1))));
IIntegrate(3185,Int(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Sqrt(Sqr(Cos(Plus(e,Times(f,x))))),Power(Times(f,Cos(Plus(e,Times(f,x)))),CN1)),Subst(Int(Times(Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),CN1D2)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),Not(IntegerQ(p)))));
IIntegrate(3186,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Subtract(Plus(a,b),Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x))),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Subtract(m,C1))))));
IIntegrate(3187,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Power(f,CN1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(Plus(a,b),Sqr($s("ff")),Sqr(x))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),p,C1)),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,m)),IntegerQ(p))));
IIntegrate(3188,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Sqrt(Sqr(Cos(Plus(e,Times(f,x))))),Power(Times(f,Cos(Plus(e,Times(f,x)))),CN1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),CN1D2)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),Not(IntegerQ(p)))));
IIntegrate(3189,Int(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Times($s("ff"),Power(d,Plus(Times(C2,IntPart(Times(C1D2,Subtract(m,C1)))),C1)),Power(Times(d,Sin(Plus(e,Times(f,x)))),Times(C2,FracPart(Times(C1D2,Subtract(m,C1))))),Power(Times(f,Power(Sqr(Sin(Plus(e,Times(f,x)))),FracPart(Times(C1D2,Subtract(m,C1))))),CN1)),Subst(Int(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Subtract(Plus(a,b),Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x))),And(FreeQ(List(a,b,d,e,f,m,p),x),Not(IntegerQ(m)))));
IIntegrate(3190,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Subtract(m,C1))))));
IIntegrate(3191,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Plus(a,Times(Plus(a,b),Sqr($s("ff")),Sqr(x))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,m),p,C1)),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,m)),IntegerQ(p))));
IIntegrate(3192,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Sqrt(Sqr(Cos(Plus(e,Times(f,x))))),Power(Times(f,Cos(Plus(e,Times(f,x)))),CN1)),Subst(Int(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),Not(IntegerQ(p)))));
IIntegrate(3193,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(d,Plus(Times(C2,IntPart(Times(C1D2,Subtract(m,C1)))),C1)),Power(Times(d,Cos(Plus(e,Times(f,x)))),Times(C2,FracPart(Times(C1D2,Subtract(m,C1))))),Power(Times(f,Power(Sqr(Cos(Plus(e,Times(f,x)))),FracPart(Times(C1D2,Subtract(m,C1))))),CN1)),Subst(Int(Times(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,d,e,f,m,p),x),Not(IntegerQ(m)))));
IIntegrate(3194,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sqr(Sin(Plus(e,Times(f,x)))),x))),Dist(Times(Power($s("ff"),Times(C1D2,Plus(m,C1))),Power(Times(C2,f),CN1)),Subst(Int(Times(Power(x,Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,$s("ff"),x)),p),Power(Power(Subtract(C1,Times($s("ff"),x)),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Sqr(Sin(Plus(e,Times(f,x)))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,Subtract(m,C1))))));
IIntegrate(3195,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Times(d,$s("ff"),x),m),Power(Plus(a,Times(Plus(a,b),Sqr($s("ff")),Sqr(x))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(p,C1)),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,d,e,f,m),x),IntegerQ(p))));
IIntegrate(3196,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT),Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(m,C1)),Sqrt(Sqr(Cos(Plus(e,Times(f,x))))),Power(Times(f,Cos(Plus(e,Times(f,x)))),CN1)),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f,p),x),IntegerQ(Times(C1D2,m)),Not(IntegerQ(p)))));
IIntegrate(3197,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT),Power(Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(Times(d,Tan(Plus(e,Times(f,x)))),Plus(m,C1)),Power(Sqr(Cos(Plus(e,Times(f,x)))),Times(C1D2,Plus(m,C1))),Power(Times(d,f,Power(Sin(Plus(e,Times(f,x))),Plus(m,C1))),CN1)),Subst(Int(Times(Power(Times($s("ff"),x),m),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p),Power(Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,d,e,f,m,p),x),Not(IntegerQ(m)))));
IIntegrate(3198,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_DEFAULT),Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Sin(Plus(e,Times(f,x))),x))),Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Times(d,$s("ff"),x),n),Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(m,C1))),Power(Plus(a,Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Sin(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,d,e,f,n,p),x),IntegerQ(Times(C1D2,Subtract(m,C1))))));
IIntegrate(3199,Int(Times(Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_DEFAULT),Power(Times(c_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),m_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Cos(Plus(e,Times(f,x))),x))),Negate(Dist(Times($s("ff"),Power(f,CN1)),Subst(Int(Times(Power(Times(c,$s("ff"),x),m),Power(Subtract(C1,Times(Sqr($s("ff")),Sqr(x))),Times(C1D2,Subtract(n,C1))),Power(Subtract(Plus(a,b),Times(b,Sqr($s("ff")),Sqr(x))),p)),x),x,Times(Cos(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x))),And(FreeQ(List(a,b,c,e,f,m,p),x),IntegerQ(Times(C1D2,Subtract(n,C1))))));
IIntegrate(3200,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),m_),Power($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),n_),Power(Plus(a_,Times(b_DEFAULT,Sqr($($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),p_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("ff"),FreeFactors(Tan(Plus(e,Times(f,x))),x))),Dist(Times(Power($s("ff"),Plus(n,C1)),Power(f,CN1)),Subst(Int(Times(Power(x,n),Power(Plus(a,Times(Plus(a,b),Sqr($s("ff")),Sqr(x))),p),Power(Power(Plus(C1,Times(Sqr($s("ff")),Sqr(x))),Plus(Times(C1D2,Plus(m,n)),p,C1)),CN1)),x),x,Times(Tan(Plus(e,Times(f,x))),Power($s("ff"),CN1))),x)),And(FreeQ(List(a,b,e,f),x),IntegerQ(Times(C1D2,m)),IntegerQ(Times(C1D2,n)),IntegerQ(p))));
  }
}
}
