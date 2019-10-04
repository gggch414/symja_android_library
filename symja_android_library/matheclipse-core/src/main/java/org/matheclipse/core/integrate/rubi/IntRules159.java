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
public class IntRules159 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(3976,Int(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(Subtract(Times(b,c),Times(a,d)),CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),Dist(Times(c,Power(Subtract(Times(b,c),Times(a,d)),CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),Or(EqQ(Subtract(Sqr(a),Sqr(b)),C0),EqQ(Subtract(Sqr(c),Sqr(d)),C0)))));
IIntegrate(3977,Int(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1)),x_Symbol),
    Condition(Subtract(Dist(Power(d,CN1),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(Times(c,Power(d,CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0))));
IIntegrate(3978,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),QQ(5L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(Sqr(c),Sqr(g),Power(Times(d,Subtract(Times(b,c),Times(a,d))),CN1)),Int(Times(Sqrt(Times(g,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),CN1)),x),x)),Dist(Times(Sqr(g),Power(Times(d,Subtract(Times(b,c),Times(a,d))),CN1)),Int(Times(Sqrt(Times(g,Csc(Plus(e,Times(f,x))))),Plus(Times(a,c),Times(Subtract(Times(b,c),Times(a,d)),Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Subtract(Sqr(a),Sqr(b)),C0))));
IIntegrate(3979,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),QQ(5L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1)),x_Symbol),
    Condition(Subtract(Dist(Times(g,Power(d,CN1)),Int(Times(Power(Times(g,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(Times(c,g,Power(d,CN1)),Int(Times(Power(Times(g,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0))));
IIntegrate(3980,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,b,Power(f,CN1)),Subst(Int(Power(Subtract(C1,Times(b,d,Sqr(x))),CN1),x),x,Times(Cot(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),CN1))),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0))));
IIntegrate(3981,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(Subtract(Times(b,c),Times(a,d)),Power(d,CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),CN1)),x),x)),Dist(Times(b,Power(d,CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),EqQ(Subtract(Sqr(c),Sqr(d)),C0))));
IIntegrate(3982,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Simp(Times(CN2,Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Sqrt(Times(CN1,Subtract(Times(b,c),Times(a,d)),Subtract(C1,Csc(Plus(e,Times(f,x)))),Power(Times(Plus(c,d),Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),CN1))),Sqrt(Times(Subtract(Times(b,c),Times(a,d)),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Times(Subtract(c,d),Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),CN1))),EllipticPi(Times(b,Plus(c,d),Power(Times(d,Plus(a,b)),CN1)),ArcSin(Times(Sqrt(Times(Plus(a,b),Power(Plus(c,d),CN1))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2))),Times(Subtract(a,b),Plus(c,d),Power(Times(Plus(a,b),Subtract(c,d)),CN1))),Power(Times(d,f,Sqrt(Times(Plus(a,b),Power(Plus(c,d),CN1))),Cot(Plus(e,Times(f,x)))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0))));
IIntegrate(3983,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,a,Power(Times(b,f),CN1)),Subst(Int(Power(Plus(C2,Times(Subtract(Times(a,c),Times(b,d)),Sqr(x))),CN1),x),x,Times(Cot(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),CN1))),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0))));
IIntegrate(3984,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Simp(Times(CN2,Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Times(Subtract(Times(b,c),Times(a,d)),Subtract(C1,Csc(Plus(e,Times(f,x)))),Power(Times(Plus(a,b),Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),CN1))),Sqrt(Times(CN1,Subtract(Times(b,c),Times(a,d)),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Times(Subtract(a,b),Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),CN1))),EllipticF(ArcSin(Times(Rt(Times(Plus(c,d),Power(Plus(a,b),CN1)),C2),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),CN1D2))),Times(Plus(a,b),Subtract(c,d),Power(Times(Subtract(a,b),Plus(c,d)),CN1))),Power(Times(f,Subtract(Times(b,c),Times(a,d)),Rt(Times(Plus(c,d),Power(Plus(a,b),CN1)),C2),Cot(Plus(e,Times(f,x)))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0))));
IIntegrate(3985,Int(Times(Sqr($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,Power(b,CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),CN1)),x),x)),Dist(Power(b,CN1),Int(Times(Csc(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0))));
IIntegrate(3986,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),QQ(-3L,2L))),x_Symbol),
    Condition(Plus(Dist(Times(Subtract(a,b),Power(Subtract(c,d),CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),CN1)),x),x),Dist(Times(Subtract(Times(b,c),Times(a,d)),Power(Subtract(c,d),CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),QQ(3L,2L))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0))));
IIntegrate(3987,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Dist(Times(Sqr(a),g,Cot(Plus(e,Times(f,x))),Power(Times(f,Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Subtract(a,Times(b,Csc(Plus(e,Times(f,x))))))),CN1)),Subst(Int(Times(Power(Times(g,x),Subtract(p,C1)),Power(Plus(a,Times(b,x)),Subtract(m,C1D2)),Power(Plus(c,Times(d,x)),n),Power(Subtract(a,Times(b,x)),CN1D2)),x),x,Csc(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),Or(EqQ(p,C1),IntegerQ(Subtract(m,C1D2))))));
IIntegrate(3988,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Dist(Power(Power(g,Plus(m,n)),CN1),Int(Times(Power(Times(g,Csc(Plus(e,Times(f,x)))),Plus(m,n,p)),Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,p),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),IntegerQ(m),IntegerQ(n))));
IIntegrate(3989,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(g,Csc(Plus(e,Times(f,x)))),Plus(m,p)),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n),Power(Times(Power(g,m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n)),CN1)),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(m,n,p),C0),IntegerQ(m))));
IIntegrate(3990,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Dist(Times(Power(Times(g,Csc(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n),Power(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n)),CN1)),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(m,n,p),C0),Not(IntegerQ(m)))));
IIntegrate(3991,Int(Times(Power($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(d,Times(c,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))))),CN1)),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Plus(d,Times(c,Sin(Plus(e,Times(f,x))))),n),Power(Power(Sin(Plus(e,Times(f,x))),Plus(m,n,p)),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),IntegerQ(Subtract(m,C1D2)),IntegerQ(Subtract(n,C1D2)),IntegerQ(p),LeQ(CN2,Plus(m,n,p),CN1))));
IIntegrate(3992,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),n_)),x_Symbol),
    Condition(Int(ExpandTrig(Times(Power(Times(g,$($s("§csc"),Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,$($s("§csc"),Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,$($s("§csc"),Plus(e,Times(f,x))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),Or(IntegersQ(m,n),IntegersQ(m,p),IntegersQ(n,p)))));
IIntegrate(3993,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT)),m_),Power(Plus(c_DEFAULT,Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT)),n_),Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(g,Csc(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),n)),x),FreeQ(List(a,b,c,d,e,f,g,m,n,p),x)));
IIntegrate(3994,Int(Times($($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Plus(A_,Times(B_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(-3L,2L))),x_Symbol),
    Condition(Simp(Times(C2,ASymbol,Plus(C1,Sec(Plus(e,Times(f,x)))),Sqrt(Times(Subtract(Times(b,c),Times(a,d)),Subtract(C1,Sec(Plus(e,Times(f,x)))),Power(Times(Plus(a,b),Plus(c,Times(d,Sec(Plus(e,Times(f,x)))))),CN1))),EllipticE(ArcSin(Times(Rt(Times(Plus(c,d),Power(Plus(a,b),CN1)),C2),Sqrt(Plus(a,Times(b,Sec(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Sec(Plus(e,Times(f,x))))),CN1D2))),Times(Plus(a,b),Subtract(c,d),Power(Times(Subtract(a,b),Plus(c,d)),CN1))),Power(Times(f,Subtract(Times(b,c),Times(a,d)),Rt(Times(Plus(c,d),Power(Plus(a,b),CN1)),C2),Tan(Plus(e,Times(f,x))),Sqrt(Times(CN1,Subtract(Times(b,c),Times(a,d)),Plus(C1,Sec(Plus(e,Times(f,x)))),Power(Times(Subtract(a,b),Plus(c,Times(d,Sec(Plus(e,Times(f,x)))))),CN1)))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),EqQ(ASymbol,BSymbol))));
IIntegrate(3995,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),A_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),c_),QQ(-3L,2L))),x_Symbol),
    Condition(Simp(Times(CN2,ASymbol,Plus(C1,Csc(Plus(e,Times(f,x)))),Sqrt(Times(Subtract(Times(b,c),Times(a,d)),Subtract(C1,Csc(Plus(e,Times(f,x)))),Power(Times(Plus(a,b),Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),CN1))),EllipticE(ArcSin(Times(Rt(Times(Plus(c,d),Power(Plus(a,b),CN1)),C2),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Csc(Plus(e,Times(f,x))))),CN1D2))),Times(Plus(a,b),Subtract(c,d),Power(Times(Subtract(a,b),Plus(c,d)),CN1))),Power(Times(f,Subtract(Times(b,c),Times(a,d)),Rt(Times(Plus(c,d),Power(Plus(a,b),CN1)),C2),Cot(Plus(e,Times(f,x))),Sqrt(Times(CN1,Subtract(Times(b,c),Times(a,d)),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Times(Subtract(a,b),Plus(c,Times(d,Csc(Plus(e,Times(f,x)))))),CN1)))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),EqQ(ASymbol,BSymbol))));
IIntegrate(3996,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Plus(Simp(Times(ASymbol,a,Cot(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(f,n),CN1)),x),Dist(Power(Times(d,n),CN1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(n,Plus(Times(BSymbol,a),Times(ASymbol,b))),Times(Plus(Times(BSymbol,b,n),Times(ASymbol,a,Plus(n,C1))),Csc(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(ASymbol,b),Times(a,BSymbol)),C0),LeQ(n,CN1))));
IIntegrate(3997,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,BSymbol,Cot(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(f,Plus(n,C1)),CN1)),x)),Dist(Power(Plus(n,C1),CN1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Simp(Plus(Times(ASymbol,a,Plus(n,C1)),Times(BSymbol,b,n),Times(Plus(Times(ASymbol,b),Times(BSymbol,a)),Plus(n,C1),Csc(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(ASymbol,b),Times(a,BSymbol)),C0),Not(LeQ(n,CN1)))));
IIntegrate(3998,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Plus(Dist(Times(BSymbol,Power(b,CN1)),Int(Csc(Plus(e,Times(f,x))),x),x),Dist(Times(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Power(b,CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol),x),NeQ(Subtract(Times(ASymbol,b),Times(a,BSymbol)),C0))));
IIntegrate(3999,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Negate(Simp(Times(BSymbol,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),x)),And(FreeQ(List(a,b,ASymbol,BSymbol,e,f,m),x),NeQ(Subtract(Times(ASymbol,b),Times(a,BSymbol)),C0),EqQ(Subtract(Sqr(a),Sqr(b)),C0),EqQ(Plus(Times(a,BSymbol,m),Times(ASymbol,b,Plus(m,C1))),C0))));
IIntegrate(4000,Int(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_),Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),B_DEFAULT),A_)),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(a,f,Plus(Times(C2,m),C1)),CN1)),x),Dist(Times(Plus(Times(a,BSymbol,m),Times(ASymbol,b,Plus(m,C1))),Power(Times(a,b,Plus(Times(C2,m),C1)),CN1)),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1))),x),x)),And(FreeQ(List(a,b,ASymbol,BSymbol,e,f),x),NeQ(Subtract(Times(ASymbol,b),Times(a,BSymbol)),C0),EqQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Plus(Times(a,BSymbol,m),Times(ASymbol,b,Plus(m,C1))),C0),LtQ(m,Negate(C1D2)))));
  }
}
}
