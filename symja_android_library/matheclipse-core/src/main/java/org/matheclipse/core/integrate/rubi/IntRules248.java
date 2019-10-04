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
public class IntRules248 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(6201,Int(Times(Exp(Times(ArcCoth(Times(c_DEFAULT,Plus(a_,Times(b_DEFAULT,x_)))),n_DEFAULT)),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Plus(a,Times(b,x))),Times(C1D2,n)),Power(Plus(C1,Power(Times(c,Plus(a,Times(b,x))),CN1)),Times(C1D2,n)),Power(Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),CN1)),Int(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(C1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),Power(Power(Plus(CN1,Times(a,c),Times(b,c,x)),Times(C1D2,n)),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),Not(IntegerQ(Times(C1D2,n))))));
IIntegrate(6202,Int(Times(Exp(Times(ArcCoth(Plus(a_,Times(b_DEFAULT,x_))),n_DEFAULT)),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_),Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,Power(Subtract(C1,Sqr(a)),CN1)),p),Power(Times(Plus(a,Times(b,x)),Power(Plus(C1,a,Times(b,x)),CN1)),Times(C1D2,n)),Power(Times(Plus(C1,a,Times(b,x)),Power(Plus(a,Times(b,x)),CN1)),Times(C1D2,n)),Power(Subtract(Subtract(C1,a),Times(b,x)),Times(C1D2,n)),Power(Power(Plus(CN1,a,Times(b,x)),Times(C1D2,n)),CN1)),Int(Times(u,Power(Subtract(Subtract(C1,a),Times(b,x)),Subtract(p,Times(C1D2,n))),Power(Plus(C1,a,Times(b,x)),Plus(p,Times(C1D2,n)))),x),x),And(FreeQ(List(a,b,c,d,e,n,p),x),Not(IntegerQ(Times(C1D2,n))),EqQ(Subtract(Times(b,d),Times(C2,a,e)),C0),EqQ(Plus(Times(Sqr(b),c),Times(e,Subtract(C1,Sqr(a)))),C0),Or(IntegerQ(p),GtQ(Times(c,Power(Subtract(C1,Sqr(a)),CN1)),C0)))));
IIntegrate(6203,Int(Times(Exp(Times(ArcCoth(Plus(a_,Times(b_DEFAULT,x_))),n_DEFAULT)),u_DEFAULT,Power(Plus(c_,Times(d_DEFAULT,x_),Times(e_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus(c,Times(d,x),Times(e,Sqr(x))),p),Power(Power(Subtract(Subtract(Subtract(C1,Sqr(a)),Times(C2,a,b,x)),Times(Sqr(b),Sqr(x))),p),CN1)),Int(Times(u,Power(Subtract(Subtract(Subtract(C1,Sqr(a)),Times(C2,a,b,x)),Times(Sqr(b),Sqr(x))),p),Exp(Times(n,ArcCoth(Times(a,x))))),x),x),And(FreeQ(List(a,b,c,d,e,n,p),x),Not(IntegerQ(Times(C1D2,n))),EqQ(Subtract(Times(b,d),Times(C2,a,e)),C0),EqQ(Plus(Times(Sqr(b),c),Times(e,Subtract(C1,Sqr(a)))),C0),Not(Or(IntegerQ(p),GtQ(Times(c,Power(Subtract(C1,Sqr(a)),CN1)),C0))))));
IIntegrate(6204,Int(Times(Exp(Times(ArcCoth(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_)),CN1))),n_DEFAULT)),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Exp(Times(n,ArcTanh(Plus(Times(a,Power(c,CN1)),Times(b,x,Power(c,CN1))))))),x),FreeQ(List(a,b,c,n),x)));
IIntegrate(6205,Int(ArcTanh(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Subtract(Simp(Times(x,ArcTanh(Plus(a,Times(b,Power(x,n))))),x),Dist(Times(b,n),Int(Times(Power(x,n),Power(Subtract(Subtract(Subtract(C1,Sqr(a)),Times(C2,a,b,Power(x,n))),Times(Sqr(b),Power(x,Times(C2,n)))),CN1)),x),x)),FreeQ(List(a,b,n),x)));
IIntegrate(6206,Int(ArcCoth(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Subtract(Simp(Times(x,ArcCoth(Plus(a,Times(b,Power(x,n))))),x),Dist(Times(b,n),Int(Times(Power(x,n),Power(Subtract(Subtract(Subtract(C1,Sqr(a)),Times(C2,a,b,Power(x,n))),Times(Sqr(b),Power(x,Times(C2,n)))),CN1)),x),x)),FreeQ(List(a,b,n),x)));
IIntegrate(6207,Int(Times(ArcTanh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),Power(x_,CN1)),x_Symbol),
    Condition(Subtract(Dist(C1D2,Int(Times(Log(Plus(C1,a,Times(b,Power(x,n)))),Power(x,CN1)),x),x),Dist(C1D2,Int(Times(Log(Subtract(Subtract(C1,a),Times(b,Power(x,n)))),Power(x,CN1)),x),x)),FreeQ(List(a,b,n),x)));
IIntegrate(6208,Int(Times(ArcCoth(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),Power(x_,CN1)),x_Symbol),
    Condition(Subtract(Dist(C1D2,Int(Times(Log(Plus(C1,Power(Plus(a,Times(b,Power(x,n))),CN1))),Power(x,CN1)),x),x),Dist(C1D2,Int(Times(Log(Subtract(C1,Power(Plus(a,Times(b,Power(x,n))),CN1))),Power(x,CN1)),x),x)),FreeQ(List(a,b,n),x)));
IIntegrate(6209,Int(Times(ArcTanh(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(x,Plus(m,C1)),ArcTanh(Plus(a,Times(b,Power(x,n)))),Power(Plus(m,C1),CN1)),x),Dist(Times(b,n,Power(Plus(m,C1),CN1)),Int(Times(Power(x,Plus(m,n)),Power(Subtract(Subtract(Subtract(C1,Sqr(a)),Times(C2,a,b,Power(x,n))),Times(Sqr(b),Power(x,Times(C2,n)))),CN1)),x),x)),And(FreeQ(List(a,b),x),RationalQ(m,n),NeQ(m,CN1),NeQ(Plus(m,C1),n))));
IIntegrate(6210,Int(Times(ArcCoth(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(x,Plus(m,C1)),ArcCoth(Plus(a,Times(b,Power(x,n)))),Power(Plus(m,C1),CN1)),x),Dist(Times(b,n,Power(Plus(m,C1),CN1)),Int(Times(Power(x,Plus(m,n)),Power(Subtract(Subtract(Subtract(C1,Sqr(a)),Times(C2,a,b,Power(x,n))),Times(Sqr(b),Power(x,Times(C2,n)))),CN1)),x),x)),And(FreeQ(List(a,b),x),RationalQ(m,n),NeQ(m,CN1),NeQ(Plus(m,C1),n))));
IIntegrate(6211,Int(ArcTanh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Subtract(Dist(C1D2,Int(Log(Plus(C1,a,Times(b,Power(f,Plus(c,Times(d,x)))))),x),x),Dist(C1D2,Int(Log(Subtract(Subtract(C1,a),Times(b,Power(f,Plus(c,Times(d,x)))))),x),x)),FreeQ(List(a,b,c,d,f),x)));
IIntegrate(6212,Int(ArcCoth(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Subtract(Dist(C1D2,Int(Log(Plus(C1,Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),CN1))),x),x),Dist(C1D2,Int(Log(Subtract(C1,Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),CN1))),x),x)),FreeQ(List(a,b,c,d,f),x)));
IIntegrate(6213,Int(Times(ArcTanh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Subtract(Dist(C1D2,Int(Times(Power(x,m),Log(Plus(C1,a,Times(b,Power(f,Plus(c,Times(d,x))))))),x),x),Dist(C1D2,Int(Times(Power(x,m),Log(Subtract(Subtract(C1,a),Times(b,Power(f,Plus(c,Times(d,x))))))),x),x)),And(FreeQ(List(a,b,c,d,f),x),IGtQ(m,C0))));
IIntegrate(6214,Int(Times(ArcCoth(Plus(a_DEFAULT,Times(b_DEFAULT,Power(f_,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Subtract(Dist(C1D2,Int(Times(Power(x,m),Log(Plus(C1,Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),CN1)))),x),x),Dist(C1D2,Int(Times(Power(x,m),Log(Subtract(C1,Power(Plus(a,Times(b,Power(f,Plus(c,Times(d,x))))),CN1)))),x),x)),And(FreeQ(List(a,b,c,d,f),x),IGtQ(m,C0))));
IIntegrate(6215,Int(Times(Power(ArcTanh(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),CN1))),m_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Power(ArcCoth(Plus(Times(a,Power(c,CN1)),Times(b,Power(x,n),Power(c,CN1)))),m)),x),FreeQ(List(a,b,c,n,m),x)));
IIntegrate(6216,Int(Times(Power(ArcCoth(Times(c_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))),CN1))),m_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Power(ArcTanh(Plus(Times(a,Power(c,CN1)),Times(b,Power(x,n),Power(c,CN1)))),m)),x),FreeQ(List(a,b,c,n,m),x)));
IIntegrate(6217,Int(ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),x_Symbol),
    Condition(Subtract(Simp(Times(x,ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)))),x),Dist(c,Int(Times(x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c)))));
IIntegrate(6218,Int(ArcCoth(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),x_Symbol),
    Condition(Subtract(Simp(Times(x,ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)))),x),Dist(c,Int(Times(x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c)))));
IIntegrate(6219,Int(Times(ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),Power(x_,CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Log(x)),x),Dist(c,Int(Times(Log(x),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c)))));
IIntegrate(6220,Int(Times(ArcCoth(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),Power(x_,CN1)),x_Symbol),
    Condition(Subtract(Simp(Times(ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Log(x)),x),Dist(c,Int(Times(Log(x),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c)))));
IIntegrate(6221,Int(Times(ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(d,x),Plus(m,C1)),ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(c,Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,m),x),EqQ(b,Sqr(c)),NeQ(m,CN1))));
IIntegrate(6222,Int(Times(ArcCoth(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),Power(Times(d_DEFAULT,x_),m_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Times(d,x),Plus(m,C1)),ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Power(Times(d,Plus(m,C1)),CN1)),x),Dist(Times(c,Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,m),x),EqQ(b,Sqr(c)),NeQ(m,CN1))));
IIntegrate(6223,Int(Times(Power(ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),CN1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C1,Log(ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)))),Power(c,CN1)),x),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c)))));
IIntegrate(6224,Int(Times(Power(ArcCoth(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),CN1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Negate(Simp(Times(Log(ArcCoth(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2)))),Power(c,CN1)),x)),And(FreeQ(List(a,b,c),x),EqQ(b,Sqr(c)))));
IIntegrate(6225,Int(Times(Power(ArcTanh(Times(c_DEFAULT,x_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2))),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Simp(Times(Power(ArcTanh(Times(c,x,Power(Plus(a,Times(b,Sqr(x))),CN1D2))),Plus(m,C1)),Power(Times(c,Plus(m,C1)),CN1)),x),And(FreeQ(List(a,b,c,m),x),EqQ(b,Sqr(c)),NeQ(m,CN1))));
  }
}
}
